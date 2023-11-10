#Joshua Rex
#Intro to Programming with Python
#4/30/2023

def GetNumberOne(Calculation_Type):
	"""Get the first number to be used in the calculation from the user"""
	while True:
		number_one = input(f"What is the first number you would like to {Calculation_Type}? ")
		try: 
			number_one = float(number_one)
		except:
			print("Please type an integer.")
		else:
			return number_one
			break

def GetNumberTwo(Calculation_Type):
	"""Get the second number to be used in the calculation from the user"""
	while True:
		number_two = input(f"What is the second number you would like to {Calculation_Type}? ")
		try: 
			number_two = float(number_two)
		except:
			print("Please type an integer.")
		else:
			return number_two
			break


print("Welcome to simple calculator!")
while True:
	print("Type 'a' to add, 'd' to divide, 'm' to muliply, 's' to subtract or 'q' to quit.")
	calculation = input("What type of calculation would you like to do? ")
	if calculation.lower() == q:
		break
	elif calculation.lower() == a:
		number_one = GetNumberOne("add")
		number_two = GetNumberTwo("add")
		solution = number_one + number_two
		print(f"The solution is {solution}")
	elif calculation.lower() == d:
		number_one = GetNumberOne("divide")
		number_two = GetNumberTwo("divide")
		while number_two == 0:
			print("You cannot divide by zero!")
			number_two = GetNumberTwo("divide")
		solution = number_one / number_two
		print(f"The solution is {solution}")
	elif calculation.lower() == m:
		number_one = GetNumberOne("multiply")
		number_two = GetNumberTwo("multiply")
		solution = number_one * number_two
		print(f"The solution is {solution}")
	elif calculation.lower() == s:
		number_one = GetNumberOne("subtract")
		number_two = GetNumberTwo("subtract")
		solution = number_one - number_two
		print(f"The solution is {solution}")
	else:
		print("Invalid Input.")
		