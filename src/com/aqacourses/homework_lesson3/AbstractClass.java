package com.aqacourses.homework_lesson3;
/*
Создайте абстрактный класс который содержит конструктор что принимает виде параметра int numOfMonth и содержит абстрактный метод printPhrase
Также абстрактный класс содержит в себе энам (да так можно), который содержит в себе все месяца.в виде JANUARY, FEBRUARY и так далее.
Также содержит не абстрактный метод  getMonthNameByNum который используя numOfMonth возвращает месяц по номеру.

 */
public abstract class AbstractClass {
    AbstractClass(int numOfMonth){ }   //конструктор

    abstract void printPhrase();       // абстрактный метод

    private enum MonthsOfTheYear {          //   enum месяцев
        JANAURY("Janaury"),
        FEBRUARY("February"),
        MARCH("March"),
        APRIL("April"),
        MAY("May"),
        JUNE("June"),
        JULY("July"),
        AUGUST("August"),
        SEPTEMBER("September"),
        OCTOBER("October"),
        NOVEMBER("November"),
        DECEMBER("December");

        private String month;

        MonthsOfTheYear(String month) {
        this.month = month;
        }

        public String getMonthNameByNum(int numOfMonth){return month;}
    }




}


