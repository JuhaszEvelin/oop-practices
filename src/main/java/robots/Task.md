**Ipari robotok**

Készítsünk programot, amellyel szimulálni tudjuk ipari robotok működését. A robotok egy raktárban dolgoznak, és a feladatuk áruk helyrevitele. A robotok árammal működnek, minden nap elején adott mennyiséggel tölthetik fel az akkumulátoraikat. Ennek során az akkumulátor töltési szintje nő, de a maximális töltési kapacitást nem haladhatja meg. A feltöltés után kezdik meg az áruk szállítását, ennek során az akkumulátor töltése csökken. A robotok sorban veszik fel az árukat. Minden robot annyi árut vesz fel, amennyi a tényleges szállítási kapacitásának és a még szállításra váró áruk mennyiségének a minimuma. Az egyes robotok tényleges szállítási kapacitása nem haladhatja meg a maximális értéket, de a lehető legnagyobb olyan érték, hogy a szállítás után az akkumulátor töltési szintje nem lehet negatív. Egy robot egy nap csak egyszer vesz fel árut. Ha egy adott nap a robotok nem tudják az összes beérkezett árut helyre vinni, akkor a maradék a következő napra marad.

A munkában háromféle robot vesz részt:

    • Mac: Maximális töltési szintje 10, maximális szállítási kapacitása 10 egység, egy egység szállítása eggyel csökkenti a töltési szintet.
    • Eco: Maximális töltési szintje 4, maximális szállítási kapacitása 6, két egység szállítása eggyel csökkenti a töltési szintet. (Páratlan egység szállításakor a pár nélkül maradó egység is eggyel csökkent, azaz 5 egység esetén 3 lenne a fogyasztás.) 
    • Pro: Maximális töltési szintje 12, maximális szállítási kapacitása 8. Egy egység szállítása 5 egységig eggyel csökkenti a töltési szintet, az 5 feletti egységek kettővel (Pl. 7 egység esetén 5+4=9 a fogyasztás.) 

A szimuláció 4 napig tart. Minden nap rátöltünk a robotokra a lentiek szerint:
• 1. nap
◦ töltés mennyisége: 3
◦ Beérkezett áruk mennyisége: 20
• 2. nap
◦ töltés mennyisége: 2
◦ Beérkezett áruk mennyisége: 32
• 3. nap
◦ töltés mennyisége: 5
◦ Beérkezett áruk mennyisége: 20
• 4. nap
◦ töltés mennyisége: 3
◦ Beérkezett áruk mennyisége: 16

A szimulációban résztvevő robotok:

    • R2, egy Mac típusú robot 4 egység alap töltöttséggel
    • 3CPO, egy Eco típusú robot 3 egység alap töltöttségi szinttel
    • BB8, egy Pro típusú robot 10 egység alap töltöttséggel
    • E12, egy Eco típus, 4 egység alap töltöttséggel

Ezt írjátok át úgy, hogy a szimuláció configurációját egy txt fájlból szedje ki a programotok, és a végeredményt egy másik txt fájlba írjátok ki.

Kb így nézzen ki (a példa a második link utolsó feladatát tartalmazza - Ipari robotok). Ha plusz paramétert kell a feladat miatt hozzáadni bármelyikhez, tegyétek hozzá nyugodtan.

<szimuláció napjai>
<első robot neve> <robot típusa rövidítve> <alap töltöttség>
<második robot neve> <robot típusa rövidítve> <alap töltöttség>
Pl:
4
R2 M 4
3CPO E 3

