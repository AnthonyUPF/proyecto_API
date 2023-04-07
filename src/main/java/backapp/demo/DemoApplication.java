package backapp.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/api")
	public Response api(){
		Response response = new Response();
		response.page = 1;
		response.per_page = 6;
		response.total = 12;
		response.total_pages = 2;
		
		// Crear lista de datos
		response.data = new ArrayList<>();
		Data data1 = new Data();
		data1.id = 1;
		data1.email = "george.bluth@reqres.in";
		data1.first_name = "George";
		data1.last_name = "Bluth";
		data1.avatar = "https://reqres.in/img/faces/1-image.jpg";
		response.data.add(data1);
		
		Data data2 = new Data();
		data2.id = 2;
		data2.email = "janet.weaver@reqres.in";
		data2.first_name = "Janet";
		data2.last_name = "Weaver";
		data2.avatar = "https://reqres.in/img/faces/2-image.jpg";
		response.data.add(data2);
		
		Data data3 = new Data();
		data3.id = 3;
		data3.email = "emma.wong@reqres.in";
		data3.first_name = "Emma";
		data3.last_name = "Wong";
		data3.avatar = "https://reqres.in/img/faces/3-image.jpg";
		response.data.add(data3);
		
		Data data4 = new Data();
		data4.id = 4;
		data4.email = "eve.holt@reqres.in";
		data4.first_name = "Eve";
		data4.last_name = "Holt";
		data4.avatar = "https://reqres.in/img/faces/4-image.jpg";
		response.data.add(data4);
		
		Data data5 = new Data();
		data5.id = 5;
		data5.email = "charles.morris@reqres.in";
		data5.first_name = "Charles";
		data5.last_name = "Morris";
		data5.avatar = "https://reqres.in/img/faces/5-image.jpg";
		response.data.add(data5);
		
		Data data6 = new Data();
		data6.id = 6;
		data6.email = "tracey.ramos@reqres.in";
		data6.first_name = "Tracey";
		data6.last_name = "Ramos";
		data6.avatar = "https://reqres.in/img/faces/6-image.jpg";
		response.data.add(data6);
		
		// Crear objeto support
		Support support = new Support();
		support.url = "https://reqres.in/#support-heading";
		support.text = "To keep ReqRes free, contributions towards server costs are appreciated!";
		response.support = support;
		return response;
		
		// Convertir a JSON
		//Gson gson = new Gson();
		//String json = gson.toJson(response);
	}
	

}
