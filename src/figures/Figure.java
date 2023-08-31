package figures;

public class Figure {
    public static void totalAreaOfAllShapes(FiguresProperty[] figuresProperties) {
        int totalArea = 0;
        for (FiguresProperty fp: figuresProperties) {
            totalArea += fp.figureArea();
        }
        System.out.println("The total area of all shapes: " + totalArea);
    }
}
