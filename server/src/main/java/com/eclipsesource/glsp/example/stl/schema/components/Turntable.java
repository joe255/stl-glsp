package com.eclipsesource.glsp.example.stl.schema.components;

import com.eclipsesource.glsp.example.stl.schema.Component;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Turntable extends Component {

    public static final String TYPE = "turntable";

    private String name;

    public Turntable() {
        setType(TYPE);
    }
}
