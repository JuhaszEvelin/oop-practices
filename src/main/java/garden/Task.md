## 4. Kertész
Készítsünk programot a következő kertészeti szimulációhoz. Egy kertben különböző növényeket tartanak, amelyeket gondozni kell. A kertész három fajta anyag közül naponta csak egyet adhat az összes növénynek. Az anyagok fajtái: víz, tápoldat, műtrágya. A növények az egyes anyagokra eltérően reagálnak: sorvadnak; tűrik, ekkor nem nőnek; szeretik, ekkor nőnek. Egy növény kipusztulhat, ha sorvadás során a mérete nullára csökken, illetve túlburjánzásban is kipusztulhat, ha túl naggyá válik. A túlburjánzás határa növényfajtánként eltérő. Előfordul, hogy a kertész nem ad nekik tápanyagot, ekkor garantáltan sorvadnak eggyel. A konkrét kertben három fajta növényt termesztenek: kaktuszt, virágot ésbokrot, ezek jellemzői a következők:
* **Kaktusz:** Víz esetén a mérete eggyel csökken, tápoldat esetén eggyel nő, műtrágya esetén eggyel nő. A túlburjánzás határa 4.
* **Virág:** Víz esetén a mérete hárommal nő, tápoldat és műtrágya esetén eggyel csökken. A túlburjánzás határa 6.
* **Bokor:** Víz és műtrágya esetén a mérete eggyel nő, tápoldat esetén eggyel csökken. A túlburjánzás határa 10.

Készítsünk egy oneDayInTheGarden() metódust, melyet a mainben tudunk meghívni. A szimulációban az alábbi növények vegyenek részt (fajta, azonosító, kezdő tápanyagszint):
* Virág V102 3
* Bokor B223 4
* Kaktusz K15 2
* Kaktusz K18 1

A szimuláció 5 napig tart, és az alábbi tápanyagokat kapják a növények egységesen: víz, tápoldat, semmi, víz, műtrágya
