# WebStore

## About
A simple CRUD Application which manages products, their reviews and images. Built in ```scala``` using the ```Play``` framework along with front-end integration with ```twirl``` templating engine.

## How to Run
- The app requires ```sbt``` (for experienced users) or ```activator``` (for beginners) to be preinstalled before running. (Relevant links for installation: [activator](https://www.playframework.com/documentation/2.3.0/Installing) and [sbt](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html))
- Running Using **Activator**:
  - Navigate to the project directory.
  - ``` $ activator compile```
  - If required, you can run the included tests (or write custom ones) using ```$ activator test```
  - ``` $ activator run ```
- Running using **sbt**:
  - Navigate to the project directory.
  - Run the sbt shell by typing ```$ sbt```.
  - Inside the shell:
    - ```$ compile```
    - If required, you can run the included tests (or write custom ones) using ```$ test```
    - ```$ run```
- You can now access the application at: ```localhost:9000 ```
   
  **Note:** The only difference between ```activator``` and ```sbt``` is that activator gives more enhanced error messages as compared to sbt. However, the debugging granularity is better when using sbt.
