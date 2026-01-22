# demoTest

## Why does the User class have TWO constructors?

```
public User() {}

public User(String username, int age, String phone) {
    this.username = username;
    this.age = age;
    this.phone = phone;
}
```

They serve different purposes.

## 1. Empty constructor (User())

This constructor is required for Spring Boot / Jackson when using @RequestBody.

Example:
```
@PostMapping
public User add(@RequestBody User user) { ... }
```

When a JSON request is sent, Spring uses Jackson to convert JSON into a Java object.

How Jackson works (simplified):
```
User user = new User();
user.setUsername("ford");
user.setAge(12);
user.setPhone("0895978054");
```
If you remove the empty constructor, you will get an error like:
```
Cannot construct instance of User
(no Creators, like default constructor, exist)
```
Conclusion:
The empty constructor is mandatory for JSON → Java mapping.

## 2. Parameterized constructor (User(String, int, String))

This constructor is NOT required by Spring.

It exists for developer convenience when creating objects manually.

Example:

````
User user = new User("ford", 12, "0895978054");
````
Useful for:

- Tests
- Seeding data
- Manual object creation
- Cleaner code

Spring does NOT use this constructor.

## Summary

- User() is required for @RequestBody
- User(String, int, String) is optional
- Removing User() will break JSON mapping