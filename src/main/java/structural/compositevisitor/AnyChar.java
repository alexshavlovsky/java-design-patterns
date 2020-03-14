package structural.compositevisitor;

class AnyChar extends Composite {
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitAny(this);
    }
}
