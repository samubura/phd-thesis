agent("moon walker") {
    beliefs {
        fact { "path"("location1", "location2") }
        fact { "path"("location2", "location3") }                
        rule { "reachable"(X, Y) impliedBy "path"(X, Y) }
        rule { "reachable"(X, Z) impliedBy "path"(X, Y) and "reachable"(Y, Z) }
    }
}