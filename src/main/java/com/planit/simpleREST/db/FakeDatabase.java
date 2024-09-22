package com.planit.simpleREST.db;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class FakeDatabase implements Database {
    private List<Map<String, Object>> database = new ArrayList<>();
    public FakeDatabase() {
        insertRow("1", LocalDate.of(2021, 1, 1), 
                  10000.0, 5, 3.5);
        insertRow("2", LocalDate.of(2021, 2, 1), 
                  15000.0, 10, 4.0);
        insertRow("3", LocalDate.of(2021, 3, 1), 
                  20000.0, 15, 4.5);
        insertRow("4", LocalDate.of(2021, 4, 1), 
                  25000.0, 20, 5.0);
        insertRow("5", LocalDate.of(2021, 5, 1), 
                  30000.0, 25, 5.5);
    }

    @Override
    public void insertRow(String id, LocalDate creationDate, double principal, int lengthYears, double rate) {
        Map<String, Object> entry = Map.of(
            "id", id,
            "creationDate", creationDate,
            "principal", principal,
            "lengthYears", lengthYears,
            "rate", rate
        );
        database.add(entry);
    }

    @Override
    public Map<String, Object> findEntry(String key, Object value) {
        return database.stream()
                .filter(entry -> entry.containsKey(key) && entry.get(key).equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Entry not found"));
    }
}
