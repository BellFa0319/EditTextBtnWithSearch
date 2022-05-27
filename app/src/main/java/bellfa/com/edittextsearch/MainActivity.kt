package bellfa.com.edittextsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import bellfa.com.edittextsearch.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    //feat 1
    //feat 2
    //feat 6
    //feat 7
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //temp5 기능 개발중
        //temp5 기능 개발 완료
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonSearch.setOnClickListener {
            binding.edittextSearch.let { binding. textviewResult.setText(binding.edittextSearch.text.toString() + "으로 검색합니다.")}
        }

        //temp2 의 수정
        binding.edittextSearch.setOnEditorActionListener(TextView.OnEditorActionListener { v, actionId, event ->

            when(actionId){
                EditorInfo.IME_ACTION_SEARCH -> binding.buttonSearch.performClick()
                else -> return@OnEditorActionListener false
            }

        })
        //temp3 기능

    }
}
