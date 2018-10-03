### Basic Programming (C#)

Prerequisite:
- .NET Core SDK 2.1
- GIT

Setup:
- Create an account in github (if you don't have)
- Open this project in github after login with your github account
- Fork this project into your github account (check top-right on git)
- Now you can see the project in your github account
- Clone the project to your machine from your github account
- Checkout branch (C#) locally with "git checkout C#"
- Now you can see the project structure and build it (dotnet build)


Process :
- Pickup any ProgramTest class from BasicProgramming.Tests/src/* and corresponding Program class from BasicProgramming/src/*
- Run all the test methods in the ProgramTest class and all of them must fail (dotnet test BasicProgramming.Test)
- Now implement the method in the corresponding Program & Rerun test methods from ProgramTest
- Keep fixing the implementation of Program until all the test methods in ProgramTest passes

Rules :
  - Must implement only the method in the classes inside BasicProgramming/src/**/Program.cs
  - Not allowed to change method signature
  - Not allowed to add any new file to the project
  - Not allowed to change any code inside BasicProgramming.Tests/
  - Not allowed to change any file outside BasicProgramming/**/Program.java
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




