package com.eclipsesource.glsp.example.stl.schema;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SEdge;

@Getter
@Setter
public final class Connector extends SEdge {

    public static final String TYPE = "connector";

    public Connector() {
        setType(TYPE);
    }
}
