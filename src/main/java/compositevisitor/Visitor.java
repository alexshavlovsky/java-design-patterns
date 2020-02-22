package compositevisitor;

public interface Visitor {
    void visitNormal(NormalChar composite);

    void visitAny(AnyChar composite);

    void visitStar(Star composite);

    void visitUnion(Union composite);

    void visitConcatenation(Concatenation composite);

    void visitEmpty(Empty composite);
}
