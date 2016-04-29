package cass.wsd;

/**
 * Enumeration representing implemented WSD algorithms.
 * @author cwlucas41
 *
 */
public enum Algorithm {
	LESK,
	LESK_WITH_FILTER,
	NEW_LESK,
	STOCHASTIC_GRAPH,
	FREQUENCY,
	RANDOM,
	RANDOM_WITH_FILTER;
}
