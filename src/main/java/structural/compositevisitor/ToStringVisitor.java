package structural.compositevisitor;

import java.util.Arrays;

class ToStringVisitor implements Visitor {
    private StringBuilder s = new StringBuilder();

    private String getResult() {
        return s.toString();
    }

    private void visitGroup(Composite exp, Runnable... sequence) {
        boolean doGroup = exp.getParentPrecedence() > exp.getPrecedence();
        if (doGroup) s.append("(");
        Arrays.stream(sequence).forEach(Runnable::run);
        if (doGroup) s.append(")");
    }

    public static String toString(Composite composite) {
        ToStringVisitor v = new ToStringVisitor();
        composite.acceptVisitor(v);
        return v.getResult();
    }

    @Override
    public void visitNormal(NormalChar composite) {
        s.append(composite.e);
    }

    @Override
    public void visitAny(AnyChar composite) {
        s.append('.');
    }

    @Override
    public void visitStar(Star composite) {
        visitGroup(composite, () -> composite.e.acceptVisitor(this));
        s.append('*');
    }

    @Override
    public void visitUnion(Union composite) {
        visitGroup(composite,
                () -> composite.e1.acceptVisitor(this),
                () -> s.append('|'),
                () -> composite.e2.acceptVisitor(this)
        );
    }

    @Override
    public void visitConcatenation(Concatenation composite) {
        visitGroup(composite, () -> composite.list.forEach(e -> e.acceptVisitor(this)));
    }

    @Override
    public void visitEmpty(Empty composite) {
    }
}
