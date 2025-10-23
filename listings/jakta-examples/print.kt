package jakta.examples

object Print : AbstractInternalAction("print", 2) {
  override fun action(request: InternalRequest) {
    println("[" + request.agent.name + "] " + request.arguments.joinToString(" "))
  }
}