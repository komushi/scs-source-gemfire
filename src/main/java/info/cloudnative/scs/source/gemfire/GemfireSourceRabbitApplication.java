package info.cloudnative.scs.source.gemfire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import(org.springframework.cloud.stream.app.gemfire.source.GemfireSourceConfiguration.class)
public class GemfireSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GemfireSourceRabbitApplication.class, args);
	}
}
