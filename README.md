# Java-Collections-Framework

ArrayList

Iterator

Stack

Queue and LinkedList

PriorityQueue

ArrayDeque

HashSet

LinkedHashSet

TreeSet

Sets of Custom Classes (hashCode and equals)

HashMap

TreeMap

Classes: Arrays Class & Collections Class

Sorting Custom Collections

Collection Interface: Comparable Interface & Comparator Interface

# Here's a structured overview of the Java Collections Framework, focusing on each category and component:

### *1. List*

The List interface represents an ordered collection where elements can be accessed by their index.

#### *ArrayList*
- *Description*: Implements the List interface with a dynamically resizable array.
- *Characteristics*: Fast random access and efficient for frequent retrieval operations.
- *Key Methods*: add(), remove(), get(), set(), size()

#### *LinkedList*
- *Description*: Implements both List and Queue interfaces using a doubly-linked list.
- *Characteristics*: Good performance for insertions and deletions, especially at the beginning or end of the list.
- *Key Methods*: add(), remove(), get(), addFirst(), addLast(), removeFirst(), removeLast()

#### *Stack*
- *Description*: Extends Vector to implement a last-in, first-out (LIFO) stack of objects.
- *Characteristics*: Provides methods for stack operations.
- *Key Methods*: push(), pop(), peek(), empty()

### *2. Set*

The Set interface represents a collection that does not allow duplicate elements.

#### *HashSet*
- *Description*: Implements Set using a hash table.
- *Characteristics*: Does not guarantee any specific order. Provides constant-time performance for basic operations.
- *Key Methods*: add(), remove(), contains(), size()

#### *LinkedHashSet*
- *Description*: Extends HashSet and maintains insertion order using a linked list.
- *Characteristics*: Guarantees predictable iteration order.
- *Key Methods*: add(), remove(), contains(), size()

#### *TreeSet*
- *Description*: Implements SortedSet using a red-black tree.
- *Characteristics*: Stores elements in a sorted order based on their natural ordering or a specified comparator.
- *Key Methods*: add(), remove(), first(), last(), ceiling(), floor()

### *3. Queue*

The Queue interface represents a collection designed for holding elements prior to processing.

#### *ArrayDeque*
- *Description*: Implements a double-ended queue using a resizable array.
- *Characteristics*: Provides efficient methods for adding and removing elements from both ends.
- *Key Methods*: addFirst(), addLast(), removeFirst(), removeLast(), peekFirst(), peekLast()

#### *LinkedList*
- *Description*: Also implements the Queue interface, in addition to List.
- *Characteristics*: Suitable for queue operations (FIFO) with efficient insertion and removal.
- *Key Methods*: offer(), poll(), peek(), add()

#### *PriorityQueue*
- *Description*: Implements Queue with elements ordered by priority.
- *Characteristics*: Elements are dequeued based on priority rather than insertion order.
- *Key Methods*: add(), offer(), peek(), poll()

### *4. Map*

The Map interface represents a collection of key-value pairs.

#### *HashMap*
- *Description*: Implements Map using a hash table.
- *Characteristics*: Allows null values and keys. Provides constant-time performance for basic operations.
- *Key Methods*: put(), get(), remove(), containsKey(), containsValue()

#### *TreeMap*
- *Description*: Implements SortedMap using a red-black tree.
- *Characteristics*: Stores keys in a sorted order based on their natural ordering or a specified comparator.
- *Key Methods*: put(), get(), remove(), firstKey(), lastKey(), ceilingKey(), floorKey()

#### *LinkedHashMap*
- *Description*: Extends HashMap to maintain insertion order or access order.
- *Characteristics*: Guarantees predictable iteration order.
- *Key Methods*: put(), get(), remove(), entrySet()

### *5. Classes*

#### *Arrays Class*
- *Description*: Provides static methods to operate on arrays.
- *Key Methods*: sort(), binarySearch(), copyOf(), equals()

#### *Collections Class*
- *Description*: Provides static utility methods for collections.
- *Key Methods*: sort(), reverse(), synchronizedCollection(), unmodifiableCollection()

### *6. Collections*

#### *Sorting Custom Collections*
- *Description*: To sort custom collections, implement the Comparable interface for natural ordering or use a Comparator for custom sorting logic.

### *7. Interfaces*

#### *Comparable Interface*
- *Description*: Allows objects to be compared to each other. Implement the compareTo() method for natural ordering.
- *Usage*: Used in sorting elements within collections like TreeSet and TreeMap.

#### *Comparator Interface*
- *Description*: Allows defining custom orderings for objects. Implement the compare() method to specify custom sorting logic.
- *Usage*: Used when sorting elements according to a custom order.

This overview should help you navigate the various components and functionalities of the Java Collections Framework. If you need more details or examples for any of these components, feel free to ask!
