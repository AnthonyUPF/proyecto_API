package backapp.demo.BackEnd;

import java.util.ArrayList;


import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Response {
	private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private ArrayList<Data> data=new ArrayList<Data>();
    private Support support;

    public Response(int page, int per_page, int total, int total_pages) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
    }
	
}
