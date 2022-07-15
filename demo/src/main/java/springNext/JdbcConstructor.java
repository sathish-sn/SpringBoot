package springNext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JdbcConstructor {
	
	@Autowired
	jdbcConnection jdbcConnection;

	
	public jdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	
	public void setJdbcConnection(jdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}

