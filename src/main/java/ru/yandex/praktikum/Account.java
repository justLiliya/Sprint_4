package ru.yandex.praktikum;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
        if (name.length() >= 3) {
            if (name.length() <= 19) {
                if (!name.startsWith(" ")) {
                    if (!name.endsWith(" ")) {
                        if (name.length() - name.replace(" ", "").length() == 1)  {
                            return true;
                        }
                    }
                }
            }
        }
            return false;
        }
    }
