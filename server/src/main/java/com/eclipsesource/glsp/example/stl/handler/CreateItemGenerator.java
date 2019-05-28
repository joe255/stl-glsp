package com.eclipsesource.glsp.example.stl.handler;

import com.eclipsesource.glsp.example.stl.schema.components.ItemGenerator;

import java.util.function.Function;

public class CreateItemGenerator extends CreateComponentHandler<ItemGenerator> {
    public CreateItemGenerator() {
        super("component:itemGenerator", new ItemGenerator(), i -> "ItemGenerator" + i);
    }

    @Override
    protected void doConcreteStuff(ItemGenerator component) {

    }
}
