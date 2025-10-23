object Send : AbstractExternalAction("send", 3) {
  override fun action(request: ExternalRequest) {
    val receiver = request.argument(0)
    val ilf = IllocutionaryForce.parse(request.argument(1))
    val content = request.argument(2)
    val sender = request.sender
    sendMessage(receiver, Message(sender, ilf, content))
  }
}