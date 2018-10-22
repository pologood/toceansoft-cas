/*
 * 版权所有.(c)2010-2018. 拓胜科技
 */

package com.toceansoft.cas.support.auth;

import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apereo.cas.authentication.RememberMeUsernamePasswordCredential;

/**
 * 用户名，密码，系统
 *
 * @author Narci.Lee
 * @date 2018/10/22
 * @since
 */
public class UsernamePasswordSysCredential extends RememberMeUsernamePasswordCredential {
	@Size(min = 2, message = "require system")
	private String system;

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;

	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().appendSuper(super.hashCode()).append(this.system).toHashCode();
	}
}
