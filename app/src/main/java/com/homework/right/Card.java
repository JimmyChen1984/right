package com.homework.right;

class Card extends Position{
    private int value;

    public Card(Position p, int value) {
        super(p);
        this.value = value;
    }

    public Card(Card c) {
        super(c.getx(),c.gety());
        this.value = c.getValue();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public void moveTo(Position p, Card[][] grid) {
        grid[p.getx()][p.gety()] = this;
        grid[super.getx()][super.gety()] = null;
        set(p.getx(), p.gety());
    }
}
