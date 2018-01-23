package com.example.enzoteles.arquiteturamvpk

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.enzoteles.arquiteturamvpk.app.MyApplication
import com.example.enzoteles.arquiteturamvpk.mvp.login.LoginFragment
import com.example.enzoteles.arquiteturamvpk.utils.ManagerFragment

class MainActivityK : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var login = LoginFragment()
        var manager = ManagerFragment(this)
        manager.addFragment(login, false, "login")
        //FacadeApp.getInstance().mainActivityK = this;
        MyApplication.mainActivity.activity = this;
    }


}
