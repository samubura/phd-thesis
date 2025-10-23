import jakta.examples.Print

agent("name"){
  actions { action(Print) }
  plans {
    +achieve("greet") then { 
      execute("print"("Hello World!")) 
    }
  }
}