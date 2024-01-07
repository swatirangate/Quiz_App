package com.example.quiz_app;

public class pythonQuestionAnswer {
    public static String[] question ={
            "Which type of Programming does Python support?",
            "Is Python case sensitive when dealing with identifiers?",
            "Which of the following is the correct extension of the Python file?",
            "Is Python code compiled or interpreted?",
            "What will be the value of the '4 + 3 % 5' Python expression?"

    };

    public static String[][] choices ={
            {"object-oriented programming","structured programming","functional programming", "all of the mentioned"},
            {"no", "yes","machine dependent", "none of the mentioned"},
            {".python", ".py", ".pl", ".p"},
            {"Both compiled and interpreted","Neither compiled nor interpreted","Python code is only compiled", "Python code is only interpreted"},
            {"7", "2", "4", "1"}
    };

    public static String[] correctAnswer ={
            "all of the mentioned",
            "yes",
            ".py",
            "Both compiled and interpreted",
            "7"
    };
}
