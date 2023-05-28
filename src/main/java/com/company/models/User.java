package com.company.models;

import com.company.models.enums.Role;
import com.company.models.enums.Status;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Role role;
    private int loyaltyPoints;
    private double balance;
}
