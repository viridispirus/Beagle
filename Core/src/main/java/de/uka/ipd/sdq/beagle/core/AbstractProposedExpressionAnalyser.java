package de.uka.ipd.sdq.beagle.core;

import de.uka.ipd.sdq.beagle.core.analysis.ProposedExpressionAnalyser;
import de.uka.ipd.sdq.beagle.core.analysis.ReadOnlyProposedExpressionAnalyserBlackboardView;
import de.uka.ipd.sdq.beagle.core.analysis.ProposedExpressionAnalyserBlackboardView;


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
	public canContribute(final ReadOnlyProposedExpressionAnalyserBlackboardView blackboard) {
		//implement method
	}

    /**
	 *
	 *
	 *
	 */
	public void contribute(final ProposedExpressionAnalyserBlackboardView blackboard) {
		//implement method
	}
}