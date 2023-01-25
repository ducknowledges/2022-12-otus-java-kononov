package com.github.ducknowledges.containers;

import static java.util.Objects.nonNull;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CustomerService {

    private final NavigableMap<Customer, String> map = new TreeMap<>(Comparator.comparing(Customer::getScores));

    public Map.Entry<Customer, String> getSmallest() {
        return getClonedEntry(map.firstEntry());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return getClonedEntry(map.higherEntry(customer));
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }

    private Map.Entry<Customer, String> getClonedEntry(Map.Entry<Customer, String> entry) {
        if (nonNull(entry)) {
            Customer cloned = new Customer(entry.getKey());
            entry = Map.entry(cloned, entry.getValue());
        }
        return entry;
    }
}
