//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 11:43:47 AM CET 
//


package org.lsc.plugins.connectors.msgraphapi.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.lsc.configuration.ServiceType;


/**
 * <p>Java class for msGraphApiService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="msGraphApiService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.1.xsd}serviceType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msGraphApiService", namespace = "http://lsc-project.org/XSD/lsc-microsoft-graph-api-plugin-1.0.xsd")
@XmlSeeAlso({
    MsGraphApiUsersService.class
})
public abstract class MsGraphApiService
    extends ServiceType
{


}
