package sample.hello.resources;


import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class JSONServiceResourceTest {

	@Test
	public void testMetallicaGet() {
		try {
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8080/demo/rest/json/metallica/get");
			ClientResponse response = webResource.accept("application/json")
					.get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}
			String output = response.getEntity(String.class);
			assertThat(output, is(notNullValue()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testMetallicaPost() {

		try {
			Client client = Client.create();
			WebResource webResource = client
					.resource("http://localhost:8080/demo/rest/json/metallica/post");
			String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
			ClientResponse response = webResource.type("application/json")
					.post(ClientResponse.class, input);
			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}
			String output = response.getEntity(String.class);
			assertThat(output, is(notNullValue()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
