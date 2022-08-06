package wend.web.id.quiz

object Constant {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): List<Question> {
        val questionList = ArrayList<Question>()

        questionList.add(
            Question(
                1,
                "What country does this flag belong to?",
                R.drawable.indonesia,
                "Indonesia",
                "Malaysia",
                "Cambodia",
                "Laos",
                0
            )
        )
        questionList.add(
            Question(
                2,
                "What country does this flag belong to?",
                R.drawable.malaysia,
                "Indonesia",
                "Malaysia",
                "Cambodia",
                "Laos",
                1
            )
        )
        questionList.add(
            Question(
                3,
                "What country does this flag belong to?",
                R.drawable.cambodia,
                "Indonesia",
                "Malaysia",
                "Cambodia",
                "Laos",
                2
            )
        )
        questionList.add(
            Question(
                4,
                "What country does this flag belong to?",
                R.drawable.laos,
                "Indonesia",
                "Malaysia",
                "Cambodia",
                "Laos",
                3
            )
        )
        questionList.add(
            Question(
                5,
                "What country does this flag belong to?",
                R.drawable.thailand,
                "Thailand",
                "Vietnam",
                "Myanmar",
                "Laos",
                0
            )
        )
        questionList.add(
            Question(
                6,
                "What country does this flag belong to?",
                R.drawable.vietnam,
                "Thailand",
                "Vietnam",
                "Myanmar",
                "Laos",
                1
            )
        )
        questionList.add(
            Question(
                7,
                "What country does this flag belong to?",
                R.drawable.myanmar,
                "Thailand",
                "Vietnam",
                "Myanmar",
                "Laos",
                2
            )
        )
        questionList.add(
            Question(
                8,
                "What country does this flag belong to?",
                R.drawable.philippines,
                "Philippines",
                "Indonesia",
                "Malaysia",
                "Cambodia",
                0
            )
        )
        questionList.add(
            Question(
                9,
                "What country does this flag belong to?",
                R.drawable.ukraine,
                "Philippines",
                "Ukraine",
                "Venezuela",
                "Uzbekistan",
                1
            )
        )
        questionList.add(
            Question(
                10,
                "What country does this flag belong to?",
                R.drawable.venezuela,
                "Philippines",
                "Ukraine",
                "Venezuela",
                "Uzbekistan",
                2
            )
        )
        questionList.add(
            Question(
                11,
                "What country does this flag belong to?",
                R.drawable.uzbekistan,
                "Philippines",
                "Ukraine",
                "Venezuela",
                "Uzbekistan",
                3
            )
        )
        questionList.add(
            Question(
                12,
                "What country does this flag belong to?",
                R.drawable.iran,
                "Iran",
                "Iraq",
                "Syrian",
                "Turkey",
                0
            )
        )
        questionList.add(
            Question(
                13,
                "What country does this flag belong to?",
                R.drawable.iraq,
                "Iran",
                "Iraq",
                "Syrian",
                "Turkey",
                1
            )
        )
        questionList.add(
            Question(
                14,
                "What country does this flag belong to?",
                R.drawable.syrian,
                "Iran",
                "Iraq",
                "Syrian",
                "Turkey",
                2
            )
        )
        questionList.add(
            Question(
                15,
                "What country does this flag belong to?",
                R.drawable.turkey,
                "Iran",
                "Iraq",
                "Syrian",
                "Turkey",
                3
            )
        )
        questionList.add(
            Question(
                16,
                "What country does this flag belong to?",
                R.drawable.egypt,
                "Egypt",
                "Libya",
                "Algeria",
                "Morocco",
                0
            )
        )
        questionList.add(
            Question(
                17,
                "What country does this flag belong to?",
                R.drawable.libya,
                "Egypt",
                "Libya",
                "Algeria",
                "Morocco",
                1
            )
        )
        questionList.add(
            Question(
                18,
                "What country does this flag belong to?",
                R.drawable.algeria,
                "Egypt",
                "Libya",
                "Algeria",
                "Morocco",
                2
            )
        )
        questionList.add(
            Question(
                19,
                "What country does this flag belong to?",
                R.drawable.morocco,
                "Egypt",
                "Libya",
                "Algeria",
                "Morocco",
                3
            )
        )
        questionList.add(
            Question(
                20,
                "What country does this flag belong to?",
                R.drawable.ghana,
                "Ghana",
                "Nigeria",
                "Togo",
                "Benin",
                0
            )
        )
        questionList.add(
            Question(
                21,
                "What country does this flag belong to?",
                R.drawable.nigeria,
                "Ghana",
                "Nigeria",
                "Togo",
                "Benin",
                1
            )
        )
        questionList.add(
            Question(
                22,
                "What country does this flag belong to?",
                R.drawable.togo,
                "Ghana",
                "Nigeria",
                "Togo",
                "Benin",
                2
            )
        )
        questionList.add(
            Question(
                23,
                "What country does this flag belong to?",
                R.drawable.benin,
                "Ghana",
                "Nigeria",
                "Togo",
                "Benin",
                3
            )
        )
        questionList.add(
            Question(
                24,
                "What country does this flag belong to?",
                R.drawable.kenya,
                "Kenya",
                "Uganda",
                "Tanzania",
                "Ethiopia",
                0
            )
        )
        questionList.add(
            Question(
                25,
                "What country does this flag belong to?",
                R.drawable.uganda,
                "Kenya",
                "Uganda",
                "Tanzania",
                "Ethiopia",
                1
            )
        )
        questionList.add(
            Question(
                26,
                "What country does this flag belong to?",
                R.drawable.tanzania,
                "Kenya",
                "Uganda",
                "Tanzania",
                "Ethiopia",
                2
            )
        )
        questionList.add(
            Question(
                27,
                "What country does this flag belong to?",
                R.drawable.ethiopia,
                "Kenya",
                "Uganda",
                "Tanzania",
                "Ethiopia",
                3
            )
        )
        questionList.add(
            Question(
                28,
                "What country does this flag belong to?",
                R.drawable.south,
                "South Africa",
                "Zimbabwe",
                "Namibia",
                "Botswana",
                0
            )
        )
        questionList.add(
            Question(
                29,
                "What country does this flag belong to?",
                R.drawable.zimbabwe,
                "South Africa",
                "Zimbabwe",
                "Namibia",
                "Botswana",
                1
            )
        )
        questionList.add(
            Question(
                30,
                "What country does this flag belong to?",
                R.drawable.namibia,
                "South Africa",
                "Zimbabwe",
                "Namibia",
                "Botswana",
                2
            )
        )
        questionList.add(
            Question(
                31,
                "What country does this flag belong to?",
                R.drawable.bostwana,
                "South Africa",
                "Zimbabwe",
                "Namibia",
                "Botswana",
                3
            )
        )
        questionList.add(
            Question(
                32,
                "What country does this flag belong to?",
                R.drawable.angola,
                "Angola",
                "Mozambique",
                "Zambia",
                "Zimbabwe",
                0
            )
        )
        questionList.add(
            Question(
                33,
                "What country does this flag belong to?",
                R.drawable.mozambique,
                "Angola",
                "Mozambique",
                "Zambia",
                "Zimbabwe",
                1
            )
        )
        questionList.add(
            Question(
                34,
                "What country does this flag belong to?",
                R.drawable.zambia,
                "Angola",
                "Mozambique",
                "Zambia",
                "Zimbabwe",
                2
            )
        )
        questionList.add(
            Question(
                35,
                "What country does this flag belong to?",
                R.drawable.zimbabwe,
                "Angola",
                "Mozambique",
                "Zambia",
                "Zimbabwe",
                3
            )
        )
        questionList.add(
            Question(
                36,
                "What country does this flag belong to?",
                R.drawable.finland,
                "Finland",
                "Sweden",
                "Norway",
                "Denmark",
                0
            )
        )
        questionList.add(
            Question(
                37,
                "What country does this flag belong to?",
                R.drawable.sweden,
                "Finland",
                "Sweden",
                "Norway",
                "Denmark",
                1
            )
        )
        questionList.add(
            Question(
                38,
                "What country does this flag belong to?",
                R.drawable.norway,
                "Finland",
                "Sweden",
                "Norway",
                "Denmark",
                2
            )
        )
        questionList.add(
            Question(
                39,
                "What country does this flag belong to?",
                R.drawable.denmark,
                "Finland",
                "Sweden",
                "Norway",
                "Denmark",
                3
            )
        )
        questionList.add(
            Question(
                40,
                "What country does this flag belong to?",
                R.drawable.germany,
                "Germany",
                "Austria",
                "Switzerland",
                "Belgium",
                0
            )
        )
        questionList.add(
            Question(
                41,
                "What country does this flag belong to?",
                R.drawable.austria,
                "Germany",
                "Austria",
                "Switzerland",
                "Belgium",
                1
            )
        )
        questionList.add(
            Question(
                42,
                "What country does this flag belong to?",
                R.drawable.switzerland,
                "Germany",
                "Austria",
                "Switzerland",
                "Belgium",
                2
            )
        )
        questionList.add(
            Question(
                43,
                "What country does this flag belong to?",
                R.drawable.belgium,
                "Germany",
                "Austria",
                "Switzerland",
                "Belgium",
                3
            )
        )
        questionList.add(
            Question(
                44,
                "What country does this flag belong to?",
                R.drawable.italy,
                "Italy",
                "France",
                "Spain",
                "Portugal",
                0
            )
        )
        questionList.add(
            Question(
                45,
                "What country does this flag belong to?",
                R.drawable.france,
                "Italy",
                "France",
                "Spain",
                "Portugal",
                1
            )
        )
        questionList.add(
            Question(
                46,
                "What country does this flag belong to?",
                R.drawable.spain,
                "Italy",
                "France",
                "Spain",
                "Portugal",
                2
            )
        )
        questionList.add(
            Question(
                47,
                "What country does this flag belong to?",
                R.drawable.portugal,
                "Italy",
                "France",
                "Spain",
                "Portugal",
                3
            )
        )
        questionList.add(
            Question(
                48,
                "What country does this flag belong to?",
                R.drawable.greece,
                "Greece",
                "Cyprus",
                "Albania",
                "Bulgaria",
                0
            )
        )
        questionList.add(
            Question(
                49,
                "What country does this flag belong to?",
                R.drawable.cyprus,
                "Greece",
                "Cyprus",
                "Albania",
                "Bulgaria",
                1
            )
        )
        questionList.add(
            Question(
                50,
                "What country does this flag belong to?",
                R.drawable.albania,
                "Greece",
                "Cyprus",
                "Albania",
                "Bulgaria",
                2
            )
        )
        questionList.add(
            Question(
                51,
                "What country does this flag belong to?",
                R.drawable.bulgaria,
                "Greece",
                "Cyprus",
                "Albania",
                "Bulgaria",
                3
            )
        )
        questionList.add(
            Question(
                52,
                "What country does this flag belong to?",
                R.drawable.netherlands,
                "Netherlands",
                "Belgium",
                "Luxembourg",
                "Germany",
                0
            )
        )
        questionList.add(
            Question(
                53,
                "What country does this flag belong to?",
                R.drawable.belgium,
                "Netherlands",
                "Belgium",
                "Luxembourg",
                "Germany",
                1
            )
        )
        questionList.add(
            Question(
                54,
                "What country does this flag belong to?",
                R.drawable.luxembourg,
                "Netherlands",
                "Belgium",
                "Luxembourg",
                "Germany",
                2
            )
        )
        questionList.add(
            Question(
                55,
                "What country does this flag belong to?",
                R.drawable.germany,
                "Netherlands",
                "Belgium",
                "Luxembourg",
                "Germany",
                3
            )
        )
        questionList.add(
            Question(
                56,
                "What country does this flag belong to?",
                R.drawable.sweden,
                "Sweden",
                "Norway",
                "Denmark",
                "Finland",
                0
            )
        )
        questionList.add(
            Question(
                57,
                "What country does this flag belong to?",
                R.drawable.norway,
                "Sweden",
                "Norway",
                "Denmark",
                "Finland",
                1
            )
        )
        questionList.add(
            Question(
                58,
                "What country does this flag belong to?",
                R.drawable.denmark,
                "Sweden",
                "Norway",
                "Denmark",
                "Finland",
                2
            )
        )
        questionList.add(
            Question(
                59,
                "What country does this flag belong to?",
                R.drawable.finland,
                "Sweden",
                "Norway",
                "Denmark",
                "Finland",
                3
            )
        )
        questionList.add(
            Question(
                60,
                "What country does this flag belong to?",
                R.drawable.austria,
                "Austria",
                "Switzerland",
                "Belgium",
                "Germany",
                0
            )
        )
        questionList.add(
            Question(
                61,
                "What country does this flag belong to?",
                R.drawable.switzerland,
                "Austria",
                "Switzerland",
                "Belgium",
                "Germany",
                1
            )
        )
        questionList.add(
            Question(
                62,
                "What country does this flag belong to?",
                R.drawable.belgium,
                "Austria",
                "Switzerland",
                "Belgium",
                "Germany",
                2
            )
        )
        questionList.add(
            Question(
                63,
                "What country does this flag belong to?",
                R.drawable.germany,
                "Austria",
                "Switzerland",
                "Belgium",
                "Germany",
                3
            )
        )
        questionList.add(
            Question(
                64,
                "What country does this flag belong to?",
                R.drawable.france,
                "France",
                "Spain",
                "Portugal",
                "Italy",
                0
            )
        )
        questionList.add(
            Question(
                65,
                "What country does this flag belong to?",
                R.drawable.spain,
                "France",
                "Spain",
                "Portugal",
                "Italy",
                1
            )
        )
        questionList.add(
            Question(
                66,
                "What country does this flag belong to?",
                R.drawable.portugal,
                "France",
                "Spain",
                "Portugal",
                "Italy",
                2
            )
        )
        questionList.add(
            Question(
                67,
                "What country does this flag belong to?",
                R.drawable.italy,
                "France",
                "Spain",
                "Portugal",
                "Italy",
                3
            )
        )
        questionList.add(
            Question(
                68,
                "What country does this flag belong to?",
                R.drawable.cyprus,
                "Cyprus",
                "Albania",
                "Bulgaria",
                "Greece",
                0
            )
        )
        questionList.add(
            Question(
                69,
                "What country does this flag belong to?",
                R.drawable.albania,
                "Cyprus",
                "Albania",
                "Bulgaria",
                "Greece",
                1
            )
        )
        questionList.add(
            Question(
                70,
                "What country does this flag belong to?",
                R.drawable.bulgaria,
                "Cyprus",
                "Albania",
                "Bulgaria",
                "Greece",
                2
            )
        )
        questionList.add(
            Question(
                71,
                "What country does this flag belong to?",
                R.drawable.greece,
                "Cyprus",
                "Albania",
                "Bulgaria",
                "Greece",
                3
            )
        )
        questionList.add(
            Question(
                72,
                "What country does this flag belong to?",
                R.drawable.belgium,
                "Belgium",
                "Luxembourg",
                "Germany",
                "Netherlands",
                0
            )
        )
        questionList.add(
            Question(
                73,
                "What country does this flag belong to?",
                R.drawable.luxembourg,
                "Belgium",
                "Luxembourg",
                "Germany",
                "Netherlands",
                1
            )
        )
        questionList.add(
            Question(
                74,
                "What country does this flag belong to?",
                R.drawable.germany,
                "Belgium",
                "Luxembourg",
                "Germany",
                "Netherlands",
                2
            )
        )
        questionList.add(
            Question(
                75,
                "What country does this flag belong to?",
                R.drawable.netherlands,
                "Belgium",
                "Luxembourg",
                "Germany",
                "Netherlands",
                3
            )
        )
        questionList.add(
            Question(
                76,
                "What country does this flag belong to?",
                R.drawable.japan,
                "Japan",
                "South Korea",
                "China",
                "Taiwan",
                0
            )
        )
        questionList.add(
            Question(
                77,
                "What country does this flag belong to?",
                R.drawable.japan,
                "South Korea",
                "Japan",
                "China",
                "Taiwan",
                1
            )
        )
        questionList.add(
            Question(
                78,
                "What country does this flag belong to?",
                R.drawable.china,
                "Japan",
                "South Korea",
                "China",
                "Taiwan",
                2
            )
        )
        questionList.add(
            Question(
                79,
                "What country does this flag belong to?",
                R.drawable.taiwan,
                "Japan",
                "South Korea",
                "China",
                "Taiwan",
                3
            )
        )
        questionList.add(
            Question(
                80,
                "What country does this flag belong to?",
                R.drawable.fiji,
                "Fiji",
                "Tonga",
                "Samoa",
                "Kiribati",
                0
            )
        )
        questionList.add(
            Question(
                81,
                "What country does this flag belong to?",
                R.drawable.tonga,
                "Fiji",
                "Tonga",
                "Samoa",
                "Kiribati",
                1
            )
        )
        questionList.add(
            Question(
                82,
                "What country does this flag belong to?",
                R.drawable.samoa,
                "Fiji",
                "Tonga",
                "Samoa",
                "Kiribati",
                2
            )
        )
        questionList.add(
            Question(
                83,
                "What country does this flag belong to?",
                R.drawable.kiribati,
                "Fiji",
                "Tonga",
                "Samoa",
                "Kiribati",
                3
            )
        )
        questionList.add(
            Question(
                84,
                "What country does this flag belong to?",
                R.drawable.samoa,
                "Tonga",
                "Fiji",
                "Kiribati",
                "Samoa",
                3
            )
        )
        questionList.add(
            Question(
                85,
                "What country does this flag belong to?",
                R.drawable.kiribati,
                "Fiji",
                "Tonga",
                "Kiribati",
                "Samoa",
                2
            )
        )
        questionList.add(
            Question(
                85,
                "What country does this flag belong to?",
                R.drawable.fiji,
                "Australia",
                "New Zealand",
                "Fiji",
                "Tonga",
                2
            )
        )
        questionList.add(
            Question(
                86,
                "What country does this flag belong to?",
                R.drawable.sierra,
                "Guinea",
                "Guinea-Bissau",
                "Liberia",
                "Sierra Leone",
                3
            )
        )
        questionList.add(
            Question(
                87,
                "What country does this flag belong to?",
                R.drawable.tonga,
                "Australia",
                "New Zealand",
                "Fiji",
                "Tonga",
                3
            )
        )
        questionList.add(
            Question(
                88,
                "What country does this flag belong to?",
                R.drawable.guinea,
                "Guinea",
                "Guinea-Bissau",
                "Sierra Leone",
                "Liberia",
                0
            )
        )
        questionList.add(
            Question(
                89,
                "What country does this flag belong to?",
                R.drawable.portugal,
                "Portugal",
                "Greece",
                "Spain",
                "Italy",
                0
            )
        )
        questionList.add(
            Question(
                90,
                "What country does this flag belong to?",
                R.drawable.greece,
                "Portugal",
                "Greece",
                "Spain",
                "Italy",
                1
            )
        )
        questionList.add(
            Question(
                91,
                "What country does this flag belong to?",
                R.drawable.spain,
                "Portugal",
                "Greece",
                "Spain",
                "Italy",
                2
            )
        )
        questionList.add(
            Question(
                92,
                "What country does this flag belong to?",
                R.drawable.italy,
                "Portugal",
                "Greece",
                "Spain",
                "Italy",
                3
            )
        )
        questionList.add(
            Question(
                93,
                "What country does this flag belong to?",
                R.drawable.india,
                "India",
                "Pakistan",
                "Bangladesh",
                "Sri Lanka",
                0
            )
        )
        questionList.add(
            Question(
                94,
                "What country does this flag belong to?",
                R.drawable.pakistan,
                "India",
                "Pakistan",
                "Bangladesh",
                "Sri Lanka",
                1
            )
        )
        questionList.add(
            Question(
                95,
                "What country does this flag belong to?",
                R.drawable.bangladesh,
                "India",
                "Pakistan",
                "Bangladesh",
                "Sri Lanka",
                2
            )
        )
        questionList.add(
            Question(
                96,
                "What country does this flag belong to?",
                R.drawable.singapore,
                "Indonesia",
                "Lithuania",
                "Kenya",
                "Singapore",
                3
            )
        )
        questionList.add(
            Question(
                97,
                "What country does this flag belong to?",
                R.drawable.singapore,
                "Singapore",
                "Malaysia",
                "Brunei",
                "Indonesia",
                0
            )
        )
        questionList.add(
            Question(
                98,
                "What country does this flag belong to?",
                R.drawable.malaysia,
                "Singapore",
                "Malaysia",
                "Brunei",
                "Indonesia",
                1
            )
        )
        questionList.add(
            Question(
                99,
                "What country does this flag belong to?",
                R.drawable.brunei,
                "Singapore",
                "Malaysia",
                "Brunei",
                "Indonesia",
                2
            )
        )
        questionList.add(
            Question(
                100,
                "What country does this flag belong to?",
                R.drawable.indonesia,
                "Singapore",
                "Malaysia",
                "Brunei",
                "Indonesia",
                3
            )
        )
        questionList.add(
            Question(
                101,
                "What country does this flag belong to?",
                R.drawable.sudan,
                "Sudan",
                "South Sudan",
                "Eritrea",
                "Ethiopia",
                0
            )
        )
        questionList.add(
            Question(
                102,
                "What country does this flag belong to?",
                R.drawable.saudi,
                "Saudi Arabia",
                "Yemen",
                "Oman",
                "Qatar",
                0
            )
        )
        questionList.add(
            Question(
                103,
                "What country does this flag belong to?",
                R.drawable.yemen,
                "Saudi Arabia",
                "Yemen",
                "Oman",
                "Qatar",
                1
            )
        )
        questionList.add(
            Question(
                104,
                "What country does this flag belong to?",
                R.drawable.oman,
                "Saudi Arabia",
                "Yemen",
                "Oman",
                "Qatar",
                2
            )
        )
        questionList.add(
            Question(
                105,
                "What country does this flag belong to?",
                R.drawable.qatar,
                "Saudi Arabia",
                "Yemen",
                "Oman",
                "Qatar",
                3
            )
        )
        questionList.add(
            Question(
                106,
                "What country does this flag belong to?",
                R.drawable.nepal,
                "Nepal",
                "Bhutan",
                "India",
                "Sri Lanka",
                0
            )
        )
        questionList.add(
            Question(
                107,
                "What country does this flag belong to?",
                R.drawable.bhutan,
                "Nepal",
                "Bhutan",
                "India",
                "Sri Lanka",
                1
            )
        )
        questionList.add(
            Question(
                108,
                "What country does this flag belong to?",
                R.drawable.india,
                "Nepal",
                "Bhutan",
                "India",
                "Sri Lanka",
                2
            )
        )
        questionList.add(
            Question(
                109,
                "What country does this flag belong to?",
                R.drawable.nigeria,
                "Nigeria",
                "Ghana",
                "Togo",
                "Benin",
                0
            )
        )
        questionList.add(
            Question(
                110,
                "What country does this flag belong to?",
                R.drawable.ghana,
                "Nigeria",
                "Ghana",
                "Togo",
                "Benin",
                1
            )
        )
        questionList.add(
            Question(
                111,
                "What country does this flag belong to?",
                R.drawable.togo,
                "Nigeria",
                "Ghana",
                "Togo",
                "Benin",
                2
            )
        )
        questionList.add(
            Question(
                112,
                "What country does this flag belong to?",
                R.drawable.benin,
                "Nigeria",
                "Ghana",
                "Togo",
                "Benin",
                3
            )
        )
        questionList.add(
            Question(
                113,
                "What country does this flag belong to?",
                R.drawable.russia,
                "Russia",
                "Ukraine",
                "Belarus",
                "Kazakhstan",
                0
            )
        )
        questionList.add(
            Question(
                114,
                "What country does this flag belong to?",
                R.drawable.ukraine,
                "Russia",
                "Ukraine",
                "Belarus",
                "Kazakhstan",
                1
            )
        )
        questionList.add(
            Question(
                115,
                "What country does this flag belong to?",
                R.drawable.belarus,
                "Russia",
                "Ukraine",
                "Belarus",
                "Kazakhstan",
                2
            )
        )
        questionList.add(
            Question(
                116,
                "What country does this flag belong to?",
                R.drawable.kazakhstan,
                "Russia",
                "Ukraine",
                "Belarus",
                "Kazakhstan",
                3
            )
        )
        questionList.add(
            Question(
                117,
                "What country does this flag belong to?",
                R.drawable.brunei,
                "Brunei",
                "Malaysia",
                "Singapore",
                "Indonesia",
                0
            )
        )
        questionList.add(
            Question(
                118,
                "What country does this flag belong to?",
                R.drawable.malaysia,
                "Brunei",
                "Malaysia",
                "Singapore",
                "Indonesia",
                1
            )
        )
        questionList.add(
            Question(
                119,
                "What country does this flag belong to?",
                R.drawable.singapore,
                "Brunei",
                "Malaysia",
                "Singapore",
                "Indonesia",
                2
            )
        )
        questionList.add(
            Question(
                120,
                "What country does this flag belong to?",
                R.drawable.indonesia,
                "Brunei",
                "Malaysia",
                "Singapore",
                "Indonesia",
                3
            )
        )
        questionList.add(
            Question(
                121,
                "What country does this flag belong to?",
                R.drawable.canada,
                "Canada",
                "United States",
                "Mexico",
                "Cuba",
                0
            )
        )
        questionList.add(
            Question(
                122,
                "What country does this flag belong to?",
                R.drawable.canada,
                "Cuba",
                "United States",
                "Laos",
                "Canada",
                3
            )
        )
        questionList.add(
            Question(
                123,
                "What country does this flag belong to?",
                R.drawable.mexico,
                "Canada",
                "United States",
                "Mexico",
                "Cuba",
                2
            )
        )
        questionList.add(
            Question(
                124,
                "What country does this flag belong to?",
                R.drawable.cuba,
                "Canada",
                "United States",
                "Mexico",
                "Cuba",
                3
            )
        )

        val numberOfQuestion = 8
        return questionList.asSequence().shuffled().take(numberOfQuestion).toList()
    }
}