# Backend - PC-Component

API Spring Boot 3, Spring Data JPA, Spring Data REST et MySQL, selon les ateliers 01, 02 et 03.

## Prérequis

- Java 17
- Maven 3.6+
- MySQL en local

## Base de données

La configuration utilise MySQL sur `localhost:3306`, l'utilisateur `root` et un mot de passe vide, comme dans l'environnement de cours. Modifiez `src/main/resources/application.properties` si votre configuration MySQL est différente. La base `spring_DB` est créée automatiquement.

## Démarrer

Depuis ce dossier :

```bash
mvn spring-boot:run
```

L'API est à `http://localhost:8080/produits`.

## Endpoints

| Usage | URL |
|---|---|
| Lister | `GET /produits/api` |
| Consulter | `GET /produits/api/{id}` |
| Ajouter | `POST /produits/api` |
| Modifier | `PUT /produits/api` |
| Supprimer | `DELETE /produits/api/{id}` |
| Filtrer par catégorie | `GET /produits/api/prodscat/{idCat}` |
| Spring Data REST composants | `/produits/rest` |
| Recherche par nom | `/produits/rest/search/findByNomComponentContains?nom=...` |
| Recherche par catégorie | `/produits/rest/search/findByCategorieIdCat?id=...` |
| Spring Data REST catégories | `/produits/cat` |

Une catégorie se crée via `POST /produits/cat` avec `{"nomCat":"Processeurs","descriptionCat":"CPU"}`. Les IDs sont exposés pour les deux entités.

Exemple de composant :

```json
{"nomComponent":"Processeur Intel","prixComponent":250.0,"dateCreation":"2026-11-26T00:00:00.000+00:00","categorie":{"idCat":1}}
```
