'''
Assignment: Module 9 Banking Application
This application will be used to calculate insurance coverage based on the age of the insured.
Created by: Keith Olsen
Created on: 4/27/2023
'''

class InsurancePolicy:
    def __init__(self, coverage_amount):
        self.coverage_amount = coverage_amount
        
    def adjust_coverage(self, new_coverage_amount):
        if new_coverage_amount < 0:
            raise ValueError("Invalid coverage amount")
        self.coverage_amount = new_coverage_amount
        
    def get_coverage_amount(self):
        return self.coverage_amount
    
def calculate_premium(age, coverage_amount):
    base_premium = 500
    age_factor = 1.2 if age < 25 else 1.0
    coverage_factor = coverage_amount / 1000
    return base_premium * age_factor * coverage_factor

try:
    age = int(input("Enter your age: "))
    coverage_amount = int(input("Enter your coverage amount: "))
    
    policy = InsurancePolicy(coverage_amount)
    print(f"Current coverage amount: {policy.get_coverage_amount()}")
    
    premium = calculate_premium(age, policy.get_coverage_amount())
    print(f"Your premium: {premium}")
    
    adjust = input("Would you like to adjust your coverage amount? (y/n): ")
    if adjust.lower() == 'y':
        new_coverage_amount = int(input("Enter your new coverage amount: "))
        policy.adjust_coverage(new_coverage_amount)
        print(f"New coverage amount: {policy.get_coverage_amount()}")
except ValueError as e:
    print(f"Error: {str(e)}")