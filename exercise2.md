# Excercise 2 - Gitcommands

This markdown file describes the most common git commands.

## Gitcommands

### git config

git config is used to set a configuration value for your user name, email, color, etc.
Example:

```cmd
git config --global user.name "Alex Quantschnig"
git config --global user.email "alex.quantschnig@edu.fh-joanneum.at"
git config --global init.defaultBranch main
```

### git init

git init is a command in Git that initializes a new Git repository. When you run this command, Git creates a new directory in your current working directory, where it stores the necessary files for version control, including a hidden directory named .git.

### git log

git log is used to display all of the commits of a repository in chronological order.

### git diff

git diff is used to show the changes between commits, commit and working tree, etc.
When you run git diff, Git will display the differences between the current state of the files in your working directory and the last committed state of those files in your Git repository.

### git clone

git clone is a Git command line utility which is used to target an existing repository and create a clone of the target repository.

```cmd
git clone <url>
```

### git add

git add is a multipurpose command — you use it to begin tracking new files and to stage files.
With git add --all you can add all files to the staging area.
To add a specific file you can use git add "filename".

### git status

git status displays the state of the working directory and the staging area. It lets you see which changes have been staged, which haven’t, and which files aren’t being tracked by Git.

### git rm

git rm is used to remove files from a Git repository.

### git commit

git commit is used to save your changes to the local repository.
Use a simple git commit message that describes your changes.
You run it by using git commit -m "your message".

### git push

git push is used to upload local repository content to a remote repository.
You can push your changes to the remote repository by using git push after commiting something.

### git pull

git pull is used to fetch and download content from a remote repository and immediately update the local repository to match that content.
