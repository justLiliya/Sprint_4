package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getSumData() {
        return new Object[][] {
                {"Тимоти Шаламе", true},
                {"Т Ш", true},
                {"Тимотити Шаламемеме", true},
                {"ТимотейШевроле", false},
                {"Тимотити Шаламемемун", false},
                {"Ти", false},
                {"", false},
                {"Тимоти Шаламе Ивано", false},
                {" Тимоти Шаламе", false},
                {"Тимоти Шаламе ", false},
                {" Тимоти Шаламе ", false},
        };
    }


    @Test
    public void checkMethodNameToEmbossWorkTest() {
        Account account = new Account(name);
        boolean actual  = account.checkNameToEmboss(name);
        assertEquals("Крякря, ассерт не совпал!Что-то не так в имени!", expected, actual);


    }
}