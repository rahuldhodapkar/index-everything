package com.ixe.app;

import com.ixe.index.TikaFileVisitor;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Path rootPath = new File("/Users/rahuldhodapkar/Playground/curriculum-vitae").toPath();

        TikaFileVisitor tf = new TikaFileVisitor();

        try {
            Files.walkFileTree(rootPath, tf);
        }
        catch (IOException e) {
            System.err.println(e);
        }

        /*
        String urlString = "http://localhost:8983/solr/techproducts";

        HttpSolrClient solr = new HttpSolrClient.Builder(urlString).build();

        solr.setParser(new XMLResponseParser());

        try {
            QueryResponse resp = solr.query(new SolrQuery("manu_id_s:canon"));
            System.out.println(resp.getResults().get(0));
        }
        catch (Exception e) {
            System.out.println("FAILED TO RUN QUERY");
        }
        */

        System.out.println( "Hello World!" );
    }
}
