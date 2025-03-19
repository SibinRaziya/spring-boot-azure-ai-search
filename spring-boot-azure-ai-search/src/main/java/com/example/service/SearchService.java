package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class SearchService {

    public String search(String query) {
        return "Results for query: " + query;
    }
}
