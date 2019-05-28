package com.eclipsesource.glsp.example.stl.handler;

import com.eclipsesource.glsp.example.stl.schema.Component;
import com.eclipsesource.glsp.example.stl.schema.components.Store;
import com.eclipsesource.glsp.example.stl.schema.components.stores.ProductStore;

import java.util.function.Function;

public class CreateProductStoreHandler extends CreateStoreHandler<ProductStore> {
    public CreateProductStoreHandler() {
        super("component:productStore", new ProductStore(), i -> "ProductStore" + i);
    }

    @Override
    protected void doConcreteStuff(Component component) {

    }
}
