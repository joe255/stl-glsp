package com.eclipsesource.glsp.example.stl.schema;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SNode;

@Getter
@Setter
public final class InputSlot extends SNode {

    public static final String TYPE = "inputSlot";

    private String name;

    public InputSlot() {
        setType(TYPE);
    }
}
