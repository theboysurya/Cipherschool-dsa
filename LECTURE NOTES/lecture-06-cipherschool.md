# Instantiation in Java
Instantiation in Java refers to the process of creating an instance or object of a class by calling its constructor. This process allocates the initial memory for the object and returns a reference to it. Instantiation provides the blueprint for creating objects of the class.

## Syntax for Instantiation:

```
ClassName objName = new ClassName();  
// or
ClassName cn;  
cn = new ClassName();  
```
## Ways to Create Instances:

1. Using the `new` Keyword
2. Using Static Factory Method
## Heap and Stack Memory
### Stack Memory
**Definition:** Stack memory is a physical space in RAM allocated to each thread at runtime.\
**Characteristics:**
- Created when a thread is created.
- Memory management follows LIFO (Last-In-First-Out) order.
- Stores variables, references to objects, and partial results.
- Memory allocated to the stack is freed when the function returns.

**Example:**
```
int x = 5; // x is stored in stack memory
```
### Heap Memory
**Definition:** Heap memory is created when the JVM starts up and is used by the application for its entire runtime.\
**Characteristics:**
- Stores objects and JRE classes.
- Memory is dynamically allocated and deallocated.
- Does not follow any specific order.
- References to objects in the heap are stored in stack memory.

**Example:**

```
String str = new String("Hello"); // "Hello" is stored in heap memory, reference in stack
```
## Garbage Collection
**Definition:** Garbage collection is the process by which Java programs perform automatic memory management.\
**Function:** The JVM runs the garbage collector to identify and delete objects that are no longer needed, freeing up memory.\
**How It Works:**
Java programs compile to bytecode that runs on the JVM.
Objects are created on the heap.
The garbage collector finds unused objects and deletes them to free up memory.
## Summary
In Java, instantiation is the process of creating objects using constructors, with memory allocation managed through stack and heap memory. Stack memory is used for storing variables and references, following a LIFO order, while heap memory is used for storing objects. Garbage collection automatically manages memory by freeing up space occupied by objects that are no longer in use.