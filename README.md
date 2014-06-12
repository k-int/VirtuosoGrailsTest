VirtuosoGrailsTest
==================

Test app grails - virtuoso linkup

http://virtuoso.openlinksw.com/dataspace/doc/dav/wiki/Main/VirtJdbcHibernate
http://hcklab.blogspot.co.uk/2009/09/uploading-rdf-vocabularies-grails.html


Virtuoso console: http://localhost:8890/conductor (dba/dba)



Once data loaded into Virtuoso public sparql can be accessed at 

ProxyPass          /sparql        http://virtuoso.internal.example.com:8890/sparql
ProxyPassReverse   /sparql        http://virtuoso.internal.example.com:8890/sparql


See http://virtuoso.openlinksw.com/dataspace/doc/dav/wiki/Main/VirtTipsAndTricksGuideSetApacheVirtuosoPortNumber
