package com.example.enzoteles.arquiteturamvpk.utils

import android.app.Activity
import android.app.Fragment
import com.example.enzoteles.arquiteturamvpk.MainActivityK
import com.example.enzoteles.arquiteturamvpk.R
import com.example.enzoteles.arquiteturamvpk.mvp.login.LoginFragment

/**
 * Created by enzoteles on 16/01/18.
 */
class ManagerFragment(val activity: Activity){

    var manager = activity.fragmentManager

    fun addFragment(frag: Fragment, backstack: Boolean, tag:String) {
        var transation = manager.beginTransaction()
        transation.add(R.id.content, frag, tag)
        if (backstack == true) {
            transation.addToBackStack(null)
        }
        transation.commit()
    }

    fun replaceFragment(frag: Fragment, backstack: Boolean, tag: String) {
        var transation = manager.beginTransaction()
        transation.add(R.id.content, frag, "login")
        if (backstack == true) {
            transation.addToBackStack(null)
        }
        transation.commit()
    }


}