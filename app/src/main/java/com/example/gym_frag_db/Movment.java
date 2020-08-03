package com.example.gym_frag_db;

public class Movment {
    private int id     ;

    private int day1   ;
    private int day11  ;
    private int day12  ;
    private int day13  ;
    private int day14  ;

    private int day2   ;
    private int day21  ;
    private int day22  ;
    private int day23  ;
    private int day24  ;

    private int day3   ;
    private int day31  ;
    private int day32  ;
    private int day33  ;
    private int day34  ;


    public Movment(int id,
                   int day1, int day11, int day12, int day13, int day14,
                   int day2, int day21, int day22, int day23, int day24,
                   int day3, int day31, int day32, int day33, int day34) {

        this.id    = id   ;
        this.day1  = day1 ;
        this.day11 = day11;
        this.day12 = day12;
        this.day13 = day13;
        this.day14 = day14;
        this.day2  = day2 ;
        this.day21 = day21;
        this.day22 = day22;
        this.day23 = day23;
        this.day24 = day24;
        this.day3  = day3 ;
        this.day31 = day31;
        this.day32 = day32;
        this.day33 = day33;
        this.day34 = day34;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDay1() {
        return day1;
    }

    public void setDay1(int day1) {
        this.day1 = day1;
    }

    public int getDay2() {
        return day2;
    }

    public void setDay2(int day2) {
        this.day2 = day2;
    }

    public int getDay3() {
        return day3;
    }

    public void setDay3(int day3) {
        this.day3 = day3;
    }

    public int getDay11() {
        return day11;
    }

    public void setDay11(int day11) {
        this.day11 = day11;
    }

    public int getDay12() {
        return day12;
    }

    public void setDay12(int day12) {
        this.day12 = day12;
    }

    public int getDay13() {
        return day13;
    }

    public void setDay13(int day13) {
        this.day13 = day13;
    }

    public int getDay14() {
        return day14;
    }

    public void setDay14(int day14) {
        this.day14 = day14;
    }

    public int getDay21() {
        return day21;
    }

    public void setDay21(int day21) {
        this.day21 = day21;
    }

    public int getDay22() {
        return day22;
    }

    public void setDay22(int day22) {
        this.day22 = day22;
    }

    public int getDay23() {
        return day23;
    }

    public void setDay23(int day23) {
        this.day23 = day23;
    }

    public int getDay24() {
        return day24;
    }

    public void setDay24(int day24) {
        this.day24 = day24;
    }

    public int getDay31() {
        return day31;
    }

    public void setDay31(int day31) {
        this.day31 = day31;
    }

    public int getDay32() {
        return day32;
    }

    public void setDay32(int day32) {
        this.day32 = day32;
    }

    public int getDay33() {
        return day33;
    }

    public void setDay33(int day33) {
        this.day33 = day33;
    }

    public int getDay34() {
        return day34;
    }

    public void setDay34(int day34) {
        this.day34 = day34;
    }

}
