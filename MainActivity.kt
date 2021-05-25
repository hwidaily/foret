package com.example.maindisplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_onshop.setOnClickListener { // var : 변수 값이 언제든지 변경 될 수 있음.  val : 자바에서는 final 값이 변경되지 못하는 변수.
            val intent = Intent(this, OnnShop::class.java) // 다음화면으로 넘어가기 위한 인텐트 객체 생성
            startActivity(intent)

        }

        btn_home.setOnClickListener { // var : 변수 값이 언제든지 변경 될 수 있음.  val : 자바에서는 final 값이 변경되지 못하는 변수.
            val intent = Intent(this, OnnShop::class.java) // 다음화면으로 넘어가기 위한 인텐트 객체 생성
            startActivity(intent)

        }


        webView.settings.javaScriptEnabled = true // 자바 스크립트 허용
        /* 웹뷰에서 새 창이 뜨지 않도록 방지하는 구문 */
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        webView.loadUrl("https://search.shopping.naver.com/search/all?catId=ROOT&frm=NVSHCAT&origQuery=%EC%A0%9C%EB%A1%9C%EC%9B%A8%EC%9D%B4%EC%8A%A4%ED%8A%B8%20%EC%98%A8%EB%9D%BC%EC%9D%B8%20%EC%83%B5&pagingIndex=1&pagingSize=40&productSet=total&query=%EC%A0%9C%EB%A1%9C%EC%9B%A8%EC%9D%B4%EC%8A%A4%ED%8A%B8%20%EC%98%A8%EB%9D%BC%EC%9D%B8%20%EC%83%B5&sort=rel×tamp=&viewType=list") // 링크 주소를 Load 함





    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId)
        {
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.send -> Toast.makeText(applicationContext, "메시지", Toast.LENGTH_SHORT).show()
        }
        layoutInflater.cloneInContext() //네비게이션 뷰 닫기
        return false
    }
}

private fun LayoutInflater.cloneInContext() {
    TODO("Not yet implemented")
}
