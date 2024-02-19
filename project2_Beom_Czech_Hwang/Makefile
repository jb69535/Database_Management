# Java Compiler
JAVAC = javac
# Java Runtime
JAVA = java
# Binary directory for compiled classes
BIN_DIR = bin
# Library directory for JAR files
LIB_DIR = lib
# Main class for running the program
MAIN_CLASS = App

# Compile all Java files in the current directory
cl:
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) -cp $(LIB_DIR)/*:. *.java

# Run the application
run:
	$(JAVA) -cp $(BIN_DIR):$(LIB_DIR)/* $(MAIN_CLASS)

# Clean up compiled files and temporary files
clean:
	rm -rf $(BIN_DIR)/*.class
	rm -rf *.java~

.PHONY: cl run clean
