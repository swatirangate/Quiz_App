package com.example.quiz_app;

public class CppQuestionAnswer {
    public static String[] question ={
            "Identify the correct extension of the user-defined header file in C++.",
            "Identify the incorrect constructor type.",
            "C++ uses which approach?",
            "Which of the following data type is supported in C++ but not in C?",
            "Which of the following is “address of operator”?"
    };

    public static String[][] choices ={
            {".cpp", ".hg", ".h", ".hf"},
            {"Friend Constructor", "Copy Constructor", "Default Constructor", "Parameterized Constructor"},
            {"right-left", "top-down", "left-right", "bottom-up"},
            { "int", "bool", "double", "float"},
            {"*", "&", "[]", "&&"}
    };

    public static String[] correctAnswer ={
            ".h",
            "Friend Constructor",
            "bottom-up",
            "bool",
            "&"
    };
}
