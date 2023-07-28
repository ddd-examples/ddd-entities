package com.starkmotors.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Entity<Customer> {
    private CustomerID id;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public boolean hasSameIdentityAs(Customer that) {
        return this.id.equals(that.id);
    }
}
