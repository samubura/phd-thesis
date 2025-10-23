agent("sender"){
  actions { action(Send) }
  plans {
    +achieve("greet_twice") then { 
      execute("send"("receiver", "tell", "hello!"))
      Send("receiver", "tell", "hello!")
    }
  }
}