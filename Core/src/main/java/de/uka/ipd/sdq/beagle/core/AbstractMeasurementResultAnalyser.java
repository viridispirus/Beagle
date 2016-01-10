package de.uka.ipd.sdq.beagle.core;

/**
 * Implements MeasurementResultAnalyser interface.
 *
 * @author Michael Vogt
 * @see MeasurementResultAnalyser
 */
public abstract class AbstractMeasurementResultAnalyser implements MeasurementResultAnalyser {

    /**
	 *
	 *
	 *
	 */
	public boolean canContribute(final ReadOnlyMeasurementResultAnalyserBlackboardView blackboard) {
		//implement method
		return false;
	}

    /**
	 *
	 *
	 *
	 */
	public void contribute(final MeasurementResultAnalyserBlackboardView blackboard) {
		//implement method
	}
}