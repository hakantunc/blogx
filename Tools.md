# [nuXmv](https://nuxmv.fbk.eu)

## Steps

1. `nuXmv -int`
1. `reset`
1. `read_model -i model.smv`
1. `go`
1. `pick_state -vr`
  * `-v` verbose
  * `-r` random
  * `-i` interactive
  * `-c` constraint
1. `simulate -vr -k 1`

## Commands

* `show_traces`
* `goto_state`

## Use Case

* `reset; read_model -i model.smv;`
* `go; pick_state -vr;`
* `simulate -vr -k 1`

## Resources

* http://nusmv.fbk.eu/NuSMV/tutorial/index.html
* http://disi.unitn.it/~trentin/teaching/fm2016/fm2016.html
