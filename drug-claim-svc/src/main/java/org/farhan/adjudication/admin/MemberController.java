package org.farhan.adjudication.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@GetMapping("/member")
	public AdminResponse claim(@RequestParam(value = "certificate") String provider) {
		MemberFactory.create(provider);
		return new AdminResponse("Data Added");
	}
}