## java installation on windows

Setting up Java and Maven is the classic "rite of passage" for any developer. It’s mostly about telling Windows exactly where you put your tools so it can find them when you type a command.

Here is your step-by-step guide to getting both running on Windows.
Part 1: Installing Java (JDK)

Java Development Kit (JDK) is the foundation. We will use JDK 17 or 21 (LTS versions) for maximum stability.

    Download: Go to the Oracle JDK Downloads or Adoptium (Open source).

    Run Installer: Download the x64 MSI Installer and run it.

        Default Path: C:\Program Files\Java\jdk-21 (Keep note of this!)

    Set Environment Variables:

        Search for "Edit the system environment variables" in your Start menu.

        Click Environment Variables.

        Under System Variables, click New:

            Variable name: JAVA_HOME

            Variable value: C:\Program Files\Java\jdk-21 (Path to your install folder).

        Find the Path variable in the list, select it, and click Edit.

        Click New and add: %JAVA_HOME%\bin.

    Verify: Open Command Prompt (cmd) and type:
    Bash

    java -version

Part 2: Installing Apache Maven

Maven doesn't have a "setup.exe"—it's a manual extraction process.

    Download: Go to the [[Maven Download page.]]
    (https://dlcdn.apache.org/maven/maven-3/3.9.12/binaries/apache-maven-3.9.12-bin.zip)
    

    Extract: Download the Binary zip archive. Extract it to a permanent location, like C:\apache-maven-3.9.x.

    Set Environment Variables:

        Go back to Environment Variables.

        Under System Variables, click New:

            Variable name: MAVEN_HOME

            Variable value: C:\apache-maven-3.9.x (Path to your extracted folder).

        Find the Path variable again, click Edit, then New.

        Add: %MAVEN_HOME%\bin.

    Verify: Open a new Command Prompt (old ones won't see the changes) and type:
    Bash

    mvn -version

Summary of Variables
Variable	Value (Example)	Purpose
JAVA_HOME	C:\Program Files\Java\jdk-21	Tells apps where Java lives.
MAVEN_HOME	C:\apache-maven-3.9.6	Tells apps where Maven lives.
Path (Additions)	%JAVA_HOME%\bin & %MAVEN_HOME%\bin	Lets you run java and mvn from any folder.