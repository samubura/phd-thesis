plans {
    // achievement goal invocation plan
    + achieve("f"(X)) then { 
        /* plan's body */ 
    }
    + achieve("f") then { 
        /* plan's body */ 
    }
    // achievement goal failure plan
    - achieve("f"(X)) then { 
        /* plan's body */ 
    }
    - achieve("f") then { 
        /* plan's body */
    }
    // test goal invocation plan
    + test("f"(X)) then { 
        /* plan's body */ 
    }
    + test("f") then {
        /* plan's body */
    }
    // test goal failure plan
    - test("f"(X)) then { 
        /* plan's body */
    }
    - test("f") then { 
        /* plan's body */ 
    }
    // belief base addition plan
    + "belief" then { 
        /* plan's body */ 
    }
    // belief base removal plan
    - "belief" then { 
        /* plan's body */
    }
}