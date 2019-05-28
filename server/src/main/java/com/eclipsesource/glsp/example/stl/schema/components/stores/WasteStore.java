package com.eclipsesource.glsp.example.stl.schema.components.stores;

import com.eclipsesource.glsp.example.stl.schema.components.Store;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class WasteStore extends Store {

    public static final String TYPE = "wasteStore";

    private String name;

    public WasteStore() {
        setType(TYPE);
    }
}