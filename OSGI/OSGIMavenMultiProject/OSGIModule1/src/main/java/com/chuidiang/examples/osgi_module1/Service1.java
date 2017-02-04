package com.chuidiang.examples.osgi_module1;

import com.chuidiang.examples.osgi_module1.interfaz.IfzService1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by JAVIER on 03/02/2017.
 */
public class Service1 implements IfzService1 {
    private static Logger log = LoggerFactory.getLogger(Service1.class);

    public void start(){
        log.info("Service1 starts");
    }

    public void stop(){
        log.info("Service1 stops");
    }
}