
package bsr.server.innerservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="balanceAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="target_account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "title",
    "amount",
    "balanceAfter",
    "targetAccount"
})
@XmlSeeAlso({
    Transfer.class,
    BankFee.class,
    Deposit.class,
    Withdraw.class
})
public abstract class Operation {

    protected String title;
    protected int amount;
    protected int balanceAfter;
    @XmlElement(name = "target_account")
    protected String targetAccount;

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
     * Gets the value of the targetAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAccount() {
        return targetAccount;
    }

    /**
     * Sets the value of the targetAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAccount(String value) {
        this.targetAccount = value;
    }

}
