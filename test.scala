object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world2!")
  }
}


Procedure Task3 {id,name,email}
	id input = get data from user     //Data is sent from the user i.e 1
	database = information pre-stored   //Can be a list of data i.e. 1,Monis, monisj94@gmail.com
	id in database.map(getdata).formap(getmeeting).getorElse(gotoerrorPage)         
	//If condition with the help of map and foreach
	login.id ==1.map(assignhtml to success page).map(show sucess page).orElse(show error page) //As in if found for exsisting user  
Procedure HTML {id,name,email}      //UserDAO HTML page 
	body = html body            //Here our above list of data is converted to HTML like <h1>$body</h1>
Procedure Error_Page (HTML) {     //Front End Error_page
	err_page = enter html // Print      It will print an error message of "Sorry no Data was Found"
}
Procedure Success_Page (HTML) {     //Front_End Sucess Page
	su_page =enter html // Print  It will Present with the user credentials i.e. "Welcome Monis"
}
Procedure Meeting_Log (ID){ //Meeting time decision
	if meeting_time != None 
		go to html
		go to sucess_page (html("$time") 		//Person that has meeting time logged
	else
		go_to_html
		go to sucess_page (html("$time")		//Person that does not have meeting time looged



Procedure Task4 {text1,text2,tex3}{   //Here we take the string inputs from the user i.e "monis","jawed","36"
		for-comprehension(text1,text2,text3)
		for-comprehension(text1,2,text3)		//Here we are passing the inputs to the for-comprehension black box
		for-comprehension(text1,text2,None)) 	
}		
Procedure for-comprehension {text1,text2,tex3} for{		//function of the for-comprehension
	s1 <- text1
	s2 <- text2			//Assigning or mapping values
	s3 <- text3}
Yields s1+s2+s3 //Returning the value		in our case (monis jawed 36), (monis 2 36), (None)






Procedure Task5 {text1,text2,tex3,text4}{		//Here we take the string inputs from the user i.e "monis","jawed","36","SE"
		for-comprehension(text1,text2,text3,text4)
		for-comprehension(2,text2,text3,text4)		//Here we are passing the inputs to the for-comprehension black box
		for-comprehension(text1,text2,None,text3)) 
		if value == true: //Value returned from the for-comprehension
			print true
		else false	
}		
Procedure for-comprehension {text1,text2,text3,text4} for{		/function of the for-comprehension
	s1 <- text1
	s2 <- text2
	s3 <- text3				/Assigning or mapping values
	s4 <- text4}
Yields s1+s2+s3+s4 //Returning the value		in our case (monis jawed 36), (monis 2 36,SE), (None)



Procedure Task7 (Car:String, Driver:String){ // Car function with values car and drivers as list //as Linus,Porsche
	case class Driver(name: String)		//driver class
	case class Car(model: String)		//car class
	val drivers = List()			//List of drivers
	val cars = List()				//List of Cars
	call combination(List)			//Calling Combination
}
Procedure combinations(List){		//function for the combinations and for-comprehension
	for {
      car <- cars
      drivers <- drivers
    } yield (drivers.name, car.model)	//Returning values from drivers and cars list 
  }
}













}