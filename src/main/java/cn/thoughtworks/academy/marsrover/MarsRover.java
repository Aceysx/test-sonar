package cn.thoughtworks.academy.marsrover;

import static cn.thoughtworks.academy.marsrover.Direction.WEST;

public class MarsRover {

    private final Rover[][] rovers;
    private Rover rover;
    private int x;
    private int y;

    public MarsRover(int width, int height) {
        rovers = new Rover[width + 1][height + 1];
    }

    public MarsRover place(Rover rover) {
        rover.setMarsRover(this);
        this.rover = rover;
        return this;
    }

    public MarsRover at(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public void faceTo(Direction direction) {
        rover.setDirection(direction);
        rovers[x][y] = rover;
    }

    public Rover get(int x, int y) {
        return rovers[x][y];
    }


    public MarsRover move(Rover rover) throws RoverNotFoundException {
        for (int i = 0; i < rovers.length; i++) {
            for (int j = 0; j < rovers[i].length; j++) {
                if (rover.equals(rovers[i][j])) {
                    this.x = i;
                    this.y = j;
                    return this;
                }
            }
        }
        throw new RoverNotFoundException();
    }

    public void to(Direction direction) {
        Offset offset = direction.offset();
        rovers[x + offset.getX()][y + offset.getY()] = rovers[x][y];
        rovers[x][y] = null;
    }
}
