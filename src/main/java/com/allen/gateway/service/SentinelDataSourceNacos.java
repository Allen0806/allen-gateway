package com.allen.gateway.service;

/**
 * sentinel数据持久化到nacos
 * 
 * @author Allen
 *
 * @date 2020年12月22日
 * @since 1.0.0
 */
//@Component
public class SentinelDataSourceNacos {

//	// nacos server addr
//	@Value("${spring.cloud.nacos.config.server-addr}")
//	private String serverAddr;
//
//	// nacos group
//	private static final String groupId = "DEFAULT_GROUP";
//	
//	// nacos dataId
//	private static final String dataId = "gateway-sentinel";
//
//	// if change to true, should be config NACOS_NAMESPACE_ID
//	private static boolean isDemoNamespace = false;
//	
//	// fill your namespace id,if you want to use namespace. for example:
//	// 0f5c7314-4983-4022-ad5a-347de1d1057d,you can get it on nacos's console
//	private static final String NACOS_NAMESPACE_ID = "${namespace}";

//	@PostConstruct
//	public void initRules() {
//		if (isDemoNamespace) {
//			loadMyNamespaceRules();
//		} else {
//			loadRules();
//		}
//	}
//
//	private void loadRules() {
//		ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<>(serverAddr, groupId,
//				dataId, source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
//				}));
//		FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
//	}
//
//	private void loadMyNamespaceRules() {
//		Properties properties = new Properties();
//		properties.put(PropertyKeyConst.SERVER_ADDR, serverAddr);
//		properties.put(PropertyKeyConst.NAMESPACE, NACOS_NAMESPACE_ID);
//
//		ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<>(properties, groupId,
//				dataId, source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
//				}));
//		FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
//	}

}
