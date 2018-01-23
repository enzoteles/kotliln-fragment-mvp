package com.example.enzoteles.arquiteturamvpk.mvp.add

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.enzoteles.arquiteturamvpk.R

/**
 * Created by enzoteles on 16/01/18.
 */
class AddFragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(R.layout.add, container, false)

        return view
    }
}