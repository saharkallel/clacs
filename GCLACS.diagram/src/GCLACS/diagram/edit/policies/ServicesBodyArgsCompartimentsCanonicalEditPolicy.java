package GCLACS.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import GCLACS.GCLACSPackage;
import GCLACS.diagram.edit.parts.InterfaceEditPart;
import GCLACS.diagram.edit.parts.ProvidedPortEditPart;
import GCLACS.diagram.part.GclacsDiagramUpdater;
import GCLACS.diagram.part.GclacsNodeDescriptor;
import GCLACS.diagram.part.GclacsVisualIDRegistry;

/**
 * @generated
 */
public class ServicesBodyArgsCompartimentsCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = GclacsDiagramUpdater
				.getServicesBodyArgsCompartiments_5003SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((GclacsNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = GclacsVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ProvidedPortEditPart.VISUAL_ID:
		case InterfaceEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(GCLACSPackage.eINSTANCE
					.getServices_Body());
			myFeaturesToSynchronize.add(GCLACSPackage.eINSTANCE
					.getServices_Arg());
		}
		return myFeaturesToSynchronize;
	}

}
