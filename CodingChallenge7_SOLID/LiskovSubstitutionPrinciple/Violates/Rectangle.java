package OOP2_Coding_Challenges.CodingChallenge7_SOLID.LiskovSubstitutionPrinciple.Violates;

public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
