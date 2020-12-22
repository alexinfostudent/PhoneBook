package com.alexinfostudent.phonebook;

public class Phone {

    private String name;
    private int number;

    Phone(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public  String toString(){
        return name + " \n " + String.valueOf(number);
    }
}
