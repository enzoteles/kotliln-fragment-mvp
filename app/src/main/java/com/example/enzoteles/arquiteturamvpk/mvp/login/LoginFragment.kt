package com.example.enzoteles.arquiteturamvpk.mvp.login

import android.animation.ObjectAnimator
import android.app.Activity
import android.app.Fragment
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.enzoteles.arquiteturamvpk.MainActivityK
import com.example.enzoteles.arquiteturamvpk.R
import kotlinx.android.synthetic.main.login.view.*

/**
 * Created by enzoteles on 16/01/18.
 */

class LoginFragment : Fragment(), OnLoginMVP.view {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(R.layout.login, container, false)
        view.btn_login.text = "Login"

        var logo = view.logo

        //animation
        logoAlphaAndRotation(logo, view)

        //call the method of the presenter
        //init dagger component
        val loginComponent = DaggerOnLoginComponent.builder().loginModule(LoginModule()).build()
        //instanciando o presenter via dagger2
        var presenter = loginComponent.provideLoginPresenter()

        view.btn_login.setOnClickListener {
            var login = view.edt_login.text.toString()
            var password = view.edt_password.text.toString()
            presenter.callPresenter(login, password);
        }
        return view
    }

    override fun logoAlphaAndRotation(logo: ImageView, view: View) {

        ObjectAnimator.ofFloat(logo, "alpha", 0f, 1f).apply {
            duration = 3000
            start()
        }


        Handler().postDelayed({

            var move = ObjectAnimator.ofFloat(logo, "y", 10f).apply {
                duration = 2000
                start()
            }

        }, 1000)


        Handler().postDelayed({

            view.layout_login.visibility = View.VISIBLE

        }, 3000)

    }

}






