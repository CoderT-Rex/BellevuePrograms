
baseballTeams = ['cardinals', 'tigers', 'red sox', 'rangers', 'astros', 'white sox', 'cubs']

# Prints ['cardinals', 'tigers', 'red sox', 'rangers']
for baseballTeam in baseballTeams[0:4]:
  print(f"{baseballTeam.lower()}, {baseballTeam.title()}, {baseballTeam.upper()}")

print("------------------------------------------")  
  
# Prints ['red sox', 'rangers']
for baseballTeam in baseballTeams[2:4]:
  print(f"{baseballTeam.lower()}, {baseballTeam.title()}, {baseballTeam.upper()}")

print("------------------------------------------")  

# Prints ['cardinals', 'tigers', 'red sox']
for baseballTeam in baseballTeams[:3]:
  print(f"{baseballTeam.lower()}, {baseballTeam.title()}, {baseballTeam.upper()}")

print("------------------------------------------")  

# Prints ['rangers', 'astros', 'white sox', 'cubs']
for baseballTeam in baseballTeams[3:]:
  print(f"{baseballTeam.lower()}, {baseballTeam.title()}, {baseballTeam.upper()}")

print("------------------------------------------")  

# Prints ['red sox', 'rangers', 'astros', 'white sox', 'cubs']
for baseballTeam in baseballTeams[-5:]:
  print(f"{baseballTeam.lower()}, {baseballTeam.title()}, {baseballTeam.upper()}")
        