package org.zdanek.designpatterns.behavioral.visitor;

public class Oil implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
