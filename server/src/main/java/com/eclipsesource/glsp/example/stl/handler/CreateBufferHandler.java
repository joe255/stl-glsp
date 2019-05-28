package com.eclipsesource.glsp.example.stl.handler;

import com.eclipsesource.glsp.example.stl.schema.Component;
import com.eclipsesource.glsp.example.stl.schema.components.Buffer;

import java.util.function.Function;

public class CreateBufferHandler extends CreateComponentHandler<Buffer> {

    public CreateBufferHandler() {
        super("component:buffer", new Buffer(), i -> "Buffer" + i);
    }

    @Override
    protected void doConcreteStuff(Buffer component) {

    }
}
