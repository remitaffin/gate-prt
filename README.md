1) Installer [Git pour Windows](http://msysgit.github.io)
  ou sur Mac : brew install git
  
2) Creer et installer une paire de clés SSH => [lien](https://help.github.com/articles/generating-ssh-keys/)

3) cd /path/to/your/local/folder/a/creer/

4) git clone git@github.com:remitaffin/gate-prt.git

5) git pull origin master



/////////////////////////////// INSTALLTION MAVEN :///////////////////////////////////////////////////////////////////////////////////////////////////////

MAC/LINUX ==> utiliser la commande "export" pour créer les variables denvironnements

WINDOWS :

1) Télécharger Maven     http://maven.apache.org/download.cgi

2) Extraire

3)Ajouter la variable denvironnement "M2_HOME" aux user variables avec comme valeur le chemin du dossier dintallation de Maven précédement extrait (ex : C:\Program Files\apache-maven-3.2.3)
  Assurez vous quil ny ait pas pas despace avant ou apres la valeur.
  
4) Ajoutez mtnt la user variable "M2" avec la valeur "%M2_HOME%\bin"

5) Modifier la variable systeme "Path" et ajouter "%M2%" en début de chaine.
	(sur MAC/UNIX ==> export PATH=$M2:$PATH)

6) Assurez vous que la variable denvironnement "JAVA_HOME" existe (soit dans user variables soit dans system variables) et que le chemin de votre JDK y figure
  (ex : C:\Program Files\Java\jdk1.7.0_51)
  
7) Assurez vous que "%JAVA_HOME%\bin" est dans le "Path"

8) Installation terminée, pour controler, ouvrir une invite de commande et entrer "mvn --version"


///////////////////////////////CONFIGURATION PROXY////////////////////////////////////////////////////////////////////////////////////////////////////////

1) Se rendre dans "...\apache-maven-3.2.3\conf"

2) Ouvrir le fichier settings.xml avec votre éditeur de texte préféré

3) Trouver la partie "proxy" et décommentez/modifier cette partie.




