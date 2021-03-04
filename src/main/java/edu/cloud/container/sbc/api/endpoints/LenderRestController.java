package edu.cloud.container.sbc.api.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.cloud.container.sbc.vo.LenderFeatureConfig;

@RestController
public class LenderRestController {
	
	@GetMapping(value="/lfc")
	@ResponseBody
	public List<LenderFeatureConfig> getAllFeatureConfig()
	{
		List<LenderFeatureConfig> aList = new ArrayList<>();
		aList.add(new LenderFeatureConfig("ABC", "x", "x123"));
		aList.add(new LenderFeatureConfig("ABC", "y", "y123"));
		return aList;
		
	}

}
