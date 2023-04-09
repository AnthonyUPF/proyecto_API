package backapp.demo.BackEnd;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Data {
	private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    public Data(int id, String email, String first_name, String last_name, String avatar) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }
	
}
