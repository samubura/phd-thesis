mas {
  agent("id") {
    goals { achieve("goal") }
    actions {
      action("customInternalAction", 1) {
        val parameter: Atom = argument(0)
        // This is executed at runtime
        for(letter in parameter.value.toList()) { println(letter) }
      }
    }
    plans {
      +achieve("goal") then {
        //this is executed at MAS assemble time
        for (i in 1..10) { execute("print"(i)) }
        execute("customInternalAction"("test"))
      }
    }
  }
}.start()