package com.jianglibo.vaadin.dashboard.util;

import com.google.common.collect.Sets;
import com.vaadin.ui.Component;

public class StyleUtil {
	
	public static boolean hasStyleName(String styles, String style) {
		return Sets.newHashSet(styles.split("\\s+")).contains(style);
	}
	
	public static void setMarginTen(Component c) {
		c.addStyleName("margin-ten");
	}
	
	public static void setMarginTopTen(Component c) {
		c.addStyleName("margin-top-ten");
	}
	
	public static void setMarginLeftTen(Component c) {
		c.addStyleName("margin-left-ten");
	}
	public static void setMarginBottomTen(Component c) {
		c.addStyleName("margin-bottom-ten");
	}
	public static void setMarginRightTen(Component c) {
		c.addStyleName("margin-right-ten");
	}
	
	
	public static void setMarginTwenty(Component c) {
		c.addStyleName("margin-twenty");
	}
	
	public static void setMarginTopTwenty(Component c) {
		c.addStyleName("margin-top-twenty");
	}
	
	public static void setMarginLeftTwenty(Component c) {
		c.addStyleName("margin-left-twenty");
	}
	public static void setMarginBottomTwenty(Component c) {
		c.addStyleName("margin-bottom-twenty");
	}
	public static void setMarginRightTwenty(Component c) {
		c.addStyleName("margin-right-twenty");
	}
}