# spring

1. copy the config files for the config server from application-config to your local folder, defined in spring.cloud.config.server.git.uri
1. start config server (mvn spring-boot:run)
    1. it will throw an error first that the discovery server is not found
1. start discovery server (mvn spring-boot:run)
