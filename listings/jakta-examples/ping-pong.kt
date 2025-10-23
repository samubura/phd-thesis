mas {
    environment { actions { action(Send) } }
    agent("pinger") {
        goals { achieve("send_ping") }
        plans {
            +achieve("send_ping") then { Send("ponger", "tell", "ping") }
            +"pong".fromAnyone then { Stop }
        }
    }
    agent("ponger") {
        plans {
            +"ping".source(X) then { Send(X, "tell", "pong"); Stop }
        }
    }
}