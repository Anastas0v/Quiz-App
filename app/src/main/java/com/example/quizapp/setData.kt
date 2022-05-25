package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "What is Kotlin?",

           "Planet",
           "City In USA",
           "Animal",
           "Programming Language",
           4
       )
       var question2 = QuestionData(
           2,
           "When was Kotlin developed?",

           "2016",
           "2021",
           "2000",
           "Not on the list",
           1
       )
       var question3 = QuestionData(
           3,
           "Can I Make Android App Using Kotlin?",

           "No",
           "Yes",
           "Maybe if you try.",
           "Not at all.",
           2
       )
       var question4 = QuestionData(
           4,
           "How many constructors are available in Kotlin?",

           "Three",
           "One",
           "Two",
           "More than three",
           3
       )

       var question5 = QuestionData(
           5,
           "Who is the developer of Kotlin?",

           "Microsoft",
           "Tesla",
           "JetBrains",
           "Google",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}