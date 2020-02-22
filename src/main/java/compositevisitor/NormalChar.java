package compositevisitor;

class NormalChar extends Composite {
    char e;

    NormalChar(char e) {
        if (isOperator(e) || isAnyChar(e)) throw new AssertionError("Not a char");
        this.e = e;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitNormal(this);
    }
}
