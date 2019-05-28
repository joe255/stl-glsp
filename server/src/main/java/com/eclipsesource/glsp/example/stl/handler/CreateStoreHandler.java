package com.eclipsesource.glsp.example.stl.handler;

import com.eclipsesource.glsp.example.stl.schema.Component;
import com.eclipsesource.glsp.example.stl.schema.components.Store;

import java.util.function.Function;

public abstract class CreateStoreHandler<T extends Store> extends CreateComponentHandler<T>{

    public CreateStoreHandler(String elementTypeId, T component, Function<Integer, String> labelProvider) {
        super(elementTypeId, component, labelProvider);
    }

    @Override
    protected void doConcreteStuff(T component) {

    }
}
