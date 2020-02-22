package compositevisitor;

class Star extends Composite {
    Composite e;

    Star(Composite e) {
        this.e = e;
        applyParent(e);
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitStar(this);
    }

    @Override
    public int getPrecedence() {
        return 3;
    }
}
