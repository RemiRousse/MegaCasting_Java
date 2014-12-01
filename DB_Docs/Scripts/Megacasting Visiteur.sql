DROP TABLE `visiteur`;

CREATE TABLE `visiteur` (
	`Identifant` 	bigint unsigned NOT NULL auto_increment,
	`AdressseIp` 	varchar(25),
	`Pays` 			varchar(50) default NULL,
	`Ville` 		varchar(50),
	`OS` 			varchar(50) default NULL,
	`Navigateur` 	varchar(50) default NULL,
	`DateDebut` 	datetime,
	`DateFin` 		datetime,
	PRIMARY KEY (`Identifant`)
) AUTO_INCREMENT=1;

INSERT INTO `visiteur` (`AdressseIp`,`Pays`,`Ville`,`OS`,`Navigateur`,`DateDebut`,`DateFin`) 
VALUES 	("45.242.85.144"	,	"Chad",								"Durgapur",					"MAC OS X"        , "Safari",		"2013-10-26 07:21:43",	"2009-11-02 07:21:43"),
		("174.231.120.249"	,	"France",							"Paris",					"IOS"             , "Safari",		"2011-02-06 02:09:48",	"2012-04-27 02:09:48"),
		("180.201.8.244"	,	"France",							"Marseille",				"ANDROID"         , "Chrome",		"2012-02-13 08:55:22",	"2011-09-26 08:55:22"),
		("80.22.209.211"	,	"France",							"Lyon",						"ANDROID"         , "Chrome",		"2005-11-04 21:33:15",	"2005-05-25 21:33:15"),
		("227.96.202.38"	,	"Ethiopia",							"Thirimont",				"WINDOWS 7"       , "Firefox",		"2014-06-07 17:36:54",	"2010-07-01 17:36:54"),
		("97.93.13.181"		,	"Bulgaria",							"Kota",						"ANDROID"         , "Chrome",		"2014-05-13 14:39:27",	"2013-01-28 14:39:27"),
		("95.188.126.138"	,	"Cape Verde",						"Mainz",					"WINDOWS XP"      , "Firefox",		"2007-05-12 00:51:07",	"2003-11-15 00:51:07"),
		("78.248.90.26"		,	"France",							"Toulouse",					"WINDOWS VISTA"   , "Firefox",		"2013-06-22 20:43:59",	"2015-02-13 20:43:59"),
		("119.215.224.145"	,	"France",							"Nice",						"WINDOWS 8"       , "Opera",		"2010-02-10 15:15:11",	"2008-02-06 15:15:11"),
		("165.25.192.242"	,	"France",							"Nantes",					"WINDOWS 8.1"     , "Firefox",		"2009-05-02 16:23:47",	"2014-06-10 16:23:47"),
		("169.53.65.183"	,	"Guinea-Bissau",					"Rotorua",					"ANDROID"         , "Chrome",		"2008-11-21 05:41:58",	"2009-07-10 05:41:58"),
		("70.75.28.133"		,	"France",							"Corroy-le-Chateau",		"ANDROID"         , "Chrome",		"2003-11-15 15:48:12",	"2008-06-07 15:48:12"),
		("89.186.219.192"	,	"France",							"Montpellier",				"UBUNTU"          , "Firefox",		"2004-12-17 09:51:20",	"2004-04-03 09:51:20"),
		("237.246.30.86"	,	"France",							"Bordeaux",					"DEBIAN"          , "Firefox",		"2006-04-08 01:11:02",	"2007-07-22 01:11:02"),
		("210.177.254.88"	,	"France",							"Bordeaux",					"WINDOWS 8"       , "Firefox",		"2014-08-19 22:13:28",	"2011-03-18 22:13:28"),
		("70.173.196.99"	,	"France",							"Lille",					"ANDROID"         , "Chrome",		"2007-11-06 00:27:26",	"2010-01-18 00:27:26"),
		("17.250.60.246"	,	"France",							"Rennes",					"WINDOWS 8.1"     , "Firefox",		"2010-01-18 04:38:20",	"2014-08-02 04:38:20"),
		("211.4.81.106"		,	"France",							"Rennes",					"ANDROID"         , "Chrome",		"2009-11-18 05:25:53",	"2010-09-16 05:25:53"),
		("140.14.13.161"	,	"France",							"Reims",					"ANDROID"         , "Chrome",		"2004-01-12 11:28:58",	"2010-06-04 11:28:58"),
		("19.114.36.199"	,	"Guadeloupe",						"Nethen",					"WINDOWS XP"      , "Firefox",		"2013-01-13 05:45:40",	"2011-12-26 05:45:40"),
		("210.19.186.92"	,	"Costa Rica",						"Houston",					"WINDOWS VISTA"   , "Firefox",		"2012-04-23 14:43:42",	"2008-12-20 14:43:42"),
		("218.60.68.31"		,	"France",							"Le Havre",					"MAC OS X"        , "Safari",		"2014-03-09 16:02:11",	"2012-03-30 16:02:11"),
		("46.104.9.62"		,	"France",							"Le Havre",					"IOS"             , "Safari",		"2011-07-03 00:30:45",	"2010-09-15 00:30:45"),
		("61.48.197.69"		,	"Dominican Republic",				"Saint-Marc",				"ANDROID"         , "Chrome",		"2013-07-25 13:54:09",	"2015-11-14 13:54:09"),
		("14.59.14.45"		,	"France",							"Saint-Étienne",			"ANDROID"         , "Chrome",		"2003-12-09 10:40:02",	"2010-12-17 10:40:02"),
		("90.129.56.47"		,	"France",							"Toulon",					"WINDOWS XP"      , "Firefox",		"2010-09-18 23:35:11",	"2006-06-15 23:35:11"),
		("178.100.194.205"	,	"France",							"Rochefort",				"WINDOWS VISTA"   , "Firefox",		"2013-08-28 10:57:57",	"2014-07-30 10:57:57"),
		("217.67.252.82"	,	"Hong Kong",						"Hong Kong",				"ANDROID"         , "Chrome",		"2010-09-28 20:55:33",	"2004-04-19 20:55:33"),
		("168.14.97.84"		,	"France",							"Grenoble",					"ANDROID"         , "Chrome",		"2009-04-10 23:08:11",	"2012-05-31 23:08:11"),
		("209.190.64.180"	,	"Cambodia",							"Erpion",					"WINDOWS VISTA"   , "Firefox",		"2006-02-05 17:09:13",	"2006-06-03 17:09:13"),
		("140.19.215.148"	,	"Antarctica",						"Nevers",					"WINDOWS 8"       , "Firefox",		"2006-12-31 14:37:27",	"2010-01-21 14:37:27"),
		("82.248.206.4"		,	"Mayotte",							"Kilwinning",				"ANDROID"         , "Chrome",		"2013-11-26 10:20:18",	"2015-05-07 10:20:18"),
		("110.16.214.231"	,	"France",							"Villeurbanne",				"IOS"             , "Safari",		"2013-09-05 23:58:51",	"2014-08-13 23:58:51"),
		("62.206.211.107"	,	"Netherlands",						"LaSalle",					"WINDOWS 8.1"     , "Firefox",		"2005-10-22 07:21:13",	"2009-06-16 07:21:13"),
		("60.66.103.202"	,	"Saint Lucia",						"Whitehaven",				"WINDOWS 8"       , "Firefox",		"2004-11-10 09:35:24",	"2006-12-14 09:35:24"),
		("70.6.228.93"		,	"China",							"Rothesay",					"IOS"             , "Safari",		"2005-01-03 15:39:34",	"2003-12-23 15:39:34"),
		("68.128.37.74"		,	"France",							"Dijon",					"ANDROID"         , "Chrome",		"2013-06-07 05:28:54",	"2013-08-18 05:28:54"),
		("7.25.216.45"		,	"Gibraltar",						"Forres",					"WINDOWS 8.1"     , "Firefox",		"2010-10-07 13:47:00",	"2011-04-15 13:47:00"),
		("88.51.162.81"		,	"France",							"Albury",					"ANDROID"         , "Chrome",		"2010-05-14 20:24:31",	"2003-12-11 20:24:31"),
		("247.64.118.144"	,	"France",							"Notre-Dame-du-Nord",		"ANDROID"         , "Chrome",		"2007-09-21 17:59:56",	"2013-07-09 17:59:56"),
		("36.254.209.251"	,	"France",							"Angers",					"WINDOWS 8"       , "Firefox",		"2014-02-27 11:17:28",	"2009-09-04 11:17:28"),
		("134.253.179.15"	,	"France",							"Angers",					"WINDOWS 8.1"     , "Firefox",		"2009-12-19 15:36:40",	"2014-04-21 15:36:40"),
		("83.93.252.238"	,	"Australia",						"Bienne-lez-Happart",		"ANDROID"         , "Chrome",		"2008-08-05 01:31:16",	"2005-08-26 01:31:16"),
		("48.179.172.126"	,	"Peru",								"Tallahassee",				"WINDOWS 8"       , "Firefox",		"2004-01-27 22:29:01",	"2011-10-23 22:29:01"),
		("24.65.215.191"	,	"France",							"La Rochelle",				"ANDROID"         , "Chrome",		"2007-04-28 12:15:17",	"2006-05-10 12:15:17"),
		("208.2.149.98"		,	"Netherlands",						"Sangli",					"WINDOWS 8.1"     , "Firefox",		"2004-03-11 17:05:33",	"2008-11-06 17:05:33"),
		("232.54.182.64"	,	"Belgium",							"Isnes",					"WINDOWS 8"       , "Firefox",		"2006-11-29 20:48:26",	"2008-12-01 20:48:26"),
		("62.125.107.221"	,	"Puerto Rico",						"Palmariggi",				"IOS"             , "Safari",		"2010-01-22 08:15:31",	"2010-12-22 08:15:31"),
		("185.211.118.57"	,	"Kenya",							"Carpignano Salentino",		"ANDROID"         , "Chrome",		"2007-02-19 01:43:36",	"2015-02-04 01:43:36"),
		("210.17.9.22"		,	"France",							"Le Mans",					"IOS"             , "Safari",		"2004-01-02 04:42:09",	"2014-09-22 04:42:09"),
		("31.223.29.237"	,	"Saint Martin",						"Gualdo Tadino",			"ANDROID"         , "Firefox",		"2005-05-01 13:16:41",	"2010-05-19 13:16:41"),
		("227.195.59.213"	,	"France",							"Le Mans",					"IOS"             , "Safari",		"2007-06-29 13:18:27",	"2011-10-27 13:18:27"),
		("179.73.119.46"	,	"Algeria",							"Castel Giorgio",			"ANDROID"         , "Chrome",		"2004-02-29 14:49:10",	"2013-09-21 14:49:10"),
		("244.253.231.151"	,	"Russian Federation",				"Vietri di Potenza",		"ANDROID"         , "Chrome",		"2003-11-07 11:25:50",	"2013-06-02 11:25:50"),
		("93.203.40.67"		,	"Dominican Republic",				"Canning",					"ANDROID"         , "Chrome",		"2011-01-27 01:52:22",	"2009-08-08 01:52:22"),
		("208.179.33.42"	,	"France",							"Rigolet",					"WINDOWS XP"      , "Opera",		"2013-03-22 13:54:44",	"2014-05-24 13:54:44"),
		("176.254.136.38"	,	"France",							"Bergen Mons",				"WINDOWS VISTA"   , "Chrome",		"2004-03-25 12:22:02",	"2010-05-20 12:22:02"),
		("27.66.29.78"		,	"France",							"Saint-Louis",				"MAC OS X"        , "Safari",		"2004-04-19 19:36:30",	"2008-02-11 19:36:30"),
		("162.123.49.247"	,	"Norfolk Island",					"Gebze",					"IOS"             , "Safari",		"2012-11-08 06:22:44",	"2011-03-25 06:22:44"),
		("238.117.62.127"	,	"Uzbekistan",						"Feira de Santana",			"ANDROID"         , "Chrome",		"2006-09-30 09:08:30",	"2009-12-30 09:08:30"),
		("92.169.209.155"	,	"France",							"Nîmes",					"ANDROID"         , "Firefox",		"2010-11-20 16:45:57",	"2013-01-15 16:45:57"),
		("5.214.167.245"	,	"Senegal",							"Moignelee",				"WINDOWS XP"      , "Firefox",		"2012-02-01 11:30:28",	"2005-01-29 11:30:28"),
		("210.131.146.205"	,	"Senegal",							"Navsari",					"WINDOWS XP"      , "Chrome",		"2008-07-22 22:58:42",	"2005-02-08 22:58:42"),
		("136.70.67.84"		,	"France",							"Nîmes",					"WINDOWS VISTA"   , "Chrome",		"2008-12-05 11:57:53",	"2008-08-17 11:57:53"),
		("220.220.201.37"	,	"Somalia",							"Ahmadpur East",			"WINDOWS 8"       , "Firefox",		"2012-10-12 21:32:05",	"2013-04-27 21:32:05"),
		("112.250.219.191"	,	"France",							"Clermont-Ferrand",			"WINDOWS 8.1"     , "Firefox",		"2005-03-18 09:13:44",	"2005-06-14 09:13:44"),
		("177.137.4.73"		,	"France",							"Limoges",					"ANDROID"         , "Chrome",		"2007-01-09 06:13:51",	"2009-10-08 06:13:51"),
		("58.121.187.224"	,	"Singapore",						"M�nster",					"ANDROID"         , "Chrome",		"2010-10-24 21:58:27",	"2011-05-25 21:58:27"),
		("237.24.170.170"	,	"France",							"Tours",					"UBUNTU"          , "Firefox",		"2014-07-29 21:32:09",	"2010-09-12 21:32:09"),
		("177.42.102.223"	,	"France",							"Amiens",					"DEBIAN"          , "Opera",		"2013-04-30 01:51:55",	"2010-07-25 01:51:55"),
		("21.203.34.164"	,	"France",							"Metz",						"WINDOWS 8"       , "Firefox",		"2008-12-26 19:15:30",	"2015-09-03 19:15:30"),
		("103.92.213.241"	,	"France",							"Metz",						"ANDROID"         , "Firefox",		"2013-12-19 03:46:03",	"2014-12-11 03:46:03"),
		("232.94.214.172"	,	"France",							"Perpignan",				"WINDOWS 8.1"     , "Safari",		"2013-05-28 08:49:55",	"2013-01-17 08:49:55"),
		("24.174.26.246"	,	"Seychelles",						"Denver",					"ANDROID"         , "Firefox",		"2007-10-16 08:21:42",	"2007-10-21 08:21:42"),
		("74.231.96.64"		,	"Guinea-Bissau",					"Allein",					"ANDROID"         , "Firefox",		"2011-05-05 19:31:00",	"2008-03-26 19:31:00"),
		("146.17.118.107"	,	"France",							"Rouen",					"MAC OS X"        , "Opera",		"2011-03-09 04:40:14",	"2006-07-26 04:40:14"),
		("47.163.222.115"	,	"France",							"Créteil",					"IOS"             , "Safari",		"2008-09-05 13:12:43",	"2011-05-02 13:12:43"),
		("184.236.214.13"	,	"France",							"Caen",						"ANDROID"         , "Firefox",		"2011-03-16 18:49:30",	"2014-03-29 18:49:30"),
		("2.103.54.86"		,	"France",							"Rouen",					"ANDROID"         , "Firefox",		"2004-08-09 17:56:15",	"2013-12-16 17:56:15"),
		("126.27.248.56"	,	"Faroe Islands",					"Nuraminis",				"WINDOWS 7"       , "Chrome",		"2006-12-15 06:38:30",	"2011-12-10 06:38:30"),
		("166.29.82.38"		,	"France",							"Brest",					"ANDROID"         , "Chrome",		"2009-04-27 01:29:58",	"2009-02-17 01:29:58"),
		("244.45.220.129"	,	"France",							"Brest",					"ANDROID"         , "Chrome",		"2011-03-23 01:32:14",	"2005-11-04 01:32:14"),
		("218.8.52.55"		,	"France",							"Aix-en-Provence",			"ANDROID"         , "Chrome",		"2007-10-08 00:34:26",	"2005-11-21 00:34:26"),
		("170.89.206.159"	,	"France",							"Cannes",					"WINDOWS XP"      , "Chrome",		"2013-11-17 01:19:49",	"2014-05-10 01:19:49"),
		("117.156.67.198"	,	"France",							"Roubaix Nord",				"ANDROID"         , "Firefox",		"2004-01-16 07:16:22",	"2010-11-28 07:16:22"),
		("182.150.76.68"	,	"Gabon",							"Namen",					"WINDOWS 8.1"     , "Firefox",		"2013-02-06 14:19:10",	"2003-11-09 14:19:10"),
		("184.172.160.162"	,	"France",							"Bondy",					"ANDROID"         , "Chrome",		"2010-06-09 22:23:31",	"2007-11-22 22:23:31"),
		("215.139.132.184"	,	"France",							"Roubaix Nord",				"ANDROID"         , "Firefox",		"2006-06-25 23:03:32",	"2007-11-08 23:03:32"),
		("97.168.223.213"	,	"France",							"Aix-en-Provence",			"MAC OS X"        , "Firefox",		"2006-09-17 10:16:26",	"2006-11-22 10:16:26"),
		("5.34.80.84"		,	"Maldives",							"Luino",					"IOS"             , "Safari",		"2008-01-20 17:06:42",	"2008-02-24 17:06:42"),
		("154.79.112.179"	,	"France",							"Calais",					"ANDROID"         , "Chrome",		"2014-07-26 07:22:42",	"2011-12-22 07:22:42"),
		("109.203.37.142"	,	"Tanzania",							"Aurora",					"WINDOWS 8.1"     , "Safari",		"2011-05-24 13:15:19",	"2006-12-07 13:15:19"),
		("110.84.36.67"		,	"Bhutan",							"Quinte West",				"WINDOWS 8"       , "Firefox",		"2014-07-06 01:36:17",	"2015-04-11 01:36:17"),
		("85.155.177.45"	,	"Uganda",							"Solihull",					"WINDOWS 8.1"     , "Chrome",		"2010-01-15 08:29:35",	"2008-02-06 08:29:35"),
		("211.91.116.80"	,	"France",							"Avignon",					"WINDOWS 8"       , "Opera",		"2014-10-19 05:50:16",	"2013-06-02 05:50:16"),
		("145.62.123.211"	,	"France",							"Avignon",					"WINDOWS 8.1"     , "Chrome",		"2007-06-13 12:32:05",	"2010-01-22 12:32:05"),
		("39.192.138.192"	,	"Peru",								"Schwalbach",				"ANDROID"         , "Chrome",		"2008-10-01 23:55:56",	"2004-09-06 23:55:56"),
		("208.182.170.114"	,	"France",							"Avignon",					"ANDROID"         , "Chrome",		"2004-11-29 12:32:01",	"2010-11-02 12:32:01"),
		("100.125.29.69"	,	"France",							"Cannes",					"MAC OS X"        , "Safari",		"2010-07-09 23:24:51",	"2003-11-02 23:24:51"),
		("117.184.100.166"	,	"France",							"Béziers",					"ANDROID"         , "Firefox",		"2009-10-22 01:32:54",	"2005-10-06 01:32:54");
		
		
		
DROP TABLE `candidat`;

CREATE TABLE `candidat` (
	`Identifant` 				bigint unsigned NOT NULL auto_increment,
	`Nom` 						varchar(255) default NULL,
	`Prenom` 					varchar(255) default NULL,
	`DateNaissance` 			datetime,
	`Pays` 						varchar(100) default NULL,
	`IdentifiantCompte` 		bigint,
	`IdentifiantVisiteur` 		bigint,
	`IdentifiantInformation` 	bigint,
	PRIMARY KEY (`Identifant`)
) AUTO_INCREMENT=1;

INSERT INTO `candidat` (`Nom`,`Prenom`,`Pays`, `DateNaissance`,`IdentifiantCompte`,`IdentifiantVisiteur`,`IdentifiantInformation`)
VALUES 	("Levy",		"Chadwick",		"France",				`1973-05-04`,		1,		1,		1);
		("Garcia",		"Colby",		"Spain",				`1988-10-26`,		2,		2,		2);
		("Small",		"Patrick",		"Spain",				`1963-08-28`,		3,		3,		3);
		("Rush",		"Castor",		"United States",		`1966-06-28`,		4,		4,		4);
		("Ellison",		"Victor",		"United Kingdom",		`1966-03-08`,		5,		5,		5);
		("Bartlett",	"Oscar",		"United Kingdom",		`1972-09-21`,		6,		6,		6);
		("Russell",		"Lawrence",		"France",				`1960-12-10`,		7,		7,		7);
		("Glass",		"Zachary",		"Spain",				`1974-03-01`,		8,		8,		8);
		("Zamora",		"Tad",			"United Kingdom",		`1990-03-07`,		9,		9,		9);
		("Beasley",		"Plato",		"United Kingdom",		`1979-07-12`,		10,		10,		10);
		("Franco",		"Leo",			"United Kingdom",		`1970-02-26`,		11,		11,		11);
		("Phillips",	"Richard",		"France",				`1983-06-19`,		12,		12,		12);
		("Whitehead",	"Clinton",		"France",				`1987-07-16`,		13,		13,		13);
		("Ewing",		"Hamish",		"United States",		`1970-12-14`,		14,		14,		14);
		("Poole",		"Nigel",		"Spain",				`1990-05-29`,		15,		15,		15);
		("Vazquez",		"Amos",			"United Kingdom",		`1994-04-30`,		16,		16,		16);
		("Sawyer",		"Wyatt",		"France",				`1987-09-16`,		17,		17,		17);
		("Cannon",		"Ryan",			"Spain",				`1967-01-20`,		18,		18,		18);
		("Walter",		"Nehru",		"United States",		`1975-08-17`,		19,		19,		19);
		("Dickerson",	"Daniel",		"Spain",				`1968-09-09`,		20,		20,		20);
		("Solomon",		"Marshall",		"Spain",				`1975-06-11`,		21,		21,		21);
		("Cantrell",	"Ali",			"Spain",				`1985-06-12`,		22,		22,		22);
		("Marks",		"Camden",		"United Kingdom",		`1987-11-01`,		23,		23,		23);
		("Deleon",		"Thor",			"United Kingdom",		`1992-10-24`,		24,		24,		24);
		("Randolph",	"Norman",		"United Kingdom",		`1993-02-06`,		25,		25,		25);
		("Rosales",		"Harlan",		"United Kingdom",		`1961-11-12`,		26,		26,		26);
		("Andrews",		"Rafael",		"France",				`1960-12-26`,		27,		27,		27);
		("Byers",		"Vladimir",		"Spain",				`1969-09-16`,		28,		28,		28);
		("Bender",		"Rashad",		"Spain",				`1963-12-27`,		29,		29,		29);
		("Kennedy",		"Owen",			"United Kingdom",		`1973-10-14`,		30,		30,		30);
		("Humphrey",	"Arsenio",		"United Kingdom",		`1958-10-10`,		31,		31,		31);
		("Kramer",		"Victor",		"France",				`1965-02-26`,		32,		32,		32);
		("Huff",		"Lionel",		"Spain",				`1990-08-03`,		33,		33,		33);
		("Duncan",		"Hayden",		"France",				`1982-08-08`,		34,		34,		34);
		("Barber",		"Tarik",		"Spain",				`1977-09-04`,		35,		35,		35);
		("Norris",		"Valentine",		"United States",	`1982-12-22`,		36,		36,		36);
		("Kinney",		"Barry",		"United States",		`1984-11-13`,		37,		37,		37);
		("Russell",		"Alexander",	"United Kingdom",		`1966-06-04`,		38,		38,		38);
		("Parks",		"Ivan",			"Spain",				`1983-01-23`,		39,		39,		39);
		("Dyer",		"Bruno",		"France",				`1987-10-20`,		40,		40,		40);
		("Baldwin",		"Eaton",		"United Kingdom",		`1974-06-12`,		41,		41,		41);
		("Murphy",		"Kibo",			"Spain",				`1975-11-16`,		42,		42,		42);
		("Ramos",		"Hammett",		"United Kingdom",		`1982-09-02`,		43,		43,		43);
		("Mcpherson",	"Berk",			"France",				`1993-01-30`,		44,		44,		44);
		("Henson",		"Colorado",		"Spain",				`1984-10-10`,		45,		45,		45);
		("Klein",		"Tarik",		"Spain",				`1985-09-23`,		46,		46,		46);
		("Mullins",		"Quamar",		"United States",		`1962-03-02`,		47,		47,		47);
		("Marquez",		"Quamar",		"United States",		`1979-05-10`,		48,		48,		48);
		("Holland",		"Forrest",		"United Kingdom",		`1994-09-04`,		49,		49,		49);
		("Rich",		"Abel",			"France",				`1979-02-04`,		50,		50,		50);
		("Hunt",		"Driscoll",		"United States",		`1968-03-22`,		51,		51,		51);
		("Ellison",		"Kelly",		"France",				`1991-02-28`,		52,		52,		52);
		("Mullins",		"Salvador",		"United Kingdom",		`1993-08-04`,		53,		53,		53);
		("Deleon",		"Aidan",		"United States",		`1960-09-20`,		54,		54,		54);
		("Ramirez",		"Ryan",			"France",				`1983-02-11`,		55,		55,		55);
		("Glass",		"Tarik",		"United Kingdom",		`1970-12-03`,		56,		56,		56);
		("Wright",		"Colby",		"United Kingdom",		`1963-01-09`,		57,		57,		57);
		("Moody",		"Daquan",		"Spain",				`1987-09-15`,		58,		58,		58);
		("Donaldson",	"Fritz",		"France",				`1969-03-03`,		59,		59,		59);
		("Stephenson",	"Tarik",		"Spain",				`1990-03-12`,		60,		60,		60);
		("Hill",		"Hiram",		"France",				`1991-01-03`,		61,		61,		61);
		("Randolph",	"Baxter",		"United States",		`1968-03-02`,		62,		62,		62);
		("Stokes",		"Nathaniel",	"Spain",				`1991-12-14`,		63,		63,		63);
		("Delaney",		"Wyatt",		"United States",		`1960-07-13`,		64,		64,		64);
		("Thompson",	"Tarik",		"United Kingdom",		`1979-08-01`,		65,		65,		65);
		("Conrad",		"Valentine",	"United States",		`1973-10-31`,		66,		66,		66);
		("Bowers",		"Kelly",		"Spain",				`1970-08-19`,		67,		67,		67);
		("Stein",		"Garrett",		"France",				`1989-08-31`,		68,		68,		68);
		("Nash",		"Keaton",		"United Kingdom",		`1961-08-27`,		69,		69,		69);
		("Workman",		"Marsden",		"Spain",				`1965-02-21`,		70,		70,		70);
		("Stout",		"Philip",		"United Kingdom",		`1984-08-03`,		71,		71,		71);
		("Ashley",		"Akeem",		"United States",		`1991-06-14`,		72,		72,		72);
		("Hyde",		"Rooney",		"United States",		`1967-04-02`,		73,		73,		73);
		("Stuart",		"Alden",		"France",				`1963-10-11`,		74,		74,		74);
		("Goodman",		"Caleb",		"Spain",				`1960-12-17`,		75,		75,		75);
		("Melton",		"Ray",			"United States",		`1979-12-24`,		76,		76,		76);
		("Mullins",		"Neville",		"Spain",				`1986-06-25`,		77,		77,		77);
		("Tanner",		"Kadeem",		"United Kingdom",		`1970-07-25`,		78,		78,		78);
		("Peck",		"Kyle",			"United States",		`1978-07-24`,		79,		79,		79);
		("Gillespie",	"Dante",		"Spain",				`1962-02-07`,		80,		80,		80);
		("Watson",		"Aladdin",		"Spain",				`1983-01-24`,		81,		81,		81);
		("Nixon",		"Malcolm",		"United States",		`1974-03-16`,		82,		82,		82);
		("Manning",		"Dieter",		"United States",		`1968-10-29`,		83,		83,		83);
		("Ashley",		"Francis",		"United States",		`1958-08-09`,		84,		84,		84);
		("Cardenas",	"Blake",		"Spain",				`1989-09-23`,		85,		85,		85);
		("Moses",		"Hammett",		"United Kingdom",		`1984-01-26`,		86,		86,		86);
		("Manning",		"Hoyt",			"France",				`1986-10-11`,		87,		87,		87);
		("Ramirez",		"Isaac",		"France",				`1981-01-06`,		88,		88,		88);
		("Gonzales",	"Mark",			"United Kingdom",		`1988-08-07`,		89,		89,		89);
		("Ryan",		"Abraham",		"Spain",				`1974-09-06`,		90,		90,		90);
		("Witt",		"Erasmus",		"United Kingdom",		`1983-05-27`,		91,		91,		91);
		("Tillman",		"Elvis",		"United States",		`1984-02-24`,		92,		92,		92);
		("Mcintyre",	"Merrill",		"United Kingdom",		`1976-06-22`,		93,		93,		93);
		("Dudley",		"Duncan",		"France",				`1966-07-17`,		94,		94,		94);
		("Mack",		"Myles",		"United Kingdom",		`1978-05-06`,		95,		95,		95);
		("Vang",		"Zachary",		"United Kingdom",		`1972-10-21`,		96,		96,		96);
		("Flowers",		"Moses",		"United States",		`1963-01-20`,		97,		97,		97);
		("Delaney",		"Jeremy",		"United States",		`1994-05-11`,		98,		98,		98);
		("Bender",		"Jameson",		"France",				`1994-02-05`,		99,		99,		99);
		("Gilmore",		"Ralph",		"Spain",				`1973-08-07`,		100,	100,	100);
		