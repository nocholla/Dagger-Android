package com.nocholla.dagger.recyclerview.dagger.component;

import android.content.Context;

import com.nocholla.dagger.recyclerview.MyApplication;
import com.nocholla.dagger.recyclerview.dagger.module.ContextModule;
import com.nocholla.dagger.recyclerview.dagger.module.RetrofitModule;
import com.nocholla.dagger.recyclerview.dagger.qualifier.ApplicationContext;
import com.nocholla.dagger.recyclerview.dagger.scopes.ApplicationScope;
import com.nocholla.dagger.recyclerview.retrofit.APIInterface;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    public APIInterface getApiInterface();

    @ApplicationContext
    public Context getContext();

    public void injectApplication(MyApplication myApplication);
}
