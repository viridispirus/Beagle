package de.uka.ipd.sdq.beagle.core;

import de.uka.ipd.sdq.beagle.core.analysis.ProposedExpressionAnalyser;

/**
 * Implements ProposedExpressionAnalyser interface.
 *
 * @author Michael Vogt
 * @see ProposedExpressionAnalyser
 */
public abstract class AbstractProposedExpressionAnalyser implements ProposedExpressionAnalyser {

    /**
	 *
	 *
	 *
	 */
	public boolean canContribute(final ReadOnlyProposedExpressionBlackboardView blackboard) {
		//implement method
		return false;
	}

    /**
	 *
	 *
	 *
	 */
	public void contribute(final ProposedExpressionBlackboardView blackboard) {
		//implement method
	}
}