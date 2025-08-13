package com.conan.shared.api.spi;

/**
 * @author zhangconan
 * @date 2025/4/27 14:48
 * @class RulePlugin
 * @description
 */
public interface RulePlugin {
	/**
	 * 处理文件
	 *
	 * @param fileId
	 * @param filePath
	 * @param slotPath
	 * @return
	 */
	String executeFileTxt(String fileId, String filePath, String slotPath);
}
