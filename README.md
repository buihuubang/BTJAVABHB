# PUSH GITHUB:

## PUSH:

$ git config --global user.email = "your email github"

$ git config --global user.name = "your username github"

$ git add .

$ git commit -m "message"

$ git push -f origin master

## REMOVE FILE:

$ git rm yourfile

$ git commit -m "remove yourfile"

$ git push -f origin master

*if you want to remove the file only from Git repository and not re move it from file system, use:*

$ git rm --cached youfile

$ git commit -m "remove yourfile"

$ git push -f origin master

## Store your github account without entering your user and password in a prompt:

$ git config credential.helper store

$ git push http://example.com/repo.git

Username: <type your username>

Password: <type your password>

# IF CAN'T PUSH TO MASTER OR "Everything up-to-date" MESSAGE APPEAR, TRY THIS:

//USE "git branch -v", to see branch. If terminal show us:

master

*mybranch

//Then do this:
 
$ git checkout master

//to update the state to the latest remote master state

$ git pull               

//to bring changes to local master from your mybranch

$ git merge mybranch 

//push current HEAD to remote master branch    

$ git push -f origin master 

## OR:

//Make sure everything is pushed up to your remote repository (GitHub):

$ git checkout master

//Overwrite "master" with "mybranch":

$ git reset --hard mybranch

//Force the push to your remote repository:

$ git push -f origin master

*From stackoverflow.com*

## END.
