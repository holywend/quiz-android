package wend.web.id.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FinishActivity : AppCompatActivity() {

    private var tvScore: TextView? = null
    private var tvName: TextView? = null
    private var btnFinish: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        tvScore = findViewById(R.id.tvScore)
        tvName = findViewById(R.id.tvName)
        btnFinish = findViewById(R.id.btnFinish)

        val userName = intent.getStringExtra(Constant.USER_NAME)
        val totalQuestions = intent.getStringExtra(Constant.TOTAL_QUESTIONS)
        val correctAnswers = intent.getStringExtra(Constant.CORRECT_ANSWERS)
        val score = "Your score is $correctAnswers of $totalQuestions"
        tvName?.text = userName
        tvScore?.text = score

        btnFinish?.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}