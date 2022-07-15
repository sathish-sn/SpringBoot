package Example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example2 {
	
	@Autowired
	jdbcConnection jdbcConnection;

	
	public jdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	
	public void setJdbcConnection(jdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
