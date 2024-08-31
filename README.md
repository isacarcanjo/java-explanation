
# What's Java ?

It's a high-level language object-oriented programming language that was made at 1995 by Sun Microsystems.
It designed wil be platform-independent that means, It can runs on any device using JVM (Java Virtual Machine).


Some concepts related to Java:

## Object-Oriented programming (OOP):
Java follows the principles of OOP it uses objects and classes as the primary means to structure and organize the code.

## Platform Independence:
Java can runs anywhere, because is compiled to bytecode, using the JVM, that's you can run any device.

## Memory Management:
Java has a automatic memory management using the garbage collector. allocating and deallocating the memory.

## Concurrency:
Java has a support for multithreading, allowing developers to build programs with multiples tasks simultaneously.



## Syntax

### Variables
You can declare two ways of java variable.

```
Type variableName = value;
var variableName = value;
```
One time defined the type. you never can change the type defined before.
```
String name = "Isac";
name = 10; // Error

var name = "Jose";
name = 10; // Error
```

### Types
There are 8 primitives types,

### Numerics

```
byte, short, int, long
```

Only thing that change, it's the size. Each type can storage more than other.

### Boolean
```
boolean isOkay = true;
```

### Char
Can storage only one letter.
```
char letter = "A";
char letter = "AB"; // Error

If you want to storage a string, you can use the classe String.

String name = "ABC"
```

### Float point
Both storage numbers after the comma, but double is more accurate.
```
double age = 20.5;
float age2 = 20.5F; // aways with 'F' in the final.
```

## Conditionals
Equal as any language.

```
if () {
} else if () {
} else {
}
```

## Array

### Defined size
```
int[] idades = new int[10]; 
String[] names = new String[10];
boolean[] areOk = new boolean[10];

idades.length // Size
Or

boolean[] areOk = {true, false, true};


```

### Dynamic
```
Example:
ArrayList<type> name = new ArrayList<type>();

ArrayList<Integer> idades = new ArrayList<Integer>();
idades.add(10);
idades.remove(0);
idades.get(0);
idades.size();
```

## Loops

### For
```
int idade = 10;
for (var i = 0; i < idade; i++) {
    
}
```

### While
```
int idade = 10;
int i = 0;
while (i < idade) {
   i++;
}
```

## Casting (Convert types)

### Implicit (inplicite)
```
int idade = 10;
double idade2 = idade; // correct

idade = idade2; // wrong, because the size
```

### Explicit (èxplicite)
```
int idade = 10;
double idade2 = idade;

idade = (int) idade2; // correct

// Strings

char letra = 'a';
String nome = String.valueOf(letra); // 'a' String
letra = nome.charAt(0); // 'a' char
String nome = String.valueOf(idade);
idade2 = Integer.parseInt(nome);

```


## JDK (Java Development Kit):

It's java dev kit, where contains all necessary tools to build e compile java programs.
Also it has JRE and compiler 'javac' and debugger 'jdb' and some tools to compile the code.


## JVM (Java Virtual Machine)
It's a virtual machine that's executes bytecode by java compiler.
It's responsible to convert bytecode and machine code to specific operating system.
JVM has memory and threads management and garbage collection.


## JRE (Java Runtime Environment)
It's an java execution environment, that's there is a JVM and default libraries to run java programs.
There is none development tools, only runs already compiled programs.

**JDK** has **JRE**, and the **JRE** has **JVM**.

# Questions ?

### Can you mention the main classes implementing the list interface ?

There are 4:

**ArrayList**: It's array resizable, it's very good to read operations.<br/>
**LinkedList**: Doubly linked list, it is efficient in insertion and removal operations.<br/>
**Vector**: It's like ArrayList, but it's synchronized safe to use in multi-threaded.<br/>
**Stack**: It's Vector subclass that implements a stack (LIFO - Last In, First Out).

### What is the difference between systems.out, System.err, and System.in?
**System.out**: Show the return on the console output.<br/>
**System.err**: Show the return error message on the error console output.<br/>
**System.in**: It's used to get the keyboard input.
```
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
```

### Syntax on how to create a linked list and a vector in Java?
```
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Element 1");

Vector<Integer> vector = new Vector<>();
vector.add(1);
```

### How it works clone ?
The method clone in java does the object superficial (superfixial) copy,
it means that make a new object instance, but if the object has another objects in this one, they change.

### Exceptions types in java ?
There are 2 types, **Checked** and **Unchecked**.

**Checked**: Are the ones we have to deal with try and catch.<br/>
IOException: Thrown when an I/O error occurs, such as failure to read or write to a file.<br/>
SQLException: Thrown to indicate an error related to database operations.<br/>
ClassNotFoundException: Thrown when an application tries to load a class at runtime and cannot find it.<br/>
FileNotFoundException: Thrown when trying to access a file that does not exist.

**Unchecked**: Are the ones we have not to deal. Happen at execution time.
<br/>**NullPointerException**, **ArrayIndexOutOfBoundsException**, etc

### Difference between finally and finalize ?

**finally**: Use to in the try catch block, when is called to close connections and release resources.
**finalize**: It's a method use in the object, Called by garbage collector, before to destroy the object.
The proposal of this method was to clean resources before the garbage destroy.


### Garbage collection can occur in the permanent generation space in JVM ?
**Garbage Collection (GC)**: It's a process where JVM restore the free memory that is not more used by objects.
**Permanent Generation (PermGen) Space**: It was a JVM memory space in the **heap** that used to store classes metadata, but after Java 8 changed to Metaspace.
Before java 8 the Garbage collector has been worked until the memory runs out.
Generating **OutOfMemoryError** error.
**Metaspace**: From Java 8 metaspace has been managed out of heap.

### What's heap ?
Heap is a java area where memory is allocated by JVM. to use dynamic memory.

### Could you explain the life cycle of uh let's say of an applet ?
Applet it's a small java application that you can put on the web page and will be runs by browser.
It has 4 methods, **init()**, **start()**, **stop()**, **destroy()**.

### What are the layers okay of a RMI (Remote Method Invocation) active ?
RMI it's a tool that you can call remote object methods. You have 3 layers.<br/>

**Stub (Ponteiro Local) and Skeleton Layer (Esqueleto - Obsoleto no Java 2)** <br/>
It works as local proxy to object remote. Skeleton is deprecated.<br/>
**Remote Reference Layer**: Manage references and calls to remote objects.<br/>
**Transport Layer**: Make a manage the communication between client and server. Using TCP/IP.

### What is DGC ?
**DGC (Distributed Garbage Collection)**: It's a tool manage memory has been used in distributed systems' context. Like the RMI.

### How can i synchronize two process in Java?

**Threads Synchronization**: Use **synchronized**, **ReentrantLock**, **Semaphore**, or **CountDownLatch** to synchronize threads inside one process.<br/>
**Independents synchronization Process**: Use lock files, sockets, RMI or libraries to synchronize.

### What's the trade-off between using an unordered array and using a ordered array?

**Unordered Array**: Prefer it if you need fast insertions and search/remove is not a common operation.<br/>
**Ordered Array**: Prefer it if fast searching is a priority and you are willing to pay the price for slower insertions and removals.

### Can you explain marshalling and unmarshalling?
**Marshalling**: It's a process that transform object and easy data structure to send end storage, ex JSON, XML.
**Unmarshalling**: It's the reverse process.

### When we use Linked List over an ArrayList in Java ?
**ArrayList**: use when you need to fast index access and use more read than insert and remove.
**LinkedList**: Use when you need insert and remove frequently, it's common use to queue (kiu) or stack.

### Why is a string length accurate?
The length of a string in Java is precise because strings are immutable, the length is stored internally, 
and the length() method directly returns the number of char elements, ensuring efficiency and consistency.