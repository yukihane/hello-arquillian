package org.arquillian.example;

import java.io.PrintStream;
import javax.inject.Inject;

/**
 * A component for creating personal greetings.
 */
public class Greeter {

    private final PhraseBuilder phraseBuilder;

    @Inject
    public Greeter(final PhraseBuilder phraseBuilder) {
        this.phraseBuilder = phraseBuilder;
    }

    public void greet(final PrintStream to, final String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(final String name) {
        return phraseBuilder.buildPhrase("hello", name);
    }
}
