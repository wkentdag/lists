Comp 124 Lists Lab
=====
Fork this project. For week 1, complete the MyArrayList class. For week 2, complete the MyLinkedList class.

### MyArrayList (week 1):

This week you will work in MyArrayList.java. You should not change TestList.

Note the use of the parameter `<E>` in MyArrayList.
Think of `E` as a parameter that is passed when the list is constructed via the angle brackets.
When TestList creates a MyArrayList, it calls `new MyArrayList<String>()`, thus `E` will hold the class `String`.
Thus, inside MyArrayList, you can refer to a single element (String) as `E elem = ...`.
If you wanted to declare an array of strings, you would write `E [] elems = ...`.

I've provided you with unit tests in the TestList class. For week 1, the `testOneLinkedAdd` (which is designed for LinkedLists) will **never** pass.

 1. Complete `add(o)` (In TestList `testGet` and `testAdd` should pass).
 2. Complete `expand()` (Hint: use `newArrayOfE()`. In TestList `testGet`, `testAdd`, and `testExpand` should pass).
 3. Complete `add(i, o)` (In TestList all 4 unit tests should pass).


### MyLinkedList (week 2):

This week you will work in MyLinkedList.java. You should not change TestList or MyLinkedNode.
**Hint:** It helps to draw diagrams of the operations you need to perform!

 1. Change the `list` instance variable at the top of TestList from a `MyArrayList` to a `MyLinkedList`.
 2. Complete the `add(o)` method in MyLinkedList. The `testOneLinkedAdd` unit test should pass.
 2. Complete the `get()` method. The `testOneLinkedAdd`, `testGet`, and `testAdd` unit tests should pass.
 3. Complete the `add(i, o)` method. All unit tests should pass.