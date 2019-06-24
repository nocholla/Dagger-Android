package com.nocholla.dagger.recyclerview.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.nocholla.dagger.recyclerview.MyApplication;
import com.nocholla.dagger.recyclerview.R;
import com.nocholla.dagger.recyclerview.adapter.RecyclerViewAdapter;
import com.nocholla.dagger.recyclerview.dagger.component.ApplicationComponent;
import com.nocholla.dagger.recyclerview.dagger.component.MainActivityComponent;
import com.nocholla.dagger.recyclerview.dagger.module.MainActivityContextModule;
import com.nocholla.dagger.recyclerview.dagger.qualifier.ActivityContext;
import com.nocholla.dagger.recyclerview.dagger.qualifier.ApplicationContext;
import com.nocholla.dagger.recyclerview.model.StarWars;
import com.nocholla.dagger.recyclerview.retrofit.APIInterface;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void launchIntent(String filmName) {

    }
}

