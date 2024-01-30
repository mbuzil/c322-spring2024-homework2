package main.resources.java.controllers;


@RestController
public class HomeController
{
    @GetMapping("/")
    public String welcome()
    {
        return "Welcome to the Inventory Management API";
    }
}
