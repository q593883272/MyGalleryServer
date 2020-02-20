package com.raven.gallery.test.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created By Raven on 2020/2/7 14:28
 * Spring JUnit测试
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJUnitTest {


    @Before
    public void before() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 开始测试 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Test
    public void test() throws Exception {
        log.info("Hello World By Spring JUnit Test !!!");
    }

    @After
    public void after() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 测试结束 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

}

