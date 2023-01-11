DROP TABLE IF EXISTS Tancol;
CREATE TABLE IF NOT EXISTS Tancol (
  nemzetiseg CHAR(200),
  tanc_neve CHAR(100),
  cd_sorszam INTEGER
);

DROP TABLE IF EXISTS Csoport;
CREATE TABLE IF NOT EXISTS Csoport (
  csoport_neve CHAR(100),
  nemzetiseg CHAR(200) PRIMARY KEY,
  pontszam INTEGER,
  atlag_eletkor INTEGER
);

DROP TABLE IF EXISTS Tanc;
CREATE TABLE IF NOT EXISTS Tanc (
  tanc_neve CHAR(100) PRIMARY KEY
);

DROP TABLE IF EXISTS Zene;
CREATE TABLE IF NOT EXISTS Zene (
  cd_sorszam INTEGER PRIMARY KEY,
  cim CHAR(100),
  mufaj CHAR(200),
  eloado CHAR(200)
);

INSERT INTO csoport (csoport_neve,nemzetiseg,pontszam,atlag_eletkor)
VALUES
('Guys with Kids', 'USA', 120, 20),
('A fentiek', 'szlovák', 2, 21),
('Jó Barát', 'lengyel', 213, 30),
('Rabló Pandúrok', 'magyar', 233, 21),
('Sógorok', 'osztrák', 222, 31),
('Szomszédok', 'román', 1, 18),
('Total Success', 'francia', 110, 66);

INSERT INTO tanc (tanc_neve)
VALUES
('Balett'),
('Capoeira'),
('Kortárstánc'),
('Pogo'),
('Salsa'),
('Tangó'),
('Zumba');

INSERT INTO tancol (nemzetiseg, tanc_neve, cd_sorszam)
VALUES
('magyar', 'Balett', 1),
('USA', 'Capoeira', 2),
('francia', 'Kortárstánc', 3),
('román', 'Pogo', 4),
('szlovák', 'Salsa', 5),
('lengyel', 'Tangó', 6),
('osztrák', 'Zumba', 7);

INSERT INTO zene (cd_sorszam,cim,mufaj,eloado)
VALUES
(1,'16 tonna', 'pop', 'Republic'),
(2,'Gangnam Sytle', 'pop', 'PSY'),
(3,'Highway to Hell', 'rock', 'ACDC'),
(4,'Tinglitangli', 'minimal', 'Lady Luck'),
(5,'Pokol tanca', 'rock', 'John All Stars'),
(6,'Gyite', 'techno', 'Paul Kalkbrenner'),
(7,'Tabletta', 'pop', 'NERVO');

ALTER TABLE tancol
  ADD CONSTRAINT tancol_zene FOREIGN KEY (cd_sorszam) REFERENCES zene ( cd_sorszam ),
  ADD CONSTRAINT tancol_csoport FOREIGN KEY (nemzetiseg) REFERENCES csoport ( nemzetiseg ),
  ADD CONSTRAINT tancol_tanc FOREIGN KEY (tanc_neve) REFERENCES tanc ( tanc_neve );
