
baseballTeams = ['cardinals', 'tigers', 'red sox']

for baseballTeam in baseballTeams:
  print(f'I like the {baseballTeam.title()} team.')
  print(f'How many World Series has the {baseballTeam.title()} won?')
  print()
  
print('----------End of Loop----------')  
  
# or

for baseballTeam in baseballTeams:
  print(f'I like the {baseballTeam.title()} team.')
  print(f'\tHow many World Series has the {baseballTeam.title()} won.\n')

print('----------End of Loop----------')  

# or
# Not in loop - Logic Error
for baseballTeam in baseballTeams:
  print(f'I like the {baseballTeam.title()} team.')
print(f'\tHow many World Series has the {baseballTeam.title()} won.\n')

# Not in loop
print('----------End of Loop----------')  

# Error - No statements in loop
#for baseballTeam in baseballTeams:
#print(f'I like the {baseballTeam.title()} team.')
#print(f'\tHow many World Series has the {baseballTeam.title()} won.\n')
  