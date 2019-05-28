package com.eclipsesource.glsp.example.stl.schema.components;

import com.eclipsesource.glsp.example.stl.schema.Component;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SNode;

@Getter
@Setter
public final class ItemSeparator extends Component {

    public static final String TYPE = "itemSeparator";

    private String name;

    public ItemSeparator() {
        setType(TYPE);
    }
}
