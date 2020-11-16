package com.allen.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

/**
 * 网关配置类
 *
 * @author Allen
 * @date Jul 2, 2020
 * @since 1.0.0
 */
// @Configuration
public class GatewayConfig {
	
//	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes().route(r -> r.path("/spring-cloud").uri("http://www.ityouknow.com").id("message_route"))
				.build();
	}

}
