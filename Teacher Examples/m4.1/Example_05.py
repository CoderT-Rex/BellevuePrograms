
baseballTeams = ['cardinals', 'tigers', 'red sox', 'rangers', 'astros', 'white sox', 'cubs']


# Logic error
for baseballTeam in baseballTeams:
  print(f'I like the {baseballTeam.title()} team.')
print(f'How many World Series has the {baseballTeam.title()} won.')
  
print('----------End of Loop----------')  


# Syntax error 
for baseballTeam in baseballTeams:
    print(f'I like the {baseballTeam.title()} team.')
  print(f'How many World Series has the {baseballTeam.title()} won.')
  
print('----------End of Loop----------')  
