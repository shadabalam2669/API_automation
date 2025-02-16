package com.shadab.com.shadab.alam;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class testng {
	@Test
	public void getrequest() {

	RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping")

	.when().get()
	.then().log().all().statusCode(201);

	System.out.println("im from testng"
			+ "yes i am");
}

}


