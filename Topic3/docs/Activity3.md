# Activity 3

- Author:  Charles Ackley
- Date:  4/23/2025

## Introduction



## Activity 2 Screenshots

#### Part 1: Creating Models, Views, and Controllers Using Spring MVC Screenshots

- **Hello OrdersBusinessService**

    ![Hello OrderBuisnessService](./consoleOrdersBusinessService.png)

- **Hello AnotherOrdersBusinessService**

    ![Hello AnotherOrdersBuisnessService](./consoleAnotherOrdersBusinessService.png)

- **Hello SecurityBusinessService**

    ![Hello SecurityBusinessService](./consoleSecurityBusinessService.png)

- **Orders Page Using OrdersBusinessService**

    ![Orders Page Using OrdersBusinessService](./myOrdersPage.png)

#### Part 2:Spring Bean Life Cycle and Scopes

- **OrdersBusinessService init() and destroy()**

    ![OrdersBusinessService init() and destroy()](./OrdersBuisnessServiceInitDestroy.png)
    init() got called upon application start
    init() got called only once upon application start
    destroy() got called upon application end
    destroy() got called only once upon application end
    Next answer why

- **OrdersBusinessService @Scope Annotation**

    ![OrdersBusinessService @Scope Annotation](./OrdersBuisnessServiceScopeInit.png)
    init() got called after submitting the login form
    init() got called twice after submitting the login form
    Next answer why


- **OrdersBusinessService @RequestScope Annotation**

    ![OrdersBusinessService @RequestScope Annotation](./OrdersBuisnessServiceRequestScopeInit.png)
    init() got called after submitting the login form
    init() got called only once after submitting the login form
    Next answer why

- **OrdersBusinessService @SessionScope Annotation**

    - ***Browser Session 1***
    ![Browser Session 1 @SessionScope Annotation](./OrdersBuisnessServiceSessionScopeBrowser1.png)

    - ***Browser Session 2***
    ![Browser Session 2 @SessionScope Annotation](./OrdersBuisnessServiceSessionScopeBrowser2.png)

    init() got called one time for each browser session
    init() got called after submitting the login form
    Next answer why

- **OrdersBusinessService Default Singleton Scope**

    ![OrdersBusinessService Default Singleton Scope](./OrdersBuisnessServiceDefault.png)
    init() got called upon application start
    init() got called only once upon application start
    Next answer why

#### Part 3: 

## Conclusion


