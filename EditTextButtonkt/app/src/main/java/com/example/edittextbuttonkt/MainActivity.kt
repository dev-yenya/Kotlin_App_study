 package com.example.edittextbuttonkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edittextbuttonkt.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) { //액티비티가 최초 실행되면 이곳을 수행한다.
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetText.setOnClickListener{ //에딧텍스트에서 입력받은 값을 텍스트뷰로 출력력
           var resultText = binding.etId.text.toString() // 에딧텍스트에 입력된 값
            binding.tvResult.setText(resultText)
        }
    }
}