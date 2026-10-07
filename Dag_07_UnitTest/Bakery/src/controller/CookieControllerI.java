package controller;

import model.*;

public interface CookieControllerI {

    Dough prepareDough(Recipe recipe);

    Cookie[] makeCookies(Dough dough);
}
