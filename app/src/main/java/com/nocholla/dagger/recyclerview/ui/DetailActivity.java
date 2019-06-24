package com.nocholla.dagger.recyclerview.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.nocholla.dagger.recyclerview.MyApplication;
import com.nocholla.dagger.recyclerview.R;
import com.nocholla.dagger.recyclerview.dagger.component.ApplicationComponent;
import com.nocholla.dagger.recyclerview.dagger.component.DaggerDetailActivityComponent;
import com.nocholla.dagger.recyclerview.dagger.component.DetailActivityComponent;
import com.nocholla.dagger.recyclerview.dagger.qualifier.ApplicationContext;
import com.nocholla.dagger.recyclerview.model.Film;
import com.nocholla.dagger.recyclerview.retrofit.APIInterface;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
