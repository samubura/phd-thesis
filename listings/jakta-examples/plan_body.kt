agent{
  plans {
    +/- "event" iff { "guard" } then {
      achieve("goal"(X))
      test("goal"(Y))
      spawn("goal"(Z))
      +"belief"(A)
      -"belief"(B)
      update("belief"(C))
      act("external_action"(X, Y, Z)) 
      iact("internal_action"(X, Y, Z))
    }
  }
}