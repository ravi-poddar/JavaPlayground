Practice Problem: Design a Simple Payment System

🔹 Scenario:
You're designing a system where users can make payments using different methods like Credit Card or UPI.

🔧 Requirements:
Encapsulation:

Create a User class with private fields: name, email, balance.

Provide public methods to access and update the balance.

Abstraction:

Define a PaymentMethod interface with a method pay(double amount).

Inheritance:

Create classes CreditCardPayment and UPIPayment that implement the PaymentMethod interface.

Polymorphism:

In your main function, accept any PaymentMethod object and call the pay() method.