package com.yang;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zeyu on 16/3/16.
 */
public class MainTest01 {

    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(MainTest01.class);
        logger.error("test........");
    }

}
