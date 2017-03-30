package web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWordController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> Hello() {
		return new ResponseEntity<String> ("Hello World", HttpStatus.OK);
	}
}
