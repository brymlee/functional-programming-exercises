Feature: List reducing service functionality   

Scenario: Can the reducing service take a list of names and turn them into a comma delimited string. 
	Given a string list of "["Mike", "Joe", "Bob", "Sally"]"  
	When calling the name delimiter on list 
	Then the string list result from the name delimiter should be "["Mike, Joe, Bob, Sally"]" 

Scenario: Can the reducing service take a list of integers and sum and aggregate those integers.
	Given an integer list of "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]"
	When calling the name integer list sum aggregator
	Then the integer list result from the sum aggregator should be "[55]"
