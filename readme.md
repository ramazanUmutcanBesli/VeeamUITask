# veeam Careers UI Testing Project
cz.careers.veeam.com is a career website in Czechia.

Here is the [Link](https://cz.careers.veeam.com/company) for more information.

# Steps to Create Project
1. Create a maven project called `VeeamUITask`.
2. Add below property section under `pom.xml`.
```xml
<properties>
<maven.compiler.source>8</maven.compiler.source>
<maven.compiler.target>8</maven.compiler.target>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
```
3. Add dependencies
```xml
<dependencies>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.2.0</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.3.4</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.3.4</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>me.jvt.cucumber</groupId>
            <artifactId>reporting-plugin</artifactId>
            <version>7.3.0</version>
        </dependency>
    </dependencies>
```

4. Add Build plugin
```xml
<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <configuration>
                    <parallel>methods</parallel>
                    <!--<useUnlimitedThreads>true</useUnlimitedThreads>-->
                    <threadCount>4</threadCount>
                    <perCoreThreadCount>false</perCoreThreadCount>
                    <testFailureIgnore>true</testFailureIgnore>
                    <includes>
                        <include>**/CukesRunner*.java</include>
                        <include>**/FailedTestRunner*.java</include>
                    </includes>
                </configuration>
            </plugin>
        </plugins>
    </build>
```
5. Add a properties file with exact name `configuration.properties`.
    * Add following line to properties file
   ```properties
    browser=chrome
    ```
6. Create `resources` folder and `features` package.
7. Create package called `veeam` under `test/java/com`.
    * Create a `pages` package and `basePage.java ` class under `pages`package.
    * Implement all of WebElement related to `careers page`


8. Create a package called `runners` and java classes called `CukesRunner` and`FailedTestRunner`.
9. Create a package called `step_definitions`.
    * Create a java class called `Hooks` which use `@Before` and `@After` annotations.
10. Create a `features` package under `resources`.
    * 
11. Created unimplemented snippets in `step_definitions` package.