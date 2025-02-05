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

println myMethod([1,2,3], [4,5,6]) // unexpected behavior
```