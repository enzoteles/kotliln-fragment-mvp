package com.example.enzoteles.arquiteturamvpk.mvp.login

import android.app.Activity
import com.example.enzoteles.arquiteturamvpk.MainActivityK
import dagger.Module
import dagger.Provides

/**
 * Created by enzoteles on 16/01/18.
 */
@Module
class LoginModule{

    @Provides
    fun provideLoginPresenter() : OnLoginMVP.presenter{
        return LoginPresenter(LoginFragment())
    }

    @Provides
    fun provideLoginInteractor(): OnLoginMVP.interactor{
        return LoginInteractor(LoginPresenter(LoginFragment()))
    }
}



