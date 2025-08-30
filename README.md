# SimpleUI

A basic Java Swing application with a graphical user interface (GUI) that prompts the user for their name and displays a greeting message.

This project was built and tested in a Linux virtual machine and displayed on a Windows desktop using VcXsrv for GUI support.

## 💡 Features

- Java Swing-based window
- Text field for entering a name
- Button that says hello when clicked
- Output label showing the greeting

## 🖥️ Screenshot

> *(You can add a screenshot of the UI here if you’d like.)*

## 🚀 How to Run

Make sure you have Java installed and your GUI display is working (e.g., using VcXsrv on Windows).

### 1. Compile

```bash
javac SimpleUI.java
# Java-Projects
My Java projects

2. Run
java SimpleUI

If you're using a virtual machine, ensure your display is set correctly:
export DISPLAY=$(ip route | awk '/default/ {print $3}'):0

Requirements

Java 17+ (OpenJDK or Oracle JDK)

X11 display (if running in a headless VM; e.g., VcXsrv or Xming)

Git (to clone or version the project)

FILE STRUCTURE:
SimpleUI.java        # Java source code
README.md            # Project overview and instructions
.gitignore           # Tells Git to ignore compiled .class files

.GitIgnore:
*.class
We ignore .class files because they are compiled and shouldn't be tracked in version control.

License

Stephen A License (or replace with your preferred license)

✍️ Author

Created by [Your Name] — student, explorer, and future Java pro!
