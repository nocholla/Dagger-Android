package com.nocholla.dagger.recyclerview.dagger.module;

import android.content.Context;

import com.nocholla.dagger.recyclerview.dagger.qualifier.ApplicationContext;
import com.nocholla.dagger.recyclerview.dagger.scopes.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext() {
        return context;
    }
}
