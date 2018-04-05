#!/bin/bash

cd /scaladev/
git pull
git add .
git commit -m "`date`"
git push

