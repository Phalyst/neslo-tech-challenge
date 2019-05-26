# neslo-tech-challenge


This application passes a simple mathematical equation using only numbers, a decimal
point, and + - / * and return the mathematical computation of the two numbers provided

the app require loging credantial 
username : user
password : user

commands can be sent via swagger-ui
http://localhost:8080/swagger-ui.html#/neslo-resource/mathematicalEquationUsingPOST

a Json request with 1st and second value and mathematical operator need to be passed

e.g
{
  "firstOperand": 0,
  "operator": "string",
  "secondOperand": 0
}

Junit test also provided to test all the mathematical equations implementation
