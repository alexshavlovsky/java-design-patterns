package compositevisitor;

class Empty extends Composite {
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitEmpty(this);
    }
}
