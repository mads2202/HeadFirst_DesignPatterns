package com.mads2202.iterator;

import java.util.Iterator;

public interface SocialNetwork {
    Iterator createFriendsIterator(String profileEmail);

    Iterator createCoworkersIterator(String profileEmail);
}
