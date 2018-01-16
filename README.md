## Deploy ke payara/server-full

cara deploy menggunakan docker container payara/payara-full

```sh
mvn clean package
```

```sh
docker container run -p 8080:8080  -p 4848:4848 -v /Users/dimmaryanto93/dev/example/java-web/servlet-jsp/jaxrs-ri-example/:/opt/payara41/deployments -d payara/server-full
```

open [http://localhost:4848] login sebagai admin, passwordnya `admin`.
deploy menggunakan context pilih directorynya `/opt/payara41/developments/target/jaxrs-example/` 
