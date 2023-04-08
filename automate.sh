#!/bin/bash

# Script to automate git add ., git commit -m "Update", and git push

# Change to your repository directory
cd /Users/omar/Desktop/College/Computer Science/Spring-Quarter-2023/CS-145

# Perform git add .
git add .

# Perform git commit with a default commit message "Update"
git commit -m "Update"

# Perform git push
git push

# Print success message
echo "Git add, commit, and push completed successfully!"

