
package bsr.server.innerservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="balanceAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="executed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operationAccount" type="{http://innerServices.server.bsr/}account" minOccurs="0"/>
 *         &lt;element name="operationClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", propOrder = {
    "amount",
    "balanceAfter",
    "executed",
    "id",
    "operationAccount",
    "operationClassName",
    "targetAccountNumber",
    "title"
})
@XmlSeeAlso({
    Deposit.class
})
public abstract class Operation {

    protected int amount;
    protected int balanceAfter;
    protected boolean executed;
    protected int id;
    protected Account operationAccount;
    protected String operationClassName;
    protected String targetAccountNumber;
    protected String title;

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the balanceAfter property.
     * 
     */
    public int getBalanceAfter() {
        return balanceAfter;
    }

    /**
     * Sets the value of the balanceAfter property.
     * 
     */
    public void setBalanceAfter(int value) {
        this.balanceAfter = value;
    }

    /**
     * Gets the value of the executed property.
     * 
     */
    public boolean isExecuted() {
        return executed;
    }

    /**
     * Sets the value of the executed property.
     * 
     */
    public void setExecuted(boolean value) {
        this.executed = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the operationAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getOperationAccount() {
        return operationAccount;
    }

    /**
     * Sets the value of the operationAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setOperationAccount(Account value) {
        this.operationAccount = value;
    }

    /**
     * Gets the value of the operationClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationClassName() {
        return operationClassName;
    }

    /**
     * Sets the value of the operationClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationClassName(String value) {
        this.operationClassName = value;
    }

    /**
     * Gets the value of the targetAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAccountNumber() {
        return targetAccountNumber;
    }

    /**
     * Sets the value of the targetAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAccountNumber(String value) {
        this.targetAccountNumber = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
