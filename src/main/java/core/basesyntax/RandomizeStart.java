package core.basesyntax;

import java.util.Random;

public class RandomizeStart {
        int coordinateIndexLimit = 10;
        Direction[] directions = Direction.values();
        Random random = new Random();

    public Robot getRandomStart() {
        int randomDirectionIndex = random.nextInt(directions.length);
        Direction randomDirection = directions[randomDirectionIndex];
        int randomX = random.nextInt(2 * coordinateIndexLimit + 1) - coordinateIndexLimit;
        int randomY = random.nextInt(2 * coordinateIndexLimit + 1) - coordinateIndexLimit;
        Robot robot = new Robot(randomDirection, randomX, randomY);
        System.out.println("Randomized Robot Start Position:");
        System.out.println(" Direction: " + robot.getDirection());
        System.out.println(" Starting position X: " + robot.getX() + "\n" + " Starting position Y: " + robot.getY());
        return robot;
    }
}
