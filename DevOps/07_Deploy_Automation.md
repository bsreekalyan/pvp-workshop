### **The CD Phase: From Warehouse to User**

**1. The Pick-up (Artifact Retrieval)** Once the CI pipeline creates a **JAR file** and stores it in the **Nexus Repository**, the CD process begins. An automation tool (like **Ansible**, **Terraform**, or **Jenkins CD**) reaches into the repository and grabs the specific version of the app that just passed all the tests.

**2. The Target Environment (Staging/Production)** In a professional setup, we never install directly to the "Live" site first. We have different "Environments":

- **Staging Server:** A "copy" of the real world where we do final checks.
    
- **Production Servers:** The actual servers where real customers use the app.
    

**3. Automated Installation (The "Magic" Step)** Instead of a human logging into 10 different servers and copy-pasting files, an automation script (like **Ansible**) does it all at once:

- It connects to Server A, Server B, and Server C simultaneously.
    
- It stops the old version of the Java app.
    
- It copies the new `calculator-1.2.jar` file onto the server.
    
- It restarts the service.

**4. The Health Check** After the installation, the CD tool automatically pings the servers. It asks, "Are you alive? Is the app running?"

- **If Yes:** The deployment is marked as **Successful**.
    
- **If No:** The system can perform a **Rollback**, automatically putting the old version back so the website doesn't stay down.

Understanding Code Quality
