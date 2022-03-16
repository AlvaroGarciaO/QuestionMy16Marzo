package cat.urv.deim.asm.questionmy16marzo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        this.intent?.extras?.getString(QuestionActivity.KEY_SCORE,"5")
        this.intent?.extras?.getLong(QuestionActivity.KEY_RESPONSE_TIME,0L)
    }
}