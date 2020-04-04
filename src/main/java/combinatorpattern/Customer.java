package combinatorpattern;

import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;

    public Customer(String name, String email, String phoneNumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return the dob
     */
    public LocalDate getDob() {
        return dob;
    }
    

}