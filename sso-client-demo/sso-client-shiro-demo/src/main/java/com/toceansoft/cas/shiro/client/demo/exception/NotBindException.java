/*
 * 版权所有.(c)2010-2018. 拓胜科技
 */

package com.toceansoft.cas.shiro.client.demo.exception;

import io.buji.pac4j.subject.Pac4jPrincipal;

import java.util.Map;

/**
 * @author Narci.Lee
 * @date 2018/10/9
 * @since 1.0.0
 */
public class NotBindException extends Exception {
    private String clientName;
    private String redirectUrl;
    private Map<String, Object> attr;
    private Pac4jPrincipal principal;

    public Pac4jPrincipal getPrincipal() {
        return principal;
    }

    public NotBindException setPrincipal(Pac4jPrincipal principal) {
        this.principal = principal;
        return this;
    }

    public String getClientName() {
        return clientName;
    }

    public NotBindException setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public NotBindException setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public Map<String, Object> getAttr() {
        return attr;
    }

    public NotBindException setAttr(Map<String, Object> attr) {
        this.attr = attr;
        return this;
    }
}
