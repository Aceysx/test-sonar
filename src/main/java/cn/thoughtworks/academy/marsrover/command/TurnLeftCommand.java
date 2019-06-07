package cn.thoughtworks.academy.marsrover.command;

import cn.thoughtworks.academy.marsrover.Rover;
import cn.thoughtworks.academy.marsrover.RoverCommand;

public class TurnLeftCommand implements RoverCommand {
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
