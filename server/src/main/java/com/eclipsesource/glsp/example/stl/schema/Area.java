package com.eclipsesource.glsp.example.stl.schema;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SNode;

@Getter
@Setter
public final class Area extends SNode {

    public static final String TYPE = "area";

    private String name;

    public Area() {
        setType(TYPE);
    }
}
