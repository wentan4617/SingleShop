package com.went.core.service;

import com.went.core.bean.TestTb;
import com.went.core.dao.TestTbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by went on 16/7/27.
 */
@Service
@Transactional
public class TestTbServcieImpl implements TestTbService {

    @Autowired
    private TestTbDao testTbDao;

    public void addTestTb(TestTb testTb) {
        testTbDao.addTestTb(testTb);
    }
}