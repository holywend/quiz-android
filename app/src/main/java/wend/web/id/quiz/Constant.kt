package wend.web.id.quiz

object Constant {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val q1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.afghanistan,
            "Afghanistan",
            "Albania",
            "Algeria",
            "Andorra",
            0
        )
        questionList.add(q1)
        val q2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.bhutan,
            "Bangladesh",
            "Bahamas",
            "Barbados",
            "Bhutan",
            3
        )
        questionList.add(q2)
        val q3 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.colombia,
            "Czech",
            "Colombia",
            "Cuba",
            "Croatia",
            1
        )
        questionList.add(q3)
        val q4 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.kazakhstan,
            "Kenya",
            "Kuwait",
            "Kazakhstan",
            "Kyrgyzstan",
            2
        )
        questionList.add(q4)
        val q5 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.laos,
            "Latvia",
            "Laos",
            "Luxembourg",
            "Libya",
            1
        )
        questionList.add(q5)


        return questionList
    }
}