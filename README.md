# ~~I need help!~~ Problem SOLVED!

My goal is to run different cucumber step definitions with different spring profiles:

```gherkin
Feature: My Feature

  Scenario: Get my text with default profile
    Given The application is running
    And No profile is active
    When I ask for my text
    Then I should get 'This is default'

  Scenario: Get my text with debug profile
    Given The application is running
    Given Profile 'debug' is active
    When I ask for my text
    Then I should get 'This is for debug'

  Scenario: Get my text with real profile
    Given The application is running
    Given Profile 'real' is active
    When I ask for my text
    Then I should get 'This is for real!'
```

The reason is there a several services implementing the interface `MyService`

```java
public interface MyService {
    String get();
}
```

Each of them only active for its profile:

| class | profile | result |
|-------|---------|--------|
| MyDefaultService | <none>  | "This is default"   | 
| MyRealService    | "real"  | "This is for real!" | 
| MyDebugService   | "debug" | "This is for debug" | 

~~The cucumber tests are failing, the goal is to make them green...~~
~~Thank you in advice.~~

Tests are now green - problem solved.
