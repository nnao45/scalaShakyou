#!/bin/bash

cd /repo/scala/scalaShakyou
git pull
git add .
git commit -m "`date`"
git push

