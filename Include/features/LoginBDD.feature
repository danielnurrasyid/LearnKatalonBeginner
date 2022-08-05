Feature: Test Login Functionality
	
	@smoke
  Scenario Outline: Check Login is Successful with valid credentials
    Given user is on login page
    #When user enters username and password
    #ini sebagai parameter
    When user enters <username> and <password> 
    And clicks on login button
    Then user is navigated to the home page

    #datatable contoh, kalo menggunakan examples kita harus ubah scenario menjadi scenario outline
    
    @benar
    Examples: 
      | username | password |
      | Admin    | admin123 |
    
    @invalid
    Examples: 
      | username | password |
      | Admin123 | abc456   |
