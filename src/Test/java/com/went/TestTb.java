package com.went;

import com.went.common.junit.SpringJunitTest;
import com.went.core.service.TestTbService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by went on 16/7/27.
 */
public class TestTb extends SpringJunitTest{

    @Autowired
    private TestTbService testTbService;
    @Test
    public void testAdd(){
        com.went.core.bean.TestTb testTb = new com.went.core.bean.TestTb();
        testTb.setName("shuishui");
        testTbService.addTestTb(testTb);
    }

}
