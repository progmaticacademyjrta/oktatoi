/*
11. Készítsünk lekérdezést, ami visszaadja az összes versenyen részt vevő csapat nevét és pontszamat.
Rendezzük pontszám szerint csökkenő sorrendbe.*/
SELECT csoport_neve, pontszam FROM csoport ORDER BY pontszam DESC;
/*
12. Készítsünk lekérdezést, ami visszaadja a verseny győztesét (csoport neve) és pontszámát.
*/
SELECT csoport_neve,pontszam FROM csoport ORDER BY pontszam DESC LIMIT 1;
/*
13. Készítsünk lekérdezést, ami azokat a gyengécske csapatokat adja vissza,
akik kevesebb mint 100 pontot értek el.
*/
SELECT * FROM csoport WHERE pontszam < 100;

/*
14. Készítsünk lekérdezést, ami azokat a gyengécske csapatokat adja vissza, akik 100 és 200 közötti pontot értek el.
*/
SELECT * FROM csoport WHERE pontszam BETWEEN 100 and 200;
-- VAGY
SELECT csoport_neve FROM csoport WHERE pontszam >= 100 and pontszam <= 200;
/*
17. Készítsünk statisztikát (hány csapat indult a versenyen illetve mennyi volt az átlagos pontszám idén)
*/
SELECT COUNT(*) FROM csoport;
-- VAGY
SELECT COUNT(csoport_neve) FROM csoport;
SELECT AVG(pontszam) FROM csoport;
-- V2
SELECT AVG(pontszam) AS "Átlagos összpontszám"  FROM csoport;

/*
18. Készítsünk lekérdezést ami visszaadja a verseny győztesét (csoport neve), pontszámát,előadott tánc nevét.
(+1 a pontszámot "Elért pontszám" ideiglenes névvel lássuk el)
*/
SELECT csoport_neve, pontszam AS "Elért pontszám", tanc_neve
FROM csoport,tanc
ORDER BY pontszam DESC
lIMIT 1;

SELECT csoport.csoport_neve,csoport.pontszam AS "Elért pontszám",tancol.tanc_neve
from csoport
INNER JOIN tancol on csoport.nemzetiseg=tancol.nemzetiseg
ORDER BY pontszam DESC LIMIT 1;
