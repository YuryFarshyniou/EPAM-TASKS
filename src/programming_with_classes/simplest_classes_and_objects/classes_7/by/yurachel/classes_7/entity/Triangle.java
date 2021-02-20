package programming_with_classes.simplest_classes_and_objects.classes_7.by.yurachel.classes_7.entity;


import java.util.Objects;

public class Triangle {

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    //Произвольный  треугольник.

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    // Если размер не указан.

    public Triangle() {
        this.firstSide = -1;
        this.secondSide = -1;
        this.thirdSide = -1;
    }

    public String toString() {
        return "Triangle parameters.First side: " + this.firstSide +
                ", Second side: " + this.secondSide + ", Third side: " +
                this.thirdSide;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.firstSide, firstSide) == 0 && Double.compare(triangle.secondSide, secondSide) == 0 && Double.compare(triangle.thirdSide, thirdSide) == 0;
    }


    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide);
    }
}
