package com.nocholla.dagger.recyclerview.di.component;

import android.content.Context;

import com.nocholla.dagger.recyclerview.MyApplication;
import com.nocholla.dagger.recyclerview.di.module.ContextModule;
import com.nocholla.dagger.recyclerview.di.module.RetrofitModule;
import com.nocholla.dagger.recyclerview.di.qualifier.ApplicationContext;
import com.nocholla.dagger.recyclerview.di.scopes.ApplicationScope;
import com.nocholla.dagger.recyclerview.api.APIInterface;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    public APIInterface getApiInterface();

    @ApplicationContext
    public Context getContext();

    public void injectApplication(MyApplication myApplication);
}
