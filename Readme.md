# Snake and Ladders - LLD

## Class Diagram

```
                +------------------+
                |      Game        |
                +------------------+
                | Board board      |
                | Queue<Player>    |
                | Dice dice        |
                +------------------+
                | start()          |
                +--------+---------+
                         |
                         v

                +------------------+
                |      Board       |
                +------------------+
                | int size         |
                | Map snakes       |
                | Map ladders      |
                +------------------+
                | getNewPosition() |
                +--------+---------+
                         |
         -------------------------------
         |                             |

 +------------------+        +------------------+
 |      Snake       |        |     Ladder       |
 +------------------+        +------------------+
 | head             |        | start            |
 | tail             |        | end              |
 +------------------+        +------------------+

                +------------------+
                |     Player       |
                +------------------+
                | id               |
                | position         |
                +------------------+

                +------------------+
                |      Dice        |
                +------------------+
                | roll()           |
                +------------------+
```

---

## Features

* NxN board
* n snakes and n ladders
* Multiplayer support
* Dice-based movement
* Snake & Ladder transitions

---

## How to Run

```
javac game/*.java Main.java
java Main
```

---

## Notes

* Uses Queue for turn-based simulation
* Snakes and ladders stored using HashMap for O(1) lookup
* No move if exceeds board limit

```
```
