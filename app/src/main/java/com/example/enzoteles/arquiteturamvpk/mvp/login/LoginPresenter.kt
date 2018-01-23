package com.example.enzoteles.arquiteturamvpk.mvp.login

import android.widget.Toast
import com.example.enzoteles.arquiteturamvpk.app.MyApplication
import com.example.enzoteles.arquiteturamvpk.mvp.add.AddFragment
import com.example.enzoteles.arquiteturamvpk.utils.ManagerFragment

/**
 * Created by enzoteles on 16/01/18.
 */
class LoginPresenter(val view: OnLoginMVP.view) : OnLoginMVP.presenter {
    override fun errorAuthentication() {
        var cont = MyApplication.instance
        Toast.makeText(cont, "Error na autenticação!!!", Toast.LENGTH_SHORT).show()
    }

    override fun callPresenter(login: String, password: String) {
        var interactor = LoginInteractor(this)
        interactor.validationLogin(login, password);
    }

    override fun showAddFragment() {
        var ac = MyApplication.mainActivity.activity
        var manager = ManagerFragment(ac)
        var add = AddFragment()
        manager.replaceFragment(add, true, "add")
    }

}