# instanceof Operator in Java

## What is instanceof?

`instanceof` is a Java operator used to check whether an object is an instance of a particular class, subclass, or interface.

It returns a boolean value (`true` or `false`).

---

## Why do we use instanceof?

It is commonly used before type casting to avoid `ClassCastException`.

---

## Syntax

```java
object instanceof ClassName
```

---

## Example

```java
class Animal {}

class Dog extends Animal {}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Dog();

        System.out.println(animal instanceof Dog);      // true
        System.out.println(animal instanceof Animal);   // true
    }
}
```

---

## Key Points

- Returns `true` or `false`
- Checks class, subclass, or interface
- Used before downcasting
- Helps prevent `ClassCastException`

---

## Advantages

- Safe type checking
- Prevents runtime casting errors
- Improves code readability

---

## When to Use

Use `instanceof` when:

- Performing downcasting
- Working with inheritance
- Checking implemented interfaces

---

## Conclusion

The `instanceof` operator is used to determine whether an object belongs to a specific class or interface. It provides safe type checking before casting and helps avoid runtime errors.
