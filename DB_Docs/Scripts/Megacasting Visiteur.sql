DROP TABLE `candidat`;

CREATE TABLE `candidat` (
	`Identifant` 				bigint NOT NULL auto_increment,
	`Nom` 						varchar(25) default NULL,
	`Prenom` 					varchar(50) default NULL,
	`DateNaissance` 			datetime,
	`Pays` 						varchar(50) default NULL,
	`IdentifiantCompte` 		bigint,
	`IdentifiantInformation` 	bigint,
	PRIMARY KEY (`Identifant`)
) AUTO_INCREMENT=1;

INSERT INTO `candidat` (`Nom`,`Prenom`,`Pays`, `DateNaissance`,`IdentifiantCompte`,`IdentifiantInformation`)
VALUES 	("Levy",		"Chadwick",		"France",				`1973-05-04`,		1,	1),
		("Garcia",		"Colby",		"Spain",				`1988-10-26`,		2,	2),
		("Small",		"Patrick",		"Spain",				`1963-08-28`,		3,	3),
		("Rush",		"Castor",		"United States",		`1966-06-28`,		4,	4),
		("Ellison",		"Victor",		"United Kingdom",		`1966-03-08`,		5,	5),
		("Bartlett",	"Oscar",		"United Kingdom",		`1972-09-21`,		6,	6),
		("Russell",		"Lawrence",		"France",				`1960-12-10`,		7,	7),
		("Glass",		"Zachary",		"Spain",				`1974-03-01`,		8,	8),
		("Zamora",		"Tad",			"United Kingdom",		`1990-03-07`,		9,	9),
		("Beasley",		"Plato",		"United Kingdom",		`1979-07-12`,		10,	10),
		("Franco",		"Leo",			"United Kingdom",		`1970-02-26`,		11,	11),
		("Phillips",	"Richard",		"France",				`1983-06-19`,		12,	12),
		("Whitehead",	"Clinton",		"France",				`1987-07-16`,		13,	13),
		("Ewing",		"Hamish",		"United States",		`1970-12-14`,		14,	14),
		("Poole",		"Nigel",		"Spain",				`1990-05-29`,		15,	15),
		("Vazquez",		"Amos",			"United Kingdom",		`1994-04-30`,		16,	16),
		("Sawyer",		"Wyatt",		"France",				`1987-09-16`,		17,	17),
		("Cannon",		"Ryan",			"Spain",				`1967-01-20`,		18,	18),
		("Walter",		"Nehru",		"United States",		`1975-08-17`,		19,	19),
		("Dickerson",	"Daniel",		"Spain",				`1968-09-09`,		20,	20);
		
		
DROP TABLE `annonceur`;

CREATE TABLE `annonceur` (
	`Identifant` 				bigint NOT NULL auto_increment,
	`Siret` 					varchar(100) default NULL,
	`Nom` 						varchar(75),
	`Responsable` 				varchar(25) default NULL,
	`IdentifiantCompte` 		bigint default NULL,
	`IdentifiantInformation` 	bigint default NULL,
	PRIMARY KEY (`Identifant`)
) AUTO_INCREMENT=1;

INSERT INTO `annonceur` (`Siret`,`Nom`,`Responsable`,`IdentifiantCompte`,`IdentifiantInformation`) 
VALUES 	("629.409.178.189",		"Nec Orci LLP",							"M. Cameron",		21,		21),
		("445.180.3.473",		"Curabitur Institute",					"M. Vinson",		22,		22),
		("711.91.199.31",		"Sagittis Inc.",						"M. Bonner",		23,		23),
		("665.408.171.642",		"Odio Sagittis LLP",					"Mme. Hartman",		24,		24),
		("5.12.197.552",		"Phasellus Vitae Ltd",					"M. Kennedy",		25,		25);

		
DROP TABLE `information`;

CREATE TABLE `information` (
	`Identifant` 		bigint NOT NULL auto_increment,
	`Mail` 				varchar(255) default NULL,
	`TelephoneFixe` 	varchar(100) default NULL,
	`TelephonePortable` varchar(100) default NULL,
	`Fax` 				varchar(100) default NULL,
	`Rue` 				varchar(100),
	`Ville` 			varchar(100),
	`Pays` 				varchar(100),
	`CP` 				varchar(100),
	PRIMARY KEY (`Identifant`)
) AUTO_INCREMENT=1;

INSERT INTO `information` (`Mail`,`TelephoneFixe`,`TelephonePortable`,`Fax`,`Pays`,`Rue`,`CP`,`Ville`)
/* candidat */
VALUES 	("faucibus.leo.in@actellus.edu",						"05 56 62 56 24",		"(293) 248-6595",		NULL,				"France",				'Bois Fleuri (Rue du)', 44125, 'Beausejour'),
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
		("at@justo.org",										"03 77 31 92 41",		"06 59 46 90 43",		"03 44 07 65 62",	"United States",		'La Cave (Rue)', 48573, 'Luzzara');

		
		
DROP TABLE `compte`;

CREATE TABLE `compte` (
	`Identifant` bigint NOT NULL auto_increment,
	`Login` varchar(50) default NULL,
	`Password` varchar(25),
	`code` bigint,
	PRIMARY KEY (`Identifant`)
) AUTO_INCREMENT=1;

INSERT INTO `compte` (`Login`,`Password`,`code`)
/* candidat */
VALUES 	("Meloxicam",				"MRN48FPI6TZ",	4600),
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




DROP TABLE `employe`;

CREATE TABLE `employe` (
	`Identifant` mediumint(8) unsigned NOT NULL auto_increment,
	`Nom` varchar(255) default NULL,
	`Prenom` varchar(255) default NULL,
	`Poste` mediumint default NULL,
	`Habilitation` mediumint default NULL,
	`IdentifiantInforamation` mediumint,
	PRIMARY KEY (`Identifant`)
) AUTO_INCREMENT=1;

INSERT INTO `employe` (`Nom`,`Prenom`,`Poste`,`Habilitation`,`IdentifiantInforamation`) 
VALUES 	("Brun","Françoise",1,2,1);
		("Le goff","Charlotte",1,3,2);
		("Pons","Tristan",1,5,3);
		("Dumont","Maxime",1,5,4);
		("Denis","Alice",1,4,5);
		("Albert","Valentin",1,3,6);
		("Lopez","Clara",1,3,7);
		("Breton","Alexia",1,1,8);
		("Chevalier","Victor",1,5,9);
		("Giraud","Anaël",1,5,10);
		("Mallet","Lauriane",1,5,11);
		("Leroux","Marine",1,5,12);
		("Deschamps","Cloé",1,1,13);
		("Boyer","Rémi",1,3,14);
		("Klein","Nicolas",1,2,15);
		("Roussel","Titouan",1,1,16);
		("Carre","Léane",1,5,17);
		("Faure","Lina",1,3,18);
		("Boulanger","Jasmine",1,5,19);
		("Maillard","Gaspard",1,1,20);
		("David","Zoé",1,1,21);
		("Adam","Eva",1,1,22);
		("Schneider","Margot",1,5,23);
		("Chevalier","Mehdi",1,5,24);
		("Rousseau","Lucie",1,4,25);
		("Morel","Robin",1,1,26);
		("Dumont","Colin",1,4,27);
		("Breton","Capucine",1,5,28);
		("Dupuis","Constant",1,2,29);
		("David","Tristan",1,1,30);
		("Paul","Dorian",1,4,31);
		("Renault","Samuel",1,3,32);
		("Charpentier","Pauline",1,3,33);
		("Barre","Robin",1,5,34);
		("Bailly","Rose",1,4,35);
		("Marie","Mathéo",1,1,36);
		("Leveque","Chloé",1,2,37);
		("Fernandez","Anna",1,1,38);
		("Menard","Clément",1,2,39);
		("Mallet","Margot",1,4,40);
		("Denis","Katell",1,4,41);
		("Lebrun","Jérémy",1,2,42);
		("Marchal","Océane",1,1,43);
		("Jean","Alexandre",1,5,44);
		("Dupont","Davy",1,5,45);
		("Marie","Clara",1,5,46);
		("Rodriguez","Carla",1,4,47);
		("Dumas","Mathieu",1,4,48);
		("Leroux","Bastien",1,3,49);
		("Humbert","Kyllian",1,4,50);
		("Poulain","Jeanne",1,4,51);
		("Royer","Marie",1,3,52);
		("Mercier","Malik",1,4,53);
		("Michel","Malo",1,2,54);
		("Brunet","Tatiana",1,4,55);
		("Huet","Baptiste",1,1,56);
		("Girard","Grégory",1,2,57);
		("Jean","Nathan",1,1,58);
		("Dumont","Candice",1,2,59);
		("Collet","Marine",1,5,60);
		("Hubert","Léonard",1,2,61);
		("Marty","Alexia",1,2,62);
		("Pasquier","Félix",1,3,63);
		("Boyer","Antonin",1,4,64);
		("Duval","Edwige",1,4,65);
		("Petit","Zoé",1,1,66);
		("Bonnet","Killian",1,2,67);
		("Le gall","Anaëlle",1,2,68);
		("Leclerc","Amine",1,3,69);
		("Guyot","Marwane",1,5,70);
		("Mercier","Roméo",1,1,71);
		("Morel","Célia",1,5,72);
		("Mathieu","Jasmine",1,4,73);
		("Marechal","Mélanie",1,5,74);
		("Hubert","Alexis",1,4,75);
		("Paris","Antonin",1,1,76);
		("Laurent","Léonie",1,1,77);
		("Marchal","Ethan",1,5,78);
		("Le gall","Katell",1,3,79);
		("Michel","Kyllian",1,2,80);
		("Pasquier","Éloïse",1,3,81);
		("Aubry","Hugo",1,3,82);
		("Fournier","Alexis",1,4,83);
		("Leclerc","Chaïma",1,2,84);
		("Fontaine","Colin",1,1,85);
		("Jean","Evan",1,4,86);
		("Gautier","Zoé",1,1,87);
		("Jean","Maelys",1,3,88);
		("Gerard","Angelina",1,5,89);
		("Breton","Noah",1,3,90);
		("Bonnet","Antoine",1,2,91);
		("Boulanger","Manon",1,2,92);
		("Richard","Mathéo",1,2,93);
		("Colin","Mélanie",1,5,94);
		("Gillet","Simon",1,4,95);
		("Riviere","Théo",1,3,96);
		("Faure","Cédric",1,2,97);
		("Muller","Simon",1,5,98);
		("Andre","Julien",1,1,99);
		("Duval","Lucie",1,2,100);

