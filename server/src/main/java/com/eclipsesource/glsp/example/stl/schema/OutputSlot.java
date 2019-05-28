package com.eclipsesource.glsp.example.stl.schema;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SNode;

@Getter
@Setter
public final class OutputSlot extends SNode {

    public static final String TYPE = "outputSlot";

    private String name;

    public OutputSlot() {
        setType(TYPE);
    }
}
