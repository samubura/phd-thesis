plans {
    + achieve("f"(X)) iff {
        // plan's context
        (N lowerThan M) and (S `is` (N + 1)) 
    } then {
        /* plan's body */
    }

    + achieve("f"(X)) then {
        /* plan's body */
    }
}