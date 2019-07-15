package com.nocholla.dagger.recyclerview.di.component;

import android.content.Context;

import com.nocholla.dagger.recyclerview.di.module.AdapterModule;
import com.nocholla.dagger.recyclerview.di.qualifier.ActivityContext;
import com.nocholla.dagger.recyclerview.di.scopes.ActivityScope;
import com.nocholla.dagger.recyclerview.ui.MainActivity;

import dagger.Component;

@ActivityScope
@Component(modules = AdapterModule.class, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();

    void injectMainActivity(MainActivity mainActivity);
}
