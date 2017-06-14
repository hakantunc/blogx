# Find and remove duplicate files
* `fdupes <dir>`
  - List duplicates in the dir
* `fdupes -d <dir>`
  - Removes duplicates with a prompt to choose which one to keep
* `brew install fdupes`
* https://github.com/adrianlopezroche/fdupes

# Show images inline in Markdown in Atom Text Editor
* https://atom.io/packages/inline-markdown-images

# Keep running [nodemon](https://nodemon.io/) even after an error
* `nodemon -x '<cmd> || exit 1'`

# Repeat a command multiple times
* `repeat 3 { date; sleep 1 }`

# Execute scheduled commands - cron

* Add jobs
  - `crontab -e`
* Caveats:
  - Give full path for commands. Environment variables are limited.
  - Escape `%` characters.

# ssh to a computer without a password

* Generate keys
  - `ssh-keygen -t rsa`
* Add the generated public key to the target machine's `~/.ssh/authorized_keys` file
* Connect to the target machine
  - `ssh -i <private_key_location> <target_hostname>@<target_ip>`

# Edit a line or access history from an interactive shell

* `with-readline <cmd>`
  - `brew install with-readline`
* `rlwrap <cmd>`
  - Supports Coq autocomplete.
  - `brew install rlwrap`


# Unlock a PDF file

* Install:
  - `brew install qpdf`
* Usage:
  - `qpdf --decrypt input.pdf output.pdf`

# Convert Images to a PDF file

* Install:
  - `pip3 install img2pdf`
* Usage:
  - `img2pdf *.jpg -o out.pdf`
* Source:
  - https://gitlab.mister-muffin.de/josch/img2pdf

# Convert Audible books to mp3

1. Get the key
  - `./audible-activator.py`
  - Source: https://github.com/paladini/audible-activator/
1. Convert to mp3
  - ./AAXtoMP3.sh --single `<key>` file.aax
  - Source: https://github.com/KrumpetPirate/AAXtoMP3

* Alternative single step which didn't work
  - https://github.com/paladini/aax2mp3-easy

# Merge mp3 files

`cat indir/*.mp3 | mp3cat - - > merged.mp3`

Install: `brew install mp3cat`

# Ripping a DVD

* Start playing the dvd with a media player
* Locate the dvd
  - `lsblk`
* Copy
  `dd if=/dev/sr0 of=~/alchemy.iso status=progress`
* Check error messages if any
  - `dmesg`
