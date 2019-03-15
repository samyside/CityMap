package vlad.application.item;

import java.io.Serializable;

public class Item implements Serializable {
    private String header;
    private String description;

    public Item(String header, String description) {
        this.header = header;
        this.description = description;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
