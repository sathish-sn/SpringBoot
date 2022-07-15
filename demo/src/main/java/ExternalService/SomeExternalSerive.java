package ExternalService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class SomeExternalSerive {

	@Value("${external.service.url}")
	private String url;

	public String returnSErviceURL() {
		return url;
	}

}
