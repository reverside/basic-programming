### Basic Programming (Java)

Prerequisite:
- .NET Core SDK 2.1
- GIT

Setup:
- Create an account in github (if you don't have)
- Open this project in github after login with your github account
- Fork this project into your github account (check top-right on git)
- Now you can see the project in your github account
- Clone the project to your machine from your github account
- Checkout branch (c#) locally with "git checkout c#"
- Now you can see the project structure and build it (mvn clean test)


Process :
- Pickup any ProgramTest class from src/test/* and corresponding Program class from src/main/*
- Run all the test methods in the ProgramTest class and all of them must fail
- Now implement the method in the corresponding Program & Rerun test methods from ProgramTest
- Keep fixing the implementation of Program until all the test methods in ProgramTest passes

Rules :
  - Must implement only the method in the classes inside src/main
  - Not allowed to add any new file to the project
  - Not allowed to change any code inside src/test
  - Not allowed to change any file outside src/main/**/Program.java
  - Only allowed to add code to the predefined method in Program.java
  - Must implement one program at a time
  - Must commit the changes for one program before attempting for next program
  - Must commit it with message like "p34 implemented"


Submission :

Once you are done with all the programs ensure the followings to submit :
  - Ensure all your test cases are passing (mvn clean test)
  - Ensure you have not broken any of the above rules
  - Push all your commits to github -> "git push origin java"
  - Share your github project URL with Lerato using email




