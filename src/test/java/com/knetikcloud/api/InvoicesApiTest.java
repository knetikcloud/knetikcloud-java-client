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
import com.knetikcloud.model.AddressResource;
import com.knetikcloud.model.InvoiceCreateRequest;
import com.knetikcloud.model.InvoicePaymentStatusRequest;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.PageResourceInvoiceLogEntry;
import com.knetikcloud.model.PageResourceInvoiceResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourcestring;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.PayBySavedMethodRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesApi
 */
@Ignore
public class InvoicesApiTest {

    private final InvoicesApi api = new InvoicesApi();

    
    /**
     * Create an invoice
     *
     * Create an invoice(s) by providing a cart GUID. Note that there may be multiple invoices created, one per vendor. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER or INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInvoiceTest() throws ApiException {
        InvoiceCreateRequest req = null;
        List<InvoiceResource> response = api.createInvoice(req);

        // TODO: test validations
    }
    
    /**
     * Create a invoice template
     *
     * Invoice templates define a type of invoice and the properties they have.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInvoiceTemplateTest() throws ApiException {
        TemplateResource invoiceTemplateResource = null;
        TemplateResource response = api.createInvoiceTemplate(invoiceTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a invoice template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInvoiceTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteInvoiceTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Lists available fulfillment statuses
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulFillmentStatusesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        PageResourcestring response = api.getFulFillmentStatuses(size, page);

        // TODO: test validations
    }
    
    /**
     * Retrieve an invoice
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceTest() throws ApiException {
        Integer id = null;
        InvoiceResource response = api.getInvoice(id);

        // TODO: test validations
    }
    
    /**
     * List invoice logs
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceLogsTest() throws ApiException {
        Integer id = null;
        Integer size = null;
        Integer page = null;
        PageResourceInvoiceLogEntry response = api.getInvoiceLogs(id, size, page);

        // TODO: test validations
    }
    
    /**
     * Get a single invoice template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getInvoiceTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search invoice templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getInvoiceTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Retrieve invoices
     *
     * Without INVOICES_ADMIN permission the results are automatically filtered for only the logged in user&#39;s invoices. It is recomended however that filter_user be added to avoid issues for admin users accidentally getting additional invoices. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoicesTest() throws ApiException {
        Integer filterUser = null;
        String filterEmail = null;
        String filterFulfillmentStatus = null;
        String filterPaymentStatus = null;
        String filterItemName = null;
        String filterExternalRef = null;
        String filterCreatedDate = null;
        String filterVendorIds = null;
        String filterCurrency = null;
        String filterShippingStateName = null;
        String filterShippingCountryName = null;
        String filterShipping = null;
        String filterVendorName = null;
        String filterSku = null;
        String filterNotSku = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceInvoiceResource response = api.getInvoices(filterUser, filterEmail, filterFulfillmentStatus, filterPaymentStatus, filterItemName, filterExternalRef, filterCreatedDate, filterVendorIds, filterCurrency, filterShippingStateName, filterShippingCountryName, filterShipping, filterVendorName, filterSku, filterNotSku, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Lists available payment statuses
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentStatusesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        PageResourcestring response = api.getPaymentStatuses(size, page);

        // TODO: test validations
    }
    
    /**
     * Pay an invoice using a saved payment method
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payInvoiceTest() throws ApiException {
        Integer id = null;
        PayBySavedMethodRequest request = null;
        StringWrapper response = api.payInvoice(id, request);

        // TODO: test validations
    }
    
    /**
     * Set the additional properties of an invoice
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setAdditionalPropertiesTest() throws ApiException {
        Integer id = null;
        Object properties = null;
        api.setAdditionalProperties(id, properties);

        // TODO: test validations
    }
    
    /**
     * Set the fulfillment status of a bundled invoice item
     *
     * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setBundledInvoiceItemFulfillmentStatusTest() throws ApiException {
        Integer id = null;
        String bundleSku = null;
        String sku = null;
        StringWrapper status = null;
        api.setBundledInvoiceItemFulfillmentStatus(id, bundleSku, sku, status);

        // TODO: test validations
    }
    
    /**
     * Set the external reference of an invoice
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalRefTest() throws ApiException {
        Integer id = null;
        StringWrapper externalRef = null;
        api.setExternalRef(id, externalRef);

        // TODO: test validations
    }
    
    /**
     * Set the fulfillment status of an invoice item
     *
     * This allows external fulfillment systems to report success or failure. Fulfillment status changes are restricted by a specific flow determining which status can lead to which. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setInvoiceItemFulfillmentStatusTest() throws ApiException {
        Integer id = null;
        String sku = null;
        StringWrapper status = null;
        api.setInvoiceItemFulfillmentStatus(id, sku, status);

        // TODO: test validations
    }
    
    /**
     * Set the order notes of an invoice
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setOrderNotesTest() throws ApiException {
        Integer id = null;
        StringWrapper orderNotes = null;
        api.setOrderNotes(id, orderNotes);

        // TODO: test validations
    }
    
    /**
     * Set the payment status of an invoice
     *
     * This may trigger fulfillment if setting the status to &#39;paid&#39;. This is mainly intended to support external payment systems that cannot be incorporated into the payment method system. Payment status changes are restricted by a specific flow determining which status can lead to which. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPaymentStatusTest() throws ApiException {
        Integer id = null;
        InvoicePaymentStatusRequest request = null;
        api.setPaymentStatus(id, request);

        // TODO: test validations
    }
    
    /**
     * Set or update billing info
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVOICES_USER and owner, or INVOICES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBillingInfoTest() throws ApiException {
        Integer id = null;
        AddressResource billingInfoRequest = null;
        api.updateBillingInfo(id, billingInfoRequest);

        // TODO: test validations
    }
    
    /**
     * Update a invoice template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInvoiceTemplateTest() throws ApiException {
        String id = null;
        PatchResource templatePatchResource = null;
        Boolean testValidation = null;
        TemplateResource response = api.updateInvoiceTemplate(id, templatePatchResource, testValidation);

        // TODO: test validations
    }
    
}
