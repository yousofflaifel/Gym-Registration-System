# Gym Registration System

A Java console-based Gym Registration System developed to demonstrate practical use of data structures, algorithms, Abstract Data Types (ADTs), Object-Oriented Programming concepts, and algorithm complexity analysis.

The system uses a **FIFO Queue implemented with a singly linked list** for member registration and removal, and **Quick Sort** to display registered members in ascending order of age.

## Small Project Description

**A Java-based Gym Registration System that uses a linked-list FIFO queue for member registration and Quick Sort to organize members by age.**

## Project Overview

The application provides a simple menu-driven interface for managing gym members.

The main operations are:

1. Register a new member.
2. Remove the first registered member.
3. Display registered members sorted by age.
4. Exit the application.

The project was developed as part of a university Data Structures and Algorithms assignment.

## Technologies Used

- Java
- Object-Oriented Programming
- Singly Linked Lists
- FIFO Queue
- Abstract Data Types (ADT)
- Quick Sort
- Recursion
- Big O Notation
- Asymptotic Analysis
- Exception Handling
- Eclipse IDE project configuration

## Main Data Structures

### FIFO Queue

The registration system uses a FIFO (First In, First Out) queue.

A member who registers first is the first member removed from the registration queue.

For example:

```text
Sarah -> Ahmad -> Ayah -> Ali
  ↑                    ↑
 Head                 Tail
```

If a member is removed, Sarah is removed first.

The queue is implemented using a **singly linked list**.

### Queue Components

Each queue consists of:

- `Node`
- `Member`
- `head`
- `tail`

The queue provides the following operations:

```text
enqueue()
dequeue()
isEmpty()
getMembers()
```

### Enqueue

Adds a new member to the rear of the queue.

The queue maintains a reference to the tail, allowing a new member to be added without traversing the entire linked list.

**Time Complexity:**

```text
O(1)
```

### Dequeue

Removes the member at the front of the queue.

The head reference is moved to the next node.

**Time Complexity:**

```text
O(1)
```

### IsEmpty

Checks whether the queue contains any members.

```text
head == null && tail == null
```

### Get Members

`getMembers()` traverses the linked list and copies the registered members into an array.

This array is then used by Quick Sort.

**Time Complexity:**

```text
O(n)
```

## Member Class

The `Member` class represents a gym member.

Each member contains:

```text
Name
Age
Phone Number
```

The class also overrides `toString()` to provide a readable representation of member information when displayed in the console.

## Quick Sort

Quick Sort is used when the user chooses:

```text
3. Print registered members (sorted)
```

The algorithm sorts the members by **age in ascending order**.

The implementation uses the **last element as the pivot**.

For example:

```text
[21, 24, 19, 22, 18, 20]
```

After Quick Sort:

```text
[18, 19, 20, 21, 22, 24]
```

The corresponding members are then displayed in ascending order of age.

### Quick Sort Process

The algorithm:

1. Selects the last element as the pivot.
2. Partitions the array around the pivot.
3. Places the pivot in its correct position.
4. Recursively sorts the left partition.
5. Recursively sorts the right partition.
6. Continues until the array is sorted.

### Time Complexity

Best case:

```text
O(n log n)
```

Worst case:

```text
O(n²)
```

The worst case can occur when the chosen pivot creates highly unbalanced partitions.

Because this implementation always selects the last element as the pivot, already sorted or reverse-sorted input can lead to the worst-case behavior.

## Object-Oriented Programming Concepts

The project also demonstrates several OOP concepts.

### Encapsulation

The queue manages its internal data through operations such as:

```text
enqueue()
dequeue()
isEmpty()
```

The main program does not need to manually manipulate the linked-list nodes.

### Abstraction

The queue provides operations that describe what the data structure can do without requiring the user of the queue to understand all of its internal implementation details.

### Inheritance

The project report discusses how inheritance can support ADTs by allowing related classes to reuse common attributes and behavior.

### Polymorphism

The project discusses how different implementations can provide the same abstract queue operations through a common interface.

## Error Handling

The application handles the case where a user attempts to remove a member from an empty queue.

When `dequeue()` is called while the queue is empty, the program raises an error indicating:

```text
Queue is empty
```

The main program catches this error and displays an appropriate message to the user.

## Testing

The queue implementation was tested using multiple scenarios.

### Dequeue Tests

The system checks:

- Dequeue from an empty queue.
- Dequeue when multiple members exist.

Expected behavior:

```text
Empty queue -> Error
Non-empty queue -> First registered member removed
```

### Enqueue Tests

The system checks:

- Adding a member to an empty queue.
- Adding a member when other members already exist.

Expected behavior:

```text
Empty queue -> New member becomes head and tail
Existing queue -> New member is added at the rear
```

These tests verify that the FIFO behavior is maintained.

## Complexity Summary

| Operation | Time Complexity |
|---|---:|
| `enqueue()` | O(1) |
| `dequeue()` | O(1) |
| `isEmpty()` | O(1) |
| `getMembers()` | O(n) |
| Quick Sort - Best Case | O(n log n) |
| Quick Sort - Worst Case | O(n²) |

## How to Run

### Requirements

You need:

- Java Development Kit (JDK)
- A Java-compatible IDE such as Eclipse, IntelliJ IDEA, or VS Code with Java support

### Running with Eclipse

1. Open Eclipse.
2. Import the project as an existing Eclipse project.
3. Open the `GymRegistrationSystem.java` file.
4. Run the `main()` method.
5. Use the console menu to interact with the system.

### Running from the Command Line

Navigate to the directory containing the Java source files and compile them:

```bash
javac code/*.java
```

Then run:

```bash
java code.GymRegistrationSystem
```

## Using the Application

When the application starts, the following menu is displayed:

```text
*** Gym Registration System ***

1. Register new member
2. Remove registered member
3. Print registered members (sorted)
4. Exit
```

### Register a Member

Select:

```text
1
```

Enter:

```text
Member name
Member age
Member phone number
```

The member is added to the rear of the queue.

### Remove a Member

Select:

```text
2
```

The first registered member is removed according to the FIFO principle.

If the queue is empty, an error message is displayed.

### Display Sorted Members

Select:

```text
3
```

The current queue members are copied into an array and sorted by age using Quick Sort.

### Exit

Select:

```text
4
```

The application terminates.

## Design Decisions

### Why a Linked List?

The number of gym members cannot necessarily be known in advance.

A linked-list queue can grow dynamically as new members are registered without requiring a fixed initial capacity.

The trade-off is that each node requires an additional reference to the next node.

### Why Maintain Both Head and Tail?

Maintaining both references allows:

- Adding at the rear in O(1).
- Removing from the front in O(1).

Without a tail reference, adding a new member would require traversing the linked list to find the last node.

### Why Quick Sort?

Quick Sort was selected to demonstrate an efficient comparison-based sorting algorithm and to analyze how pivot selection affects algorithm performance.

## Academic Concepts Demonstrated

This project demonstrates practical understanding of:

- Data Structures
- Algorithms
- FIFO Queues
- Singly Linked Lists
- Nodes
- Abstract Data Types
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- Recursion
- Quick Sort
- Partitioning
- Time Complexity
- Big O Notation
- Asymptotic Analysis
- Runtime Error Handling
- Testing

## Limitations

This is a console-based academic project rather than a production gym management system.

It currently does not include:

- Database storage
- User authentication
- Graphical User Interface
- Persistent member records
- Membership payments
- Membership plans
- Attendance tracking
- Advanced member search
- Editing existing member information

Member data exists only while the program is running.

## Future Improvements

Possible improvements include:

- Adding a graphical user interface.
- Connecting the system to a database.
- Adding persistent member storage.
- Adding member search functionality.
- Adding member update and deletion features.
- Adding membership plans and payment tracking.
- Adding attendance management.
- Improving input validation.
- Using a more robust exception type for invalid queue operations.
- Improving Quick Sort pivot selection to reduce the probability of worst-case behavior.

## Learning Outcomes

This project provided practical experience with:

- Implementing data structures from scratch.
- Understanding how linked lists work internally.
- Implementing a FIFO queue.
- Maintaining O(1) enqueue and dequeue operations.
- Implementing Quick Sort recursively.
- Performing partition operations.
- Analyzing best-case and worst-case complexity.
- Applying Big O notation.
- Understanding ADTs.
- Applying OOP principles to data structures.
- Handling runtime errors.
- Testing data structure operations.

## Author

**Yousof Flaifel**

Data Science & AI Student  
Al Hussein Technical University (HTU)

---

University Data Structures and Algorithms Project
