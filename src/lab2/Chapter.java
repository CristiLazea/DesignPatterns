package lab2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }
    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return  subChapters.get(indexSubChapterOneOne);
    }
}
