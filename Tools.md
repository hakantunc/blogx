# Maven
There are 3 lifecycles: default, clean, and site.

## Default lifecycle
* compile
* test
* package: Create a jar file
* install: Add jar file into local maven repository

When you run any of these phases, it runs from the beginning in order until the specified phase.

## Clean lifecycle
Cleans the project

## Use cases
* Create a jar file
  - `mvn clean package`
* Add jar file into the local maven repository
  - `mvn clean install`
* Run tests
  - `mvn clean test`

## Use case #1
* Create a maven project
  - `mvn archetype:generate`
* Install the jar into local repo
  - `mvn install`
* Run the app
  - `java -cp ~/.m2/repository/<give-the-path> <entry-point-to-main (com.java...App)>`

## Use case #2: Run the application with `mvn`
* Add following to pom.xml
```xml
<plugin>
  <groupId>org.codehaus.mojo</groupId>
  <artifactId>exec-maven-plugin</artifactId>
  <version>1.6.0</version>
  <configuration>
    <mainClass>{{com.java...path-to-main}}</mainClass>
  </configuration>
</plugin>
```
* Run the main
  - `mvn -q compile exec:java`


# Haskell
* ghci multiple lines edit
  - `:set +m`

# [SPIN](http://spinroot.com/)

* Run a simulation
  - `spin *.pml`
* Generate a verifier
  - `spin -a *.pml`
* Compile and run the verifier
  - `gcc -o pan pan.c && pan`
* Simulation of the error trace
  - `spin -p -t *.pml`

# Emacs
* [use-package](https://www.masteringemacs.org/article/spotlight-use-package-a-declarative-configuration-tool)
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
* `du`       -- display disk usage statistics

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
