package ru.ifmo.rain.garder.cli.command

import ru.ifmo.rain.garder.cli.Environment
import java.io.InputStream

/**
 * Auxiliary class for exit command
 * Cannot be runned
 */
class ExitCommand(args: List<String>) : Command(args) {
    override fun run(env: Environment, input: InputStream?): InputStream? {
        throw UnsupportedOperationException("Exit command can't run")
    }
}