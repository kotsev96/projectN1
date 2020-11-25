package ru.kotsev.springmvc.domain.util;

import ru.kotsev.springmvc.domain.User;

public abstract class MessageHelper {
    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<none>";
    }
}
