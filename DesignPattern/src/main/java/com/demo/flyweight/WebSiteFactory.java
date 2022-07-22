/**
 * Created on 2018年4月25日 by caiming
 */
package com.demo.flyweight;

import java.util.Hashtable;


public class WebSiteFactory {

	private Hashtable<String, WebSite> flyweights = new Hashtable<String, WebSite>();

	public WebSite getWebSiteCategory(String key) {
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return flyweights.get(key);
	}
}
