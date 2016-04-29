package cass.wsd.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

import cass.languageTool.wordNet.CASSWordSense;
import cass.wsd.ScoredSense;

public class RandomAlgorithm implements I_WSDAlgorithm {
	
	/**
	 * Internal details for randomly selecting a sense
	 * @param Set of senses to consider
	 * @return List of senses scored randomly
	 */
	@Override
	public List<ScoredSense> score(Set<CASSWordSense> senses) {
		Random rand = new Random();
		
		List<ScoredSense> scoredSenses= new ArrayList<ScoredSense>();
		
		for (CASSWordSense sense : senses) {
			scoredSenses.add(new ScoredSense(sense, rand.nextInt()));
		}
		
		Collections.sort(scoredSenses);
		Collections.reverse(scoredSenses);
		
		return scoredSenses;
	}
}
