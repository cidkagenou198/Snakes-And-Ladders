# Snakes and Ladders - LLD

## Features

* NxN board
* n snakes and n ladders
* Multiplayer support
* Dice-based movement
* Snake & Ladder transitions

---

## How to Run

### Step 1: Compile the code

```
javac game/*.java Main.java
```

### Step 2: Run the program

```
java Main
```

---

## Inputs

When you run the program, enter:

* `n` → size of board (n x n)
* `number of players`
* `difficulty` → easy / hard

### Example:

```
Enter n: 10
Enter number of players: 2
Enter difficulty (easy/hard): easy
```

---

## Notes

* Uses Queue for turn-based simulation
* Snakes and ladders stored using HashMap for O(1) lookup
* No move if exceeds board limit
* Players take turns sequentially
