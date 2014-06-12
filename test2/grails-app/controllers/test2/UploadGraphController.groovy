package test2


import java.io.File;
import java.net.URL;

import virtuoso.jena.driver.*;
import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.* ;
import com.hp.hpl.jena.graph.*;



class UploadGraphController {

  def index() { 
    def VirtGraph graph;
    def url;
    url = "jdbc:virtuoso://localhost:1111";

    Node foo1 = Node.createURI("http://example.org/#foo1");
    Node bar1 = Node.createURI("http://example.org/#bar1");
    Node baz1 = Node.createURI("http://example.org/#baz1");

    Node foo2 = Node.createURI("http://example.org/#foo2");
    Node bar2 = Node.createURI("http://example.org/#bar2");
    Node baz2 = Node.createURI("http://example.org/#baz2");

    Node foo3 = Node.createURI("http://example.org/#foo3");
    Node bar3 = Node.createURI("http://example.org/#bar3");
    Node baz3 = Node.createURI("http://example.org/#baz3");


    log.debug("Create graph...");
    graph = new VirtGraph("http://localhost.localdomain/TestGraphURI", url, "dba", "dba");


    graph.clear ();

    log.debug("graph.isEmpty() = " + graph.isEmpty());
    log.debug("Add 3 triples to graph <Example3>.");

    graph.add(new Triple(foo1, bar1, baz1));
    graph.add(new Triple(foo2, bar2, baz2));
    graph.add(new Triple(foo3, bar3, baz3));

    log.debug("graph.isEmpty() = " + graph.isEmpty());
    log.debug("graph.getCount() = " + graph.getCount());

    List triples = new ArrayList();
    triples.add(new Triple(foo1, bar1, baz1));
    triples.add(new Triple(foo2, bar2, baz2));

    graph.isEmpty();

    graph.remove(triples);
    log.debug("graph.getCount() = " + graph.getCount());


    // def str = "INSERT INTO GRAPH <http://test1> { <aa> <bb> 'cc' . <aa1> <bb1> 123. }";
    // def vuf = VirtuosoUpdateFactory.create(str, graph);
    // vuf.exec();         

    // Query sparql = QueryFactory.create("SELECT * FROM <http://test1> WHERE { ?s ?p ?o }");

    // log.debug("Clear graph");
    // graph.clear()

    // Command line ISQL, 
    // sparql select ?s ?p ?o from <http://localhost.localdomain/TestGraphURI> where {?s ?p ?o};


    log.debug("Close graph");
    graph.close()

  }

}
