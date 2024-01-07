package com.example.quiz_app;

public class CQuestionAnswers {
    public static String[] question ={
            "What is the size of ‘int’?",
            "Which of the following is a logical OR operator?",
            "In C, what is the correct hierarchy of arithmetic operations?",
            "The library function strrchr() finds the first occurrence of a substring in another string.",
            "How can you create a variable with the numeric value 5?"
    };

    public static String[][] choices ={
            {"2", "4", "8", "Compiler Dependent"},
            {"&", "&&", "||", "None of the above"},
            {"- * / + -", "- * + - /", "- / * + -", "- + - / *"},
            { "Yes", "Strstr()", "strchr()", "strnset()"},
            {"num = 5;", "num = 5 int;", "val num = 5;", "int num = 5;"}
    };

    public static String[] correctAnswer ={
            "Compiler Dependent",
            "||",
            "- / * + -",
            "Strstr()",
            "int num = 5;"
    };
}
