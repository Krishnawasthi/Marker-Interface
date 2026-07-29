# Cloneable Interface in Java

## What is Cloneable?

`Cloneable` is a **marker interface** in Java. It belongs to the `java.lang` package and does not contain any methods.

It tells the JVM that the object of a class can be cloned using the `clone()` method.

---

## Why do we use Cloneable?

Without implementing `Cloneable`, calling the `clone()` method throws a `CloneNotSupportedException`.

Implementing this interface indicates that object copying is allowed.

---

## Key Points

- Marker interface (contains no methods)
- Present in `java.lang` package
- Used with the `clone()` method
- Creates a copy of an existing object
- Prevents `CloneNotSupportedException`

---

## Syntax

```java
class Student implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```

---

## Advantages

- Easy object copying
- Faster than manually copying each field
- Useful when creating duplicate objects

---

## Disadvantages

- Supports only shallow copy by default
- `clone()` method has several design limitations
- Often replaced by copy constructors or factory methods in modern Java

---

## Conclusion

`Cloneable` is a marker interface that allows an object to be cloned using the `clone()` method. It is mainly used for object copying and enables Java's cloning mechanism.
