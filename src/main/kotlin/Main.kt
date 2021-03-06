import java.util.*

fun main(args: Array<String>) {
    if (args.size < 4) {
        println(Constant.Messages.ArgsError)
        return
    }
    
    val host = args[0]
    val port = args[1]
    val database = args[2]
    val username = args[3]
    val url = "jdbc:postgresql://$host:$port/$database"
    
    val console = System.console()
    val password = if (console != null) {
        String(console.readPassword("Password: "))
    } else {
        print("Password: ")
        Scanner(System.`in`).use { it.nextLine() }
    }
    
    App(url, username, password).start()
}