

Question 3:
#Car Api
1. what addtional information do you need before starting to code this?
- Implement JPA
- Dowload Postman to perform test: we will use it as a client to create a car and also to
search for by Its ID
- Research how to implement spring boot for creation a Rest API.
- dowload Mysqk workbench, which is a database management tool tha will allowus to create our car database

2. make some assumptions based on the questions you raised in part 1, create a list of test scenarios for the
requeriments listed above. Be sure to indicate what the input and expected ouput shoul be for each test
 - implement JPA for car persistence in the database
 - In postman, we wil send request with the following JSON create method, Post
{
  "mode": "Toyota Corolla",
   "year": "2020-05-15"
{
findById metho Get
- implement Spring boot to create the api with business logic in a service
- Dowload a database management tool where we can verify that the data is stored correctly after persistence




Question 4: I WOULD REKECT IT
1. The name of the method is not correct --> correct is "checkCredentials"
2. vulnerability, the user's password is recorded in a logger, making it easy for hackers to steal information
3. It is not good practice to throw exceptions for control flows
4. Incorrect usage when comparing passwords, It should be something like:


if(!credentials.password.equals(user.password)){
    LOGGER.WAR("Invalid password for username:, credential.username)

}


Completion of the test for Mahindra, thank you very much.



