# Java 9 - Collection Improvements

Java 9 has created factory methods for creating immutable Lists, Sets, Maps, and Map.Entry Objects. These utility methods are used to create empty or non-empty collection objects.

In Java 8 and earlier versions, we can use Collections class utility methods like unmodifiableXXX to create Immutable Collection objects for our requirements. If we want to create an Immutable List, then we can use the Collections.unmodifiableList method.

However, these Collections.unmodifiableXXX methods are very tedious and verbose. To overcome those shortcomings, Java 9 introduced a couple of utility methods to List, Set, and Map interfaces to achieve the same behavior.

These useful methods are used to create a new Non-Empty Immutable Map with 1-10 elements. The methods are designed in such a case that we can add only 10 elements to immutable List, Set, Map, and Map.Entry objects.

<B> If we have any requirement for an immutable collection with the size of the collection at a max of 10 or below, then we use this feature.</B>

# Characteristics of These Utility Methods

* These methods are immutable. We cannot add or delete or update the elements in the collection. If we try to add or delete or update the elements, it throws an unsupportedOperationException.

``` java
List<String> list=List.of("apple","bat");
list.add("cat");
```

* It doesn't allow null values. If we try to add null values to any collection, then it throws a null pointer exception.

``` java
List<String> list=List.of("apple",null);
```

* They are serializable if all the elements are serializable.



# List (with Values and empty List)

@[List.of() Demo]({"stubs": ["src/com.gg.demo/com/demo/java9/ListOfDemo.java"], "command": "/bin/bash run.sh"})


# Set (with Values and empty Set)
@[Set.of() Demo]({"stubs": ["src/com.gg.demo/com/demo/java9/SetOfDemo.java"], "command": "/bin/bash runSetOf.sh"})

# Map (with Values and empty Map)
@[Map.of() Demo]({"stubs": ["src/com.gg.demo/com/demo/java9/MapOfDemo.java"], "command": "/bin/bash runMapOf.sh"})

# Map.Entry (with Values and empty Map.Entry)
@[Map.Entry() Demo]({"stubs": ["src/com.gg.demo/com/demo/java9/MapEntryDemo.java"], "command": "/bin/bash runMapEntry.sh"})


