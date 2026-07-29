# Serializable Interface in Java

<img width="1076" height="380" alt="image" src="https://github.com/user-attachments/assets/c3db2612-aae9-4f4d-a599-487042201a1b" />


## What is Serializable?

`Serializable` is a **marker interface** in Java. It belongs to the `java.io` package and allows an object to be converted into a byte stream.

This process is called **Serialization**.

---

## Why do we use Serializable?

Serialization is used to:

- Save objects into a file
- Transfer objects over a network
- Store objects in databases or caches
- Preserve object state

---

## Key Points

- Marker interface
- Present in `java.io` package
- Contains no methods
- Enables serialization and deserialization
- Used with `ObjectOutputStream` and `ObjectInputStream`

---

## Syntax

```java
import java.io.Serializable;

class Employee implements Serializable {

    private int id;
    private String name;
}
```

---

## Serialization

Converting an object into a byte stream.

---

## Deserialization

Converting a byte stream back into an object.

---

## Advantages

- Easy object persistence
- Supports network communication
- Helps save object state

---

## Conclusion

`Serializable` is a marker interface that allows Java objects to be converted into a byte stream so they can be stored or transmitted and later reconstructed.
