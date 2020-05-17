компиляция 
javac -sourcepath src -d bin src/com/neofleksjob/tasklibsearch/TaskLibSearch.java
делаем архив jar
jar cvf tasklibsearch.jar -C bin .

чтобы использовать библиотеку в Main
javac -sourcepath src -d bin -classpath path/to/tasklibsearch.jar src/com/neofleksjob/main/Main.java


сборка
cd Main // 
echo class-path: tasklibsearch.jar >manifest.mf
mkdir lib
cp path/to/tasklibsearch.jar lib/tasklibsearch.jar
jar -cmef manifest.mf com.neofleksjob.main.Main  main.jar  -C bin .

запуск
java -jar path/to/main.jar
