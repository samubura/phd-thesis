agent(*@\meta{Agent~name}@*) {
  actions { action((*@\meta{Action~name}@*), (*@\meta{Arity}@*)) { /* ... */ } }
  plans {
    +achieve("goal"(X)) then {
      execute((*@\meta{Name}@*), arg_1, ..., arg_(*@\meta{Arity}@*))
    }
  }
}