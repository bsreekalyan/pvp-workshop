### The CI Journey: From Code to Artifact

**1. The Starting Point (Source Control)** It all begins with the developer. You write your Java code (like `Calculator.java`) and "Push" it to **GitHub**. This is the official hand-off. The code is now in a shared space where the automation can find it.

**2. The Automated Trigger (Jenkins)** **Jenkins** acts like a 24/7 security guard watching GitHub. The moment it sees a new "Push," it automatically pulls a copy of that code onto its own server. It doesn't wait for a human to click "Start"—it triggers the build immediately.

**3. The Assembly Line (Maven)** Jenkins hands the code to **Maven**. Maven is the "worker" that knows the Java rules. It looks at your `pom.xml` and performs three critical sub-tasks:

- **Compile:** It turns the text you wrote into machine-readable `.class` files.
    
- **Test:** It runs your **JUnit** tests. If the tests say `1+1=3`, Maven stops everything.
    
- **Package:** If the tests pass, it zips everything into a **JAR file**.
    

**4. The Quality & Security Inspection** While Maven is zipping things up, two "inspectors" look at the code's health:

- **SonarQube (Code Quality):** It checks if the code is messy or hard to maintain. It’s like a spell-checker for logic.
    
- **Snyk (Security):** It checks if the libraries you are using have known hacks or viruses.
    

**5. The Warehouse (Nexus/Artifactory)** If the code is compiled, the tests pass, and the quality is high, Jenkins takes that final **JAR file** and moves it to a "Warehouse" called **Nexus**. This is where the finished product sits, ready to be picked up and put onto a real website or server.

**6. The Final Notification** The journey ends with a message. Jenkins sends a **Slack** or **Email** to the team. If the image is green, the team knows they can keep working. If it's red, the developer has to stop and fix the "broken" pipeline.
