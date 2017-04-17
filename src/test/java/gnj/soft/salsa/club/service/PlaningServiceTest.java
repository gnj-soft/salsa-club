package gnj.soft.salsa.club.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import gnj.soft.salsa.club.TestSetUp;
import gnj.soft.salsa.club.model.Planing;

/**
 * This is the class test for {@link PlaningService}
 * 
 * @author Ghislain N.
 */
public class PlaningServiceTest extends TestSetUp {

	@Autowired
	private PlaningService planingService;
	
	@Before
	public void setUp() {
		this.planingService.save(1L, 1L, 1L, 1L, "First planing for test");
		this.planingService.save(2L, 2L, 1L, 1L, "Other planing for test");
	}
	
	@Test
	public void getPlanings() {
		
		List<Planing> planings = this.planingService.getPlanings();
		
		Assert.assertNotNull(planings);
		Assert.assertEquals(2, planings.size());
	}
	
	@Test
	public void getPlaningsByLessonId() {
		
		List<Planing> planings = this.planingService.getPlaningsByLessonId(2L);
		
		Assert.assertNotNull(planings);
		Assert.assertEquals(1, planings.size());
		
		Planing planing = planings.get(0);
		
		Assert.assertNotNull(planing);
		Assert.assertEquals(new Long(2), planing.getPlaningId());
		Assert.assertEquals(new Long(1), planing.getMemberId());
		Assert.assertEquals(new Long(1), planing.getTeacherId());
	}
	
	@Test
	public void getPlaningsByMemberId() {
		
		List<Planing> planings = this.planingService.getPlaningsByMemberId(1L);
		
		Assert.assertNotNull(planings);
		Assert.assertEquals(2, planings.size());
		
		Planing planing1 = planings.get(0);
		
		Assert.assertNotNull(planing1);
		Assert.assertEquals(new Long(1), planing1.getPlaningId());
		Assert.assertEquals(new Long(1), planing1.getLessonId());
		Assert.assertEquals(new Long(1), planing1.getTeacherId());
		
		Planing planing2 = planings.get(1);
		
		Assert.assertNotNull(planing2);
		Assert.assertEquals(new Long(2), planing2.getPlaningId());
		Assert.assertEquals(new Long(2), planing2.getLessonId());
		Assert.assertEquals(new Long(1), planing2.getTeacherId());
	}
	
	@Test
	public void getPlaningsByTeacherId() {
		
		List<Planing> planings = this.planingService.getPlaningsByTeacherId(1L);
		
		Assert.assertNotNull(planings);
		Assert.assertEquals(2, planings.size());
	}
}
