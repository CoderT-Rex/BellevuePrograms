#Joshua Rex
#Into to Programming with Python
#4/29/2023

#Create the Super Class, containing the needed info for all bank accounts

class BankAccount:
	"""Represents how much money a user has in the bank"""
	def __init__(self, accountNumber, balance):
		self.accountNumber = accountNumber
		self.balance = balance

	def withdraw(self, amount):
		"""alows the user to withdraw available funds"""

#Check to see if the user entered an integer
		try: 
			amount = float(amount)
			amount = round(amount, 2)

#Check to make sure the account has enough funds before deducting them from
#the account

			if amount > self.balance:
				print("Insufficent Funds.")
			else:
				self.balance -= amount
				print(f"Your account now contains ${self.balance}")
				print()

		except:
			print("Please enter a valid integer.")
			print()

	def deposit(self, amount):
		"""Allows user to add funds to their account"""

#Check to see if the user entered a positive integer

		try: 
			amount = float(amount)
			amount = round(amount, 2)
			if amount > 0:
				self.balance += amount
				print(f"Your account now contains ${self.balance}")
			else:
				print("Please enter a positive number.")
		except:
			print("Please enter a valid integer.")

	def getBalance(self):
		"""Returns current account balance"""
		self.balance = round(self.balance, 2)
		return self.balance

class Checking(BankAccount):
	"""Adds a Subclass with fees and a minmum balance for bank accounts"""
	def __init__(self, accountNumber, balance, fees=5, minimum_balance=25):
		super().__init__(accountNumber, balance)
		self.fees = fees
		self.minimum_balance = minimum_balance

	def deductFees(self):
		"""Deducts fee from bank account"""
		self.balance -= self.fees

	def checkMinimumBalance(self):
		"""Checks to see if the account is below the minimum balance"""
		if self.balance > self.minimum_balance:
			return False
		elif self.balance <= self.minimum_balance:
			return True

#Replacing this function from the Super Class was easier then adding the
#functionality I wanted in the main body.

	def withdraw(self, amount):
		"""Allows the user to withdraw available funds, while checking account has
		enough with checking account fees and the minumum balance requirement"""
		try:
			amount = float(amount)
			amount = round(amount, 2)
			if amount > self.balance:
				print("Insufficient funds.")
			else:
				new_balance = self.balance - amount - self.fees
				if new_balance < self.minimum_balance:
					print("Withdrawal cannot be completed due to insufficient balance.")
					print()
				else:
					self.balance = round(new_balance, 2)
					print(f"Your account now contains ${self.balance}")
					print()
		except:
			print("Please enter a valid integer.")


class Savings(BankAccount):
	"""Adds a subclass of bank account that can calculate an interest rate"""
	def __init__(self, accountNumber, balance, interestRate=0.02):
		super().__init__(accountNumber, balance)
		self.interestRate = interestRate

	def addinterest(self):
		"""Adds interest according to the new rate"""
		self.balance += self.balance * self.interestRate
		self.balance = round(self.balance, 2)
		return self.balance

#Display purpose of program to user

print("Welcome to Bank Account Helper!")
print()

#Get intial values for the classes, checking for valid inputs

while True:
	accountNumber = input("What is your Account Number? ")
	try: 
		accountNumber = int(accountNumber)
		print()
		break
	except:
		print("Please enter a valid integer")
		print()

while True:
	balance = input("What is your current balance? $")
	try: 
		balance = float(balance)
		print()
		break
	except:
		print("Please enter a valid integer.")
		print()
		

#Checks what kind of account user would like to open, and intializes a loop
#that allows the user to perform the above functions.

print("Is it a Checking or Savings Account?")
print()

Run = True

while Run:
	account = input("Type c for Checking or s for Savings: ")
	print()

#Checking account can be intialized here, before asking for input
#it will check if the user has a balance below the default Minimum Balance.

	if account.lower() == 'c':
		myaccount = Checking(accountNumber, balance)
		if myaccount.checkMinimumBalance():
			print(f"Warning! Your account is below the minimum balance of ${myaccount.minimum_balance}. Please deposit additional funds.")
			print()

#User can withdraw, deposit, check balance, or press q to break the loop.

		action = input("Welcome! Type 'W' to Withdraw, 'D' to Deposit, 'B'' to check your Balance, or 'Q' to Quit. ")
		print()
		if action.lower() == 'q':
			Run = False
			break

#This second while statement ensures users can take as many actions as they want
#on this current account before exiting the program.

		while action.lower() != 'q':
			Run = False

#The extra text in the withdraw statement makes it clear to the user
#why they might not be able to make a withdraw even if they have the
#necessary funds.

			if action.lower() == 'w':
				amount = input("How much would you like to withdraw? $")
				print()
				print(f"There will be a fee of ${myaccount.fees}. Your account also must maintain a minimum balance of ${myaccount.minimum_balance}")
				feeokay = input("Would you like to continue? y/n ")
				print()
				if feeokay.lower() == 'y':
					myaccount.withdraw(amount) 

#Here the user can run the deposit function

			elif action.lower() == 'd':
				amount = input("How much would you like to deposit? $")
				print()
				myaccount.deposit(amount)
				print()

#Here the user can check their balance with the appropiate function.

			elif action.lower() == 'b':
				balance = myaccount.getBalance()
				print(f"Your account currently has a balance of {balance}.")
				print()

#This input repeats until q is typed

			action = input("Type 'W' to Withdraw, 'D' to Deposit, 'B'' to check your Balance, or 'Q' to Quit. ")
			print()

#This seperate block of elif statements creates a Savings account.

	elif account.lower() == 's':
		myaccount = Savings(accountNumber, balance)
		print("Welcome! Type 'W' to Withdraw, 'D' to Deposit, 'B' to check your Balance,")
		action = input("'I' to simulate an increase in interest, or 'Q' to Quit.")
		print()

#Option to quit the program

		if action.lower() == 'q':
			break
			Run = False

#Seperate loop so users can take as many actions as they want in the Savings
#account section

		while action.lower() != 'q':
			Run = False

#This withdrawn statement inherits from the main Bank Account class
#and does not have the checks for fees and minimum balance that were
#given to the checking account class.

			if action.lower() == 'w':
				amount = input("How much would you like to withdraw? $")
				print()
				myaccount.withdraw(amount)

#Deposit, which functions the same for both subclasses. I like adding
#alot of print() spacing to make it clear and easy to read in the
#command prompt.

			elif action.lower() == 'd':
				amount = input("How much would you like to deposit? $")
				print()
				myaccount.deposit(amount)
				print()

#Show the account balance

			elif action.lower() == 'b':
				balance = myaccount.getBalance()
				print()
				print(f"Your account currently has a balance of {balance}.")
				print()

#Only unique statement to savings account, adds interest with the default
#0.02% rate.

			elif action.lower() == 'i':
				balance = myaccount.addinterest()
				print(f"Your new balance with accrued interest is {balance}.")
				print()

#This input will repeat until q is pressed.
			print("Type 'W' to Withdraw, 'D' to Deposit, 'B'' to check your Balance,")
			action = input("'I' to simulate accured interest, or 'Q' to Quit. ")
			print()	
	
#This statement is part of the original while loop, in case the user does not
#enter a "C" or "S" for checking or savings account. This will continue to 
#prompt them until they give a valid input.

	else: 
		print("Invalid Input.")
		print()