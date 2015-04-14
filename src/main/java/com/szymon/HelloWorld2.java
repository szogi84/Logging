package com.szymon;

import org.apache.log4j.Logger;
import java.lang.Math;

/**
 * Created by Szogi on 13/04/2015.
 */
public class HelloWorld2 {
    final static Logger LOG = Logger.getLogger(HelloWorld2.class);

    public static void main(String[] args){
        HelloWorld2 obj = new HelloWorld2();
        try {
            obj.divide();
        } catch (ArithmeticException e) {
            LOG.error("You are doin it wrong!",e);
        }
    }

    private void divide() {
        double i=10/0;
    }

    private void runMe(String parameter) {
        if (LOG.isDebugEnabled()){
            LOG.debug("This is debug: " + parameter);
        }
        if (LOG.isInfoEnabled()){
            LOG.info("This is info: " + parameter);
        }

        LOG.warn("This is warn : " + parameter);
        LOG.error("This is error : " + parameter);
        LOG.fatal("This is fatal : " + parameter);
    }
}
