package com.firstProject.demo.BeanScopeAndLifeCycle;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataConfigController {
    private final CustomerConnectionPool pool1;
    private final CustomerConnectionPool pool2;

    public DataConfigController(CustomerConnectionPool pool1, CustomerConnectionPool pool2) {
        this.pool1 = pool1;
        this.pool2 = pool2;
    }


}
