package com.hc.testgit.web;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hc.testgit.entity.Good;


@RestController
@RequestMapping("good")
public class WebController {
	
	@PostMapping("get")
	public Good sendGood() {
		Good good = new Good();
		good.setId(1);
		sequ();
		return good;
	}
	
	public void sequ() {
		int[] nums = {1,6,4,5,3,2,7};
		System.out.println(nums);
		for(int i = 0;i<nums.length;i++) {
			int temp = 0;
			for(int j = 0;j<nums.length;j++) {
				if(nums[i] < nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println(nums);
	}
}




