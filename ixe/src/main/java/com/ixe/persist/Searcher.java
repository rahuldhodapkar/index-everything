package com.ixe.persist;

import java.io.File;
import java.util.List;

public interface Searcher {

    int index(FileSummary summary);

    List<File> search(String searchString);

}
