Quick Mark Web Application

Setup Guide:

1. Install tesseract-ocr-w64-setup-v5.2.0.20220712.exe from the setup folder
   - Ensure it is installed for All Users in the C:/Program Files/ directory
2. Ensure Java is installed on your machine:
   - Open CMD and type: java --version
   - If not installed, install java on your machine (recommended version 11)
3. Ensure MVN is installed on your machine: 
   - Open CMD and type: mvn -v 
   - If not installed, install the latest version of MVN
4. Once all installed:
   - Open CMD and navigate inside QMProgV2/app
   - type: mvn clean spring-boot:run -X
   - On Google Chrome, navigate to:
     - localhost:8080/
5. To close the connection, on CMD, press CTRL+C together twice