package org.example.pagination;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DataService {
    public List<String> getNames() {
        List<String> nameList = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            nameList.add(String.valueOf(i));
        }

        return nameList;
    }

}


