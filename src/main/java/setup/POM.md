POM
It is a design pattern
Dealing with Pages as seperate Java Classes
Script is easier to maintain and understand
Every page in the appliaction will have a seperate JavaClass
All WebElements will be declared as variables
Corresponding methods acting on variables


![alt text](image.png)

- [ ] POM w/o PageFactory
- [ ] POM w PageFactory
- [ ] Test Data Management
- [ ] Extent Reports
- [ ] Automating workflow
- [ ] Paramterization
- [ ] Selenium Waits
- [ ] Assertions


Step to setup the project:
1. Create maven project, add name, simple project with no archetype
2. Update pom.xml with necessary dependency like testng, selenium etc.
3. Create folder like Reports, Screenshots, TestData, Drivers etc
4. Create Packages in src/test/java - com.projectname.pages, com.projectname.test,com.projectname.utils
5. 