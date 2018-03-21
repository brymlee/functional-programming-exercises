package brymlee;

import java.util.List;

public class ReducingService {

	public static String reduceNamesIntoCommaDelimitedString(final List<String> names) {
		return names
			.stream()
			.reduce((i, j) -> i.concat(",").concat(j))
			.get();
	}

	public static Integer sumIntegers(final List<Integer> integers) {
		return integers
			.stream()
			.reduce((i, j) -> i + j)
			.get();
	}

}
