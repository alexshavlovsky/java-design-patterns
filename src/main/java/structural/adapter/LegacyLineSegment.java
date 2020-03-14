package structural.adapter;

import java.awt.*;

public class LegacyLineSegment implements LegacyLineSegmentInterface {
    private Point p1;
    private Point p2;

    public LegacyLineSegment(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    @Override
    public int getDx() {
        return p2.x - p1.x;
    }

    @Override
    public int getDy() {
        return p2.y - p1.y;
    }

    @Override
    public void translateX(int dx) {
        p1.x += dx;
        p2.x += dx;
    }

    @Override
    public void translateY(int dy) {
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
        return "LegacyLineSegment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
