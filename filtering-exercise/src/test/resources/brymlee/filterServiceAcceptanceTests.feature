Feature: List filtering service functionality 

Scenario: Can the filtering service filter out evens out of a list? 
	Given an integer list of "[1, 2, 3, 4]"
	When calling the even number filter on list
	Then the integer list result should be "[2, 4]"

Scenario: Can the filtering service filter out odds out of a list?
	Given an integer list of "[1, 2, 3, 4]"
	When calling the odd number filter on list
	Then the integer list result should be "[1, 3]"

Scenario: Can the filtering service filter out people who are close to retirement? 
	Given a person list of "[ {'name' : 'Mike', 'age' : 34}, {'name' : 'Bob', 'age' : 65},  {'name' : 'Sally', 'age' : 88}]"
	When calling the retirement filter on list
	Then the person list result should be "[ {'name' : 'Bob', 'age' : 65},  {'name' : 'Sally', 'age' : 88}]"
