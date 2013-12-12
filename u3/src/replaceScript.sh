#!/bin/sh
# Author: Chuck
# Replaces all tabs(\t) with two tabs and removes trailing whitespaces
# Don't be retarded when you use this

sed -i 's/\t/  /g;s/[[:space:]]*$//' $1
echo "All tabs and trailing whitespaces in \"$1\"\
 has been replaced with two spaces."
