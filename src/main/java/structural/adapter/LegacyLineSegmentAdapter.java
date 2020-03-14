package structural.adapter;

public class LegacyLineSegmentAdapter implements LineSegmentInterface {
    private LegacyLineSegmentInterface legacyLineSegment;

    public LegacyLineSegmentAdapter(LegacyLineSegmentInterface legacyLineSegment) {
        this.legacyLineSegment = legacyLineSegment;
    }

    @Override
    public double getLength() {
        return Math.hypot(legacyLineSegment.getDx(), legacyLineSegment.getDy());
    }

    @Override
    public void translate(int dx, int dy) {
        legacyLineSegment.translateX(dx);
        legacyLineSegment.translateY(dy);
    }
}
