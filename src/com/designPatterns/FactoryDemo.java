package com.designPatterns;

public class FactoryDemo {

    public static void main(String[] args) {

        //Triangle triangle = new Triangle();
        //Shape shape = new Triangle();

        Shape shape = ShapeFactory.createShape("Triangle");
    }


}

interface Shape{

    public void drawShape();
}

class Triangle implements Shape{

    @Override
    public void drawShape() {

    }
}

class Rectangle implements Shape{

    @Override
    public void drawShape() {

    }
}

class Square implements Shape{

    @Override
    public void drawShape() {

    }
}


class ShapeFactory {

    public static Shape createShape(String type){
        switch (type){
            case "Triangle" :
                    return new Triangle();
            case "Square" :
                    return new Square();
            default :
                    return new Rectangle();
        }
    }
}