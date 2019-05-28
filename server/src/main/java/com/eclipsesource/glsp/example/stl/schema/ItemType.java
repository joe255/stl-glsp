package com.eclipsesource.glsp.example.stl.schema;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SNode;

@Getter
@Setter
public class ItemType extends SNode {

    public static final String ITEMTYPE = "itemType";

    private String name;
    private String description;

    public ItemType() {
        setType(ITEMTYPE);
    }
}
