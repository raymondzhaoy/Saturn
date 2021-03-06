package com.vip.saturn.job.console.mybatis.service;

import java.util.List;

import com.vip.saturn.job.console.mybatis.entity.NamespaceInfo;

/**
 * 
 * @author timmy.hu
 *
 */
public interface NamespaceInfoService {

	NamespaceInfo selectByNamespace(String namespace);

	List<NamespaceInfo> selectAll();

	List<NamespaceInfo> selectAll(List<String> nsList);

	void create(NamespaceInfo namespaceInfo);

	void batchCreate(List<NamespaceInfo> namespaceInfos);

	int deleteByNamespace(String namespace);

	void deleteAll();

	void replaceAll(List<NamespaceInfo> namespaceInfos);
}
