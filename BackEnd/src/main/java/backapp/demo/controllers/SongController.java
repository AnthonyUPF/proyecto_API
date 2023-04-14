package backapp.demo.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backapp.demo.models.Data;
import backapp.demo.models.Response;
import backapp.demo.models.Support;

@RestController
@RequestMapping("/api")
public class SongController {
    Response response = new Response(1, 6, 12, 2);

    public SongController(){
        Data data1 = new Data(1, "george.bluth@reqres.in", "George", "Bluth", "https://reqres.in/img/faces/1-image.jpg");
        response.getData().add(data1);

        Data data2 = new Data(2, "janet.weaver@reqres.in", "Janet", "Weaver", "https://reqres.in/img/faces/2-image.jpg");
        response.getData().add(data2);

        Data data3 = new Data(3, "emma.wong@reqres.in", "Emma", "Wong", "https://reqres.in/img/faces/3-image.jpg");
        response.getData().add(data3);

        Data data4 = new Data(4, "eve.holt@reqres.in", "Eve", "Holt", "https://reqres.in/img/faces/4-image.jpg");
        response.getData().add(data4);

        Data data5 = new Data(5, "charles.morris@reqres.in", "Charles", "Morris", "https://reqres.in/img/faces/5-image.jpg");
        response.getData().add(data5);

        Data data6 = new Data(6, "tracey.ramos@reqres.in", "Tracey", "Ramos", "https://reqres.in/img/faces/6-image.jpg");
        response.getData().add(data6);

        Support support = new Support("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
        
        response.setSupport(support);
    }
    
    @GetMapping("/songs")
    public ResponseEntity<Response> getAllSongs() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*"); // add CORS header
        return new ResponseEntity<>(this.response, headers, HttpStatus.OK);
    }

    @PostMapping("/addSong")
    public Data addSong(@RequestBody Data data) {
        this.response.getData().add(data);
        return data;
    }
    
    @DeleteMapping("/deleteSong")
    public Data deleteSong(@RequestParam int id) {
        Data data = this.response.getData().stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        this.response.getData().remove(data);
        return data;
    }

    @PutMapping("/updateSong")
    public Data updateSong(@RequestBody Data data) {
        Data dataToUpdate = this.response.getData().stream().filter(x -> x.getId() == data.getId()).findFirst().orElse(null);
        /*dataToUpdate.setEmail(data.getEmail());
        dataToUpdate.setFirst_name(data.getFirst_name());
        dataToUpdate.setLast_name(data.getLast_name());
        dataToUpdate.setAvatar(data.getAvatar());*/
        this.response.getData().set(this.response.getData().indexOf(dataToUpdate), data);
        return dataToUpdate;
    }

    @PutMapping("/updateSong2")
    public int updateUser(@RequestBody Data data){
        //delete user with id = idUser
        int i = 0;
        while(i<this.response.getData().size()){
            if (this.response.getData().get(i).getId() == data.getId()){
                //he encontrado el idx "i" del elemento a modificar
                //-> sustituyo el elemento con el nuevo...
                this.response.getData().set(i, data);
                return 1;
            }
            i++;
        }
        return -1;
    }

}
