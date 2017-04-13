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
	
	@RequestMapping(value="/simple",method = RequestMethod.GET)
	public ResponseEntity<String> Hello() {
		return new ResponseEntity<String> ("Hello World", HttpStatus.OK);
	}
	
	@RequestMapping(value="/admin",method = RequestMethod.GET)
	public ResponseEntity<String> admin() {
		return new ResponseEntity<String> ("Hello Admin", HttpStatus.OK);
	}
	
	@RequestMapping(value="/user",method = RequestMethod.GET)
	public ResponseEntity<String> user() {
		return new ResponseEntity<String> ("Hello User", HttpStatus.OK);
	}
}
