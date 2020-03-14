package structural.compositevisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Concatenation extends Composite {
    List<Composite> list = new ArrayList<>();

    Concatenation(Composite... arr) {
        this.list.addAll(Arrays.asList(arr));
        applyParent(arr);
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitConcatenation(this);
    }

    @Override
    public int getPrecedence() {
        return 2;
    }
}
