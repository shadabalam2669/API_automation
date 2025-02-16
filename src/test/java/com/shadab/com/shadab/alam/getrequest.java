package com.shadab.com.shadab.alam;

import java.net.http.HttpResponse.ResponseInfo;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class getrequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping")

		.when().get()
		.then().log().all().statusCode(201);

		System.out.println("innnn"
				+ "in");
	}

}
