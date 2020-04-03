package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        // Using STD/Normal Java functionality
        System.out.println("[NORMAL JAVA]:: " + getDBConnectionUrl());

        // Using SUPPLIER functionality
        System.out.println("[SUPPLIER FUNC]:: " + getDBCOnnectionUrlSupplier.get());

        // Using SUPPLIER functionality
        System.out.println("[SUPPLIER FUNC-LIST]:: " + getDBCOnnectionUrlSupplierList.get());        
    }

    // Using STD/Normal Java functionality
    static String getDBConnectionUrl() {
        return "jdbc:oracle:thin:@localhost:1521/xe";
    }

    // Using SUPPLIER functionality
    static Supplier<String> getDBCOnnectionUrlSupplier = () -> "jdbc:oracle:thin:@localhost:1521/xe";

    // Using SUPPLIER-List functionality
    static Supplier<List<String>> getDBCOnnectionUrlSupplierList = () -> {
        List<String> valueSet = new ArrayList<>();
        valueSet.add("jdbc:oracle:thin:@localhost:1521/xe");
        return valueSet;
    };

}