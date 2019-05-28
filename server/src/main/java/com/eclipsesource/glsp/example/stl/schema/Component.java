package com.eclipsesource.glsp.example.stl.schema;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SNode;

@Getter
@Setter
public abstract class Component extends SNode {

    private Integer costs;
    private String name;
}
