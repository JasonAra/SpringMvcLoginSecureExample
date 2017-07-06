package com.exapot.mudel;

import java.util.Locale;

/**
 * Created by Ehsaniara
 * From https://www.exapot.com
 */
public interface Customer {
    long getCustomerId();

    void setCustomerId(long customerId);

    String getUsername();

    void setUsername(String username);

    String getPassword();

    void setPassword(String password);

    Locale getLocale();

    void setLocale(Locale locale);

    String getDisplayName();

    void setDisplayName(String displayName);

}
