#!/bin/bash

# shellcheck disable=SC2164
cd /Users/omar/Desktop/College/Computer\ Science/Spring-Quarter-2023/CS-145

git add .

# shellcheck disable=SC2006
git commit -m "Added Lectures `date +%m-%d-%Y` ch 9"

git push

echo "Git add, commit, and push completed successfully!"

