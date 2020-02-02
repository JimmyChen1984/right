package com.homework.right;

public class Position {
    private int mx,my;
    public Position(int x,int y){
        this.mx = x;
        this.my = y;
    }
    public Position(Position position){
        this.mx = position.getx();
        this.my = position.gety();
    }

    public int getx() {
        return mx;
    }

    public int gety() {
        return my;
    }

    public void set(int x, int y){
        this.mx = x;
        this.my = y;
    }
}
