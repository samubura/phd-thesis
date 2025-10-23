plans {
    + achieve("f"(X)) then {
        // achievement goal invocation
        achieve("g"(X))
        achieve("g")
         // test goal invocation
        test("g"(X))
        test("g")
        // spawn goal invocation
        spawn("g"(X))
        spawn("g")
        // belief base addition
        + "g"(X)
        add("g"(X))
        // belief base removal
        - "g"(X)
        remove("g"(X))
        // belief base update
        update("g"(X))
        // execute external action
        act("g")             
        act("g"(X))
        act("g"(X, Y, ...))
        // execute internal action
        iact("g")
        iact("g"(X))
        iact("g"(X, Y, ...))
    }
}