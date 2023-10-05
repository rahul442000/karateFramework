Feature: GET API feature

@smoke
Scenario: get user details - user not found
Given url baseUrl+'/public/v1/users'
And path '1'
When method GET
Then status 404
* print 'Rahul Soni new Smoke' 

@regression
Scenario: get user details - user not found
Given url baseUrl+'/public/v1/users'
And path '1'
When method GET
Then status 404
* print 'Rahul Soni regression' 