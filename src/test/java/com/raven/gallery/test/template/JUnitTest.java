package com.raven.gallery.test.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created By Raven on 2020/2/7 14:26
 * JUnit测试
 */
@Slf4j
@RunWith(JUnit4.class)
public class JUnitTest {

    @Before
    public void before() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 开始测试 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Test
    public void test() throws Exception {
        log.info("Hello World By JUnit Test !!!");
    }

    @After
    public void after() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 测试结束 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
