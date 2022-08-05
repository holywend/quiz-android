package wend.web.id.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        val btnStart: Button = findViewById(R.id.btnStart)
        val txtName: EditText = findViewById(R.id.txtName)
        btnStart.setOnClickListener {
            if (txtName.text.isEmpty()){
                Toast.makeText(this,"Please enter Your name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constant.USER_NAME, txtName.text.toString())
                startActivity(intent) // moved to new activity
                finish() // finish current activity
            }
        }
    }
}