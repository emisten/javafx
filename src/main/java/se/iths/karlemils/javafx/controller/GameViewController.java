package se.iths.karlemils.javafx.controller;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import se.iths.karlemils.javafx.model.GameAnimation;
import se.iths.karlemils.javafx.model.Position;
import se.iths.karlemils.javafx.model.SnakeModel;

public class GameViewController {

    public static final int LEFT_WALL = 10;


    public Canvas canvas;

    GraphicsContext context;


    public SnakeModel snake = new SnakeModel();

    public void initialize() {
        context = canvas.getGraphicsContext2D();
        canvas.setFocusTraversable(true);
        gameAnimation.start();
    }

    GameAnimation gameAnimation = new GameAnimation() {

        float time;

        @Override
        public void tick(float secondsSinceLastFrame) {
            time += secondsSinceLastFrame;
            if (time < 0.2)
                return;

            snake.update();
            render();
            time = 0.0f;
        }
    };

    public void render() {

        prepare();
        renderSnake();
    }

    private void prepare() {
        context.setFill(Color.web("#eddeaf"));
        context.fillRect(0, 0, 400, 400);
    }

    private void renderSnake() {
        for (var segment : snake.getPositionList()) {
            renderSnakeSegment(segment);
        }
    }

    private void renderSnakeSegment(Position segment) {
        context.setFill(Color.web("#004B87"));
        context.fillRect((segment.x() * 10), (segment.y() * 10), 10, 10);
    }

    public void keyPressed(KeyEvent keyEvent) {

        switch (keyEvent.getCode()) {
            case UP -> snake.setUp();
            case DOWN -> snake.setDown();
            case RIGHT -> snake.setRight();
            case LEFT -> snake.setLeft();
        }

    }
}
