#Joshua Thomas Rex
#03/24/2023
#Intro to Programming with Pyth (2235-DD) Module 4 Assignment

#Establish intial tuple values
potatodishes = ("fries", "chips", "mashed potatoes", "boxtys", "baked potatoes", "croquette", "gnocchi", "gratin potatoes", "hash browns", "potato skins", "potato bread", "schupfnudel", "tater tots", "zippuli", "tombet")

#Display all 15 items in the tuple
print(potatodishes)

#Display each value from the tuple in a string in chronological order 
yum = 0
while yum < len(potatodishes):
  print(f"Did you know you can make {potatodishes[yum]} out of potatoes?")
  yum = yum + 1

#Display each value in a string in reverse chronological order
yum = yum - 1
while yum > -1:
  print(f"I could eat {potatodishes[yum]} all day.")
  yum = yum - 1

input("Press the enter key to exit the program. So you can start cooking.")