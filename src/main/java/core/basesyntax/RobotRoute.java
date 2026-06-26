package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX() || toY != robot.getY()) {
            if ((Math.abs(toX) + Math.abs(robot.getX()))
                    > (Math.abs(toY) + Math.abs(robot.getY()))) {
                if (robot.getX() < toX) {
                    while (robot.getDirection() != Direction.RIGHT) {
                        robot.turnRight();
                    }
                    if (robot.getX() < toX) {
                        robot.stepForward();
                        System.out.println("Current direction: " + robot.getDirection()
                                + " Current position: " + "X: " + robot.getX()
                                + ", Y: " + robot.getY());
                    }
                } else if (robot.getX() > toX) {
                    while (robot.getDirection() != Direction.LEFT) {
                        robot.turnLeft();
                    }
                    if (robot.getX() > toX) {
                        robot.stepForward();
                        System.out.println("Current direction: " + robot.getDirection()
                                + " Current position: " + "X: " + robot.getX()
                                + ", Y: " + robot.getY());
                    }
                }
            } else {
                if (robot.getY() < toY) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnRight();
                    }
                    if (robot.getY() < toY) {
                        robot.stepForward();
                        System.out.println("Current direction: " + robot.getDirection()
                                + " Current position: " + "X: " + robot.getX()
                                + ", Y: " + robot.getY());
                    }
                } else if (robot.getY() > toY) {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnLeft();
                    }
                    if (robot.getY() > toY) {
                        robot.stepForward();
                        System.out.println("Current direction: " + robot.getDirection()
                                + " Current position: " + "X: " + robot.getX()
                                + ", Y: " + robot.getY());
                    }
                }
            }
        }
        if (toX == robot.getX() && toY == robot.getY()) {
            System.out.println("Robot has reached the target coordinates: "
                    + "(" + toX + ", " + toY + ")");
        }
    }
}
