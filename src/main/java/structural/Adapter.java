package structural;

import structural.adapter.LegacyLineSegment;
import structural.adapter.LegacyLineSegmentAdapter;

public class Adapter {
    public static void main(String[] args) {
        LegacyLineSegment lineSegment = new LegacyLineSegment(5, 3, 10, 12);
        LegacyLineSegmentAdapter adapter = new LegacyLineSegmentAdapter(lineSegment);
        System.out.println("===Before a translation===");
        System.out.println(lineSegment);
        System.out.println("Length: " + adapter.getLength());
        System.out.println("===After the translation: (dx=-5,dy=-3) ===");
        adapter.translate(-5, -3);
        System.out.println(lineSegment);
        System.out.println("Length: " + adapter.getLength());
    }
}
