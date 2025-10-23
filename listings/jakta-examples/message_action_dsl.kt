environment { 
    actions {
        action("talkWith", (*@\meta{Arity}@*)) { sendMessage((*@\meta{Recipient}@*), (*@\meta{Message}@*)) }
        action("helloEveryone", (*@\meta{Arity}@*)) { broadcastMessage((*@\meta{Message}@*)) }
    }
}