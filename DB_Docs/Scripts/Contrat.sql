/* Contrat */

DROP TABLE `contrat`;

CREATE TABLE `contrat` (
	`Identifiant` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	`Libelle`		VARCHAR(25),
	PRIMARY KEY (`Identifiant`)
) AUTO_INCREMENT=1;

INSERT INTO `contrat`	(`Libelle`)
	VALUES				("CDI"),
						("CDD"),
						("Interim");

/* Domaine */

DROP TABLE `domaine`;

CREATE TABLE `domaine` (
	`Identifiant` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	`Libelle`		VARCHAR(25),
	PRIMARY KEY (`Identifiant`)
) AUTO_INCREMENT=1;

INSERT INTO `domaines`	(`Libelle`)
	VALUES				("Image"),
						("Musique"),
						("Cinéma");

/* Metier */

DROP TABLE `metier`;

CREATE TABLE `metier` (
	`Identifiant` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	`Libelle`		VARCHAR(25),
	`IdentifiantDomaine` BIGINT
	PRIMARY KEY (`Identifiant`)
) AUTO_INCREMENT=1;

INSERT INTO `metier`	(`Libelle`, `IdentifiantDomaine`)
	VALUES				("Danseur", 2),
						("Musicien", 2),
						("Chorégraphe", 2),
						("Compositeur", 2),
						("Acteur", 3),
						("Réalisateur", 3),
						("Photographe", 1),
						("Retoucheur", 1);

