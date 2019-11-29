package com.logger;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class LogFilter extends Filter<ILoggingEvent> {

	@Override
	public FilterReply decide(ILoggingEvent event) {
		/*
		 * if (event.getLoggerName().contains("KibanaLogger")) { return
		 * FilterReply.ACCEPT; } else { return FilterReply.DENY; }
		 */
		return FilterReply.ACCEPT;
	}
}
