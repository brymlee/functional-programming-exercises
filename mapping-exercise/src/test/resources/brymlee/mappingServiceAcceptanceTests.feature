Feature: List mapping service functionality 

Scenario: Can the mapping service map a list of strings to integers? 
	Given a string list of "["1", "2", "3", "4"]" 
	When calling the integer map on list 
	Then the integer list result from the integer map should be "[1, 2, 3, 4]"   

Scenario: Can the mapping service flip the order of first name and last name?
	Given a string list of "["John Johnson", "Bob Barker", "Tom Thompson"]"
	When calling the name flipper map on list
	Then the string list result from the flipper map should be "["Johnson John", "Barker Bob", "Thompson Tom"]"
