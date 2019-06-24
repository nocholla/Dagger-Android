package com.nocholla.dagger.recyclerview;

import android.app.Activity;
import android.app.Application;

import com.nocholla.dagger.recyclerview.dagger.component.ApplicationComponent;
import com.nocholla.dagger.recyclerview.dagger.component.DaggerApplicationComponent;
import com.nocholla.dagger.recyclerview.dagger.module.ContextModule;

public class MyApplication extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this)).build();
        applicationComponent.injectApplication(this);

    }

    public static MyApplication get(Activity activity){
        return (MyApplication) activity.getApplication();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
