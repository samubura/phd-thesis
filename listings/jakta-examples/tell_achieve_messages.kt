mas { 
    environment { 
        actions {
            action("tellMessage", /* arity */) {
                sendMessage(recipient, Message(sender, Tell, message))
            }
            action("achieveMessage", /* arity */) {
                sendMessage(recipient, Message(sender, Achieve, message))
            }
        }
    }
}