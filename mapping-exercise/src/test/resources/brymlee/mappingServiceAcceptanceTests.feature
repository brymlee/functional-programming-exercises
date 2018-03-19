Feature: List mapping service functionality 

Scenario: Can the mapping service map a list of strings to integers? 
	Given a string list of "['1', '2', '3', '4']" 
	When calling the integer map on list 
	Then the integer list result should be "[1, 2, 3, 4]"   
