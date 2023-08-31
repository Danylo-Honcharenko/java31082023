package figures;

public class Triangle implements FiguresProperty {
    private final int base;
    private final int height;
    private String typeFigure = "Triangle";

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int figureArea() {
        return (base * height) / 2;
    }

    @Override
    public String getTypeFigure() {
        return typeFigure;
    }
}
