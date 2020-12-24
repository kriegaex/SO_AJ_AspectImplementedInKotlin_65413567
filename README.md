# AspectJ + Kotlin multi-module Maven example

This is a multi-module Maven project with AspectJ aspect library implemented in Kotlin, woven into an Java application module. It relates to my answer for [StackOverflow question #65413567](https://stackoverflow.com/a/65421793/1082681).

The project uses Nick Wong's fork of AspectJ Maven plugin which supports Java versions up to 14 which is also the version set in the POM. If you wish to downgrade, just change the setting in the root POM to `<java.version>1.8</java.version>` or whatever is appropriate for you.
