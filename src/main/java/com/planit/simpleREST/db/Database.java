package com.planit.simpleREST.db;

import java.time.LocalDate;
import java.util.Map;

public interface Database {

    void insertRow(String id, LocalDate creationDate, double principal, int lengthYears, double rate);

    Map<String, Object> findEntry(String key, Object value);

}