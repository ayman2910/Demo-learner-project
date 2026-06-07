package com.firstProject.demo.BeanScopeAndLifeCycle;

public class CustomerConnectionPool {
    public void configurePool() { System.out.println("Pool configured and channels opened."); }
    public void closePool() { System.out.println("All channels safely severed."); }
}
