java -Dserver.port=8082 -Dspring.profiles.active=nl -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9082 -jar target/webapp-*.jar