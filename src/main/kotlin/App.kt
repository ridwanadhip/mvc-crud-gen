import manager.Logger
import java.sql.DriverManager

class App(
    private val url: String,
    private val username: String,
    private val password: String
) {
    
    fun start() {
        Logger.shared.info("Attempt connection to $url")
        val connection = try {
            DriverManager.registerDriver(org.postgresql.Driver())
            DriverManager.getConnection(url, username, password)
        } catch (e: Exception) {
            println(Constant.Messages.ConnectionError)
            return
        }
    }
}