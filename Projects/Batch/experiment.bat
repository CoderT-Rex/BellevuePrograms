@echo off
title WELCOME!
:A
set /p a= Name? 
Echo Hello %a%
title %a% is a dunghead
set /p b= Password?
if %b% ==funny92 goto b
if not %b%==funny92 goto c
:c
echo program terminated
pause >nul
exit
:b
echo welcome to batch experiment 1 
pause >nul
:action
set /p action= State desired action (type list for list of actions)
if %action% ==list goto list
if %action% ==exit goto exit
if %action% ==internet goto internet
if %action% ==delete goto delete
if %action% ==cleanup goto cleanup
if %action% ==disclaimer goto disclaimer
if %action% ==StarWars goto StarWars



:list
echo exit- exits the program
echo internet- logs onto sites and gives internet access
echo delete- allows you to target and delete files in a folder on your computer
echo cleanup- variety of systems designed to clean up your computer
echo disclaimer- me covering my butt
echo StarWars- movie in command prompt made up of text, Koolio!
pause >nul
goto action

:exit
echo thank you for using Josh's experiment 1
pause >nul
echo goodbye
pause >nul
exit

:internet
set /p service= Aol or iexplorer?
if %service% ==aol goto aol
if %service% ==iexplorer goto explorer
if not %service% == aol goto no service
if not %service% == internet explorer goto no service

:aol
set /p website= website?
start aol.exe %website%
goto action

:explorer
set /p website= website?
start iexplore.exe %website%
goto action

:no service
echo either you typed something wrong, or your living in the stone age without internet.
pause >nul
goto action


:cleanup
set /p cleaning= Which action should be taken? (Diskcleanup, Diskdefragment, Cookiedelete. type help for info)
if %cleaning% ==help goto cleaninfo
if %cleaning% ==Diskcleanup CleanMgr
if %cleaning% ==Diskdefragment start %SystemRoot%\system32\dfrg.msc
if %cleaning% ==Cookiedelete goto cookiedelete
goto action


:cleaninfo
echo Unwanted or unesscessary files can use up space and slow down your computer
echo Disk Clean up is a program that scans for such files, but be careful you don't delete necessary files! Follow the instrustions on the bottom of the screen for each set of files, if you do screw up, I'd recomend a system restore, access a former date so you can restore any files you might have deleted. It's under accesories and system tools in the start menu
echo Disk Defragmenter is a no risk program that simply compresses files (not delete them) for a faster computer and more disk space.
echo delcookies is a program I wrote to delete anything in your cookie folder, shouldn't do anything wrong, but still use at own risk.
echo note that defragment and clean up are not my programs and therefore may not be on all computers
pause >nul
goto cleanup

:delete
set /p filepath= Type name of folder (it's file path) to be deleted (files cannot be recovered once deleted) example C:\Docuements and Settings\Administrator\Cookies (file paths can be found in propierties) This will delete ALL THE ITEMS IN THAT FOLDER PERNAMENTLY, WILL NOT TARGET ONE SPECIFIC FILE
cd %filepath%
del *
echo for computer file security the program will now shut down
goto exit

:cookiedelete
set /p signedin= What user name are you signed in under? (example: administrator)
cd C:\Documents and Settings\%signedin%\cookies
del *
pause >nul
echo For computer safety the program will now shutdown
pause >nul
goto exit

:disclaimer
echo Disclaimer: Joshua Rex is not responsible for any and all damage done to a computer, most, if not all, of these programs are tested but could be harmful if used in a wrong way.
pause >nul
goto action 

:StarWars
telnet towel.blinkenlights.nl
goto action