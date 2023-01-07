package org.udemy.functionalprogramming.concepts.composition;

public class Square {
    private Integer side;

    public Square(int side ) {
        setSide(side);
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    public Integer getArea(){
        return this.side * side;
    }
}
