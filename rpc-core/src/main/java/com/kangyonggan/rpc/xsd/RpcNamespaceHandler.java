package com.kangyonggan.rpc.xsd;

import com.kangyonggan.rpc.constants.RpcPojo;
import com.kangyonggan.rpc.pojo.Application;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * RPC命名空间解析
 *
 * @author kangyonggan
 * @since 2019-02-13
 */
public class RpcNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser(RpcPojo.application.name(), new SimpleBeanDefinitionParser(Application.class));
    }
}