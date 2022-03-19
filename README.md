# Spring-Secuity-JPA

This Project depicts how to apply Spring Security using JPA and MySQL.

- User Details are Stored in MySQL Table.

- Spring Data JPA is used to fetch the user details from MySQL DB based on the username provided by the user at login instance.

- The UserDetails Object is verified with provided credentials by the Spring Security Authentication Manager.

- If UserName and Password Matches, user is succesfully authenticated

- Role based authorization is also provided to ADMIN and USER roles.
