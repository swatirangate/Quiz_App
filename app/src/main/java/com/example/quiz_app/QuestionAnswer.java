package com.example.quiz_app;

public class QuestionAnswer {
    public static String[] question ={
            "Which of the following is not a java keyword?",
            "Appropriate data type for value 2.2 ?",
            "A UML association is ?",
            "Correct syntax for java main method ?",
            "Correct syntax to declare integer type variable?"
    };

    public static String[][] choices ={
            {"int", "new", "Integer", "double"},
            {"double", "String", "int", "boolean"},
            {"implemented as a java method", "implemented as a java class", "implemented as a java attribute member", "none of the above"},
            { "public void main(String args[])", "public static void main()", "public static void main(string args[])", "none of the above"},
            {"int a", "boolean a", "String a", "none of the above"}
    };

    public static String[] correctAnswer ={
            "Integer",
            "double",
            "implemented as a java attribute member",
            "none of the above",
            "int a"
    };
}
