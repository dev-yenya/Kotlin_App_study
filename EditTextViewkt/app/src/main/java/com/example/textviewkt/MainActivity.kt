//뷰바인딩 참고 : https://duckssi.tistory.com/42

package com.example.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.textviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //전역 변수로 바인딩 객체 선언
    private var mBinding : ActivityMainBinding? = null
    //매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 최초 실행되었을 때 수행
        super.onCreate(savedInstanceState)
        // xml 화면 뷰를 연결한다. -> new 뷰바인딩(2021)
        //setContentView(R.layout.activity_main)

        //뷰 바인딩 클래스 -> inflate 메서드 활용
        // 액티비티에서 사용할 바인딩 클래스의 인스턴스 생성
        mBinding = ActivityMainBinding.inflate(layoutInflater)

        //getRoot 메서드로 레이아웃 내부 최상위 위치 g뷰의 인스턴스 활용
        //생성된 뷰 액티비티에 표시
        setContentView(binding.root)

        //binding 변수를 통해 xml 파일 내 뷰 id 접근 가능
        //tv_title -> tvTitle(파스칼케이스 + 카멜케이스 네이밍 규칙 적용)
        binding.tvTitle.setText("hello world")
    }
    
    //액티비티가 파괴될 때
    override fun onDestroy() {
        //onDestroy에서 binding class 인스턴스 참조 정리
        mBinding = null
        super.onDestroy()
    }

}