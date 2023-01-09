drop TABLE IF EXISTS progmatic;
CREATE TABLE if not EXISTS progmatic(
  tanfolyam_neve VARCHAR PRIMARY KEY,
  letszam INTEGER
);
ALTER TABLE progmatic
ADD datum DATE;

INSERT INTO progmatic (tanfolyam_neve, letszam, datum)
VALUES
('Jr. Tesztautomatizáló esti',21,'2022-10-09'),
('Jr. Front-end fejlesztő esti',21,'2022-10-09');

UPDATE progmatic
SET letszam=31
WHERE tanfolyam_neve='Jr. Tesztautomatizáló esti';

DELETE FROM progmatic
WHERE tanfolyam_neve='Jr. Front-end fejlesztő esti';
