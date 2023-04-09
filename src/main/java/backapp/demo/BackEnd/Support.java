package backapp.demo.BackEnd;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Support {
	public String url;
    public String text;

    public Support(String url, String text) {
        this.url = url;
        this.text = text;
    }
	
}
