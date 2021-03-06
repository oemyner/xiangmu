package com.example.jon.fangnews.di.module;

import android.app.Activity;

import com.example.jon.fangnews.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jon on 2016/12/19.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity){
        this.mActivity = activity;
    }

    @PerActivity
    @Provides
    Activity provideActivity(){
        return mActivity;
    }



}
