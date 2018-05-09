package com.example.android.motivationalquotes.data;

import com.example.android.motivationalquotes.model.Quote;

import java.util.ArrayList;

public interface QuoteListAsyncResponse {
    void processFinished(ArrayList<Quote> quotes);
}
