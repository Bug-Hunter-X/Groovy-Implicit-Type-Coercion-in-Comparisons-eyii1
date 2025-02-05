# Groovy Implicit Type Coercion Bug

This example demonstrates a potential issue in Groovy related to implicit type coercion during comparisons.  When comparing lists or other complex data structures using operators like `>`, the default Groovy behavior might not be what you expect.  The provided code showcases this issue and a solution that addresses it.

## How to reproduce

1. Save the code in `bug.groovy`.
2. Run the script using Groovy interpreter: `groovy bug.groovy`

You'll observe unexpected output when comparing lists.

## Solution

The solution involves explicitly comparing the lists using a custom method or the `compareTo` method to get consistent results.