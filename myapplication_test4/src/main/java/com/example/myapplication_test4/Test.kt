package com.example.myapplication_test4

class Test {

}

// 함수 밖, 최고 상위 영역() - 여기에선 전역변수
//val_test1; //초기화를 안해서 나오는 오류
val test1 ="test"; //선언과 동시에 초기화함
var test2 = null;

//val test5:String; // 여기에선 오류가 뜸
//var test6:String;

// 결론, IDE를 사용하는 이유는 작업의 편의성, 생산성
// 그래서, 기본 문법을 너무 외워서 다 맞춰서 작성하는 것 보다는
// IDE에 맡기는 것을 추천.
// 자동완성 코드 등, 여러가지를 이용할 예정


val data1 : Int by lazy {
    println("순서3 in lazy")
    10
}

// 자바에선 없는 모양
// 일반 함수와는 다른것이, 매개변수 자리에 함수형 타입이 들어가고, 반환형 타입에도 함수형 타입이 들어감
fun hofFun(arg: (Int) -> Boolean): () -> String {
    val result = if(arg(10)) {
        "valid"
    } else {
        "invalid"
    }
    return {"hofFun result : $result"}
}
fun main() {
    val result = hofFun({no -> no > 0})
    println(result())

    println("순서1 maun 먼저 실행.")
    println("순서2 lazy 호출 확인: " + data1) // 이 시점에서 data1을 불러올때, 순서3에서의 data1을 메모리 로드하여 초기화해서 불러오니 순서는 순서1->순서3->순서2로 움직임

    val test3:String; //함수 내에서 변수 선언하면 지역변수
    var test4:String; //함수 내에선 이렇게 초기화하지 않아도 오류가 뜨지 않음
    
    
    // var 변수, val 상수,
    // ex) var 변수명 : 타입 = 값;
    // 기본은 변경이 되지 않는 상수를 주로 사용을 하되, 만약, 변경이 되는 부분이면 var을 쓰면 됨.
    // 코틀린에서는 모든 타입이 객체임. 즉, 참조형(객체)이라는 것
    // 자바에서는 기본(형)타입 8가지, 그외의 형은 참조형
    // 참조형은 타입을 쓰고 "."을 하고 ctrl+space를 누르면 참조할 애들이 나옴
    // 그러니 코틀린에서는 다 참조형이니 다 이렇게해서 불러서 쓸 수 있는 편리함 존재
    
    var name = "lhs";
    var name2 : String = "lhs2";
    var age : Int = 10;
    var age2 = 10;
    
    println("이름 :" + name)
    println("hello android by kotlin")
}