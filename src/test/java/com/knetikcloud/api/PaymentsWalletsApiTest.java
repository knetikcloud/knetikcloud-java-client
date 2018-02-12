/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.PageResourceSimpleWallet;
import com.knetikcloud.model.PageResourceWalletTotalResponse;
import com.knetikcloud.model.PageResourceWalletTransactionResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SimpleWallet;
import com.knetikcloud.model.WalletAlterRequest;
import com.knetikcloud.model.WalletTransactionResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsWalletsApi
 */
@Ignore
public class PaymentsWalletsApiTest {

    private final PaymentsWalletsApi api = new PaymentsWalletsApi();

    
    /**
     * Returns the user&#39;s wallet for the given currency code
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; WALLETS_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserWalletTest() throws ApiException {
        Integer userId = null;
        String currencyCode = null;
        SimpleWallet response = api.getUserWallet(userId, currencyCode);

        // TODO: test validations
    }
    
    /**
     * Retrieve a user&#39;s wallet transactions
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; WALLETS_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserWalletTransactionsTest() throws ApiException {
        Integer userId = null;
        String currencyCode = null;
        String filterType = null;
        Long filterMaxDate = null;
        Long filterMinDate = null;
        String filterSign = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceWalletTransactionResource response = api.getUserWalletTransactions(userId, currencyCode, filterType, filterMaxDate, filterMinDate, filterSign, size, page, order);

        // TODO: test validations
    }
    
    /**
     * List all of a user&#39;s wallets
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; WALLETS_ADMIN or owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserWalletsTest() throws ApiException {
        Integer userId = null;
        List<SimpleWallet> response = api.getUserWallets(userId);

        // TODO: test validations
    }
    
    /**
     * Retrieves a summation of wallet balances by currency code
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; WALLETS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletBalancesTest() throws ApiException {
        PageResourceWalletTotalResponse response = api.getWalletBalances();

        // TODO: test validations
    }
    
    /**
     * Retrieve wallet transactions across the system
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; WALLETS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletTransactionsTest() throws ApiException {
        Integer filterInvoice = null;
        String filterType = null;
        String filterDate = null;
        String filterSign = null;
        Integer filterUserId = null;
        String filterUsername = null;
        String filterDetails = null;
        String filterCurrencyCode = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceWalletTransactionResource response = api.getWalletTransactions(filterInvoice, filterType, filterDate, filterSign, filterUserId, filterUsername, filterDetails, filterCurrencyCode, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of wallets across the system
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; WALLETS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletsTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceSimpleWallet response = api.getWallets(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Updates the balance for a user&#39;s wallet
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; WALLETS_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWalletBalanceTest() throws ApiException {
        Integer userId = null;
        String currencyCode = null;
        WalletAlterRequest request = null;
        WalletTransactionResource response = api.updateWalletBalance(userId, currencyCode, request);

        // TODO: test validations
    }
    
}
