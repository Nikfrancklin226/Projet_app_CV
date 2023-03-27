# Projet_app_CV
Ce projet vise à présenter une interface d'accès pour voir les offres d'emplois postées et la notification d'offres suivant les catégories concernées.

La présentation de notre projet se fera en deux étapes :
<li> Une partie Back-End qui montrera l'interaction entre IntelliJ et Postman et l'enregistrement des informations 
sur les CV dans la base de données MySQL avec Spring boot.</li>
<li> Une partie Front-End qui va afficher la présentation du système avec avec un bouton qui redirige vers la
page de visualisation des CV et une Une Page de Visualisation (ListView) des CV. </li>

# I. Partie Back-End
# AdminSpringBoot

Creation de la base de données
Nous avons utiliser Spring boot pour la création de notre base de données. Nous avons choisis "maven" comme projet, "java" comme langage, et "2.7.9" comme version de spring boot. Nous avons également ajoutés les dépendances suivantes :

<li>Web</li>
<li>JPA</li>
<li>Actuator</li>
<li>Mysql</li>
<li>Lombok</li>
<li>DevTools</li>


![Spring_boot](https://user-images.githubusercontent.com/91322696/227797310-65f00344-0767-4ff3-8290-2577a76f7bd2.PNG)

Création de table

![Cap_1](https://user-images.githubusercontent.com/91322696/227797587-4fda6b65-8136-4324-915d-0d1eb034518a.PNG)


Affichage des différentes rubriques pour le CV dans la base de données MySQL

![Cap_2](https://user-images.githubusercontent.com/91322696/227797752-ebc5c5a2-743b-4a23-b0a0-eb09bf0847a8.PNG)

Stucture de la table

![Cap_3](https://user-images.githubusercontent.com/91322696/227797813-1e097b15-5b2f-4d72-8ee5-73632d374c0d.PNG)

# Postman

Structure de la table sur Postman

![Cap_4](https://user-images.githubusercontent.com/91322696/227797976-10f719e7-2cac-491a-a0aa-3067db075e8c.PNG)


![Cap_5](https://user-images.githubusercontent.com/91322696/227798018-3c24e13b-035c-486b-bce8-00ebab7307b3.PNG)

L'affichage des differents enregistrements se fait avec la requête all

![Cap_6](https://user-images.githubusercontent.com/91322696/227798056-da8b8001-35c6-4ce6-a9cd-e4ad2983619d.PNG)

Pour la requête Login, nous utilisons l'id, ce qui nous donne ceci :

![Cap_7](https://user-images.githubusercontent.com/91322696/227798091-c9721c18-3851-4332-a07c-618932ce5fe4.PNG)


La requête FindByEmailAndAdress permet d'authentifier le demandeur d'emploi pour avoir accès à l'interface des offres d'emplois

![Cap_8](https://user-images.githubusercontent.com/91322696/227798304-5ed15d7e-6e17-403b-9e8e-c9bced3bdda0.PNG)


#Swagger UI

Swagger UI n'est qu'un projet open source parmi les milliers qui existent dans l'écosystème Swagger. Le code source est hébergé publiquement sur GitHub et vous pouvez commencer à contribuer au projet open source Swagger UI. Nous avons ici les captures de l'enregistrement ( sur Swagger UI), d'affichage des differents enregistrements effectués avec la requête ALL ( sur Postman ), la requête Login, pour la connexion.

L'enregistrement se fait avec la requête save comme nous le voyons ci-dessous :

![Cap_9](https://user-images.githubusercontent.com/91322696/227798341-6c9560cf-5511-4321-8b33-9e4cb46a6053.PNG)

Ci-dessous, comment s'effectue l'enregistrement :

![Cap_10](https://user-images.githubusercontent.com/91322696/227798516-395eaff6-64e0-4112-acf0-5e49eff433c1.PNG)

![Cap_11](https://user-images.githubusercontent.com/91322696/227798526-988027f6-c68e-4ffa-b6c3-747bb2f6585e.PNG)


# II. Partie Front-End
Cette partie sera basée sur la présentation des offres d'emplois à travers une interface de bienvenue à l'application puis 
une interface d'accès pour voir les offres d'emplois postées et la notification d'offres suivant les catégories concernées. Par la suite nous aurons un bouton de redirection vers la page de visualisation des CV enrégistrés dans la base MySQL avec Spring boot.

Voici les ramifications présentes dans notre projet :

![Android_1](https://user-images.githubusercontent.com/91322696/228021869-011f02c1-4f24-4b12-bbba-e60d66df4190.PNG)

![Android_2](https://user-images.githubusercontent.com/91322696/228021953-d5b242bc-a131-4856-93d8-a49d0b96b21e.PNG)


![Android_3](https://user-images.githubusercontent.com/91322696/228022471-4a79b4b5-0088-49d4-9d19-103120d080f3.PNG)


<li>Présentation du système</li>

Dans cette partie, nous allons présenter l'interface d'accès aux offres d'emplois. Pour se faire nous avons juger opportun d'authentifier l'utilisateur de l'application pour question de sécurité. Nous avons deux étapes pour l'authentification:

<li>La partie Login qui permet à l'utilisateur de s'enregistrer pour bénéficier de l'application</li>
<li>La partie Register qui permet de vérifier si c'est l'utilisateur en question qui est réellement connecté à l'application</li>


![Android_6](https://user-images.githubusercontent.com/91322696/228023871-631a73ae-609e-4b8c-ba26-72aef5393f2a.PNG)

![Android_7](https://user-images.githubusercontent.com/91322696/228023926-a069a79c-782e-42f5-8db1-2ff1e99ff67b.PNG)

Une fois l'utilisateur connecté, il pourra avoir accès à l'inerface d'acceuil pour visualiser les CV enregistrés dans la base de données MySQL.

![Android_5](https://user-images.githubusercontent.com/91322696/228024544-a290106e-7a1c-49e3-95cb-bf3090611a11.PNG)


<li>Page de visualisation des CV enregistrés</li>

Cette page permet de présenter les CV enregistrés dans MySQL.

![Android_10](https://user-images.githubusercontent.com/91322696/228025425-1f5fcd6b-a474-4530-b4d9-cea2afea9046.PNG)

En outre, nous avons juger nécessaire que l'utilisateur pourrait directement ajouter des CV dans la base de données en 
utilisant le format de fichier GSON pour l'extraction des données.

![Android_8](https://user-images.githubusercontent.com/91322696/228028364-a920369a-478d-4d2b-a505-5f730e67ca74.PNG)

Comme ajout nous avons créer une activité pour visualiser les offres d'emploi disponibles en fonction de chaque catégorie de CV.

![Android_4](https://user-images.githubusercontent.com/91322696/228029612-5c4654c1-0329-47f8-80e8-15ebd2d54037.PNG)







