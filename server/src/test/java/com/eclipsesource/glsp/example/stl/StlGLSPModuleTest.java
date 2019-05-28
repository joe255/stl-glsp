package com.eclipsesource.glsp.example.stl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StlGLSPModuleTest {

    private StlGLSPModule stlGLSPModule;

    @Before
    public void init() {
        stlGLSPModule = new StlGLSPModule();
    }

    @Test
    public void bindOperationHandlersNotNull() {
        Assert.assertNotNull(stlGLSPModule.bindOperationHandlers());
    }

    @Test
    public void bindDiagramConfigurationsNotNull() {
        Assert.assertNotNull(stlGLSPModule.bindDiagramConfigurations());
    }
}
