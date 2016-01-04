package de.uka.ipd.sdq.beagle.analysis;

import de.uka.ipd.sdq.beagle.core.Blackboard;
import de.uka.ipd.sdq.beagle.core.ResourceDemandingInternalAction;
import de.uka.ipd.sdq.beagle.core.SEFFBranch;
import de.uka.ipd.sdq.beagle.core.SEFFLoop;
import de.uka.ipd.sdq.beagle.core.expressions.EvaluableExpression;

import java.util.Set;

/**
 * View of the {@link Blackboard} designed to be used by {@link ResultAnalyser}. Reading
 * information and adding proposed expressions to the {@link Blackboard} is supported.
 * 
 * @author Christoph Michelbach
 * 
 * @see Blackboard for information about Blackboard views
 * 
 */
public class AnalyserBlackboardView {

	/**
	 * Creates a new {@code AnalyserBlackboardView} for {@code blackboard}.
	 *
	 * @param blackboard The {@link Blackboard} to be accessed through the
	 *            {@code AnalyserBlackboardView}.
	 */
	public AnalyserBlackboardView(final Blackboard blackboard) {

	}

	/**
	 * Delegates to {@link de.uka.ipd.sdq.beagle.core.Blackboard#getAllRDIAs()}.
	 *
	 * @return all {@linkplain ResourceDemandingInternalAction resource demanding internal
	 *         actions} known to Beagle. Changes to the returned set will not modify the
	 *         blackboard content. Is never {@code null}.
	 * @see de.uka.ipd.sdq.beagle.core.Blackboard#getAllRDIAs()
	 */
	public Set<ResourceDemandingInternalAction> getAllRDIAs() {
		return null;
	}

	/**
	 * Delegates to {@link de.uka.ipd.sdq.beagle.core.Blackboard#getAllSEFFBranches()}.
	 *
	 * @return all {@linkplain SEFFBranch SEFF branches} known to Beagle. Changes to the
	 *         returned set will not modify the blackboard content. Is never {@code null}.
	 * @see de.uka.ipd.sdq.beagle.core.Blackboard#getAllSEFFBranches()
	 */
	public Set<SEFFBranch> getAllSEFFBranches() {
		return null;
	}

	/**
	 * Delegates to {@link de.uka.ipd.sdq.beagle.core.Blackboard#getAllSEFFLoops()}.
	 *
	 * @return all {@linkplain SEFFLoop SEFF loops} known to Beagle. Changes to the
	 *         returned set will not modify the blackboard content. Is never {@code null}.
	 * @see de.uka.ipd.sdq.beagle.core.Blackboard#getAllSEFFLoops()
	 */
	public Set<SEFFLoop> getAllSEFFLoops() {
		return null;
	}

	/**
	 * Delegates to
	 * {@link de.uka.ipd.sdq.beagle.core.Blackboard#proposeExpressionFor(ResourceDemandingInternalAction, EvaluableExpression)}
	 * .
	 *
	 * @param rdia A resource demanding internal action. Must not be {@code null}.
	 * @param expression An evaluable expression proposed to describe {@code rdia}’s
	 *            measurement results. Must not be {@code null}.
	 * @see de.uka.ipd.sdq.beagle.core.Blackboard#proposeExpressionFor(ResourceDemandingInternalAction,
	 *      EvaluableExpression)
	 */
	public void proposeExpressionFor(final ResourceDemandingInternalAction rdia, final EvaluableExpression expression) {
	}

	/**
	 * Delegates to
	 * {@link de.uka.ipd.sdq.beagle.core.Blackboard#proposeExpressionFor(SEFFLoop, EvaluableExpression)}
	 * .
	 *
	 * @param loop A SEFF Loop. Must not be {@code null}.
	 * @param expression An evaluable expression proposed to describe {@code loop}’s
	 *            measurement results. Must not be {@code null}.
	 * @see de.uka.ipd.sdq.beagle.core.Blackboard#proposeExpressionFor(SEFFLoop,
	 *      EvaluableExpression)
	 */
	public void proposeExpressionFor(final SEFFLoop loop, final EvaluableExpression expression) {
	}

	/**
	 * Delegates to
	 * {@link de.uka.ipd.sdq.beagle.core.Blackboard#proposeExpressionFor(SEFFBranch, EvaluableExpression)}
	 * .
	 *
	 * @param branch A SEFF Branch. Must not be {@code null}.
	 * @param expression An evaluable expression proposed to describe {@code branch}’s
	 *            measurement results. Must not be {@code null}.
	 * @see de.uka.ipd.sdq.beagle.core.Blackboard#proposeExpressionFor(SEFFBranch,
	 *      EvaluableExpression)
	 */
	public void proposeExpressionFor(final SEFFBranch branch, final EvaluableExpression expression) {
	}

	/**
	 * Delegates to {@link de.uka.ipd.sdq.beagle.core.Blackboard#getRDIAsToBeMeasured()}.
	 *
	 * @return All {@linkplain ResourceDemandingInternalAction resource demanding internal
	 *         actions} to be measured. Changes to the returned set will not modify the
	 *         blackboard content. Is never {@code null}.
	 * @see de.uka.ipd.sdq.beagle.core.Blackboard#getRDIAsToBeMeasured()
	 */
	public Set<ResourceDemandingInternalAction> getRDIAsToBeMeasured() {
		return null;
	}

	/**
	 * Delegates to
	 * {@link de.uka.ipd.sdq.beagle.core.Blackboard#getSEFFBranchesToBeMeasured()}.
	 *
	 * @return All {@linkplain SEFFBranch SEFF branches} to be measured. Changes to the
	 *         returned set will not modify the blackboard content. Is never {@code null}.
	 * @see de.uka.ipd.sdq.beagle.core.Blackboard#getSEFFBranchesToBeMeasured()
	 */
	public Set<SEFFBranch> getSEFFBranchesToBeMeasured() {
		return null;
	}

	/**
	 * Delegates to
	 * {@link de.uka.ipd.sdq.beagle.core.Blackboard#getSEFFLoopsToBeMeasured()}.
	 *
	 * @return All {@linkplain SEFFLoop SEFF loops} to be measured. Changes to the
	 *         returned set will not modify the blackboard content. Is never {@code null}.
	 * @see de.uka.ipd.sdq.beagle.core.Blackboard#getSEFFLoopsToBeMeasured()
	 */
	public Set<SEFFLoop> getSEFFLoopsToBeMeasured() {
		return null;
	}
}
