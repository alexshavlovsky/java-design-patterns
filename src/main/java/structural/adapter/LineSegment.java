package structural.adapter;

import java.awt.*;

public class LineSegment implements LineSegmentInterface {
    private Point p1;
    private Point p2;

    public LineSegment(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    @Override
    public double getLength() {
        return Math.hypot(p2.x - p1.x, p2.y - p1.y);
    }

    @Override
    public void translate(int dx, int dy) {
        p1.x += dx;
        p2.x += dx;
        p1.y += dy;
        p2.y += dy;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "LineSegment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
