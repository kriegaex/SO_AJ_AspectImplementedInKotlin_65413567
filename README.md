# AspectJ + Kotlin multi-module Maven example

This is a multi-module Maven project with AspectJ aspect library implemented in Kotlin, woven into an Java application module. It relates to my answer for [StackOverflow question #65413567](https://stackoverflow.com/a/65421793/1082681).

The project uses Nick Wong's fork of AspectJ Maven plugin which supports Java versions up to 14 which is also the version set in the POM. If you wish to downgrade, just change the setting in the root POM to `<java.version>1.8</java.version>` or whatever is appropriate for you.

For your convenience, the Java application module also builds a fat JAR containing application and aspect code as well as all dependencies such as Kotlin and AspectJ runtime. Just build and run the application like this:

```text
XXX> mvn clean package
(...)
[INFO] AspectJ + Kotlin ................................... SUCCESS [  0.226 s]
[INFO] Kotlin aspect ...................................... SUCCESS [ 10.241 s]
[INFO] Java application ................................... SUCCESS [  1.611 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
(...)

XXX> java -jar java-app\target\java-app-1.0-SNAPSHOT.one-jar.jar
execution(void de.scrum_master.stackoverflow.q65413567.app.Application.doSomething())
Doing something
```
