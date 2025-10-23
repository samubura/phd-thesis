fun collatz(number: Int) = mas { 
  agent("collatz-agent") {
    goals { achieve("collatz"(number)) }
    plans {
      +achieve(verify(X)) // We reached 4 for the second time: it's a cycle
        onlyIf { "found"(4).fromSelf }
        then { Print("Collatz Conjecture verified!"); Stop }
      +achieve(collatz(X)) // We reached an even number: divide by 2
        onlyIf { X.isEven() and (R `is` X.intDiv(2)) }
        then { achieve("verify"(R), true); +"found"(X); achieve("collatz"(R)) }
      +achieve(collatz(X)) // We reached an odd number: multiply by 3 and add 1
        onlyIf { X.isOdd() and (R `is` ((X * 3) + 1)) }
        then { achieve("verify"(R), true); +"found"(X); achieve("collatz"(R)) }
    }
  }
}