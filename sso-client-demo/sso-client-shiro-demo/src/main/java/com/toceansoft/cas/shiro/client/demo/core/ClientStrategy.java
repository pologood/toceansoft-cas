/*
 * 版权所有.(c)2010-2018. 拓胜科技
 */

package com.toceansoft.cas.shiro.client.demo.core;

import io.buji.pac4j.subject.Pac4jPrincipal;
import org.aspectj.lang.JoinPoint;


/**
 * 根据客户端进行匹配。若是当前客户端，并且未绑定，则进行handle处理，
 * 进一步为了通过第三方登录用户未绑定时进行绑定
 *
 * @author Narci.Lee
 * @date 2018/10/8
 * @since 1.0.0
 */
public interface ClientStrategy {
    /**
     * clientName
     *
     * @return
     */
    String name();

    /**
     * 若匹配出则进行终端处理
     *
     * @param joinPoint
     * @param pac4jPrincipal
     */
    void handle(JoinPoint joinPoint, Pac4jPrincipal pac4jPrincipal) throws Exception;


    /**
     * 判断是否已绑定
     *
     * @param principal
     * @return
     */
    boolean isBind(Pac4jPrincipal principal);
}
