package com.hgdiv.opendata.utils;

import com.hgdiv.opendata.model.Search;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlUtils {

    private static final String ARTIST_SEARCH_URL = "https://api.deezer.com/search/artist?q=";
    private static final String BASIC_SEARCH_URL = "https://api.deezer.com/search?q=";


    public static String buildSearchQuery(String userInput) {
        return BASIC_SEARCH_URL + userInput;


    }

    public static String buildArtistSearchQuery(String userInput) {
        return getSearchQuery(userInput);
    }


    private static String getSearchQuery(final String userIn) {
        StringBuilder queryBuilder = new StringBuilder(ARTIST_SEARCH_URL);

        try {
            queryBuilder.append(URLEncoder.encode(userIn, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
      /*  if (search.getSearchOrder() != null) {
            queryBuilder.append("&order=");
            queryBuilder.append(search.getSearchOrder());
        }*/
        return queryBuilder.toString();
    }
}