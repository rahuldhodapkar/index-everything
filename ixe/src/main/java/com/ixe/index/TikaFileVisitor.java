package com.ixe.index;

import com.ixe.persist.PersistenceMapper;
import org.apache.tika.Tika;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.XHTMLContentHandler;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import static java.nio.file.FileVisitResult.*;

public class TikaFileVisitor implements FileVisitor<Path> {

    private Tika tika;

    public TikaFileVisitor(){
        tika = new Tika();
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path fp, BasicFileAttributes attrs) throws IOException {

        File file = fp.toFile();

        Metadata metadata = new Metadata();

        metadata.setAll(
                PersistenceMapper.fileDetails2MetadataProperties(file, attrs)
        );

        Reader out = tika.parse(file, metadata);

        System.out.println(metadata);

        // major indexing logic needs to be here.
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path fp, IOException exc) throws IOException {
        System.err.println(exc);
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return CONTINUE;
    }
}
