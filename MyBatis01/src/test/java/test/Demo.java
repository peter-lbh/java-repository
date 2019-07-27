package test;


import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.sql.SQLException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
public class Demo {

//    @Test
//    public void test() throws SQLException {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        BasicDataSource basicDataSource = context.getBean("dataSource",BasicDataSource.class);
//        System.out.println(basicDataSource);
//        Assert.notNull(basicDataSource.getConnection());
//        System.out.println(basicDataSource.getConnection());
//
//    }
}
