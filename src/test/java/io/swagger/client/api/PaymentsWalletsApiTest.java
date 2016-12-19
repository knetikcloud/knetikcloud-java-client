/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.PageSimpleWallet;
import io.swagger.client.model.PageWalletTotalResponse;
import io.swagger.client.model.PageWalletTransactionResource;
import io.swagger.client.model.SimpleWallet;
import io.swagger.client.model.WalletAlterRequest;
import io.swagger.client.model.WalletTransactionResource;
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
     * Retrieves a summation of wallet balances by currency code
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletTotalsUsingGETTest() throws ApiException {
        PageWalletTotalResponse response = api.getWalletTotalsUsingGET();

        // TODO: test validations
    }
    
    /**
     * Returns the user&#39;s wallet for the given currency code
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletUsingGETTest() throws ApiException {
        Integer userId = null;
        String currencyCode = null;
        SimpleWallet response = api.getWalletUsingGET(userId, currencyCode);

        // TODO: test validations
    }
    
    /**
     * List all of a user&#39;s wallets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletsUsingGETTest() throws ApiException {
        Integer userId = null;
        List<SimpleWallet> response = api.getWalletsUsingGET(userId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of wallets across the system
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletsUsingGET1Test() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageSimpleWallet response = api.getWalletsUsingGET1(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Retrieve wallet transactions across the system
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionHistoryUsingGETTest() throws ApiException {
        Integer filterInvoice = null;
        String filterType = null;
        Long filterMaxDate = null;
        Long filterMinDate = null;
        String filterSign = null;
        Integer filterUserId = null;
        String filterUsername = null;
        String filterDetails = null;
        String filterCurrencyCode = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageWalletTransactionResource response = api.transactionHistoryUsingGET(filterInvoice, filterType, filterMaxDate, filterMinDate, filterSign, filterUserId, filterUsername, filterDetails, filterCurrencyCode, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Updates the balance for a user&#39;s wallet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBalanceUsingPUTTest() throws ApiException {
        Integer userId = null;
        String currencyCode = null;
        WalletAlterRequest request = null;
        WalletTransactionResource response = api.updateBalanceUsingPUT(userId, currencyCode, request);

        // TODO: test validations
    }
    
    /**
     * Retrieve a user&#39;s wallet transactions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userTransactionHistoryUsingGETTest() throws ApiException {
        Integer userId = null;
        String currencyCode = null;
        String filterType = null;
        Long filterMaxDate = null;
        Long filterMinDate = null;
        String filterSign = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageWalletTransactionResource response = api.userTransactionHistoryUsingGET(userId, currencyCode, filterType, filterMaxDate, filterMinDate, filterSign, size, page, order);

        // TODO: test validations
    }
    
}
