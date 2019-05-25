object Constant {
    object Messages {
        const val ConnectionError = "Cannot connect to database"
        const val ArgsError =
            "Wrong command. Correct usage: crudgen [host] [port] [database] [username]\n" +
            "For example: crudgen localhost 5432 dbname dbuser"
    }
}