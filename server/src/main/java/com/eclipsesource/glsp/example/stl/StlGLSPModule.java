package com.eclipsesource.glsp.example.stl;

import com.eclipsesource.glsp.api.diagram.DiagramConfiguration;
import com.eclipsesource.glsp.api.handler.OperationHandler;
import com.eclipsesource.glsp.server.di.DefaultGLSPModule;

import java.util.Collection;

// TODO
public class StlGLSPModule extends DefaultGLSPModule {

    @Override
    protected Collection<Class<? extends OperationHandler>> bindOperationHandlers() {
        return null;
    }

    @Override
    protected Collection<Class<? extends DiagramConfiguration>> bindDiagramConfigurations() {
        return null;
    }
}
