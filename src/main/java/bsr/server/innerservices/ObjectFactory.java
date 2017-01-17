
package bsr.server.innerservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bsr.server.innerservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransferMoney_QNAME = new QName("http://innerServices.server.bsr/", "transferMoney");
    private final static QName _WithdrawMoneyResponse_QNAME = new QName("http://innerServices.server.bsr/", "withdrawMoneyResponse");
    private final static QName _NotValidException_QNAME = new QName("http://innerServices.server.bsr/", "NotValidException");
    private final static QName _DepositMoneyResponse_QNAME = new QName("http://innerServices.server.bsr/", "depositMoneyResponse");
    private final static QName _GetAccountsResponse_QNAME = new QName("http://innerServices.server.bsr/", "getAccountsResponse");
    private final static QName _DepositMoney_QNAME = new QName("http://innerServices.server.bsr/", "depositMoney");
    private final static QName _SessionException_QNAME = new QName("http://innerServices.server.bsr/", "SessionException");
    private final static QName _IOException_QNAME = new QName("http://innerServices.server.bsr/", "IOException");
    private final static QName _GetAccounts_QNAME = new QName("http://innerServices.server.bsr/", "getAccounts");
    private final static QName _GetBankFeeFromAccountResponse_QNAME = new QName("http://innerServices.server.bsr/", "getBankFeeFromAccountResponse");
    private final static QName _WithdrawMoney_QNAME = new QName("http://innerServices.server.bsr/", "withdrawMoney");
    private final static QName _TransferMoneyResponse_QNAME = new QName("http://innerServices.server.bsr/", "transferMoneyResponse");
    private final static QName _AccountChecksumException_QNAME = new QName("http://innerServices.server.bsr/", "AccountChecksumException");
    private final static QName _AccountServiceException_QNAME = new QName("http://innerServices.server.bsr/", "AccountServiceException");
    private final static QName _Transfer_QNAME = new QName("http://innerServices.server.bsr/", "transfer");
    private final static QName _AccountException_QNAME = new QName("http://innerServices.server.bsr/", "AccountException");
    private final static QName _BankFee_QNAME = new QName("http://innerServices.server.bsr/", "bank_fee");
    private final static QName _GetBankFeeFromAccount_QNAME = new QName("http://innerServices.server.bsr/", "getBankFeeFromAccount");
    private final static QName _Deposit_QNAME = new QName("http://innerServices.server.bsr/", "deposit");
    private final static QName _UserException_QNAME = new QName("http://innerServices.server.bsr/", "UserException");
    private final static QName _Operation_QNAME = new QName("http://innerServices.server.bsr/", "operation");
    private final static QName _OperationException_QNAME = new QName("http://innerServices.server.bsr/", "OperationException");
    private final static QName _Withdraw_QNAME = new QName("http://innerServices.server.bsr/", "withdraw");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bsr.server.innerservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link TransferMoney }
     * 
     */
    public TransferMoney createTransferMoney() {
        return new TransferMoney();
    }

    /**
     * Create an instance of {@link WithdrawMoneyResponse }
     * 
     */
    public WithdrawMoneyResponse createWithdrawMoneyResponse() {
        return new WithdrawMoneyResponse();
    }

    /**
     * Create an instance of {@link NotValidException }
     * 
     */
    public NotValidException createNotValidException() {
        return new NotValidException();
    }

    /**
     * Create an instance of {@link DepositMoneyResponse }
     * 
     */
    public DepositMoneyResponse createDepositMoneyResponse() {
        return new DepositMoneyResponse();
    }

    /**
     * Create an instance of {@link GetAccountsResponse }
     * 
     */
    public GetAccountsResponse createGetAccountsResponse() {
        return new GetAccountsResponse();
    }

    /**
     * Create an instance of {@link DepositMoney }
     * 
     */
    public DepositMoney createDepositMoney() {
        return new DepositMoney();
    }

    /**
     * Create an instance of {@link SessionException }
     * 
     */
    public SessionException createSessionException() {
        return new SessionException();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link GetAccounts }
     * 
     */
    public GetAccounts createGetAccounts() {
        return new GetAccounts();
    }

    /**
     * Create an instance of {@link GetBankFeeFromAccountResponse }
     * 
     */
    public GetBankFeeFromAccountResponse createGetBankFeeFromAccountResponse() {
        return new GetBankFeeFromAccountResponse();
    }

    /**
     * Create an instance of {@link WithdrawMoney }
     * 
     */
    public WithdrawMoney createWithdrawMoney() {
        return new WithdrawMoney();
    }

    /**
     * Create an instance of {@link TransferMoneyResponse }
     * 
     */
    public TransferMoneyResponse createTransferMoneyResponse() {
        return new TransferMoneyResponse();
    }

    /**
     * Create an instance of {@link AccountChecksumException }
     * 
     */
    public AccountChecksumException createAccountChecksumException() {
        return new AccountChecksumException();
    }

    /**
     * Create an instance of {@link AccountServiceException }
     * 
     */
    public AccountServiceException createAccountServiceException() {
        return new AccountServiceException();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link AccountException }
     * 
     */
    public AccountException createAccountException() {
        return new AccountException();
    }

    /**
     * Create an instance of {@link BankFee }
     * 
     */
    public BankFee createBankFee() {
        return new BankFee();
    }

    /**
     * Create an instance of {@link GetBankFeeFromAccount }
     * 
     */
    public GetBankFeeFromAccount createGetBankFeeFromAccount() {
        return new GetBankFeeFromAccount();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link UserException }
     * 
     */
    public UserException createUserException() {
        return new UserException();
    }

    /**
     * Create an instance of {@link OperationException }
     * 
     */
    public OperationException createOperationException() {
        return new OperationException();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link ObjectId }
     * 
     */
    public ObjectId createObjectId() {
        return new ObjectId();
    }

    /**
     * Create an instance of {@link Account.Operations }
     * 
     */
    public Account.Operations createAccountOperations() {
        return new Account.Operations();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "transferMoney")
    public JAXBElement<TransferMoney> createTransferMoney(TransferMoney value) {
        return new JAXBElement<TransferMoney>(_TransferMoney_QNAME, TransferMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "withdrawMoneyResponse")
    public JAXBElement<WithdrawMoneyResponse> createWithdrawMoneyResponse(WithdrawMoneyResponse value) {
        return new JAXBElement<WithdrawMoneyResponse>(_WithdrawMoneyResponse_QNAME, WithdrawMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotValidException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "NotValidException")
    public JAXBElement<NotValidException> createNotValidException(NotValidException value) {
        return new JAXBElement<NotValidException>(_NotValidException_QNAME, NotValidException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "depositMoneyResponse")
    public JAXBElement<DepositMoneyResponse> createDepositMoneyResponse(DepositMoneyResponse value) {
        return new JAXBElement<DepositMoneyResponse>(_DepositMoneyResponse_QNAME, DepositMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "getAccountsResponse")
    public JAXBElement<GetAccountsResponse> createGetAccountsResponse(GetAccountsResponse value) {
        return new JAXBElement<GetAccountsResponse>(_GetAccountsResponse_QNAME, GetAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "depositMoney")
    public JAXBElement<DepositMoney> createDepositMoney(DepositMoney value) {
        return new JAXBElement<DepositMoney>(_DepositMoney_QNAME, DepositMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "SessionException")
    public JAXBElement<SessionException> createSessionException(SessionException value) {
        return new JAXBElement<SessionException>(_SessionException_QNAME, SessionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "getAccounts")
    public JAXBElement<GetAccounts> createGetAccounts(GetAccounts value) {
        return new JAXBElement<GetAccounts>(_GetAccounts_QNAME, GetAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankFeeFromAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "getBankFeeFromAccountResponse")
    public JAXBElement<GetBankFeeFromAccountResponse> createGetBankFeeFromAccountResponse(GetBankFeeFromAccountResponse value) {
        return new JAXBElement<GetBankFeeFromAccountResponse>(_GetBankFeeFromAccountResponse_QNAME, GetBankFeeFromAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "withdrawMoney")
    public JAXBElement<WithdrawMoney> createWithdrawMoney(WithdrawMoney value) {
        return new JAXBElement<WithdrawMoney>(_WithdrawMoney_QNAME, WithdrawMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "transferMoneyResponse")
    public JAXBElement<TransferMoneyResponse> createTransferMoneyResponse(TransferMoneyResponse value) {
        return new JAXBElement<TransferMoneyResponse>(_TransferMoneyResponse_QNAME, TransferMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountChecksumException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "AccountChecksumException")
    public JAXBElement<AccountChecksumException> createAccountChecksumException(AccountChecksumException value) {
        return new JAXBElement<AccountChecksumException>(_AccountChecksumException_QNAME, AccountChecksumException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "AccountServiceException")
    public JAXBElement<AccountServiceException> createAccountServiceException(AccountServiceException value) {
        return new JAXBElement<AccountServiceException>(_AccountServiceException_QNAME, AccountServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "transfer")
    public JAXBElement<Transfer> createTransfer(Transfer value) {
        return new JAXBElement<Transfer>(_Transfer_QNAME, Transfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "AccountException")
    public JAXBElement<AccountException> createAccountException(AccountException value) {
        return new JAXBElement<AccountException>(_AccountException_QNAME, AccountException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankFee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "bank_fee")
    public JAXBElement<BankFee> createBankFee(BankFee value) {
        return new JAXBElement<BankFee>(_BankFee_QNAME, BankFee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankFeeFromAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "getBankFeeFromAccount")
    public JAXBElement<GetBankFeeFromAccount> createGetBankFeeFromAccount(GetBankFeeFromAccount value) {
        return new JAXBElement<GetBankFeeFromAccount>(_GetBankFeeFromAccount_QNAME, GetBankFeeFromAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "UserException")
    public JAXBElement<UserException> createUserException(UserException value) {
        return new JAXBElement<UserException>(_UserException_QNAME, UserException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "OperationException")
    public JAXBElement<OperationException> createOperationException(OperationException value) {
        return new JAXBElement<OperationException>(_OperationException_QNAME, OperationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innerServices.server.bsr/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

}
