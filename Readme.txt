REST Services: 
1: http://localhost:8080/authenticate	

POST request expects username & password as part of post request payload.
Use Restlet client with following payload in post request: 

{
  "username": "admin",
  "password": "admin"
}
	
2: http://localhost:8080/refresh		
3: http://localhost:8080/hello-world/{name}

GET requests expects 'Authorization' http Header with value as : 
Bearer <JWT-Token>

==========

React application runs on port http://localhost:3000

login with user: admin, password: admin
React application calls authenticate and hello-world REST services. 

==========
