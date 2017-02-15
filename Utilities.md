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

* https://github.com/paladini/aax2mp3-easy

# Ripping a DVD

* Start playing the dvd with a media player
* Locate the dvd
  - `lsblk`
* Copy
  `dd if=/dev/sr0 of=~/alchemy.iso status=progress`
* Check error messages if any
  - `dmesg`
