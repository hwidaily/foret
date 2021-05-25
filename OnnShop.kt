package com.example.maindisplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_onn_shop.*

class OnnShop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {   // 액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onn_shop)

        btn_all.setOnClickListener { // var : 변수 값이 언제든지 변경 될 수 있음.  val : 자바에서는 final 값이 변경되지 못하는 변수.
            val intent = Intent(this, OnshopAll::class.java) // 다음화면으로 넘어가기 위한 인텐트 객체 생성
            startActivity(intent)
        }



//        val item = arrayOf("사과","배","딸기")
        // context란 한 액티비티의 모든 정보를 담고있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)



    }
}