package com.eclipsesource.glsp.example.stl.handler;

import com.eclipsesource.glsp.example.stl.schema.components.Machine;

import java.util.function.Function;

public class CreateMachineHandler extends CreateComponentHandler<Machine> {

    public CreateMachineHandler() {
        super("component:machine", new Machine(), i -> "Machine" + i);
    }

    @Override
    protected void doConcreteStuff(Machine component) {

    }
}
