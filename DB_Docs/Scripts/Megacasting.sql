CREATE DATABASE MegaCasting_java;
USE MegaCasting_java;

/* ************** */
/*      Info      */
/* ************** */
CREATE TABLE `information` (
	`Identifiant` 		BIGINT NOT NULL auto_increment,
	`Mail` 				VARCHAR(100) default NULL,
	`TelephoneFixe` 	VARCHAR(100),
	`TelephonePortable` VARCHAR(100) default NULL,
	`Fax` 				VARCHAR(100) default NULL,
	`Rue` 				VARCHAR(100),
	`Ville` 			VARCHAR(100),
	`Pays` 				VARCHAR(100),
	`CP` 				VARCHAR(100),
	
	PRIMARY KEY (`Identifiant`)
) AUTO_INCREMENT=1;

INSERT INTO `information` 	(`Mail`,												`TelephoneFixe`,		`TelephonePortable`,	`Fax`,				`Pays`,					`Rue`,`CP`,`Ville`)
/* candidat */
VALUES 						("faucibus.leo.in@actellus.edu",						"05 56 62 56 24",		"(293) 248-6595",		NULL,				"France",				'Bois Fleuri (Rue du)', 44125, 'Beausejour'),
							("at.auctor@elitfermentumrisus.com",					"07 24 77 77 72",		"01 45 72 00 84",		NULL,				"Spain",				'Carnot (Avenue)', 64777, 'Bahawalpur'),
							("scelerisque@sociisnatoque.org",						"06 98 22 16 71",		NULL,					NULL,				"France",				'Wladimir Morch (Boulevard)', 46114, 'Polpenazze del Garda'),
							("nibh.sit@tellusAenean.edu",							"05 51 48 20 93",		NULL,					NULL,				"United States",		'Yser (Rue de )', 43719, 'Gerpinnes'),
							("egestas.hendrerit.neque@nibh.com",					"06 97 69 85 87",		NULL,					NULL,				"France",				'Station (Rue de la)', 40997, 'Spokane'),
							("in.faucibus.orci@sociis.com",							"07 58 17 96 79",		NULL,					NULL,				"France",				'Modere Lombard (Avenue)', 24425, 'Fayetteville'),
							("urna@morbitristiquesenectus.net",						"04 61 28 82 42",		"09 24 16 49 14",		NULL,				"France",				'Lambertz (Rue)', 22988, 'Molino dei Torti'),
							("neque@rutrumeu.co.uk",								"03 42 73 60 35",		"03 23 60 20 32",		NULL,				"Spain",				'Jacques Charles (Rue)', 47048, 'Harrisburg'),
							("eleifend.non@Suspendisseacmetus.com",					"01 06 18 38 76",		"08 34 56 13 60",		NULL,				"France",				'Lamartine (Rue)', 11525, 'Ancarano'),
							("Donec.sollicitudin@perconubianostra.com",				"05 58 49 67 01",		"04 10 51 74 17",		NULL,				"France",				'Lalo (Rue)', 45903, 'Lafayette'),
							("sem.molestie@libero.ca",								"07 71 19 39 89",		"08 46 64 39 23",		NULL,				"France",				'Canada (Rue du)', 53900, 'Cerignola'),
							("a.aliquet@liberoDonec.co.uk",							"09 66 44 58 99",		"01 88 98 94 13",		NULL,				"France",				'Abbe Gregoire (Rue)', 68225, 'Hervey Bay'),
							("Praesent@pede.edu",									"06 77 86 66 05",		"02 03 81 24 66",		NULL,				"France",				'Camelias (Rue des)', 23638, 'Zoetermeer'),
							("luctus.sit.amet@feliseget.com",						"05 03 01 93 83",		NULL,					NULL,				"United States",		'Edouard Manet (Rue)', 57265, 'Mont-de-Marsan'),
							("et.arcu@aliquam.edu",									"04 28 65 74 90",		NULL,					NULL,				"France",				'Docteur Daniel Planet (Avenue du)', 27685, 'Pellizzano'),
							("risus.Duis@fringillaornare.ca",						"07 31 86 46 42",		NULL,					NULL,				"France",				'Gaston Perier (Rue)', 86391, 'Gujranwala'),
							("eu@dictumeuplacerat.org",								"07 20 93 15 39",		NULL,					NULL,				"France",				'Carnot (Avenue)', 59226, 'Sant''Urbano'),
							("lacus.pede.sagittis@vulputatemaurissagittis.org",		"02 46 59 25 42",		NULL,					NULL,				"France",				'La Cave (Rue)', 81407, 'Chiusanico'),
							("ipsum.dolor@atauctorullamcorper.net",					"07 07 41 24 41",		NULL,					NULL,				"United States",		'Pierre Noire (Impasse de la)', 24387, 'Tonk'),
							("velit@convallisin.org",								"02 36 90 77 83",		NULL,					NULL,				"France",				'Docteur Bigois (Rue du)', 80687, 'Topeka'),
			
/* annonceur */	
							("neque.et.nunc@interdum.org",							"08 63 93 51 53",		"06 70 04 65 95",		"08 63 93 51 13",	"Spain",				'Francois Mansart (Rue)', 91593, 'Howrah'),
							("eu@iaculisodio.co.uk",								"02 52 41 41 64",		"06 46 51 78 95",		"02 52 41 41 94",	"France",				'Carnot (Avenue)', 29535, 'Houthalen-Helchteren'),
							("pede.Nunc@auctornuncnulla.org",						"05 52 82 03 61",		"06 77 57 43 83",		"05 52 82 03 65",	"France",				'Boileau (Rue)', 75388, 'Móstoles'),
							("sagittis.augue@facilisiSedneque.net",					"04 41 45 57 26",		"06 50 50 55 34",		"04 41 45 57 23",	"France",				'Deperdussin (Rue)', 36133, 'Ballarat'),
							("adipiscing@ullamcorperDuis.org",						"04 73 49 94 05",		"06 30 26 80 18",		"04 73 49 94 00",	"France",				'Winston Churchill (Boulevard)', 42349, 'Swan Hills'),
		
/* diffuseur */
							("et.risus@elitelitfermentum.edu",						"05 73 32 39 31",		"06 45 22 47 15",		"03 87 07 95 82",	"France",				'Bois l Epine (Rue du)', 84660, 'Wilmington'),
							("massa@nisl.co.uk",									"04 40 47 64 51",		"06 89 81 58 08",		"08 44 57 03 49",	"France",				'Aristide Rondeau (Boulevard)', 49111, 'Saint-Denis'),
							("at@porttitortellus.co.uk",							"02 90 12 71 02",		"06 61 04 97 68",		"04 62 24 06 34",	"France",				'Docteur Deletant (Rue du)', 25558, 'Funtua'),
							("semper@ullamcorper.edu",								"05 26 25 59 94",		"06 89 17 69 36",		"01 52 08 10 15",	"France",				'Doriole (Rue)', 11705, 'Geertruidenberg'),
							("at@justo.org",										"03 77 31 92 41",		"06 59 46 90 43",		"03 44 07 65 62",	"United States",		'La Cave (Rue)', 48573, 'Luzzara'),

/* employe */
							("justo.Proin.non@mus.ca",								"05 28 50 96 29",		"06 68 52 27 55",		NULL,				"France",				'Modere Lombard (Avenue)', 37235, 'South Burlington'),
							("eu@consequatdolor.edu",								"03 37 61 48 79",		"06 12 79 58 87",		NULL,				"France",				'Moliere (Rue)', 11143, 'Sint-Gillis'),
							("tempus.scelerisque@non.co.uk",						"06 96 09 31 33",		"06 67 80 11 28",		NULL,				"France",				'Vosges (Rue des)', 39576, 'Casper'),
							("Integer.urna@urna.co.uk",								"03 20 40 40 56",		"06 63 54 33 42",		NULL,				"France",				'Laverdin (Rue)', 55326, 'Frignano'),
							("risus.odio.auctor@necluctus.net",						"04 44 79 50 70",		"06 01 88 81 69",		NULL,				"France",				'Descenderie (Rue de la)', 52252, 'New Maryland'),
							("Sed.molestie.Sed@necquam.edu",						"06 06 12 56 16",		"06 49 36 58 40",		NULL,				"France",				'Bucarest (Avenue de)', 85046, 'Oudenaken'),
							("montes.nascetur@bibendumDonec.org",					"01 34 01 10 03",		"06 83 52 58 92",		NULL,				"France",				'Duc (Rue du)', 67071, 'Elbl?g'),
							("nibh.vulputate.mauris@dignissim.net",					"03 46 81 85 93",		"06 45 99 63 25",		NULL,				"France",				'Jacques Charles (Rue)', 69984, 'Palmiano'),
							("sem@dapibusligulaAliquam.com",						"01 46 24 33 95",		"06 46 04 31 35",		NULL,				"France",				'Moliere (Impasse)', 48415, 'Kanpur Cantonment'),
							("sed.pede@penatibusetmagnis.co.uk",					"03 90 42 42 26",		"06 45 47 99 18",		NULL,				"France",				'Voltaire (Rue)', 49097, 'Joncret'),
							("egestas.Fusce.aliquet@Duismi.co.uk",					"08 02 11 26 36",		"06 08 51 20 60",		NULL,				"France",				'Dely (Rue)', 37719, 'Boncelles'),
							("non.dui.nec@libero.net",								"08 53 88 88 69",		"06 37 10 75 94",		NULL,				"France",				'Camille Desmoulins (Rue)', 78354, 'Mandya'),
							("dolor.quam@Duisa.org",								"05 16 75 83 52",		"06 54 45 70 56",		NULL,				"France",				'Francoise Dolto (Rue)', 94382, 'Warspite'),
							("eu.turpis.Nulla@Donecdignissim.org",					"06 05 46 33 72",		"06 44 33 42 45",		NULL,				"France",				'Camille Pissaro (Rue)', 30560, 'Okigwe'),
							("bibendum.ullamcorper@enim.org",						"09 27 78 45 71",		"06 16 32 31 27",		NULL,				"France",				'Francois Bureau (Rue)', 46788, 'Dutse');

/* ************** */
/*     COMPTE     */
/* ************** */
CREATE TABLE `compte` (
	`Identifiant` 	BIGINT NOT NULL auto_increment,
	`Login` 		VARCHAR(50) default NULL,
	`Password` 		VARCHAR(25),
	`code` 			BIGINT,
	
	PRIMARY KEY (`Identifiant`)
) AUTO_INCREMENT=1;

INSERT INTO `compte` 	(`Login`,					`Password`,		`code`)
/* candidat */
VALUES 					("Meloxicam",				"MRN48FPI6TZ",	4600),
						("Pravastatin",				"BDM43FGE6MY",	6915),
						("Methylprednisolone",		"SWQ82QPD1OL",	8058),
						("Carvedilol",				"DXM86XXL9YK",	2949),
						("Prednisone",				"DGQ78UHZ5ZA",	1870),
						("Azithromycin50",			"MRF17DKF8PQ",	6281),
						("Pantoprazole10",			"XWC03TMN7PT",	2811),
						("Lovastatin",				"FJM75VTG2ZU",	9433),
						("Gianvi",					"RHJ00BYU6MT",	4096),
						("Pantoprazole02",			"BVG24ZCN7ZK",	1969),
						("Tri",						"JUA99EED1OP",	1397),
						("Alprazolam",				"QUQ40UUU1JM",	2420),
						("Promethazine",			"WCC22AYY2YY",	6324),
						("Fluticasone",				"XSU74KPW0OC",	6093),
						("Lisinopril",				"DJP80DBS3LO",	8754),
						("Azithromycin",			"DFP80BNR6YO",	8352),
						("Hydrocodone",				"AFF67ZFS1UR",	2852),
						("Nexium",					"HFY26YXB5MB",	2825),
						("HCl",						"FMF17FAA5XF",	6797),
						("VitaminD",				"LEI15OCV0IE",	3401),
		
/* annonceur */
						("Annonce01",				"ENU92ESE2CJ",	6847),
						("Annonce02",				"YKB83PHC2BV",	5317),
						("Annonce03",				"EVK77DHF9TP",	3728),
						("Annonce04",				"PSZ54OMD3RB",	3568),
						("Annonce05",				"PQS98DTZ6EZ",	5333);

/* **************** */
/*     CANDIDAT     */
/* **************** */
CREATE TABLE `candidat` (
	`Identifiant` 				BIGINT NOT NULL auto_increment,
	`Nom` 						VARCHAR(25) default NULL,
	`Prenom` 					VARCHAR(50) default NULL,
	`DateNaissance` 			date,
	`Pays` 						VARCHAR(50) default NULL,
	`IdentifiantCompte` 		BIGINT,
	`IdentifiantInformation` 	BIGINT,
	
	PRIMARY KEY (`Identifiant`),
		
	FOREIGN KEY (IdentifiantCompte) 
		REFERENCES compte(`Identifiant`)
		ON UPDATE CASCADE ON DELETE RESTRICT,
		
	FOREIGN KEY (IdentifiantInformation) 
		REFERENCES information(`Identifiant`)
		ON UPDATE CASCADE ON DELETE RESTRICT
) AUTO_INCREMENT=1;

INSERT INTO `candidat` 	(`Nom`,			`Prenom`,		`Pays`, 				`DateNaissance`,	`IdentifiantCompte`,	`IdentifiantInformation`)
VALUES 					("Levy",		"Chadwick",		"France",				"1973-05-04",			1,						1),
						("Garcia",		"Colby",		"Spain",				"1988-10-26",			2,						2),
						("Small",		"Patrick",		"Spain",				"1963-08-28",			3,						3),
						("Rush",		"Castor",		"United States",		"1966-06-28",			4,						4),
						("Ellison",		"Victor",		"United Kingdom",		"1966-03-08",			5,						5),
						("Bartlett",	"Oscar",		"United Kingdom",		"1972-09-21",			6,						6),
						("Russell",		"Lawrence",		"France",				"1960-12-10",			7,						7),
						("Glass",		"Zachary",		"Spain",				"1974-03-01",			8,						8),
						("Zamora",		"Tad",			"United Kingdom",		"1990-03-07",			9,						9),
						("Beasley",		"Plato",		"United Kingdom",		"1979-07-12",			10,						10),
						("Franco",		"Leo",			"United Kingdom",		"1970-02-26",			11,						11),
						("Phillips",	"Richard",		"France",				"1983-06-19",			12,						12),
						("Whitehead",	"Clinton",		"France",				"1987-07-16",			13,						13),
						("Ewing",		"Hamish",		"United States",		"1970-12-14",			14,						14),
						("Poole",		"Nigel",		"Spain",				"1990-05-29",			15,						15),
						("Vazquez",		"Amos",			"United Kingdom",		"1994-04-30",			16,						16),
						("Sawyer",		"Wyatt",		"France",				"1987-09-16",			17,						17),
						("Cannon",		"Ryan",			"Spain",				"1967-01-20",			18,						18),
						("Walter",		"Nehru",		"United States",		"1975-08-17",			19,						19),
						("Dickerson",	"Daniel",		"Spain",				"1968-09-09",			20,						20);
		


/* **************** */
/*    ANNONCEUR     */
/* **************** */
CREATE TABLE `annonceur` (
	`Identifiant` 				BIGINT NOT NULL auto_increment,
	`Siret` 					VARCHAR(100) default NULL,
	`Nom` 						VARCHAR(75),
	`Responsable` 				VARCHAR(25) default NULL,
	`IdentifiantCompte` 		BIGINT default NULL,
	`IdentifiantInformation` 	BIGINT default NULL,
	PRIMARY KEY (`Identifiant`),
	
	FOREIGN KEY (IdentifiantCompte) 
		REFERENCES compte(`Identifiant`)
		ON UPDATE CASCADE ON DELETE RESTRICT,
		
	FOREIGN KEY (IdentifiantInformation) 
		REFERENCES information(`Identifiant`)
		ON UPDATE CASCADE ON DELETE RESTRICT
) AUTO_INCREMENT=1;

INSERT INTO `annonceur` 	(`Siret`,				`Nom`,							`Responsable`,		`IdentifiantCompte`,	`IdentifiantInformation`) 
VALUES 						("629.409.178.189",		"Nec Orci LLP",					"M. Cameron",		21,						21),
							("445.180.3.473",		"Curabitur Institute",			"M. Vinson",		22,						22),
							("711.91.199.31",		"Sagittis Inc.",				"M. Bonner",		23,						23),
							("665.408.171.642",		"Odio Sagittis LLP",			"Mme. Hartman",		24,						24),
							("5.12.197.552",		"Phasellus Vitae Ltd",			"M. Kennedy",		25,						25);


		
		
/* **************** */
/*     Diffuseur    */
/* **************** */
CREATE TABLE `diffuseur` (
	`Identifiant` 			BIGINT NOT NULL auto_increment,
	`Nom` 					VARCHAR(50),
	`Responsable` 			VARCHAR(25) default NULL,
	`IdentifiantInformation`	BIGINT,
	PRIMARY KEY (`Identifiant`),
  
	FOREIGN KEY (IdentifiantInformation) 
		REFERENCES information(`Identifiant`)
		ON UPDATE CASCADE ON DELETE RESTRICT
) AUTO_INCREMENT=1;

INSERT INTO `diffuseur` (`Nom`,										`Responsable`,		`IdentifiantInformation`)
	VALUES				("At Libero Morbi Corporation",				"M. Bradshaw",		26),
						("Libero Corp.",							"M. Barry",			27),
						("Nam Nulla Magna Ltd",						"Mme. Obrien",		28),
						("Dictum Ultricies Ligula PC",				"M. Little",		29),
						("Lorem Ipsum Inc.",						"Mme. Rollins",		30);

						
/* ************** */
/*      POSTE     */
/* ************** */
CREATE TABLE `poste` (
  `Identifiant` 			BIGINT 			NOT NULL auto_increment,
  `Libelle` 				VARCHAR(100) 	NOT NULL,
PRIMARY KEY (`Identifiant`)
) AUTO_INCREMENT=1;

INSERT INTO `poste` (`Libelle`) VALUES
			("Chargé de recrutement"),
			("Responsable"),
			("Cadre");
			
			
			
/* **************** */
/*      EMPLOYE     */
/* **************** */
CREATE TABLE `employe` (
	`Identifiant` 				BIGINT NOT NULL auto_increment,
	`Nom` 						VARCHAR(50) default NULL,
	`Prenom` 					VARCHAR(50) default NULL,
	`Poste` 					VARCHAR(50) default NULL,
	`Habilitation` 				INT default NULL,
	`IdentifiantInformation` 	BIGINT,
	PRIMARY KEY (`Identifiant`),
	
	FOREIGN KEY (IdentifiantInformation) 
		REFERENCES information(`Identifiant`)
		ON UPDATE CASCADE ON DELETE RESTRICT
) AUTO_INCREMENT=1;

INSERT INTO `employe` 	(`Nom`,			`Prenom`,		`Poste`,	`Habilitation`,		`IdentifiantInformation`) 
VALUES 					("Brun",		"Françoise",	1,			2,					31),
						("Le goff",		"Charlotte",	1,			3,					32),
						("Pons",		"Tristan",		1,			5,					33),
						("Dumont",		"Maxime",		1,			5,					34),
						("Denis",		"Alice",		1,			4,					35),
						("Albert",		"Valentin",		1,			3,					36),
						("Lopez",		"Clara",		1,			3,					37),
						("Breton",		"Alexia",		1,			1,					38),
						("Chevalier",	"Victor",		1,			5,					39),
						("Giraud",		"Anaël",		1,			5,					40),
						("Mallet",		"Lauriane",		1,			5,					41),
						("Leroux",		"Marine",		1,			5,					42),
						("Deschamps",	"Cloé",			1,			1,					43),
						("Boyer",		"Rémi",			1,			3,					44),
						("Klein",		"Nicolas",		1,			2,					45);
						
						
						
/* ******* */
/* CONTRAT */
/* ******* */
CREATE TABLE `contrat` (
	`Identifiant` BIGINT NOT NULL AUTO_INCREMENT,
	`Libelle`		VARCHAR(25),
	
	PRIMARY KEY (`Identifiant`)
) AUTO_INCREMENT=1;

INSERT INTO `contrat`	(`Libelle`)
	VALUES				("CDI"),
						("CDD"),
						("Interim");

/* ******** */
/* DOMMAINE */
/* ******** */
CREATE TABLE `domaine` (
	`Identifiant` BIGINT NOT NULL AUTO_INCREMENT,
	`Libelle`		VARCHAR(25),
	
	PRIMARY KEY (`Identifiant`)
) AUTO_INCREMENT=1;

INSERT INTO `domaine`	(`Libelle`)
	VALUES				("Image"),
						("Musique"),
						("Cinéma");
/* ******* */
/* METIER */
/* ******* */
CREATE TABLE `metier` (
	`Identifiant` BIGINT NOT NULL AUTO_INCREMENT,
	`Libelle`		VARCHAR(25),
	`IdentifiantDomaine` BIGINT,
	
	PRIMARY KEY (`Identifiant`),
	
	FOREIGN KEY (IdentifiantDomaine)
		REFERENCES domaine(`Identifiant`)
		ON UPDATE CASCADE ON DELETE RESTRICT
) AUTO_INCREMENT=1;

INSERT INTO `metier`	(`Libelle`, 		`IdentifiantDomaine`)
	VALUES				("Danseur", 		2		),
						("Musicien", 		2		),
						("Chorégraphe", 	2		),
						("Compositeur", 	2		),
						("Acteur", 			3		),
						("Réalisateur", 	3		),
						("Photographe", 	1		),
						("Retoucheur", 		1		);