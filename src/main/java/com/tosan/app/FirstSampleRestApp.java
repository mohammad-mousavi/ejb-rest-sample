package com.tosan.app;

import com.tosan.restservice.BankApi;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class FirstSampleRestApp extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(BankApi.class);
        return classes;
    }
}
