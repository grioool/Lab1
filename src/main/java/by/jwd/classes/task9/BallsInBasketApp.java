package by.jwd.classes.task9;

public class BallsInBasketApp {

    private static Basket basket = new Basket();

    private static void addBallsToBasket() {
        basket.addBall(new Ball(2, "red"));
        basket.addBall(new Ball(4, "blue"));
        basket.addBall(new Ball(1, "blue"));
        basket.addBall(new Ball(3, "blue"));
    }

    public static void main(String[] args) {
        addBallsToBasket();
        System.out.println(basket.getAmountOfBallsByColor("blue"));
        System.out.println(basket.getAmountOfBallsInBasket());
    }
}
