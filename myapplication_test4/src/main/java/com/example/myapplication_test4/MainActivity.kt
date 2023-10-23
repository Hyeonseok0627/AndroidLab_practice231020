package com.example.myapplication_test4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// 액티비티는 시스템 클래스 = 컴포넌트 클래스라고도 함
// 일반 클래스와의 차이점은, 어느 클래스를 상속을 받는지 여부에 따라서 결정됨
// 예) class MainActivity : AppCompatActivity() -> 시스템클래스라서 변수넣지않음
// 일반클래스는 class MainActivity : AppCompatActivity(val test : String)
// 이런식으로 매개변수를 사용해줘야함

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}