#Joshua Rex
#Intro to Programming with Python
#4/30/2023

#Import the os module, which is a built in module for Python that
#does reading and writing tasks that are dependent on the Operating System

#If my comments are overly detailed this week, it's because I don't
#think 'os' was adequately covered in the book, and I want to remind
#myself of these concepts for later, since I am doing outside research.

import os

def getfilepath():
    """Prompt user for directory and filename, returns a parsed filepath of the two"""
    global directory
    global filename
    directory = input("Enter the directory path where this information should be stored: ")
    print()
    filename = input("Enter what you would like the file to be called: ")

#Assign the two variables collected to the new variable 'filepath."
#To create the full address use os's 'join" method. This method creates a path
#intelligently from two seperate strings

    filepath = os.path.join(directory, filename)
    return filepath

def getinfo():
    """Get the information that will be saved to the file"""
    global name
    global address
    global phone
    name = input("What is your name? ")
    print()
#I seperated the address into multiple prompts for ease of use
    street = input("What is your street name and number? " )
    city = input("What is your city and state? ")
    Zip = input("What is your Zip Code? ")

#Combine them here, adding spaces inbetween so it looks clean
    address = street + "\n " + city + "\n " + Zip
    print()
    phone = input("What is your phone number? ")

#Display purpose of program to user
print("This program will save your name, address, and phone number in")
print("a file on your computer. First, you need to select where the file")
print("will be saved.\n")

filepath = getfilepath() 

while True:
    confirmpath = input(f"Does this filepath look correct? y/n \n {filepath} ")
    if confirmpath.lower() == 'y':
        print()
        break
    elif confirmpath.lower() == 'n':
        print()
        filepath = getfilepath()
    else:
        print()
        print("Please enter a y/n")
        print()

#Using the 'exists' method from OS, check if the entered directory exists, 
#if the 'exists' statement returns false, create one using the 'os.makedirs' command

if not os.path.exists(directory):
    os.makedirs(directory)

#invoke the get info function I constructed earlier to create
#the global variables that will be used to creat the information
#in the file

getinfo()

#This loop had the user check for typos before committing to writing the file

while True:
    confirm_info = input(f"Does this information look correct? y/n \n {name},\n {address},\n {phone} ")
    if confirm_info.lower() == 'y':
        print()
        break
    elif confirm_info.lower() == "n":
        print()
        getinfo()
    else:
        print()
        print("Please enter a y/n")
        print()

#Before writing the file, I wanted to ensure the user did not accidentally 
#overwrite existing info they wanted. This statement is True if a file
#defined in filepath already exists.   

while os.path.exists(filepath):
    overwrite = input("Warning: File with this name already exists. Do you want to overwrite it? (y/n) ")

#The solution I have here is to prompt the user to create new filepaths
#until they make one that doesn't exist, exiting this while loop.
#Another solution might be to allow them to append the existing document
#instead. This would be done by giving an option to run this code instead
#of what the "with open(filepath, "w") as file:" that follows this while statement:

#with open(filepath, "a") as file
#   file.write("{}\n {}\n {}\n".format(name, address, phone))

#If I was designing this of my own volution, I would probably add that
#option and remove the redundant "read" of the file at the bottom of the
#code. Purely taking these notes for my own learning so I can refrence
#this later.

    if overwrite.lower() == 'n':
        print("Please select a new filepath")
        filepath = getfilepath()
    else:
        print("File will be overwritten.")
        print()
        break

#Using the open and write (w) method, we create the file and fill it with 
#the variables we generated earlier.

with open(filepath, "w") as file:
    file.write("{}\n {}\n {}\n".format(name, address, phone))

print("File created sucessfully.")

#Here we open the file in read mode (r), pass the entire contents to 
#a variable and then display them for the user.

with open(filepath, "r") as f:
    contents = f.read()
    print(f"Here are the contents:\n{contents}")
    print()

#I always think my program has crashed, when I realized it just
#closed on its own before I could see the information.  

input("Thank you for using this tool!")
