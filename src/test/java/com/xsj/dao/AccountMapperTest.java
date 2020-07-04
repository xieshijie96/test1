package com.xsj.dao;

import com.xsj.entity.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author xieshijie
 * @date 2020/4/23 - 22:15
 */
public class AccountMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private AccountMapper mapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(AccountMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        Account account = new Account();
        account.setName("杰锅锅");
        account.setMoney(1000.0);
        int result = mapper.insert(account);
        System.out.println(result);
        assert (result == 1);
    }
}