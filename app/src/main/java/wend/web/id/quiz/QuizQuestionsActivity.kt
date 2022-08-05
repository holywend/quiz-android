package wend.web.id.quiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity() {
    private var userName: String? = null

    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null
    private var pbProgress: ProgressBar? = null
    private var tvProgress: TextView? = null

    private var tvOptionZero: TextView? = null
    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null

    private var btnSubmit: Button? = null

    private var currentPosition = 0
    private var selectedOption: Int? = null
    private var userAnswers: ArrayList<Int> = ArrayList()
    private var correctAnswer = 0
    private var isAnswered = false

    private val questionList = Constant.getQuestions()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        userName = intent.getStringExtra(Constant.USER_NAME)

        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.ivImage)
        pbProgress = findViewById(R.id.pbProgress)
        tvProgress = findViewById(R.id.tvProgress)

        tvOptionZero = findViewById(R.id.tvOptionZero)
        tvOptionOne = findViewById(R.id.tvOptionOne)
        tvOptionTwo = findViewById(R.id.tvOptionTwo)
        tvOptionThree = findViewById(R.id.tvOptionThree)

        btnSubmit = findViewById(R.id.btnSubmit)

        // display first question
        setDisplay(currentPosition)

        // clear the selected option and set selected option
        tvOptionZero?.setOnClickListener {
            if (!isAnswered) {
                clearSelectedOption()
                setSelectedOption(0)
            }
        }
        tvOptionOne?.setOnClickListener {
            if (!isAnswered) {
                clearSelectedOption()
                setSelectedOption(1)
            }
        }
        tvOptionTwo?.setOnClickListener {
            if (!isAnswered) {
                clearSelectedOption()
                setSelectedOption(2)
            }
        }
        tvOptionThree?.setOnClickListener {
            if (!isAnswered) {
                clearSelectedOption()
                setSelectedOption(3)
            }
        }

        // check the state
        // to display next question or display the correct answer
        btnSubmit?.setOnClickListener {
            if ((currentPosition + 1) == questionList.size && isAnswered) {
                btnSubmit?.text = getString(R.string.finish)
//                Toast.makeText(this, "You got $correctAnswer correct answers", Toast.LENGTH_SHORT
//                ).show()
                val intent = Intent(this, FinishActivity::class.java)
                intent.putExtra(Constant.USER_NAME, userName)
                intent.putExtra(Constant.TOTAL_QUESTIONS, questionList.size.toString())
                intent.putExtra(Constant.CORRECT_ANSWERS, correctAnswer.toString())
                startActivity(intent)
                finish()
            } else {
                if (isAnswered) {
                    isAnswered = false
                    nextQuestion()
                } else {
                    selectedOption?.let {
                        isAnswered = true
                        answer(it)
                    }
                }
            }
        }

    }

    // set the selected option
    private fun setSelectedOption(index: Int) {
        selectedOption = index
        when (index) {
            0 -> {
                tvOptionZero?.background =
                    ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
                tvOptionZero?.setTextColor(Color.parseColor("#000000"))
                tvOptionZero?.typeface = Typeface.DEFAULT_BOLD
            }
            1 -> {
                tvOptionOne?.background =
                    ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
                tvOptionOne?.setTextColor(Color.parseColor("#000000"))
                tvOptionOne?.typeface = Typeface.DEFAULT_BOLD
            }
            2 -> {
                tvOptionTwo?.background =
                    ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
                tvOptionTwo?.setTextColor(Color.parseColor("#000000"))
                tvOptionTwo?.typeface = Typeface.DEFAULT_BOLD
            }
            3 -> {
                tvOptionThree?.background =
                    ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
                tvOptionThree?.setTextColor(Color.parseColor("#000000"))
                tvOptionThree?.typeface = Typeface.DEFAULT_BOLD
            }
        }
    }

    // clear the selected option
    private fun clearSelectedOption() {
        selectedOption = null
        val options = ArrayList<TextView>()
        // put the text view into options array list
        tvOptionZero?.let { options.add(it) }
        tvOptionOne?.let { options.add(it) }
        tvOptionTwo?.let { options.add(it) }
        tvOptionThree?.let { options.add(it) }
        for (option in options) {
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
            option.setTextColor(Color.parseColor("#6b7280"))
            option.typeface = Typeface.DEFAULT
        }
    }

    // display next question
    private fun nextQuestion() {
        currentPosition++
        btnSubmit?.text = getString(R.string.submit)
        btnSubmit?.setBackgroundColor(ContextCompat.getColor(this,R.color.indigo_500))
        setDisplay(currentPosition)
    }

    // display the correct answer
    private fun answer(index: Int) {
        btnSubmit?.text = getString(R.string.next)
        btnSubmit?.setBackgroundColor(ContextCompat.getColor(this,R.color.purple_500))
        userAnswers.add(index)
        val answer = questionList[currentPosition].answer
        if (index == answer) {
            correctAnswer++
//            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
        } //else {
//            Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
//        }
        when (index) {
            0 -> {
                tvOptionZero?.setBackgroundResource(R.color.red_300)
            }
            1 -> {
                tvOptionOne?.setBackgroundResource(R.color.red_300)
            }
            2 -> {
                tvOptionTwo?.setBackgroundResource(R.color.red_300)
            }
            3 -> {
                tvOptionThree?.setBackgroundResource(R.color.red_300)
            }
        }
        when (answer) {
            0 -> {
                tvOptionZero?.setBackgroundResource(R.color.green_300)
                tvOptionZero?.typeface = Typeface.DEFAULT_BOLD
                tvOptionZero?.setTextColor(Color.parseColor("#000000"))
            }
            1 -> {
                tvOptionOne?.setBackgroundResource(R.color.green_300)
                tvOptionOne?.typeface = Typeface.DEFAULT_BOLD
                tvOptionOne?.setTextColor(Color.parseColor("#000000"))
            }
            2 -> {
                tvOptionTwo?.setBackgroundResource(R.color.green_300)
                tvOptionTwo?.typeface = Typeface.DEFAULT_BOLD
                tvOptionTwo?.setTextColor(Color.parseColor("#000000"))
            }
            3 -> {
                tvOptionThree?.setBackgroundResource(R.color.green_300)
                tvOptionThree?.typeface = Typeface.DEFAULT_BOLD
                tvOptionThree?.setTextColor(Color.parseColor("#000000"))
            }
        }
    }

    private fun setDisplay(index: Int) {
        val currentProgress = "${index + 1}/${pbProgress?.max}"
        clearSelectedOption()
        tvProgress?.text = currentProgress
        tvQuestion?.text = questionList[index].question
        pbProgress?.progress = index + 1
        ivImage?.setImageResource(questionList[index].image)
        tvOptionZero?.text = questionList[index].option0
        tvOptionOne?.text = questionList[index].option1
        tvOptionTwo?.text = questionList[index].option2
        tvOptionThree?.text = questionList[index].option3
    }

}