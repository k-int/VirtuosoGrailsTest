rtuosoGrailsTest
==================

Test app grails - virtuoso linkup

http://virtuoso.openlinksw.com/dataspace/doc/dav/wiki/Main/VirtJdbcHibernate
http://hcklab.blogspot.co.uk/2009/09/uploading-rdf-vocabularies-grails.html


Virtuoso console: http://localhost:8890/conductor (dba/dba)



Once data loaded into Virtuoso public sparql can be accessed at 

ProxyPass          /sparql        http://virtuoso.internal.example.com:8890/sparql
ProxyPassReverse   /sparql        http://virtuoso.internal.example.com:8890/sparql


See http://virtuoso.openlinksw.com/dataspace/doc/dav/wiki/Main/VirtTipsAndTricksGuideSetApacheVirtuosoPortNumber



ubuntu 14.04 server build
git clone https://github.com/openlink/virtuoso-opensource.git

 apt-get autoremove

apt-get install dpkg-dev build-essential autoconf automake bison build-essential checkinstall flex gawk gperf libiodbc2 libiodbc2-dev libssl-dev libtool python-dev unixodbc

cd virt...

./autogen.sh
./configure --with-layout=debian
make
make install

cp debian/init.d /etc/init.d/virtuoso

chomd ugo+rx /etc/init.d/virtuoso

http://virtuoso.openlinksw.com/dataspace/doc/dav/wiki/Main/VirtRDFInsert#Example Using Linked Data Import folder and Upload from File

