package org.zdanek.designpatterns.behavioral.visitor;

public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
