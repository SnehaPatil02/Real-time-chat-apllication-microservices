
mvn -f ./datapackage/pom.xml install

cp ./datapackage/target/datapackage-1.0-SNAPSHOT.jar ./messagingservice
cp ./datapackage/target/datapackage-1.0-SNAPSHOT.jar ./usermanagement

docker build -t user-management-service ./usermanagement

docker build -t messaging-service ./messagingservice

 



