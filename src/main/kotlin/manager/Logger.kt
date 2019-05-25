package manager

import org.apache.logging.log4j.LogManager

object Logger {
    val shared: org.apache.logging.log4j.Logger = LogManager.getLogger(this.javaClass)
}