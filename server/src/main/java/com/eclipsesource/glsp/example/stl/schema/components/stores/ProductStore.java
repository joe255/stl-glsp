package com.eclipsesource.glsp.example.stl.schema.components.stores;

import com.eclipsesource.glsp.example.stl.schema.components.Store;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class ProductStore extends Store {

    public static final String TYPE = "productStore";

    private String name;

    public ProductStore() {
        setType(TYPE);
    }
}
