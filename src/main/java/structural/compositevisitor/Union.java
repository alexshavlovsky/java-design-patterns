package structural.compositevisitor;

class Union extends Composite {
    Composite e1, e2;

    Union(Composite e1, Composite e2) {
        this.e1 = e1;
        this.e2 = e2;
        applyParent(e1, e2);
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitUnion(this);
    }

    @Override
    public int getPrecedence() {
        return 1;
    }
}
