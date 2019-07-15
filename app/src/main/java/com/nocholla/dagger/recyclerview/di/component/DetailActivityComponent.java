package com.nocholla.dagger.recyclerview.di.component;

import com.nocholla.dagger.recyclerview.di.scopes.ActivityScope;
import com.nocholla.dagger.recyclerview.ui.DetailActivity;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class)
@ActivityScope
public interface DetailActivityComponent {

    void inject(DetailActivity detailActivity);
}

