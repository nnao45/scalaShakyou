#!/bin/bash

cd /scaladev/scalaShakyou
git pull
git add .
git commit -m "`date`"
git push

