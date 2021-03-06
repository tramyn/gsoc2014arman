//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.17 at 09:53:25 AM EDT 
//


package org.ctdbase.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axn" type="{}axnType" maxOccurs="unbounded"/>
 *         &lt;element name="actor" type="{}actorType" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentid" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="form" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="formqualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="seqid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actorType", propOrder = {
    "content"
})
public class ActorType {

    @XmlElementRefs({
        @XmlElementRef(name = "actor", type = JAXBElement.class),
        @XmlElementRef(name = "axn", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "parentid", required = true)
    protected long parentid;
    @XmlAttribute(name = "position", required = true)
    protected int position;
    @XmlAttribute(name = "form")
    protected String form;
    @XmlAttribute(name = "formqualifier")
    protected String formqualifier;
    @XmlAttribute(name = "seqid")
    protected String seqid;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AxnType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActorType }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the parentid property.
     * 
     */
    public long getParentid() {
        return parentid;
    }

    /**
     * Sets the value of the parentid property.
     * 
     */
    public void setParentid(long value) {
        this.parentid = value;
    }

    /**
     * Gets the value of the position property.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
    }

    /**
     * Gets the value of the formqualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormqualifier() {
        return formqualifier;
    }

    /**
     * Sets the value of the formqualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormqualifier(String value) {
        this.formqualifier = value;
    }

    /**
     * Gets the value of the seqid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqid() {
        return seqid;
    }

    /**
     * Sets the value of the seqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqid(String value) {
        this.seqid = value;
    }

}
