package com.eternal.test.service;

import javax.annotation.Resource;

import com.eternal.Application;
import com.eternal.service.DemoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yeyang.lj on 2017/10/20.
 */
// SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)

@SpringBootTest(classes = Application.class)
public class DemoServiceTest {

    @Resource
    private DemoService demoService;

    @Test
    public void testFindAll() {
        Assert.assertEquals(1, demoService.findAll().size());
    }

}
