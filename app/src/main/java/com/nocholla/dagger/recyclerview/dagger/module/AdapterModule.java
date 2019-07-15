package com.nocholla.dagger.recyclerview.dagger.module;

import com.nocholla.dagger.recyclerview.adapter.RecyclerViewAdapter;
import com.nocholla.dagger.recyclerview.dagger.scopes.ActivityScope;
import com.nocholla.dagger.recyclerview.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module(includes = {MainActivityContextModule.class})
public class AdapterModule {

    @Provides
    @ActivityScope
    public RecyclerViewAdapter getStarWarsPeopleList(RecyclerViewAdapter.ClickListener clickListener) {
        return new RecyclerViewAdapter(clickListener);
    }

    @Provides
    @ActivityScope
    public RecyclerViewAdapter.ClickListener getClickListener(MainActivity mainActivity) {
        return mainActivity;
    }
}
