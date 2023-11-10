#Joshua Rex
#Intro to Python (2235-DD)
#04/02/2023

#Show the Welcome Message
print("Welcome to Fiber Optic Calculator")

#Get the Company name from the user and greet them
Company_Name = input("What is your company name? ")
print(f"Hello {Company_Name.title()}!")

#Inquire as to what amount of cable is to be purchased, and double check
#that the user enters an integer. 
Cable_Legnth = input("How many feet of fiber optic cable would you like to purchase? ")
try: float(Cable_Legnth)
except: Cable_Legnth = input("Invalid input, please type a valid interger: ")

if float(Cable_Legnth) > 100:
 Product_Cost = float(Cable_Legnth) * 0.80
 Product_Cost = round(Product_Cost, 2)
 print(f"It will cost {Company_Name.title()} ${Product_Cost} to lay {Cable_Legnth} feet of fiber optic cable.")

elif float(Cable_Legnth) > 250:
 Product_Cost = float(Cable_Legnth) * 0.70
 Product_Cost = round(Product_Cost, 2)
 print(f"It will cost {Company_Name.title()} ${Product_Cost} to lay {Cable_Legnth} feet of fiber optic cable.")

elif float(Cable_Legnth) > 500:
 Product_Cost = float(Cable_Legnth) * 0.50
 Product_Cost = round(Product_Cost, 2)
 print(f"It will cost {Company_Name.title()} ${Product_Cost} to lay {Cable_Legnth} feet of fiber optic cable.")

elif float(Cable_Legnth) > 0:
 Product_Cost = float(Cable_Legnth) * 0.87
 Product_Cost = round(Product_Cost, 2)
 print(f"It will cost {Company_Name.title()} ${Product_Cost} to lay {Cable_Legnth} feet of fiber optic cable.")

else: print("Invalid input, please type a valid interger greater than zero.")

input("Press the enter key to exit")