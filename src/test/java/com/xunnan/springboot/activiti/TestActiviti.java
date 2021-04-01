package com.xunnan.springboot.activiti;

import com.xunnan.springboot.utils.SecurityUtil;
import lombok.extern.slf4j.Slf4j;
import org.activiti.api.process.model.ProcessDefinition;
import org.activiti.api.process.model.ProcessInstance;
import org.activiti.api.process.model.builders.ProcessPayloadBuilder;
import org.activiti.api.process.runtime.ProcessRuntime;
import org.activiti.api.runtime.shared.query.Page;
import org.activiti.api.runtime.shared.query.Pageable;
import org.activiti.api.task.model.Task;
import org.activiti.api.task.model.builders.TaskPayloadBuilder;
import org.activiti.api.task.runtime.TaskRuntime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * activiti7测试
 * @author lining
 * @date 2020/12/30 - 23:48
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestActiviti {

    @Autowired
    private ProcessRuntime processRuntime;

    @Autowired
    private TaskRuntime taskRuntime;

    @Autowired
    private SecurityUtil securityUtil;

    /**
     * 查看流程定义内容
     */
    @Test
    public void findProcesses() {

        securityUtil.logInAs("jack");

        // 流程定义的分页对象
        Page<ProcessDefinition> definitionPage = processRuntime.processDefinitions(Pageable.of(0, 10));

        log.info("用户的流程定义总数： {}", definitionPage.getTotalItems());
        for (ProcessDefinition processDefinition : definitionPage.getContent()) {

            log.info("流程定义内容： {}", processDefinition);

            System.out.println("====================================");

        }
    }


    /**
     * 启动流程
     */
    @Test
    public void startProcesses() {
        securityUtil.logInAs("admin");
        ProcessInstance processInstance = processRuntime.start(
                ProcessPayloadBuilder
                        .start()
                        .withProcessDefinitionKey("myProcess_1")
                        .build()
        );

        log.info("流程实例的内容： {}", processInstance);
    }

    /**
     * 拾取任务，完成任务
     */
    public void doTask() {
        //    查询任务
        securityUtil.logInAs("other");
        Page<Task> taskPage = taskRuntime.tasks(Pageable.of(0, 10));

        //    拾取任务
        if (taskPage != null && taskPage.getTotalItems() > 0) {
            for (Task task : taskPage.getContent()) {
                taskRuntime.claim(TaskPayloadBuilder.claim().withTaskId(task.getId()).build());

                log.info("任务内容： {}", task);
                //    完成任务
                taskRuntime.complete(TaskPayloadBuilder.complete().withTaskId(task.getId()).build());
            }
        }
    }





}
