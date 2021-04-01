package com.xunnan.springboot.test.thredQueryTest;

import java.sql.Connection;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * @author lining
 * @date 2020/11/27 - 11:18
 */
public class ThredQuery implements Callable<String> {
    //    private Connection connection;//需要通过够早方法把对应的业务service传进来 实际用的时候把类型变为对应的类型
    private String sql;//查询条件 根据条件来定义该类的属性

    private int bindex;//分页index
    private int num;//数量
    private Map<String, Object> unitInfo;//查询信息

    /**
     * 重新构造方法
     *
     * @param sql
     * @param bindex
     * @param num
     */
    public ThredQuery(String sql, int bindex, int num, Map<String, Object> unitInfo) {
        this.sql = sql;
        this.bindex = bindex;
        this.num = num;
        this.unitInfo = unitInfo;
    }

    @Override
    public String call() throws Exception {
        String result = null;
//        String url = "jdbc:mysql://192.168.46.196:33062/"+unitInfo.get("dbname")+"?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
//        String url = "jdbc:mysql://localhost:3306/"+unitInfo.get("dbname")+"?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        String url = "jdbc:mysql://192.168.43.120:3306/" + unitInfo.get("dbname") + "?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
//        String pwd = "123456";
//        String pwd = "qaz52088";
        String pwd = "Topgo1q2w3e";
        // Connection connection = TestJDBCUtils.getConnection(url, user, pwd, driver);
        //通过service查询得到对应结果
        try {
            result = "成功====" + num;
            //拉取post_basic数据
            // SearchPostBasic.searchPostBasic(connection, unitInfo, bindex, num);
            //拉取category_basic数据
//            SearchPostBasic.searchCategory(connection,unitInfo,bindex,num);
            //拉取gkml_classify数据
//            SearchPostBasic.searchCategoryGkml(connection,unitInfo,bindex,num);
            //拉取post_gkml数据
//            SearchPostBasic.searchPostGkml(connection,unitInfo,bindex,num);
        } catch (Exception e) {
            e.printStackTrace();
            result = "失败====" + num;
        }
        return result;
    }
}
