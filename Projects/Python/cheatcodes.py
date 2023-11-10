#Joshua Rex
#Intro to Programming with Python 
#Module 6 Dictionary Assignment
#4/7/2023

#Intialize the Values in the Dictionary

turok_cheats = {
				'All Keys':'NGLCKCK',
				'All Weapons':'THMSCLS',
				'Big Heads':'PRMSHN',
				'Tiny Enemy':'HFLLTHSH',
				'Fly Mode':'KNTSFSKS',
				'Infinite Lives':'JFFSPNGDNBRG',
				'Unlimited Ammo':'LNJHNSN',
				'Invincibility':'DDDNSTBR',
				'Purdy Colors':'CRLSFNDNGS',
				'Quack Mode':'GSRCGKFS',
				'Show Credits':'LRNMSNHR',
				}

#Greet the User, then iterate through the available items in the dictionary

print('Hello! Welcome to the Turok the Dinosaur Hunter n64 Cheat Code Finder!')
print('Here is a list of available codes:')				
for cheat in turok_cheats:
	print(cheat)

#Ask the user which value they would like to look up, 
#ensuring the key is titled

code = input('Which code would you like to look up? ').title()

#Initialize a while loop that will run the program until the user quits

while code != "Quit":

#Check the users input against the dictionary, and display the value 
#if they entered a valide key 

	if code in turok_cheats:
		requested_cheat = turok_cheats[code]
		print(f'The code for {code} is {requested_cheat}')

#Allow the user to reprint the dictionary if they have entered too many codes and can no longer see the original

	elif code == "List":
		for cheat in turok_cheats:
			print(cheat)

#This prints only if the user inputs something invalid

	else: print('Sorry that code is not available')

#Allows the user to make another input. New text clarifies how to quit and recall the dictionary

	code = input('Which code would you like to look up? Type "List" for a list of codes or "Quit" to quit. ').title()
