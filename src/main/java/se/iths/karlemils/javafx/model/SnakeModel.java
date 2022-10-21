package se.iths.karlemils.javafx.model;

public class SnakeModel {
    private Position position;
    private Direction direction;


    public SnakeModel (Position position, Direction direction){
        this.position = position;
        this.direction = direction;
    }

    public SnakeModel(){
        this.position = new Position(19,19);
        this.direction = Direction.UP;
    }
}



record Position (int x, int y){}

enum Direction{
    UP,
    DOWN,
    LEFT,
    RIGHT
}
