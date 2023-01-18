package src;

import lombok.Data;
import lombok.NonNull;

@Data
public class Author {
    @NonNull
    private String name;

    @Override
    public String toString() {
        return  "Author: "+ name+"\n";

    }
}
