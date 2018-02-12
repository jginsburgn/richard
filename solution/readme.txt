Se debe correr con:
cp database/Chinook.db.bak database/Chinook.db; rm db/*.class; javac -cp 'lib/*:.' db/*; java -cp 'lib/*:.' db.CustomerAdmin;
Considerando que se debe de estar en el directorio (cwd) solution, obtenido desde el tarball.
Jonathan Ginsburg 25 de Noviembre de 2017.
