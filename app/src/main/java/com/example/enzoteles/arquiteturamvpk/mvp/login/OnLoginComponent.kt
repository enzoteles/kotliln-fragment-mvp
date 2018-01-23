package com.example.enzoteles.arquiteturamvpk.mvp.login

import com.example.enzoteles.arquiteturamvpk.MainActivityK
import dagger.Component

/**
 * Created by enzoteles on 16/01/18.
 */
@Component(modules = arrayOf(LoginModule::class))
interface OnLoginComponent{

    fun provideLoginPresenter(): OnLoginMVP.presenter
    fun provideLoginInteractor(): OnLoginMVP.interactor

}

