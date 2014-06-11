package test2

import org.openrdf.repository.RepositoryException;
import virtuoso.sesame2.driver.* 
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.rio.RDFFormat;
import java.io.File;
import java.net.URL;

class UploadGraphController {

  def index() { 
    File file = new File("/path/to/example.rdf");

    String baseURI = "http://example.org/example/localRDF";

    try {
      Repository repository = new VirtuosoRepository("jdbc:virtuoso://" + sa[0] + ":" + sa[1]+ "/charset=UTF-8/log_enable=2", sa[2], sa[3]);
      repository.initialize()
      RepositoryConnection con = repository.getConnection();
      try {
        con.add(file, baseURI, RDFFormat.RDFXML);
        URL url = new URL("http://example.org/example/remoteRDF");
        con.add(url, url.toString(), RDFFormat.RDFXML);
      }
      finally {
        con.close();
      }
    }
    catch (RepositoryException rex) {
      // handle exception
    }
    catch (java.io.IOException e) {
      // handle io exception
    }
  }

}
