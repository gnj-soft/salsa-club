package gnj.soft.salsa.club.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gnj.soft.salsa.club.model.Planing;
import gnj.soft.salsa.club.service.PlaningService;

/**
 * This class provides web services for Salsa-club Planings
 * 
 * @author Ghislain N
 */
@RestController
@RequestMapping("planings")
public class PlaningWs {
	
	@Autowired
	private PlaningService planingService;
	
	@PostMapping("")
	public void addPlaning(@RequestBody Planing planing) {
		this.planingService.save(planing);
	}
	
	@GetMapping("")
	public List<Planing> getPlanings() {
		return this.planingService.getPlanings();
	}
	
	@GetMapping("{id}")
	public Planing getPlaningById(@PathVariable Long id) {
		return this.planingService.getPlaningByPlaningId(id);
	}
	
	@PutMapping("")
	public void updatePlaning(@RequestBody Planing planing) {
		this.planingService.save(planing);
	}
	
	@DeleteMapping("{id}")
	public void deletePlaning(@PathVariable Long id) {
		this.planingService.deleteMember(id);
	}
}
