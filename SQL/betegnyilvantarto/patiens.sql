DROP TABLE IF EXISTS diagnosztizal;
CREATE TABLE IF NOT EXISTS diagnosztizal (
  betegseg_neve CHAR(200) NOT NULL,
  vizsg_azon INTEGER NOT NULL,
  datum DATE NOT NULL
);

DROP TABLE IF EXISTS erzekeny;
CREATE TABLE IF NOT EXISTS erzekeny (
  taj INTEGER DEFAULT NULL,
  gyogyszer_neve CHAR(200) DEFAULT NULL
);

DROP TABLE IF EXISTS gyogyszert_felir;
CREATE TABLE IF NOT EXISTS gyogyszert_felir (
  gyogyszer_neve CHAR(200) NOT NULL,
  betegseg_neve CHAR(200) NOT NULL,
  vizsg_azon INTEGER NOT NULL,
  datum DATE NOT NULL
);

DROP TABLE IF EXISTS latogat;
CREATE TABLE IF NOT EXISTS latogat (
  taj INTEGER NOT NULL,
  vizsg_azon INTEGER NOT NULL,
  datum DATE NOT NULL
);

DROP TABLE IF EXISTS beteg;
CREATE TABLE IF NOT EXISTS beteg (
  taj INTEGER NOT NULL,
  nev CHAR(200) NOT NULL,
  lakcim CHAR(300) NOT NULL,
  PRIMARY KEY (taj)
);

DROP TABLE IF EXISTS betegseg;
CREATE TABLE IF NOT EXISTS betegseg (
  betegseg_neve CHAR(200) NOT NULL,
  PRIMARY KEY (betegseg_neve)
);

DROP TABLE IF EXISTS gyogyszer;
CREATE TABLE IF NOT EXISTS gyogyszer (
  gyogyszer_neve CHAR(200) NOT NULL,
  PRIMARY KEY (gyogyszer_neve)
);

DROP TABLE IF EXISTS vizsgalat;
CREATE TABLE IF NOT EXISTS vizsgalat (
  vizsg_azon INTEGER NOT NULL,
  datum DATE NOT NULL,
  PRIMARY KEY (vizsg_azon)
);

INSERT INTO beteg (taj, nev, lakcim)
VALUES
(373673873, 'Teszt Elek', '1066, Budapest Andrassy u 8'),
(123456789, 'Mek Elek', '7510, Bugyi Fu ut 8'),
(123456788, 'Szonja', '3734, Szeged Tisza part 3'),
(123456783, 'Moka Miki', '1112, Debrecen Nagyerdo ut 6'),
(123456782, 'Trab Antal', '2846, Gyorujbarat Tanya u 7'),
(123456781, 'Most Kivan', '9923, Sopron Huseg utca 2'),
(123456786, 'Elem Ert', '2802, Dunaujvaros Koho utca 7');

INSERT INTO gyogyszer (gyogyszer_neve)
VALUES
('Algopyrin'),
('Algoflex'),
('Neo Citran'),
('Aflamin'),
('Perskindol'),
('Rubophen'),
('Diflam');

INSERT INTO betegseg (betegseg_neve)
VALUES
('Aranyer'),
('Atelekazia'),
('Sorelvonas'),
('Diszpraxia'),
('Perskindol'),
('Garatgyulladas'),
('Laz');

INSERT INTO vizsgalat (vizsg_azon, datum)
VALUES
(1021212234, '2018-02-08'),
(1021212334, '2018-02-07'),
(1176351563, '2018-02-09'),
(1234453435, '2018-01-08'),
(1334453434, '2018-02-08'),
(2142154564, '2018-02-08'),
(2147483647, '2018-02-08');

INSERT INTO erzekeny (taj, gyogyszer_neve)
VALUES
(373673873,'Algopyrin'),
(123456789,'Algoflex'),
(123456788,'Neo Citran'),
(123456783,'Aflamin'),
(123456782,'Perskindol'),
(123456781,'Rubophen'),
(123456786,'Diflam');

INSERT INTO gyogyszert_felir (gyogyszer_neve, betegseg_neve, vizsg_azon, datum)
VALUES
('Algopyrin','Atelekazia',1021212234, '2018-02-08'),
('Algoflex','Sorelvonas', 1021212334, '2018-02-07'),
('Neo Citran','Aranyer', 1176351563, '2018-02-08'),
('Aflamin','Diszpraxia', 1234453435, '2018-01-08'),
('Perskindol','Perskindol', 1334453434, '2018-02-08'),
('Rubophen','Garatgyulladas', 2142154564, '2018-02-08'),
('Diflam','Laz', 2147483647, '2018-02-08');

insert into latogat (taj, vizsg_azon, datum)
VALUES
(373673873, 1021212234, '2018-02-08'),
(123456786, 1021212334, '2018-02-07'),
(123456781, 1176351563, '2018-02-08'),
(123456782, 1234453435, '2018-01-08'),
(123456783, 1334453434, '2018-02-08'),
(123456788, 2142154564, '2018-02-08'),
(123456789, 2147483647, '2018-02-08');

INSERT INTO diagnosztizal (betegseg_neve, vizsg_azon, datum)
VALUES
('Laz',1021212234, '2018-02-08'),
('Garatgyulladas', 1021212334, '2018-02-07'),
('Aranyer', 1176351563, '2018-02-08'),
('Sorelvonas', 1234453435, '2018-01-08'),
('Perskindol', 1334453434, '2018-02-08'),
('Sorelvonas', 2142154564, '2018-02-08'),
('Sorelvonas', 2147483647, '2018-02-08');

ALTER TABLE diagnosztizal
	ADD CONSTRAINT diagnosztizal_betegseg FOREIGN KEY (betegseg_neve) REFERENCES betegseg (betegseg_neve),
	ADD CONSTRAINT diagnosztizal_vizsgalat FOREIGN KEY (vizsg_azon) REFERENCES vizsgalat (vizsg_azon);

ALTER TABLE erzekeny
	ADD CONSTRAINT erzekeny_gyogyszer FOREIGN KEY (gyogyszer_neve) REFERENCES gyogyszer (gyogyszer_neve),
	ADD CONSTRAINT erzekeny_beteg FOREIGN KEY (taj) REFERENCES beteg (taj);

ALTER TABLE gyogyszert_felir
	ADD CONSTRAINT gyogyszert_felir_gyogyszer FOREIGN KEY (gyogyszer_neve) REFERENCES gyogyszer (gyogyszer_neve),
	ADD CONSTRAINT gyogyszert_felir_vizsgalat FOREIGN KEY (vizsg_azon) REFERENCES vizsgalat (vizsg_azon),
  ADD CONSTRAINT gyogyszert_felir_betegseg FOREIGN KEY (betegseg_neve) REFERENCES betegseg (betegseg_neve);

 ALTER TABLE latogat
	ADD CONSTRAINT latogat_vizsgalat FOREIGN KEY (vizsg_azon) REFERENCES vizsgalat (vizsg_azon),
	ADD CONSTRAINT erzekeny_beteg FOREIGN KEY (taj) REFERENCES beteg (taj);
