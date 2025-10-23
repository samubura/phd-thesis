mas {
  object SendMessage : AbstractExternalAction("send", 3) {
    override fun action(request: ExternalRequest) {
      // Any OOP or FP construct is allowed here
    }
  }
  environment {
    actions {
      action(SendMessage)
    }
  }
  class SaySomething(val agentName: String):AbstractInternalAction("say",1) {
    override fun action(request: ExternalRequest) {
      println("${agentName} said: ${request.arguments[0]}")
    }
  }
  agent("Alice") { 
    actions {
      action(SaySomething(name))
    }
    /* ... */
  }
}