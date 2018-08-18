package com.redflag.lfvg.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ctr = false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nao_clique_button.setOnClickListener{
            if(ctr){
                textView.setText(R.string.told_you_so)
            }
            else{
                textView.setText(R.string.hello_h)
            }
            ctr = !ctr
        }
    }
}
