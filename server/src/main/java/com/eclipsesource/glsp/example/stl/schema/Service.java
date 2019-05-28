package com.eclipsesource.glsp.example.stl.schema;

import lombok.Getter;
import lombok.Setter;
import org.eclipse.sprotty.SNode;

@Getter
@Setter
public final class Service extends SNode {

    public static final String TYPE = "service";

    private String name;
    private Integer costs;
    private Long processingTime;
    private Float reliability;

    public Service() {
        setType(TYPE);
    }
}
