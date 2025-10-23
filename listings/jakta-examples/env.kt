mas {
  environment {
    from(CustomEnvironment((*@\meta{Args}@*))) // Environment class implemented elsewhere
    actions { /* external actions here */ }
    data["my.key"] = "custom value" // custom data store for the environment
    perception {
      percept { "my_key"(data["my.key"]) } // all agents will perceive this
    }
  }
}