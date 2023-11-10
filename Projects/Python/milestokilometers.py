#Joshua Rex
#Into to Programming with Python
#4/15/2023

#Create and define function

def mtok(miles):
	"""converts miles to kilometers, then displays that output to the user"""

	#Check to see if the user entered an integer
	try: 
		miles = float(miles)

#Perform the conversion
		km = miles * 1.60934

#This elif statement just checks for the proper grammar when displaying the output, if the
#user enters a fraction of a mile
		if km == 1.60934:
			print()
			print(f"{miles} mile is equal to {km} kilometers.")
			print()
		elif miles > 1:
			print()
			print(f"{miles} miles is equal to {km} kilometers.")
			print()
		elif miles < 1 and km < 1:
			print()
			print(f"The fraction of a mile {miles} is equal to {km} of a kilometer.")
			print()
		elif miles < 1 and km > 1:
			print()
			print(f"The fraction of a mile {miles} is equal to {km} kilometers.")
			print()

#If the user does not input an integer, this text will display.

	except:
		print()
		print("Invalid input, please enter an integer.")
		print()

#Display purpose of program to user

print("Welcome to the Miles to Kilometers converter!")
print()

#Get input, while giving an option to quit the program

while True:
	miles = input("Type 'Quit' to quit. Otherwise, please enter the amount of miles you would like to see in kilometers: ")
	if miles.title() == "Quit":
		break
	else:
		mtok(miles)