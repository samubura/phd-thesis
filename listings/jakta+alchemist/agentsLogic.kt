fun AgentScope.leader() {
  goals { achieve("move") }
  plans {
    +achieve("move") then {
      execute("circleMovementStep")
      execute("notifyAgent")
      achieve("move")
    }
  }
}

fun AgentScope.follower() {
  plans {
    val shape = "joinCircle"(C, R, N)
    +achieve(shape) then {
      execute("follow"(C, R, N))
    }
  }
}