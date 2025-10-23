agent((*@\meta{Agent~name}@*)) {
  actions { // internal
    action((*@\meta{Action~name}@*), (*@\meta{Arity}@*)) {
      addBelief((*@\meta{Belief}@*))         ; removeBelief((*@\meta{Belief}@*))
      addIntention((*@\meta{Intention}@*))   ; removeIntention((*@\meta{Intention}@*))
      addEvent((*@\meta{Event}@*))          ; removeEvent((*@\meta{Event}@*))
      addPlan((*@\meta{Plan}@*))            ; removePlan((*@\meta{Plan}@*))
      stopAgent()
      sleepAgent((*@\meta{Time~in~milliseconds}@*))
      pauseAgent()
    }
  }
}