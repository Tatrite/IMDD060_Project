# TP
On vous demande de créer un tout nouveau system de virtualisation.

Créer un programme qui permet de virtualiser des machines et qui doit aussi être capable de gérer un cluster d'hyperviseurs. Les classes à développer sont :

## Pare-feu
* propriétés : liste de règles
* méthodes : ajouter une règle, supprimer une règle, lister les règles, démarrer, arrêter
* contient : Règles de pare-feu

## Règles de pare-feu
* propriétés : ip/port sources/destination, protocole, nom, statu (activé, non activé), (accepter, bloquer)
* méthodes : filtrer, activer, désactiver

## Hyperviseur
* propriétés : hostname, ip, identifient du cluster, liste de VM créé, pare-feu
* méthodes : démarrer, arrêter, créer une VM, supprimer une VM, lister les VM, rejoindre un cluster, quitter un cluster, créer un cluster, supprimer un cluster
* contient : Pare-feu

## Cluster (groupe d'hyperviseurs)
* propriétés : liste d'hyperviseur, identifiant/nom unique du cluster
* méthodes : démarrer, arrêter, lister les nœuds (les hyperviseurs)
* contient : Hyperviseur

## Machine Virtuelle
* propriétés : nom, RAM, CPU, espace de stockage, pare-feu
* méthodes : arrêter, démarrer
* contient : Pare-feu
