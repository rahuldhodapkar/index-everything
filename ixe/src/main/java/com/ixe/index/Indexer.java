package com.ixe.index;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import static java.nio.file.FileVisitResult.*;

public class Indexer implements FileVisitor<File> {

    @Override
    public FileVisitResult preVisitDirectory(File dir, BasicFileAttributes attrs) throws IOException {

        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(File file, BasicFileAttributes attrs) throws IOException {
        // major indexing logic needs to be here.
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(File file, IOException exc) throws IOException {
        System.err.println(exc);
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(File dir, IOException exc) throws IOException {
        System.err.println(exc);
        return CONTINUE;
    }
}
