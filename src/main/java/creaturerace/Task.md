##  Lények versenye
Egy többnapos versenyen lények vesznek részt. A versenyt az a lény nyeri, akiéletben marad, és a legnagyobb távolságot teszi meg. Kezdetben minden lényvalamennyi vízzel rendelkezik, és a megtett távolság 0. A verseny során háromfélenap lehetséges: napos, felhős és esős. Ezekre a különböző fajtájú lények eltérőmódon reagálnak vízfogyasztás és haladás szempontjából. Minden lény először arendelkezésére álló víz mennyiségét változtatja meg, ezután ha tud, mozog. Bármelylény elpusztul, ha a vize elfogy (0 lesz az érték), ezután értelemszerűen semmilyen tevékenységre sem képes.

Minden lény jellemzői: az egyedi neve, a rendelkezésre álló víz mennyisége, amaximálisan tárolható víz mennyisége, hogy él-e, illetve az eddig megtett távolság. A versenyen részt vevő lények fajtái a következők: homokjáró, szivacs, lépegető.

A következő táblázat tartalmazza az egyes fajták jellemzőit.
| Fajta     | Víz változás          | Távolság              | Max. víz |
| :-------: | :-------------------: | :-------------------: | :------: |
|           | napos / felhős / esős | napos / felhős / esős |          |
| homokjáró |   -1  /   0    /  3   |   3   /   1    /  0   |     8    |
|  szivacs  |   -4  /  -1    /  6   |   0   /   1    /  3   |    20    |
| lépegető  |   -2  /  -1    /  3   |   1   /   2    /  1   |    12    |

Az egyes lények a vízkészlet megváltoztatása során nem léphetik túl a fajtára jellemző maximális értéket, legfeljebb azt érhetik el. Valósítsuk meg a versenyt megnyerő lényt megadó programot. Az időjárás az alábbiak szerint alakuljon – ahol n = napos, f = felhős és e = esős: nffeeennf

A versenyzők a következők legyenek:
* **Vandor a homokjáró**, 4 egység kezdeti vízzel
* **Seta a lépegető**, 7 egység vizet vitt magával
* **Csuszo a szivacs**, 12 egység vitt magával
* **Siklo a szivacs**, 10 egyszég vizet vitt magával.

Bónusz feladat: Az időjárás változzon random módon napról napra, és minden lény a fajtájának megfelelő lehetőségeken belül random vízmennyiséget vigyen magával, de minimum 3 egységet.