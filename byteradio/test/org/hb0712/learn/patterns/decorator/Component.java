package org.hb0712.learn.patterns.decorator;

/*
 * Component翻译成中文是组件的意思，它是一个接口。
 * 你可以把它想象成任何东西，例如，它是一个浏览器，那么operation就是浏览。
 * 为了便于理解，只定义了一个方法。
 */
public interface Component {
	public int operation();
}
