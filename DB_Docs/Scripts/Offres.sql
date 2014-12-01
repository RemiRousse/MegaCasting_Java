DROP TABLE `offre`;

CREATE TABLE `offre` (
  `Identifiant` 			BIGINT 			unsigned NOT NULL auto_increment,
  `Libelle` 				VARCHAR(100) 	default NULL,
  `Reference` 				VARCHAR(255) 	default NULL,
  `DateDebPublication` 		datetime,
  `DateDebContrat` 			datetime,
  `DateFinContrat` 			datetime,
  `DescPoste` 				text 			default NULL,
  `DescProfil` 				text 			default NULL,
  `IdentifiantAnnonceur` 	BIGINT,
  `IdentifiantContrat` 		BIGINT,
  `IdentifiantMetier` 		BIGINT,
  `IdentifiantDomaine` 		BIGINT,
  
  PRIMARY KEY (`Identifiant`),
  
  FOREIGN KEY (IdentifiantAnnonceur)
		REFERENCES annonceur(Identifiant)
		ON UPDATE CASCADE ON DELETE RESTRICT,
  
  FOREIGN KEY (IdentifiantContrat)
		REFERENCES contrat(Identifiant)
		ON UPDATE CASCADE ON DELETE RESTRICT,
  
  FOREIGN KEY (IdentifiantMetier)
		REFERENCES metier(Identifiant)
		ON UPDATE CASCADE ON DELETE RESTRICT,
		
  FOREIGN KEY (IdentifiantDomaine)
		REFERENCES domaine(Identifiant)
		ON UPDATE CASCADE ON DELETE RESTRICT
) AUTO_INCREMENT=1;

INSERT INTO `offre` (`Libelle`, `Reference`, `DateDebPublication`, `DateDebContrat`, `DateFinContrat`, `DescPoste`, `DescProfil`, `IdentifiantAnnonceur`, `IdentifiantContrat`, `IdentifiantMetier`, `IdentifiantDomaine`)
	VALUES			("",	"",	"2014-10-21 08:35:29",	"2014-11-03 00:00:00",	"2015-04-29 00:00:00",	"",	"",	3, 	2,	8,	1),
					("",	"",	"2014-12-13 09:15:08",	"2014-12-30 00:00:00",	"2015-03-05 00:00:00",	"",	"",	5,	3,	3,	2),
					("",	"",	"2014-11-02 17:08:58",	"2014-12-03 00:00:00",	"2015-03-18 00:00:00",	"",	"",	5,	2,	4,	2),
					("",	"",	"2014-08-07 19:05:03",	"2014-11-09 00:00:00",	"",						"",	"",	2,	1,	3,	2),
					("",	"",	"2014-11-14 09:37:36",	"2014-11-27 00:00:00",	"2014-12-28 00:00:00",	"",	"",	2,	3,	7,	1),
					("",	"",	"2014-11-12 20:40:41",	"2014-11-16 00:00:00",	"2015-03-29 00:00:00",	"",	"",	5,	3,	1,	2),
					("",	"",	"2014-10-21 23:43:57",	"2014-12-01 00:00:00",	"2015-04-17 00:00:00",	"",	"",	2,	3,	5,	3),
					("",	"",	"2014-11-02 07:23:44",	"2014-11-15 00:00:00",	"2015-02-02 00:00:00",	"",	"",	3,	2,	5,	3),
					("",	"",	"2014-08-04 11:11:29",	"2014-12-21 00:00:00",	"2015-01-07 00:00:00",	"",	"",	2,	2,	1,	2),
					("",	"",	"2014-09-26 03:19:17",	"2014-12-28 00:00:00",	"2015-03-27 00:00:00",	"",	"",	2,	3,	8,	1),
					("",	"",	"2014-09-02 23:42:25",	"2014-11-15 00:00:00",	"2014-12-22 00:00:00",	"",	"",	3,	2,	7,	1),
					("",	"",	"2014-10-16 01:56:40",	"2014-12-02 00:00:00",	"2015-04-21 00:00:00",	"",	"",	5,	3,	6,	3),
					("",	"",	"2014-08-20 03:55:29",	"2014-12-10 00:00:00",	"",						"",	"",	2,	1,	3,	2),
					("",	"",	"2014-09-06 11:47:04",	"2014-12-08 00:00:00",	"",						"",	"",	4,	1,	3,	2),
					("",	"",	"2014-08-05 03:06:57",	"2014-12-16 00:00:00",	"2014-12-21 00:00:00",	"",	"",	4,	2,	6,	3),
					("",	"",	"2014-11-21 21:29:46",	"2014-12-28 00:00:00",	"2015-01-22 00:00:00",	"",	"",	4,	2,	3,	3),
					("",	"",	"2014-08-10 06:45:47",	"2014-12-27 00:00:00",	"2015-03-24 00:00:00",	"",	"",	3,	3,	7,	1),
					("",	"",	"2014-10-27 08:46:14",	"2014-11-23 00:00:00",	"2015-01-19 00:00:00",	"",	"",	5,	2,	4,	2),
					("",	"",	"2014-11-22 04:19:18",	"2014-12-31 00:00:00",	"",						"",	"",	1,	1,	4,	2),
					("",	"",	"2014-08-25 08:38:17",	"2014-12-25 00:00:00",	"2015-05-12 00:00:00",	"",	"",	2,	3,	5,	3),
					("",	"",	"2014-12-02 10:42:35",	"2015-01-02 00:00:00",	"2015-04-22 00:00:00",	"",	"",	3,	2,	6,	3),
					("",	"",	"2014-10-07 09:13:10",	"2014-12-20 00:00:00",	"2015-06-08 00:00:00",	"",	"",	1,	2,	6,	3),
					("",	"",	"2014-11-13 01:05:01",	"2014-12-08 00:00:00",	"2015-05-16 00:00:00",	"",	"",	4,	3,	3,	2),
					("",	"",	"2014-09-25 19:03:38",	"2014-11-17 00:00:00",	"2015-05-11 00:00:00",	"",	"",	5,	3,	1,	2),
					("",	"",	"2014-10-23 07:17:49",	"2014-11-01 00:00:00",	"2015-01-11 00:00:00",	"",	"",	2,	3,	6,	3),
					("",	"",	"2014-08-08 00:53:42",	"2014-12-11 00:00:00",	"2015-01-10 00:00:00",	"",	"",	4,	3,	6,	3),
					("",	"",	"2014-11-08 22:04:01",	"2014-12-21 00:00:00",	"2015-04-17 00:00:00",	"",	"",	1,	2,	2,	2),
					("",	"",	"2014-08-22 18:37:33",	"2014-11-10 00:00:00",	"2015-02-15 00:00:00",	"",	"",	1,	2,	1,	2),
					("",	"",	"2014-08-31 01:08:30",	"2014-12-08 00:00:00",	"",						"",	"",	1,	1,	1,	2),
					("",	"",	"2014-12-01 09:43:25",	"2014-11-02 00:00:00",	"2015-02-11 00:00:00",	"",	"",	3,	2,	1,	2),
					("",	"",	"2014-09-30 18:17:02",	"2014-12-25 00:00:00",	"2015-02-07 00:00:00",	"",	"",	5,	3,	4,	2),
					("",	"",	"2014-09-20 14:08:48",	"2014-12-04 00:00:00",	"",						"",	"",	4,	1,	4,	2),
					("",	"",	"2014-09-01 05:11:53",	"2014-12-28 00:00:00",	"",						"",	"",	3,	1,	8,	1),
					("",	"",	"2014-09-26 13:08:54",	"2014-12-10 00:00:00",	"2015-04-07 00:00:00",	"",	"",	5,	3,	1,	2),
					("",	"",	"2014-11-13 05:23:44",	"2014-12-05 00:00:00",	"2015-01-19 00:00:00",	"",	"",	5,	3,	6,	3),
					("",	"",	"2014-10-17 17:19:24",	"2015-01-03 00:00:00",	"2015-05-29 00:00:00",	"",	"",	2,	3,	8,	1),
					("",	"",	"2014-11-03 02:59:52",	"2014-12-04 00:00:00",	"2015-02-15 00:00:00",	"",	"",	1,	3,	1,	2),
					("",	"",	"2014-11-30 23:45:55",	"2014-11-16 00:00:00",	"2015-05-03 00:00:00",	"",	"",	3,	2,	8,	1),
					("",	"",	"2014-11-01 23:40:26",	"2014-12-20 00:00:00",	"2015-01-17 00:00:00",	"",	"",	5,	3,	1,	2),
					("",	"",	"2014-10-24 23:49:58",	"2014-12-26 00:00:00",	"",						"",	"",	5,	1,	7,	1),
					("",	"",	"2014-10-31 02:32:34",	"2014-12-13 00:00:00",	"2015-03-12 00:00:00",	"",	"",	4,	2,	4,	2),
					("",	"",	"2014-10-23 11:11:23",	"2014-12-12 00:00:00",	"2015-05-14 00:00:00",	"",	"",	2,	2,	7,	1),
					("",	"",	"2014-08-13 09:48:45",	"2015-01-03 00:00:00",	"2015-04-15 00:00:00",	"",	"",	4,	2,	8,	1),
					("",	"",	"2014-08-11 03:45:34",	"2015-01-01 00:00:00",	"2015-01-18 00:00:00",	"",	"",	2,	3,	2,	2),
					("",	"",	"2014-11-20 03:09:25",	"2014-12-11 00:00:00",	"2015-05-20 00:00:00",	"",	"",	3,	3,	5,	3),
					("",	"",	"2014-10-12 12:46:57",	"2014-12-09 00:00:00",	"2015-04-02 00:00:00",	"",	"",	2,	2,	5,	3),
					("",	"",	"2014-11-14 11:29:36",	"2014-12-22 00:00:00",	"2015-05-22 00:00:00",	"",	"",	1,	3,	3,	2),
					("",	"",	"2014-11-19 12:03:57",	"2014-11-14 00:00:00",	"2015-03-26 00:00:00",	"",	"",	5,	2,	1,	2),
					("",	"",	"2014-10-29 17:42:22",	"2014-12-01 00:00:00",	"2015-05-22 00:00:00",	"",	"",	3,	2,	7,	1),
					("",	"",	"2014-09-11 04:11:14",	"2014-11-25 00:00:00",	"2015-03-31 00:00:00",	"",	"",	5,	3,	5,	3),
					("",	"",	"2014-08-25 08:06:50",	"2014-12-18 00:00:00",	"2015-02-07 00:00:00",	"",	"",	1,	2,	7,	1),
					("",	"",	"2014-12-05 08:10:20",	"2014-12-28 00:00:00",	"2014-12-23 00:00:00",	"",	"",	5,	3,	4,	2),
					("",	"",	"2014-12-02 16:42:59",	"2014-12-08 00:00:00",	"",						"",	"",	4,	1,	6,	3),
					("",	"",	"2014-08-12 07:28:39",	"2014-12-02 00:00:00",	"2015-03-23 00:00:00",	"",	"",	4,	2,	5,	3),
					("",	"",	"2014-08-25 00:23:34",	"2014-11-17 00:00:00",	"2015-04-26 00:00:00",	"",	"",	1,	3,	2,	2),
					("",	"",	"2014-08-11 11:05:47",	"2014-11-30 00:00:00",	"2015-04-09 00:00:00",	"",	"",	1,	3,	6,	3),
					("",	"",	"2014-08-04 15:32:23",	"2014-12-07 00:00:00",	"2014-12-27 00:00:00",	"",	"",	2,	3,	4,	2),
					("",	"",	"2014-09-23 03:03:54",	"2015-01-02 00:00:00",	"2015-04-13 00:00:00",	"",	"",	1,	2,	5,	3),
					("",	"",	"2014-08-12 07:28:19",	"2014-11-21 00:00:00",	"2015-04-19 00:00:00",	"",	"",	5,	2,	8,	1),
					("",	"",	"2014-09-12 14:18:09",	"2014-12-31 00:00:00",	"2015-01-14 00:00:00",	"",	"",	1,	3,	7,	1),
					("",	"",	"2014-11-04 12:37:22",	"2014-12-25 00:00:00",	"2015-01-11 00:00:00",	"",	"",	5,	3,	4,	2),
					("",	"",	"2014-12-16 12:31:48",	"2014-12-04 00:00:00",	"2015-02-25 00:00:00",	"",	"",	5,	3,	8,	1),
					("",	"",	"2014-09-07 03:36:45",	"2014-12-17 00:00:00",	"2015-04-06 00:00:00",	"",	"",	3,	2,	4,	2),
					("",	"",	"2014-09-13 08:57:50",	"2014-11-19 00:00:00",	"",						"",	"",	1,	1,	3,	2),
					("",	"",	"2014-09-21 13:26:59",	"2014-11-11 00:00:00",	"2015-02-03 00:00:00",	"",	"",	1,	2,	4,	2),
					("",	"",	"2014-09-04 23:19:52",	"2014-11-26 00:00:00",	"",						"",	"",	3,	1,	7,	1),
					("",	"",	"2014-08-03 18:07:48",	"2014-12-17 00:00:00",	"2015-05-12 00:00:00",	"",	"",	2,	2,	4,	2),
					("",	"",	"2014-10-18 15:34:48",	"2014-11-10 00:00:00",	"2015-01-28 00:00:00",	"",	"",	1,	3,	4,	2),
					("",	"",	"2014-11-13 00:01:41",	"2015-01-01 00:00:00",	"2015-06-02 00:00:00",	"",	"",	2,	3,	3,	2),
					("",	"",	"2014-10-05 23:45:57",	"2014-11-17 00:00:00",	"2015-05-12 00:00:00",	"",	"",	4,	2,	6,	3),
					("",	"",	"2014-09-04 12:33:48",	"2014-12-25 00:00:00",	"",						"",	"",	1,	1,	4,	2),
					("",	"",	"2014-11-28 21:08:02",	"2014-11-07 00:00:00",	"2015-01-13 00:00:00",	"",	"",	2,	2,	7,	1),
					("",	"",	"2014-09-30 00:42:58",	"2014-11-08 00:00:00",	"2015-05-26 00:00:00",	"",	"",	2,	3,	1,	2),
					("",	"",	"2014-10-05 00:34:36",	"2014-11-08 00:00:00",	"2015-05-15 00:00:00",	"",	"",	3,	3,	2,	2),
					("",	"",	"2014-11-05 13:09:29",	"2014-12-04 00:00:00",	"2015-03-15 00:00:00",	"",	"",	4,	2,	2,	2),
					("",	"",	"2014-11-14 13:41:40",	"2014-11-14 00:00:00",	"2015-04-06 00:00:00",	"",	"",	3,	2,	2,	2),
					("",	"",	"2014-09-27 22:06:57",	"2014-12-29 00:00:00",	"",						"",	"",	2,	1,	3,	2),
					("",	"",	"2014-11-22 16:08:00",	"2014-11-17 00:00:00",	"2015-05-15 00:00:00",	"",	"",	3,	2,	5,	2),
					("",	"",	"2014-09-17 17:06:22",	"2014-11-22 00:00:00",	"2015-01-16 00:00:00",	"",	"",	5,	3,	8,	1),
					("",	"",	"2014-08-01 10:19:20",	"2014-11-10 00:00:00",	"2015-05-01 00:00:00",	"",	"",	1,	3,	1,	2),
					("",	"",	"2014-08-29 02:28:47",	"2014-11-02 00:00:00",	"2015-01-31 00:00:00",	"",	"",	4,	2,	6,	3),
					("",	"",	"2014-12-07 12:03:04",	"2014-12-04 00:00:00",	"2015-01-02 00:00:00",	"",	"",	5,	3,	8,	1),
					("",	"",	"2014-11-12 05:24:07",	"2014-11-30 00:00:00",	"2015-02-19 00:00:00",	"",	"",	3,	3,	4,	2),
					("",	"",	"2014-09-25 18:51:16",	"2014-11-07 00:00:00",	"2015-03-10 00:00:00",	"",	"",	3,	2,	5,	3),
					("",	"",	"2014-08-27 15:01:27",	"2014-12-03 00:00:00",	"2015-05-14 00:00:00",	"",	"",	2,	3,	1,	2),
					("",	"",	"2014-12-09 09:40:58",	"2014-12-23 00:00:00",	"2015-01-04 00:00:00",	"",	"",	2,	3,	8,	1),
					("",	"",	"2014-09-06 04:39:07",	"2014-12-02 00:00:00",	"2015-05-13 00:00:00",	"",	"",	1,	2,	5,	3),
					("",	"",	"2014-10-06 19:12:54",	"2014-11-06 00:00:00",	"2015-01-04 00:00:00",	"",	"",	1,	2,	3,	2),
					("",	"",	"2014-09-11 15:03:41",	"2014-11-10 00:00:00",	"2015-05-11 00:00:00",	"",	"",	1,	2,	4,	2),
					("",	"",	"2014-08-19 19:26:56",	"2014-12-14 00:00:00",	"",						"",	"",	5,	1,	4,	2),
					("",	"",	"2014-11-08 15:30:45",	"2014-11-07 00:00:00",	"2015-05-15 00:00:00",	"",	"",	3,	2,	7,	1),
					("",	"",	"2014-09-16 05:18:10",	"2014-12-24 00:00:00",	"2015-01-17 00:00:00",	"",	"",	2,	3,	7,	1),
					("",	"",	"2014-09-29 23:11:34",	"2014-12-08 00:00:00",	"2015-02-22 00:00:00",	"",	"",	5,	2,	3,	2),
					("",	"",	"2014-10-01 08:13:24",	"2014-11-19 00:00:00",	"2015-02-10 00:00:00",	"",	"",	3,	3,	3,	2),
					("",	"",	"2014-10-07 19:39:15",	"2014-11-08 00:00:00",	"2015-04-19 00:00:00",	"",	"",	5,	3,	4,	2),
					("",	"",	"2014-08-21 20:27:14",	"2014-12-09 00:00:00",	"2015-04-10 00:00:00",	"",	"",	3,	2,	7,	1);
                                                                                                                        
                                                                                                                        
                                                                                                                        
                                                                                                                        
                                                                                                              