package app.visiteur;

import app.base.Rectangle;

public interface IVisiteur {

	void visit(IVisitable o);
	Rectangle visit(ClassRepresentation o);
	Rectangle visit(InterfaceRepresentation o);
}
