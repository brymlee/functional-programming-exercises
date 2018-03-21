package brymlee;

import java.util.List;

import static java.util.stream.Collectors.*;

public class FilteringService {

	public static List<Integer> filterOutEvens(final List<Integer> integers) {
		return integers
			.stream()
			.filter(integer -> integer % 2 == 0)
			.collect(toList());
			
	}

	public static List<Integer> filterOutOdds(final List<Integer> integers) {
		return integers
			.stream()
			.filter(integer -> integer % 2 != 0)
			.collect(toList());
	}

	public static List<Person> filterOutPeopleLessThan65(final List<Person> integers) {
		return integers
			.stream()
			.filter(person -> person.getAge() < 65)
			.collect(toList());
	}

	public static List<Number> filterOutIntegers(final List<Number> integers) {
		return integers
			.stream()
			.filter(number -> number instanceof Integer)
			.collect(toList());
	}

}
