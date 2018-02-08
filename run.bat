IF NOT EXIST "build" (
ant clean build compile jar run
)
ELSE(
git add .
git commit -m "commit"
git push -u origin master
)