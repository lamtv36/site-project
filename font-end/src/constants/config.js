const serverAddress = {
    mainHost: "http://localhost:8080/ns1"
}

const api  = {
    users: "list"
}

export var config = function(){
    return{
        serverAddress,
        api
    }
}