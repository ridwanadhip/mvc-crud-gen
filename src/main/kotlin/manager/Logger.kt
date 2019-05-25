package manager

import org.apache.logging.log4j.LogManager

object Logger {
    val shared = LogManager.getLogger(Logger.javaClass)
}