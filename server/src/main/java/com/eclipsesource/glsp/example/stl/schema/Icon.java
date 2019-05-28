package com.eclipsesource.glsp.example.stl.schema;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.Point;
import org.eclipse.sprotty.SShapeElement;

@Getter
@Setter
public class Icon extends SShapeElement {
    public static final String TYPE = "icon";
    private String layout;
    private String commandId;

    public Icon() {
        setType(TYPE);
        setPosition(new Point());
    }

}