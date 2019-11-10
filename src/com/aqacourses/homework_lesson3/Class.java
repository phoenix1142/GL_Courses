package com.aqacourses.homework_lesson3;

import static com.aqacourses.homework_lesson3.DaysOfWeek.*;

/*
Создайте класс который имплементит интерфейс. printPhrase пусть выводит в консоль фразу на ваш выбор
returnDayNameByNum возвращает имя дня по номеру.
returnDayNumByName возвращает номер по имени.
Используйте созданный энам с константами. Можете сделать switch
 */
public class Class implements Print {

    @Override
    public void printPhrase() {
        System.out.println("На данный момент тяжко всё это дается!");
    }

    @Override
    public String returnDayNameByNum(int numOfDay) {
        String day;
        switch (numOfDay){
            case 1: day = MONDAY.getDay();
                    break;
            case 2: day = TUESDAY.getDay();
                    break;
            case 3: day = WEDNESDAY.getDay();
                    break;
            case 4: day = THURSDAY.getDay();
                    break;
            case 5: day = FRIDAY.getDay();
                    break;
            case 6: day = SATURDAY.getDay();
                    break;
            case 7: day = SUNDAY.getDay();
                    break;
            default:
                day = "Нет такого дня!";
                    break;

        }
    return day;
    }

    @Override
    public int returnDayNameByNum(String name) {
        int numberOfDay;
        switch (name){
            case MONDAY: numberOfDay = MONDAY.getNumberOfDay();
            break;
            case TUESDAY: numberOfDay = TUESDAY.getNumberOfDay();
                break;
            case WEDNESDAY: numberOfDay = WEDNESDAY.getNumberOfDay();
                break;
            case THURSDAY: numberOfDay = THURSDAY.getNumberOfDay();
                break;
            case FRIDAY: numberOfDay = FRIDAY.getNumberOfDay();
                break;
            case SATURDAY: numberOfDay = SATURDAY.getNumberOfDay();
                break;
            case SUNDAY: numberOfDay = SUNDAY.getNumberOfDay();
                break;
                default:
                    System.out.println("Такого дня не существует!");
                    break;
        }
        return numberOfDay;
    }
}
