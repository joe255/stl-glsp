package com.eclipsesource.glsp.example.stl.handler;

import com.eclipsesource.glsp.example.stl.schema.Component;
import com.eclipsesource.glsp.example.stl.schema.components.Store;
import com.eclipsesource.glsp.example.stl.schema.components.stores.WasteStore;

import java.util.function.Function;

public class CreateWasteStoreHandler extends CreateStoreHandler<WasteStore> {
    public CreateWasteStoreHandler() {
        super("component:wasteStore", new WasteStore(), i -> "WasteStore" + i);
    }

    @Override
    protected void doConcreteStuff(WasteStore component) {

    }
}
