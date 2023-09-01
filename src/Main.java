import competition.Cat;
import competition.Contestant;
import competition.Human;
import competition.Robot;
import competition.obstacle.Obstacle;
import competition.obstacle.Treadmill;
import competition.obstacle.Wall;
import figures.*;

public class Main {
    public static void main(String[] args) {

        FiguresProperty[] figuresProperties = {
                new Circle(2),
                new Square(5),
                new Triangle(3, 6)
        };

        // overview of elements in an array
        for(FiguresProperty fp: figuresProperties) {
            System.out.printf("Result(%s): %d\n", fp.getTypeFigure(), fp.figureArea());
        }

        // total area of all shapes
        Figure.totalAreaOfAllShapes(figuresProperties);

        System.out.println("\n======================\n");

        Contestant[] contestant = {
                new Cat(21, 30),
                new Human(31, 2),
                new Robot(89, 45)
        };

        Obstacle[] obstacle = {
                new Treadmill(20),
                new Wall(15)
        };


        for (Contestant contestants: contestant) {
            boolean canContinue = true;
            for (Obstacle obstacles: obstacle) {
                if (!obstacles.overcome(contestants)) {
                    canContinue = false;
                    System.out.println("Participant " + contestants.getContestantName() + " did not pass the obstacle " + obstacles.getObstacleName());
                    break;
                } else {
                    System.out.println("Participant " + contestants.getContestantName() + " passed the obstacle " + obstacles.getObstacleName());
                }

                if (canContinue) {
                    System.out.println("Participant " + contestants.getContestantName() + " completed the course successfully!");
                } else {
                    System.out.println("Participant " + contestants.getContestantName() + " was eliminated.");
                }
            }
        }
    }
}