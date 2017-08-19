javac -d /project/target/mods --module-source-path /project/target/src /project/target/src/com.gg.demo/module-info.java /project/target/src/com.gg.demo/com/demo/java9/SetOfDemo.java

java --module-path mods --module com.gg.demo/com.demo.java9.SetOfDemo