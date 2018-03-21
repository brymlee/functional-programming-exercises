package brymlee;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class FibanacciService {

	public static List<Integer> apply(final Integer ns) {
		if(2 == ns){
			return ImmutableList.<Integer>of(0, 1);
		}else if(1 == ns){
			return ImmutableList.<Integer>of(0);
		}else if(0 == ns){
			return ImmutableList.<Integer>of();
		}else if(ns > 2){
			return apply(ImmutableList.<Integer>of(0, 1), 2, ns);
		}else{
			return ImmutableList.<Integer>of();
		}
	}

	private static List<Integer> apply(final List<Integer> sequence, final Integer index, final Integer ns) {
		if(index == ns){
			return sequence;
		}else{
			final Integer first = sequence.get(index - 2);
			final Integer second = sequence.get(index - 1);
			final List<Integer> newSequence = ImmutableList.<Integer>builder()
				.addAll(sequence)
				.add(first + second)
				.build();
			return apply(newSequence, index + 1, ns);
		}
	}

}
