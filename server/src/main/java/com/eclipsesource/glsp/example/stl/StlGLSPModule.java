package com.eclipsesource.glsp.example.stl;

import com.eclipsesource.glsp.api.diagram.DiagramConfiguration;
import com.eclipsesource.glsp.api.handler.OperationHandler;
import com.eclipsesource.glsp.server.di.DefaultGLSPModule;

import java.util.Collection;
import java.util.Collections;

public class StlGLSPModule extends DefaultGLSPModule {

    @Override
    protected Collection<Class<? extends OperationHandler>> bindOperationHandlers() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<Class<? extends DiagramConfiguration>> bindDiagramConfigurations() {
        return Collections.emptyList();
    }
}
