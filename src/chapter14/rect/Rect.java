package chapter14.rect;

public class Rect {
    // 사각형을 나타내는 클래스
    int width, height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return (double) width * height;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
