# Java Compiler
JAVAC = javac
# Java Runtime
JAVA = java
# Source directory
SRC_DIR = ./
# Binary directory for compiled classes
BIN_DIR = ./bin
# Main class for running the program
MAIN_CLASS = MovieDB

# Compile all Java files in the source directory
cl:
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(SRC_DIR)*.java

# Run the application
run:
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

# Clean up compiled files and temporary files
clean:
	rm -rf $(BIN_DIR)/*.class
	rm -rf *.java~

.PHONY: cl run clean