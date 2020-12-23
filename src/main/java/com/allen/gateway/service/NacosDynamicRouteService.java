package com.allen.gateway.service;

/**
 * Nacos动态路由配置
 * 
 * @author Allen
 *
 * @date 2020年12月22日
 * @since 1.0.0
 */
//@Component
public class NacosDynamicRouteService {
//public class NacosDynamicRouteService implements ApplicationEventPublisherAware {

//	private static String DATAID = "gateway_router";
//
//	private static String GROUP = "DEFAULT_GROUP";
//
//	@Value("${spring.cloud.nacos.config.server-addr}")
//	private String serverAddr;
//
//	@Autowired
//	private RouteDefinitionWriter routeDefinitionWriter;
//
//	private ApplicationEventPublisher applicationEventPublisher;
//
//	private static final List<String> ROUTE_LIST = new ArrayList<>();
//
//	@PostConstruct
//	public void dynamicRouteByNacosListener() {
//		try {
//			ConfigService configService = NacosFactory.createConfigService(serverAddr);
//			configService.getConfig(DATAID, GROUP, 5000);
//			configService.addListener(DATAID, GROUP, new Listener() {
//				@Override
//				public void receiveConfigInfo(String configInfo) {
//					clearRoute();
//					try {
//						System.err.println(configInfo);
//						List<RouteDefinition> gatewayRouteDefinitions = JSONObject.parseArray(configInfo,
//								RouteDefinition.class);
//						for (RouteDefinition routeDefinition : gatewayRouteDefinitions) {
//							addRoute(routeDefinition);
//						}
//						publish();
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//
//				@Override
//				public Executor getExecutor() {
//					return null;
//				}
//			});
//		} catch (NacosException e) {
//			e.printStackTrace();
//		}
//	}
//
//	private void clearRoute() {
//		for (String id : ROUTE_LIST) {
//			this.routeDefinitionWriter.delete(Mono.just(id)).subscribe();
//		}
//		ROUTE_LIST.clear();
//	}
//
//	private void addRoute(RouteDefinition definition) {
//		try {
//			routeDefinitionWriter.save(Mono.just(definition)).subscribe();
//			ROUTE_LIST.add(definition.getId());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	private void publish() {
//		this.applicationEventPublisher.publishEvent(new RefreshRoutesEvent(this.routeDefinitionWriter));
//	}
//
//	@Override
//	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
//		this.applicationEventPublisher = applicationEventPublisher;
//	}
}
