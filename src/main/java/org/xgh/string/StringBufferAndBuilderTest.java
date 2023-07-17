package org.xgh.string;

import org.junit.jupiter.api.Assertions;

/**
 * <p>
 * StringBuffer和StringBuilder异同<br/>
 * 同<br/>
 * <ul>
 *     <li>继承自AbstractStringBuilder</li>
 * </ul>
 * 异<br/>
 * <ul>
 *  <li>StringBuffer线程安全，StringBuilder线程不安全</li>
 * </ul>
 *</p>
 *
 */
public class StringBufferAndBuilderTest {
	StringBuffer stringBuffer = new StringBuffer();
	/*
		@Override
		public StringBuilder append(CharSequence s) {
			super.append(s);
			return this;
		}
	*/
	StringBuilder stringBuilder = new StringBuilder();
/*
    @Override
    public synchronized StringBuffer append(CharSequence s) {
        toStringCache = null;
        super.append(s);
        return this;
    }
 */
	//差异1 synchronized 线程安全和不安全
	//差异2 toStringCache 多线程场景toString优化
}

