# Køres ved at skrive "make" for at oversætte koden og lave pdf'en.
# For ku at bruge en af kategorierne skrives "make <kategori>".

UGE=uge1
TEXFLAGS=-synctex=1 -interaction=nonstopmode --shell-escape
JDOCFLAGS=-author -charset UTF-8 -quiet

.start:
	mkdir -p bin doc

all: jBuild lBuild doc

# Oversætter javakoden
jBuild: .start
	find src -type f -name "*.java" -print | xargs javac -d bin/
	@echo "Javaklasserne er bygget"

# Bygger pdf'en
lBuild:
	pdflatex $(TEXFLAGS) $(UGE).tex > /dev/null
	@echo "pdf'en er bygget"

# Zipper javakoden og pdf'en
zipFile: lBuild
	zip $(UGE).zip -r src $(UGE).pdf > /dev/null

doc: .start
	find ./src -type f -name "*.java" | xargs javadoc $(JDOCFLAGS) -d ./doc
	@echo "Dokumentation af klasser er skrevet"


# Fjerner de filer pdflatex danner, herunder pdf'en, og javaklasserne
clean:
	rm -f $(UGE).aux $(UGE).pdf $(UGE).log $(UGE).out $(UGE).synctex.gz
	rm -f bin/*.class
	rm -rf doc/*


# Undertrykker det spam en normal Makefile laver
.SILENT:
