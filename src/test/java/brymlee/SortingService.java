package brymlee;

import java.util.List;

import static java.util.stream.Collectors.*;

public class SortingService {

	public static List<String> sortNames(final List<String> names) {
		return names
			.stream()
			.sorted((i, j) -> i.compareTo(j))
			.collect(toList());
	}

}
