package com.loginsignupdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SignUpActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    override fun onClick(v: View?) {
        when(v?.id){

            R.id.txt_sign_up ->{
                finish()
            }


            R.id.btn_login ->{
                Toast.makeText(this, "Sign up Successfully..!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
