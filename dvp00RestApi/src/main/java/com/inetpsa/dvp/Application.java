package com.inetpsa.dvp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * This class is the Application Class.
 * 
 * @author Cristina
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    private static Class<Application> applicationClass = Application.class;

    /**
     * This is the most important method who calls the simulation.
     * 
     * @param args String[]
     */
    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }

    /**
     * An opinionated WebApplicationInitializer to run a SpringApplication from a traditional WAR deployment.
     * <p>
     * Binds Servlet, Filter and ServletContextInitializer beans from the application context to the servlet container.
     * </p>
     *
     * @link http://docs.spring.io/spring-boot/docs/current/api/index.html?org/springframework/boot/context/web/SpringBootServletInitializer.html
     */

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}
