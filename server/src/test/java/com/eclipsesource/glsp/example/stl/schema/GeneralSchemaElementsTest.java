package com.eclipsesource.glsp.example.stl.schema;

import org.eclipse.sprotty.SEdge;
import org.eclipse.sprotty.SModelElement;
import org.eclipse.sprotty.SNode;
import org.junit.Test;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Set;

import static org.junit.Assert.fail;

public class GeneralSchemaElementsTest {
    @Test
    public void allSchemaElementsDefineSameTypesAsClassNamed() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("com.eclipsesource.glsp.example.stl.schema");
        Set<Class<? extends SNode>> allTypes = reflections.getSubTypesOf(SNode.class);
        for (Class<? extends SNode> aClass : allTypes) {
            instantiateAndGetType(aClass);
        }
        Set<Class<? extends SEdge>> allEdges = reflections.getSubTypesOf(SEdge.class);
        for (Class<? extends SEdge> aClass : allEdges) {
            instantiateAndGetType(aClass);
        }
    }

    private void instantiateAndGetType(Class clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (!Modifier.isAbstract(clazz.getModifiers())) {
            Object o = clazz.getDeclaredConstructor().newInstance();
            String type = ((SModelElement) o).getType();
            if (!clazz.getName().toLowerCase().contains(type.toLowerCase())) fail();
        }
    }

}
