package com.nocholla.dagger.recyclerview.dagger.module;

import android.content.Context;

import com.nocholla.dagger.recyclerview.ui.MainActivity;
import com.nocholla.dagger.recyclerview.dagger.qualifier.ActivityContext;
import com.nocholla.dagger.recyclerview.dagger.scopes.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityContextModule {
    private MainActivity mainActivity;

    public Context context;

    public MainActivityContextModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        context = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity providesMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }

}
