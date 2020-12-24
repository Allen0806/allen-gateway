package com.allen.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Mono;

/**
 * 网关配置类
 *
 * @author Allen
 * @date Jul 2, 2020
 * @since 1.0.0
 */
@Configuration
public class GatewayConfig {

//	/**
//	 * 跨域支持配置
//	 */
//	@Bean
//	public CorsWebFilter corsFilter() {
//		CorsConfiguration config = new CorsConfiguration();
//		config.addAllowedMethod("*");
//		config.addAllowedOrigin("*");
//		config.addAllowedHeader("*");
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
//		source.registerCorsConfiguration("/**", config);
//		return new CorsWebFilter(source);
//	}

	/**
	 * 远程地址键解析器
	 */
	@Bean(value = "remoteAddrKeyResolver")
	public KeyResolver remoteAddrKeyResolver() {
		return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes().route("gateway_test", r -> r.path("/spring-cloud").uri("https://www.baidu.com")).build();
	}
	
//	@Bean
//	@Scope(value = "prototype")
//	public IRule loadBalanceRule() {
//		return new NacosRule();
//	}

}
