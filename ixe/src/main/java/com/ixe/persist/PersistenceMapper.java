package com.ixe.persist;

import org.apache.solr.common.SolrInputDocument;
import org.bson.Document;

public final class PersistenceMapper {

    private PersistenceMapper(){ super(); }

    static Document fileSummary2MongoDBDocument(FileSummary summary) {

        return null;
    }

    static FileSummary mongoDBDocument2FileSummary(Document doc) {

        return null;
    }

    static SolrInputDocument fileSummary2SolrInputDocument(FileSummary summary) {

        return null;
    }

    static FileSummary solrInputDocument2FileSummary(SolrInputDocument doc) {

        return null;
    }

}
