package by.jwd.classes.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket(){
        this.balls = new ArrayList<>();
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public int getAmountOfBallsByColor(String color){
        int amountOfBallsByColor = 0;
        for(Ball ball: balls) {
            if(ball.getColor().equals(color)){
                amountOfBallsByColor++;
            }
        }
        return amountOfBallsByColor;
    }

    public int getAmountOfBallsInBasket(){
        int amountOfBalls = 0;
        for (Ball ball: balls) {
            amountOfBalls += ball.getWeight();
        }
        return amountOfBalls;
    }
}
