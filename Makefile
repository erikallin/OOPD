UGE=uge1
TEXFLAGS=-synctex=1 -interaction=nonstopmode --shell-escape

.start:
	mkdir -p bin/

all: jBuild lBuild

jBuild: .start
	find src -type f -name "*.java" -print | xargs javac -d bin/
	@echo "Javaklasserne er bygget"

lBuild:
	pdflatex $(TEXFLAGS) $(UGE).tex > /dev/null
	@echo "pdf'en er bygget"

clean:
	rm -f $(UGE).aux $(UGE).pdf $(UGE).log $(UGE).out $(UGE).synctex.gz
	rm -f bin/*.class

.SILENT:
