package cn.thoughtworks.academy.marsrover;

import java.util.List;

public class Rover {
    private Direction direction;
    private MarsRover marsRover;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void execute(List<RoverCommand> commands) {
        for (RoverCommand command : commands) {
            command.execute(this);
        }
    }

    public void turnLeft() {
        setDirection(direction.left());
    }

    public void turnRight() {
        setDirection(direction.right());
    }

    public void moveForward() {
        try {
            marsRover.move(this).to(this.direction);
        } catch (RoverNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void setMarsRover(MarsRover marsRover) {
        this.marsRover = marsRover;
    }
}
