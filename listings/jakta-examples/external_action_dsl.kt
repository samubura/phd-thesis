environment {
  actions {
    action((*@\meta{Action~Name}@*), (*@\meta{Arity}@*)) {
      addAgent((*@\meta{Agent}@*))                  ; removeAgent((*@\meta{Agent~id}@*))
      addData((*@\meta{Key}@*), (*@\meta{Value}@*))            ; removeData((*@\meta{Key}@*))
      updateData((*@\meta{Key}@*), (*@\meta{Value}@*))
      sendMessage((*@\meta{Agent~id}@*), (*@\meta{Payload}@*))  ; broadcastMessage((*@\meta{Payload}@*))
    }
  }
}