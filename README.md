Calculator
Ce projet est une application de calculatrice simple avec un frontend Angular et un backend Spring Boot.

Backend
Le backend de cette application est développé en utilisant Spring Boot. Il fournit une API RESTful pour effectuer des opérations de calcul.

Prérequis
Java JDK 8 ou supérieur
Maven
Installation et exécution
Clonez le dépôt :

bash
Copy code
git clone https://github.com/votre-utilisateur/calculator.git
Accédez au répertoire du backend :

bash
Copy code
cd calculator-backend
Compilez et exécutez le backend :

bash
Copy code
mvn spring-boot:run
Le backend sera démarré sur http://localhost:9191.

Frontend
Le frontend de cette application est développé en utilisant Angular. Il fournit une interface utilisateur pour saisir les opérandes et effectuer des calculs.

Prérequis
Node.js
Angular CLI
Installation et exécution
Accédez au répertoire du frontend :

bash
Copy code
cd calculator-frontend
Installez les dépendances :

bash
Copy code
npm install
Démarrez le serveur de développement :

bash
Copy code
ng serve
Le frontend sera démarré sur http://localhost:4200.

Utilisation
Accédez à http://localhost:4200 dans votre navigateur pour utiliser la calculatrice. Saisissez les opérandes et sélectionnez l'opérateur, puis appuyez sur le bouton "Calculate" pour obtenir le résultat du calcul.
