package com.example.enzoteles.arquiteturamvpk.mvp.login

import android.view.View
import android.widget.ImageView

/**
 * Created by enzoteles on 16/01/18.
 */
interface OnLoginMVP {

    interface view{
        fun logoAlphaAndRotation(logo: ImageView, view: View)
    }
    interface presenter{
        fun callPresenter(login: String, password: String)
        fun showAddFragment()
        fun errorAuthentication()
    }
    interface interactor{
        fun validationLogin(login: String, password: String)
    }
}