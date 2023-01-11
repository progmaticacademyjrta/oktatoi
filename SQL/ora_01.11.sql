SELECT csoport_neve FROM csoport;
SELECT * from csoport;
SELECT * FROM csoport WHERE atlag_eletkor > 60;
SELECT * FROM csoport WHERE atlag_eletkor > 30 AND pontszam >  200 ;

SELECT * from csoport ORDER BY atlag_eletkor DESC;
SELECT * from csoport ORDER BY csoport_neve, atlag_eletkor DESC;

SELECT * from csoport LIMIT 2;

SELECT csoport_neve, nemzetiseg, pontszam, atlag_eletkor FROM csoport WHERE atlag_eletkor > 18 ORDER BY csoport_neve;

SELECT COUNT(nemzetiseg) FROM csoport;
SELECT COUNT(nemzetiseg) FROM csoport WHERE atlag_eletkor > 18;

SELECT MAX(atlag_eletkor) FROM csoport;

SELECT COUNT(csoport_neve) FROM csoport GROUP BY atlag_eletkor;
SELECT COUNT(csoport_neve),atlag_eletkor FROM csoport GROUP BY atlag_eletkor;
SELECT COUNT(csoport_neve),atlag_eletkor FROM csoport GROUP BY atlag_eletkor HAVING atlag_eletkor > 18;

SELECT csoport_neve AS "Csoport Név", pontszam AS "Pontszám" FROM csoport ORDER BY pontszam DESC;

SELECT MAX(pontszam) FROM csoport;
