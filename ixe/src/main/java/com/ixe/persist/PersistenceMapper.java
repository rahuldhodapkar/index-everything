package com.ixe.persist;

import org.apache.solr.common.SolrInputDocument;
import org.bson.Document;

import java.io.File;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Properties;

public final class PersistenceMapper {

    private PersistenceMapper(){ super(); }

    public static Document fileSummary2MongoDBDocument(FileSummary summary) {

        return null;
    }

    public static FileSummary mongoDBDocument2FileSummary(Document doc) {

        return null;
    }

    public static SolrInputDocument fileSummary2SolrInputDocument(FileSummary summary) {

        return null;
    }

    public static FileSummary solrInputDocument2FileSummary(SolrInputDocument doc) {

        return null;
    }

    public static Properties fileDetails2MetadataProperties(File f, BasicFileAttributes attrs) {

        return new Properties();
    }

}
