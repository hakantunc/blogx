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

# Ripping a DVD

* Start playing the dvd with a media player
* Locate the dvd
  - `lsblk`
* Copy
  `dd if=/dev/sr0 of=~/alchemy.iso status=progress`
* Check error messages if any
  - `dmesg`
