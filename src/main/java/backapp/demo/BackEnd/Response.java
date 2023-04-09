package backapp.demo.BackEnd;

import java.util.ArrayList;


import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Response {
	public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<Data> data=new ArrayList<Data>();
    public Support support;

    public Response(int page, int per_page, int total, int total_pages) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
    }
	
}
