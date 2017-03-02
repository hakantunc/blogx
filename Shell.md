# Commands

* `echo`     -- write arguments to the standard output
* `rev`      -- reverse lines of a file
* `tr`       -- translate characters
* `awk`      -- pattern-directed scanning and processing language
* `sed`      -- stream editor
* `bc`       -- An arbitrary precision calculator language
* `readlink` -- print resolved symbolic links or canonical file names

# Shell Scripting

Access arguments with `$1`, `$2`, etc.
 
```sh
while [ condition ]
do
   commands
done
```

```sh
if [ condition ]
  then <cmd>
elif
  then <cmd>
else <cmd>
fi
```

## Conditions

* [ -z STRING ]	True of the length if "STRING" is zero.
* [ -d FILE ]	True if FILE exists and is a directory.

Source: http://www.tldp.org/LDP/Bash-Beginners-Guide/html/sect_07_01.html
