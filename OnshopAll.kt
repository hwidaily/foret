package com.example.maindisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class OnshopAll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onshop_all)


        webView.settings.javaScriptEnabled = true // 자바 스크립트 허용
        /* 웹뷰에서 새 창이 뜨지 않도록 방지하는 구문 */
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        webView.loadUrl("https://blog.naver.com/hwidaily/222361592528") // 링크 주소를 Load 함


    }

}