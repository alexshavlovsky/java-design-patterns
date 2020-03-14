package structural.adapter;

public interface LegacyLineSegmentInterface {
    int getDx();
    int getDy();
    void translateX(int dx);
    void translateY(int dy);
}
