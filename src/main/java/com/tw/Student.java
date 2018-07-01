package com.tw;

import java.util.Map;

public class Student {
    private String name;
    private int id;
    private float chinese;
    private float english;
    private float math;
    private float computer;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, float chinese, float english, float math, float computer) {
        this.name = name;
        this.id = id;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getChinese() {
        return chinese;
    }

    public void setChinese(float chinese) {
        this.chinese = chinese;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getComputer() {
        return computer;
    }

    public void setComputer(float computer) {
        this.computer = computer;
    }
    public float getTotal() {
        return math + chinese + english + computer;
    }

    public float getAVG() {
        return getTotal()/4;
    }

    public String getRecord() {
        String record = name + "|" + math + "|" + chinese + "|" + english + "|" + computer + "|" + getAVG() + "|" + getTotal();
        return record;
    }
}
