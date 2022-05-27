package bellfa.com.edittextsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import bellfa.com.edittextsearch.databinding.ActivityMainBinding
///develop 기능 feat 4 기능 완료 4-1 핫픽스
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonSearch.setOnClickListener {
            binding.edittextSearch.let { binding. textviewResult.setText(binding.edittextSearch.text.toString() + "으로 검색합니다.")}
        }

        binding.edittextSearch.setOnEditorActionListener(TextView.OnEditorActionListener { v, actionId, event ->

            when(actionId){
                EditorInfo.IME_ACTION_SEARCH -> binding.buttonSearch.performClick()
                else -> return@OnEditorActionListener false
            }

        })

    }
}
