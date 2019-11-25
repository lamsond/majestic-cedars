# Unit 4: Writing Classes

## 4.1 Anatomy of a Class

### 4.1.1 Designing a Class

### 4.1.2 The Four Sections of a Class

## 4.2 Attributes

### 4.2.1 Attributes vs. Local Variables

**Attributes** are variables that are declared at the top of a *class*. They are **not** declared inside of a *method*. They are accessible everywhere throughout the class.

**Local Variables** are declared inside of a *method*. They belong to the method and are *not* accessible outside of that method.

```
public class Pacman{
    int x = 3;
    
    public void move(){
        int speed = 2;
        x += speed;
    }
}
```

In the code above `x`, is an *attribute* of the `Pacman` class. Since `speed` is declared inside of a method, it is a *local variable* of the `move()` method.

### 4.2.2 Instance vs. Static Attributes

Some attributes will be common to all members of a class, while others will be unique. For example, consider the four ghosts in Pacman.


| attribute | pinky | inky | blinky | cylde |
| --------- | ----- | ---- |------- | ----- |
| color | pink | cyan | red | orange |
| size | 50px | 50px | 50px | 50px |
| speed | 5 | 10 | 5 | 8 |
| (x, y) | (100, 100)| (45, 123) | (232, 101) | (23, 200) |


### 4.2.3 Public vs. Private Attributes

## 4.3 Methods

### 4.3.1 Constructor Methods