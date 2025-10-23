import jakta.examples.Print

agent("name"){
  actions { action(Print) }
  plans {
    +achieve("greet") then { Print("Hello World!") }
  }
}