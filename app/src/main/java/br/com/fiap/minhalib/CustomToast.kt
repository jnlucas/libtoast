package br.com.fiap.minhalib

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.view.*

/**
 * Created by logonrm on 26/03/2018.
 */
class CustomToast (){

    fun showToast(context: Context, mensagem: String){

        var inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        var customToastRoot: View = inflater.inflate(R.layout.custom_toast,null)

        var customtoast: Toast = Toast(context)

        customtoast.view = customToastRoot

        customToastRoot.tvId1.text = mensagem

        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM ,0, 0)

        customtoast.duration = Toast.LENGTH_LONG

        customtoast.show()





    }

}