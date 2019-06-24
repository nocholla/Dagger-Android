package com.nocholla.dagger.recyclerview.dagger.component;

import android.content.Context;

import com.nocholla.dagger.recyclerview.dagger.module.AdapterModule;
import com.nocholla.dagger.recyclerview.dagger.qualifier.ActivityContext;
import com.nocholla.dagger.recyclerview.dagger.scopes.ActivityScope;
import com.nocholla.dagger.recyclerview.ui.MainActivity;

import dagger.Component;


@ActivityScope
@Component(modules = AdapterModule.class, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();

    void injectMainActivity(MainActivity mainActivity);
}
