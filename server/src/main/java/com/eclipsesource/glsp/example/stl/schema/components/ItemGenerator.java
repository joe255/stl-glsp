package com.eclipsesource.glsp.example.stl.schema.components;

import com.eclipsesource.glsp.example.stl.schema.Component;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SNode;

@Getter
@Setter
public final class ItemGenerator extends Component {

    public static final String TYPE = "itemGenerator";

    private String name;

    public ItemGenerator() {
        setType(TYPE);
    }
}
