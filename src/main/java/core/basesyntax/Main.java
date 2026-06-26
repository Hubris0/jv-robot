package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int toX = 0;
        final int toY = 0;
        RandomizeStart randomizeStart = new RandomizeStart();
        Robot robot = randomizeStart.getRandomStart();
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, toX, toY);
    }
}
