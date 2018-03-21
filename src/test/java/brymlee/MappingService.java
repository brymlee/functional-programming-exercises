package brymlee;

import java.util.List;

import static java.util.stream.Collectors.*;

public class MappingService {

	public static List<Integer> mapStringsToIntegers(final List<String> strings) {
		return strings
			.stream()
			.map(string -> Integer.parseInt(string))
			.collect(toList());
	}

	public static List<String> mapFirstLastToLastFirstName(final List<String> names) {
		return names
			.stream()
			.map(name -> {
				final String[] split = name.split("\\s");
				return split[1].concat(" ").concat(split[0]);
			}).collect(toList());
	}

}
