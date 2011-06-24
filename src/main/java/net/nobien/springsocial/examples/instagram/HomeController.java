/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.nobien.springsocial.examples.instagram;

import javax.inject.Inject;

import org.springframework.social.instagram.api.Instagram;
import org.springframework.social.instagram.api.PagedMediaList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private final Instagram instagram;
	
	@Inject
	public HomeController(Instagram instagram) {
		this.instagram = instagram;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
	    PagedMediaList media = instagram.userOperations().getFeed();
		model.addAttribute("media", media.getList());
		return "home";
	}

}