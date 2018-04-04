# PUSH GITHUB:

git config --global user.email"your email github"

git config --global user.name"your username github"

git add .

git commit -m "message"

git push -f origin master

## IF CAN'T PUSH TO MASTER OR "Everything up-to-date" MESSAGE APPEAR, TRY THIS:

git checkout master

//to update the state to the latest remote master state

git pull               

//to bring changes to local master from your develop branch

git merge develop 

//push current HEAD to remote master branch    

git push origin master 

## OR:

//Make sure everything is pushed up to your remote repository (GitHub):

git checkout master

//Overwrite "master" with "better_branch":

git reset --hard mybranch

//Force the push to your remote repository:

git push -f origin master

## END.
