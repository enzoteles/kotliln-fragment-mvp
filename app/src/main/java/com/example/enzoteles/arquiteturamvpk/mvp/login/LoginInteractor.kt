package com.example.enzoteles.arquiteturamvpk.mvp.login

import android.util.Log

/**
 * Created by enzoteles on 16/01/18.
 */
class LoginInteractor(val presenter: OnLoginMVP.presenter) : OnLoginMVP.interactor{
    override fun validationLogin(login: String, password: String) {
        //fazendo a validação do login e senha
        Log.i("login", "${login} /--/ ${password}")
        if(login.equals("adm") && password.equals("123")){
            presenter.showAddFragment();
        }else{
            presenter.errorAuthentication();
        }

    }

}