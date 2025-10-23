plans {
  +/-achieve("goal"(X)) onlyIf { "guard"(X) } then { 
      achieve("goal"(X))
      test("goal"(Y))
      spawn("goal"(Z))
      +/-"belief"(A)
      update("belief"(C))
      execute("action"(X, Y, Z)) 
  }
  +/-test("goal"(Y)) onlyIf { "guard"(Y) } 
      then { /*...*/ }
  +/-"belief"(Z) onlyIf { "guard"(Z) } 
      then { /*...*/ }
}