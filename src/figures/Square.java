package figures;

public class Square implements FiguresProperty {
    private final int sideLength;
    private String typeFigure = "Square";

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int figureArea() {
        return sideLength * sideLength;
    }

    @Override
    public String getTypeFigure() {
        return typeFigure;
    }
}
