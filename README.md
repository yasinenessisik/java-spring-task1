## Task Description:

### Requirements:

1. Develop an API for opening a new "current account" for existing customers.

2. The API should expose an endpoint that accepts user information (`customerID`, `initialCredit`).

3. When the endpoint is called, a new account will be opened connected to the user identified by `customerID`.

4. If `initialCredit` is not 0, a transaction will be sent to the new account.

5. Another endpoint should output user information, including Name, Surname, balance, and account transactions.

6. Note that Accounts and Transactions are handled by different services.

### Bonuses:

1. Implement a simple frontend.

2. Implement Continuous Integration/Continuous Deployment (CI/CD) pipeline.

### Constraints:

1. Use any open-source tool or framework.

2. Data can be stored in memory and does not need to be persisted to an external database.

3. Emphasize proper software engineering practices including layering, abstractions, testability, and enterprise-level architecture.

4. The default programming language is Java/C#, but other languages are acceptable if justified.

### Expectations:

1. Deliver the source code published on Github or Gitlab along with instructions for execution and testing.

2. Demonstrate good Git practices and workflow, including collaboration within a team.
