package com.loginsignupdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        when(v?.id){

            R.id.btn_login ->{
                Toast.makeText(this, "Login Successfully..!", Toast.LENGTH_SHORT).show()
            }

            R.id.txt_sign_up ->{
                startActivity(Intent(this, SignUpActivity::class.java))
            }

        }
    }
}
