package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {
    @Test
    void whenGreetBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartHuman!";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String expected = "See you later.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String in = "Can you show me the sun?";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }
}