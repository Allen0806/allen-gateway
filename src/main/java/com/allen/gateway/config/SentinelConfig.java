package com.allen.gateway.config;

/**
 * Sentinel配置类
 * 
 * @author Allen
 * @date 2020年12月22日
 * @since 1.0.0
 */
//@Configuration
public class SentinelConfig {

//	private final List<ViewResolver> viewResolvers;
//
//	private final ServerCodecConfigurer serverCodecConfigurer;
//
//	public SentinelConfig(ObjectProvider<List<ViewResolver>> viewResolversProvider,
//			ServerCodecConfigurer serverCodecConfigurer) {
//		this.viewResolvers = viewResolversProvider.getIfAvailable(Collections::emptyList);
//		this.serverCodecConfigurer = serverCodecConfigurer;
//	}
//
//	@Bean
//	@Order(Ordered.HIGHEST_PRECEDENCE)
//	public SentinelGatewayBlockExceptionHandler sentinelGatewayBlockExceptionHandler() {
//		// Register the block exception handler for Spring Cloud Gateway.
//		return new SentinelGatewayBlockExceptionHandler(viewResolvers, serverCodecConfigurer);
//	}
//
//	@Bean
//	@Order(Ordered.HIGHEST_PRECEDENCE)
//	public GlobalFilter sentinelGatewayFilter() {
//		return new SentinelGatewayFilter();
//	}
//
//	@Bean
//	public SentinelResourceAspect sentinelResourceAspect() {
//		return new SentinelResourceAspect();
//	}
//
//	@PostConstruct
//	public void init() {
//		// 加载网关限流规则
//		initGatewayRules();
//		// 加载自定义限流异常处理器
//		initBlockHandler();
//	}
//
//	/**
//	 * 网关限流规则
//	 */
//	private void initGatewayRules() {
//		Set<GatewayFlowRule> rules = new HashSet<>();
//		/*
//		 * resource：资源名称，可以是网关中的 route 名称或者用户自定义的 API 分组名称 count：限流阈值
//		 * intervalSec：统计时间窗口，单位是秒，默认是 1 秒
//		 */
//		rules.add(new GatewayFlowRule("message_send").setCount(3) // 限流阈值
//				.setIntervalSec(60)); // 统计时间窗口，单位是秒，默认是 1 秒
//		rules.add(new GatewayFlowRule("message_forwarding").setCount(5) // 限流阈值
//				.setIntervalSec(60)); // 统计时间窗口，单位是秒，默认是 1 秒
//		// 加载网关限流规则
//		GatewayRuleManager.loadRules(rules);
//		initCustomizedApis();
//	}
//
//	/**
//	 * 自定义限流异常处理器
//	 */
//	private void initBlockHandler() {
//		BlockRequestHandler blockRequestHandler = new BlockRequestHandler() {
//			@Override
//			public Mono<ServerResponse> handleRequest(ServerWebExchange serverWebExchange, Throwable throwable) {
//				Map<String, String> result = new HashMap<>();
//				result.put("code", String.valueOf(HttpStatus.TOO_MANY_REQUESTS.value()));
//				result.put("message", HttpStatus.TOO_MANY_REQUESTS.getReasonPhrase());
//				result.put("route", "message_send");
//				return ServerResponse.status(HttpStatus.TOO_MANY_REQUESTS).contentType(MediaType.APPLICATION_JSON)
//						.body(BodyInserters.fromValue(result));
//			}
//		};
//		// 加载自定义限流异常处理器
//		GatewayCallbackManager.setBlockHandler(blockRequestHandler);
//	}
//
//	/**
//	 * 限流分组
//	 */
//	private void initCustomizedApis() {
//		Set<ApiDefinition> definitions = new HashSet<>();
//
//		// message_send 组
//		// message_forwarding 组
//		Set<ApiPredicateItem> sendItemSet = new HashSet<ApiPredicateItem>();
//		// 只匹配 /ms/send/**
//		sendItemSet.add(new ApiPathPredicateItem().setPattern("/ms/send/**")
//				.setMatchStrategy(SentinelGatewayConstants.URL_MATCH_STRATEGY_PREFIX));
//		ApiDefinition api1 = new ApiDefinition("message_send").setPredicateItems(sendItemSet);
//
//		// message_forwarding 组
//		Set<ApiPredicateItem> forwardingItemSet = new HashSet<ApiPredicateItem>();
//		// 只匹配 /order-service/order/index
//		forwardingItemSet.add(new ApiPathPredicateItem().setPattern("/mf/send/**"));
//		ApiDefinition api2 = new ApiDefinition("message_forwarding").setPredicateItems(forwardingItemSet);
//
//		definitions.add(api1);
//		definitions.add(api2);
//		// 加载限流分组
//		GatewayApiDefinitionManager.loadApiDefinitions(definitions);
//	}
}
