# Emacs

* Reload configurations
  - `M-x eval-buffer`

# [nuXmv](https://nuxmv.fbk.eu)

## Steps

1. `nuXmv -int`
1. `reset`
1. `read_model -i model.smv`
1. `go`
  1. simulation
    1. `pick_state -vr`
      * `-v` verbose
      * `-r` random
      * `-i` interactive
      * `-c` constraint
    1. `simulate -vr -k 1`
  1. check specification
    1. `check_property`

## Commands

* `show_traces`
* `goto_state`

## Use Cases

* Simulation
  - `reset; read_model -i model.smv; go; pick_state -vr`
  - `simulate -vr -k 1`
* Check Specification
  - `reset; read_model -i model.smv; go; check_property`

## Resources

* http://nusmv.fbk.eu/NuSMV/tutorial/index.html
* http://disi.unitn.it/~trentin/teaching/fm2016/fm2016.html


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
