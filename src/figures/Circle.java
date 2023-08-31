package figures;

public class Circle implements FiguresProperty {
    private final int radius;
    private String typeFigure = "Circle";

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int figureArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public String getTypeFigure() {
        return typeFigure;
    }
}
