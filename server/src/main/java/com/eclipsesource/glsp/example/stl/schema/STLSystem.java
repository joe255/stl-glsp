package com.eclipsesource.glsp.example.stl.schema;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SNode;

@Getter
@Setter
public final class STLSystem extends SNode {

    public static final String TYPE = "system";

    private String name;

    public STLSystem() {
        setType(TYPE);
    }
}
