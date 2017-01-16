
package bsr.server.innerservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="feeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://innerServices.server.bsr/}objectId" minOccurs="0"/>
 *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="operations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://innerServices.server.bsr/}operation"/>
 *                     &lt;element ref="{http://innerServices.server.bsr/}deposit"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="titleOFAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account", propOrder = {
    "accountNumber",
    "balance",
    "feeCount",
    "id",
    "open",
    "operations",
    "titleOFAccount"
})
public class Account {

    protected String accountNumber;
    protected int balance;
    protected int feeCount;
    protected ObjectId id;
    protected boolean open;
    protected Account.Operations operations;
    protected String titleOFAccount;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(int value) {
        this.balance = value;
    }

    /**
     * Gets the value of the feeCount property.
     * 
     */
    public int getFeeCount() {
        return feeCount;
    }

    /**
     * Sets the value of the feeCount property.
     * 
     */
    public void setFeeCount(int value) {
        this.feeCount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectId }
     *     
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectId }
     *     
     */
    public void setId(ObjectId value) {
        this.id = value;
    }

    /**
     * Gets the value of the open property.
     * 
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     */
    public void setOpen(boolean value) {
        this.open = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link Account.Operations }
     *     
     */
    public Account.Operations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account.Operations }
     *     
     */
    public void setOperations(Account.Operations value) {
        this.operations = value;
    }

    /**
     * Gets the value of the titleOFAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleOFAccount() {
        return titleOFAccount;
    }

    /**
     * Sets the value of the titleOFAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleOFAccount(String value) {
        this.titleOFAccount = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://innerServices.server.bsr/}operation"/>
     *           &lt;element ref="{http://innerServices.server.bsr/}deposit"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operationOrDeposit"
    })
    public static class Operations {

        @XmlElements({
            @XmlElement(name = "operation", namespace = "http://innerServices.server.bsr/"),
            @XmlElement(name = "deposit", namespace = "http://innerServices.server.bsr/", type = Deposit.class)
        })
        protected List<Operation> operationOrDeposit;

        /**
         * Gets the value of the operationOrDeposit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationOrDeposit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperationOrDeposit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Operation }
         * {@link Deposit }
         * 
         * 
         */
        public List<Operation> getOperationOrDeposit() {
            if (operationOrDeposit == null) {
                operationOrDeposit = new ArrayList<Operation>();
            }
            return this.operationOrDeposit;
        }

    }

}
