package com.adarsh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/*

Service Url

http://localhost:8080/JaxRsMatrixParam/service/books/2011/

http://localhost:8080/JaxRsMatrixParam/service/books/2011;author=adarsh

http://localhost:8080/JaxRsMatrixParam/service/books/2011;author=adarsh;country=india

http://localhost:8080/JaxRsMatrixParam/service/books/2011;country=india;;author=adarsh

*/

@Path("/service/books")
public class BookService {

	@GET
	@Path("{year}")
	public Response getBooks(@PathParam("year") String year,
			@MatrixParam("author") String author,
			@MatrixParam("country") String country) {

		return Response
				.status(200)
				.entity("getBooks is called, year : " + year
						+ ", author : " + author + ", country : " + country)
				.build();

	}

}