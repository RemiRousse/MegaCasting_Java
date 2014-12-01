DROP TABLE `diffuseur`;

CREATE TABLE `diffuseur` (
  `Identifiant` 			BIGINT unsigned NOT NULL auto_increment,
  `Nom` 					VARCHAR(50),
  `Responsable` 			VARCHAR(25) default NULL,
  `IdentifiantInformation`	BIGINT,
  PRIMARY KEY (`Identifiant`)
) AUTO_INCREMENT=1;

INSERT INTO `diffuseur` (`Nom`,										`Responsable`,`IdentifiantInformation`)
	VALUES				("At Libero Morbi Corporation",				"Bradshaw",		26),
						("Libero Corp.",							"Barry",		27),
						("Nam Nulla Magna Ltd",						"Obrien",		28),
						("Dictum Ultricies Ligula PC",				"Little",		29),
						("Lorem Ipsum Inc.",						"Rollins",		30);
