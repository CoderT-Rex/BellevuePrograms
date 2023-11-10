#Joshua Rex
#Into to Programming with Python
#4/13/2023

#Display purpose of program to user
print('Welcome to the interest rate calculator!')
print("In this program, we will determine how many years it will take to double your finacial investments")
print("given the intial cash amount combined with the extpected interest rate.")
print()

#Intialize a while loop, in case the user would like to make multiple calculations

program_run = True
while program_run == True:

#Gather informtation from the user, and check for invalid inputs

	investment = input("What is the intial amount of money you would like to invest? $")
	try:
		investment = float(investment)
	except:
		print("Error: You must enter this value as an integer.")
		print()
		continue

	interest = input("What is the expected rate of growth? Enter as a decimal: ")
	try:
		interest = float(interest)
	except:
		print("Error: You must enter this value as an decimal without a percent sign.")
		print()
		continue

# Set the variables

	years = 0
	balance = investment

# Perform the calculation

	while balance < investment * 2:
		balance += balance * interest
		years += 1

#Print the result, making sure the user input their interest rate correctly
	if years > 1:
		print()
		print(f"It will take {years} years for your intial investment to double.")
		print()
	else:
		print()
		print("According to our calculations, your investment will double within a single year!")
		print("This seems unlikely!")
		print("Are you sure you entered your rate of growth correctly? Please make sure you enter your interest rate as a decimal.")
		print()

#Determine if the calculation should be performed again

	exit_program = input("Would you like to run the program again? y/n ")
	if exit_program == "n":
		program_run = False
	else:
		print()

