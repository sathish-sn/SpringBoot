package CdiExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdiBussiness {
	@Autowired
	CdiDao someCdiDao;

	
	public CdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	
	public void setSomeCdiDao(CdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}

}
