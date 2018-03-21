package brymlee;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;
import static java.util.Arrays.*;
import static java.util.stream.IntStream.*;

public class FunctionalExerciseTests {

	@Test
	public void sanityCheck() {
		assertEquals("hello", "hello");	
	}

	@Test
	public void filterOutTheEvens() {
		final List<Integer> expected = asList(2, 4); 
		final List<Integer> actual = FilteringService 
			.filterOutEvens(asList(1, 2, 3, 4));
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), actual.get(index));	
			});
	}

	@Test
	public void filterOutTheOdds() {
		final List<Integer> expected = asList(1, 3);
		final List<Integer> actual = FilteringService
			.filterOutOdds(asList(1, 2, 3, 4));
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), actual.get(index));	
			});
	}

	@Test
	public void filterOutPeopleWhoAreLessThan65() {
		final List<Person> input = asList(new Person("Mike", 34), 
										  new Person("Bob", 64),
										  new Person("John", 88),
										  new Person("Sally", 102));
		final List<Person> expected = asList(new Person("Mike", 34),
										     new Person("Bob", 64));
		final List<Person> actual = FilteringService
			.filterOutPeopleLessThan65(input);
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), expected.get(index));
			});
	}

	@Test
	public void filterOutIntegersFromNumbers() {
		final List<Number> input = asList(0.1d, 50, 0.44f, 100l, 70, 80);		
		final List<Number> expected = asList(50, 70, 80);
		final List<Number> actual = FilteringService.
			filterOutIntegers(input);
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals((Integer) expected.get(index), (Integer) actual.get(index));
			});
	}

	@Test
	public void mapStringsToIntegers() {
		final List<String> input = asList("2", "4", "6", "8", "10");	
		final List<Integer> expected = asList(2, 4, 6, 8, 10); 
		final List<Integer> actual = MappingService
			.mapStringsToIntegers(input);
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), actual.get(index));	
			});
	}

	@Test
	public void mapFirstLastToLastFirstName() {
		final List<String> input = asList("Bob Barker", "Mary Johnson", "Patricia Peterson");
		final List<String> expected = asList("Barker Bob", "Johnson Mary", "Peterson Patricia");
		final List<String> actual = MappingService
			.mapFirstLastToLastFirstName(input);
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), actual.get(index));	
			});
	}

	@Test
	public void reduceNamesIntoCommaDelimitedString() {
		final List<String> input = asList("Mike", "Joe", "Bob", "Sally");
		final String expected = "Mike,Joe,Bob,Sally";
		final String actual = ReducingService
			.reduceNamesIntoCommaDelimitedString(input);
		assertEquals(expected, actual);
	}

	@Test
	public void sumIntegersUpTo10() {
		final List<Integer> input = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
		final Integer expected = 55;
		final Integer actual = ReducingService
			.sumIntegers(input);
		assertEquals(expected, actual);
	}

	@Test
	public void fibanacciTo10() {
		final List<Integer> expected = asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
		final List<Integer> actual = FibanacciService
			.apply(10);
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), actual.get(index));
			});
	}

	@Test
	public void fibanacciTo0(){
		final List<Integer> expected = asList();
		final List<Integer> actual = FibanacciService
			.apply(0);
		assertEquals(expected.size(), actual.size());
	}
	
	@Test
	public void fibanacciTo1(){
		final List<Integer> expected = asList(0);
		final List<Integer> actual = FibanacciService
			.apply(1);
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), actual.get(index));
			});
	}
	
	@Test
	public void fibanacciTo2(){
		final List<Integer> expected = asList(0, 1);
		final List<Integer> actual = FibanacciService
			.apply(2);
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), actual.get(index));
			});
	}
	
	@Test
	public void fibanacciTo5() {
		final List<Integer> expected = asList(0, 1, 1, 2, 3);
		final List<Integer> actual = FibanacciService
			.apply(5);
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), actual.get(index));
			});
	}
	
	@Test
	public void sortNames() {
		final List<String> input = asList("Zack", "Molly", "Xavier", "John", "Adam");
		final List<String> expected = asList("Adam", "John", "Molly", "Xavier", "Zack");	
		final List<String> actual = SortingService
			.sortNames(input);
		assertEquals(expected.size(), actual.size());
		range(0, expected.size())
			.forEach(index -> {
				assertEquals(expected.get(index), actual.get(index));
			});
	}
}
