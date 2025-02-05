```groovy
def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 10) //expect 10
println myMethod(10, 5) //expect 10

//Solution: Explicit list comparison
def compareLists(list1, list2) {
  if (list1.size() > list2.size()) {
    return list1
  } else if (list2.size() > list1.size()) {
    return list2
  } else {
    //Handle equal size lists - compare elements if needed 
    return list1
  }
}
println compareLists([1,2,3], [4,5,6]) // More predictable comparison

//Alternative solution using compareTo (if lists are comparable)
println ([1,2,3] <=> [4,5,6]) // -1, 0, or 1
```