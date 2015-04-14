package com.szymon;

import org.apache.log4j.Logger;

/**
 * Created by Szogi on 13/04/2015.
 */
public class HelloWorld {
    final static Logger LOG = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args){
        HelloWorld obj = new HelloWorld();
        obj.runMe("Szogi");
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
