Feature: List filtering service functionality 

Scenario: Can the filtering service filter out evens out of a list? 
	Given an integer list of "[1, 2, 3, 4]"
	When calling the even integer filter on list
	Then the integer list result from the even integer filter should be "[2, 4]"

Scenario: Can the filtering service filter out odds out of a list?
	Given an integer list of "[1, 2, 3, 4]"
	When calling the odd integer filter on list
	Then the integer list result from the odd integer filter should be "[1, 3]"

Scenario: Can the filtering service filter out people who are close to retirement? 
	Given a person list of "[ {"name" : "Mike", "age" : 34}, {"name" : "Bob", "age" : 65},  {"name" : "Sally", "age" : 88}]"
	When calling the retirement filter on list
	Then the person list result from the retirement filter should be "[ {"name" : "Bob", "age" : 65},  {"name" : "Sally", "age" : 88}]"

Scenario: Can the filtering service filter out integers from a list of generic numbers?
	Given a generic number list of "[1, 0.3, 0.55, 9, 13, 88]"
	When calling the integer filter on list
	Then the generic number list from the integer filter should be "[1, 9, 13, 88]"
