Feature: Composite service functionality.

Scenario: Can the composite service calculate the fibanacci sequence to the tenth place
	Given the last fibanacci place is a 10
	When the fibanacci calculator is called 
	Then the integer list result should be "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
