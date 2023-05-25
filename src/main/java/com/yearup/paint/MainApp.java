package com.yearup.paint;


import java.awt.*;

public class MainApp
{
    static World world = new World(200, 200); // x (-100, 100), y(-100, 100);
    static Turtle turtle = new Turtle(world,-100, 0);
    public static void main(String[] args)
    {
        turtle.setDelay(0.1);


//        makeSquare(30, Color.BLUE); // Enum
//        turtle.turnRight(180);
//        makeSquare(90, Color.RED);
//
//        makeTriangle(80, "left");
//        turtle.turnRight(180);
//        makeTriangle(20, "right");

//        makeSquare(30,  bn;


        for(int i=0;i<10;i++) {
            drawHouse(20);
            turtle.goTo(turtle.getLocation().getX() + 20, 0);
        }


//        turtle.penUp();
//        turtle.goTo(-20, -120);
//        turtle.penDown();
//        makeRectangle(10, 20);
//        makeTriangle(10, "left");
//
//        turtle.penUp();
//        turtle.goTo(-10,-120);
//        turtle.penDown();
//        makeRectangle(10, 20);
//        makeTriangle(10, "left");
//
//        turtle.penUp();
//        turtle.goTo(0,-120);
//        turtle.penDown();
//        makeRectangle(10, 20);
//        makeTriangle(10, "left");


//        turtle.penUp();
//        turtle.goTo(0, -25);

//        turtle.penDown();
//        makeCircle(25);
//        turtle.turnRight(90);


        // create house

        // Neighborhood (optional)

        // create a fence
            // create a makeRectangle method


    }

    public static void makeCircle(double radius){
        double circumference = 2 * Math.PI * radius;
        double lineLength = circumference / 360;

        for(int degrees = 360; degrees > 0; degrees--){
            turtle.forward(lineLength);
            turtle.turnLeft(1);
        }
    }

    public static void makeEquilateralTriangle(int sideOfEquilateralTriangle, String direction){
        for(int i=0;i<3;i++){
            turnAndMove(sideOfEquilateralTriangle, 120, direction);
        }
    }

    public static void makeSquare(int sidesLength, Color color){
        turtle.setColor(color);
        for(int i=0;i<4;i++){
            turnAndMove(sidesLength, 90, "right");
        }
    }
    public static void makeRectangle(int shortLength, int longLength){
        for(int i=0;i<2;i++){
            turnAndMove(shortLength, 90, "right");
            turnAndMove(longLength, 90, "right");
        }
    }
    public static void makeFencePicket(int xValue, int yValue) {
        turtle.penUp();
        turtle.goTo(xValue, yValue);
        turtle.penDown();
        makeRectangle(10, 20);
        makeEquilateralTriangle(10, "left");
    }
    public static void drawHouse(int side){
        makeSquare(side, Color.black);
        makeEquilateralTriangle(side, "left");
    }
    public static void makeFences(int xValue, int yValue) {
        for(int i=0;i<10;i++) {
            drawHouse(20);
            turtle.goTo(turtle.getLocation().getX() + 20, 0);;
        }
    }

    public static void turnAndMove(int forwardAmount, int turnDegrees, String direction){
        turtle.forward(forwardAmount);
        if(direction.equalsIgnoreCase("right")){
            turtle.turnRight(turnDegrees);
        } else if(direction.equalsIgnoreCase("left")){
            turtle.turnLeft(turnDegrees);
        } else {
            System.out.println("Direction not found");
        }
    }
}