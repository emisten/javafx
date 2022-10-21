package se.iths.karlemils.javafx.controller;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import se.iths.karlemils.javafx.model.SnakeModel;

public class GameViewController {


    public Canvas canvas;

    GraphicsContext context;


    public SnakeModel snake = new SnakeModel();

    public void initialize() {
        context = canvas.getGraphicsContext2D();
    }

    //Todo: Keyboard input
    //Todo: Snake data ie. Model for Snake
    //Todo: Animation, automatic movement of snake and rendering. Game loop

    public void onCanvasClicked(MouseEvent mouseEvent) {
        context.setFill(Color.web("#eddeaf"));
        context.fillRect(0,0,400,400);
        context.setFill(Color.BLUE);
        context.fillRect(mouseEvent.getSceneX()-(5/2), mouseEvent.getY()-(5/2), 5, 5);
    }
}
