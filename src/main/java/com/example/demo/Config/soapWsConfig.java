package com.example.demo.Config;



import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class soapWsConfig {


    @Bean
   public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServletServletRegistrationBean (ApplicationContext context){

    MessageDispatcherServlet servlet = new MessageDispatcherServlet();
    servlet.setApplicationContext(context);
    servlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean<MessageDispatcherServlet>(servlet,"/ws/*");

    }

    @Bean(name="soapUserCheck")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema){
        DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
        defaultWsdl11Definition.setPortTypeName("UserEndpoint");
        defaultWsdl11Definition.setLocationUri("/ws");
        defaultWsdl11Definition.setTargetNamespace("http://schemas.ericsson.com/sopapi/");
        defaultWsdl11Definition.setSchema(schema);

        return defaultWsdl11Definition;
    }


    @Bean
    public XsdSchema schema(){
        return new SimpleXsdSchema(new ClassPathResource("UserDetails.xsd"));
    }








}