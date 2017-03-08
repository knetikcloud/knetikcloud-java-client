/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InvoiceItemResource;
import io.swagger.client.model.SimpleUserResource;
import java.util.ArrayList;
import java.util.List;

/**
 * InvoiceResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T12:56:08.189-05:00")
public class InvoiceResource {
  @SerializedName("billing_address1")
  private String billingAddress1 = null;

  @SerializedName("billing_address2")
  private String billingAddress2 = null;

  @SerializedName("billing_city_name")
  private String billingCityName = null;

  @SerializedName("billing_country_name")
  private String billingCountryName = null;

  @SerializedName("billing_full_name")
  private String billingFullName = null;

  @SerializedName("billing_postal_code")
  private String billingPostalCode = null;

  @SerializedName("billing_state_name")
  private String billingStateName = null;

  @SerializedName("cart_id")
  private String cartId = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("current_fulfillment_status")
  private String currentFulfillmentStatus = null;

  @SerializedName("current_payment_status")
  private String currentPaymentStatus = null;

  @SerializedName("discount")
  private Double discount = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("external_ref")
  private String externalRef = null;

  @SerializedName("fed_tax")
  private Double fedTax = null;

  @SerializedName("grand_total")
  private Double grandTotal = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  @SerializedName("items")
  private List<InvoiceItemResource> items = new ArrayList<InvoiceItemResource>();

  @SerializedName("name_prefix")
  private String namePrefix = null;

  @SerializedName("order_notes")
  private String orderNotes = null;

  @SerializedName("parent_invoice_id")
  private Integer parentInvoiceId = null;

  @SerializedName("payment_method_id")
  private Integer paymentMethodId = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("shipping")
  private Double shipping = null;

  @SerializedName("shipping_address1")
  private String shippingAddress1 = null;

  @SerializedName("shipping_address2")
  private String shippingAddress2 = null;

  @SerializedName("shipping_city_name")
  private String shippingCityName = null;

  @SerializedName("shipping_country_name")
  private String shippingCountryName = null;

  @SerializedName("shipping_full_name")
  private String shippingFullName = null;

  @SerializedName("shipping_postal_code")
  private String shippingPostalCode = null;

  @SerializedName("shipping_state_name")
  private String shippingStateName = null;

  @SerializedName("sort")
  private Integer sort = null;

  @SerializedName("state_tax")
  private Double stateTax = null;

  @SerializedName("subtotal")
  private Double subtotal = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("user")
  private SimpleUserResource user = null;

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  public InvoiceResource billingAddress1(String billingAddress1) {
    this.billingAddress1 = billingAddress1;
    return this;
  }

   /**
   * Line one of the customer's billing address
   * @return billingAddress1
  **/
  @ApiModelProperty(example = "null", value = "Line one of the customer's billing address")
  public String getBillingAddress1() {
    return billingAddress1;
  }

  public void setBillingAddress1(String billingAddress1) {
    this.billingAddress1 = billingAddress1;
  }

  public InvoiceResource billingAddress2(String billingAddress2) {
    this.billingAddress2 = billingAddress2;
    return this;
  }

   /**
   * Line two of the customer's billing address
   * @return billingAddress2
  **/
  @ApiModelProperty(example = "null", value = "Line two of the customer's billing address")
  public String getBillingAddress2() {
    return billingAddress2;
  }

  public void setBillingAddress2(String billingAddress2) {
    this.billingAddress2 = billingAddress2;
  }

  public InvoiceResource billingCityName(String billingCityName) {
    this.billingCityName = billingCityName;
    return this;
  }

   /**
   * The city for the customer's billing address
   * @return billingCityName
  **/
  @ApiModelProperty(example = "null", value = "The city for the customer's billing address")
  public String getBillingCityName() {
    return billingCityName;
  }

  public void setBillingCityName(String billingCityName) {
    this.billingCityName = billingCityName;
  }

  public InvoiceResource billingCountryName(String billingCountryName) {
    this.billingCountryName = billingCountryName;
    return this;
  }

   /**
   * The country for the customer's billing address
   * @return billingCountryName
  **/
  @ApiModelProperty(example = "null", value = "The country for the customer's billing address")
  public String getBillingCountryName() {
    return billingCountryName;
  }

  public void setBillingCountryName(String billingCountryName) {
    this.billingCountryName = billingCountryName;
  }

  public InvoiceResource billingFullName(String billingFullName) {
    this.billingFullName = billingFullName;
    return this;
  }

   /**
   * The customer's name for the billing address
   * @return billingFullName
  **/
  @ApiModelProperty(example = "null", value = "The customer's name for the billing address")
  public String getBillingFullName() {
    return billingFullName;
  }

  public void setBillingFullName(String billingFullName) {
    this.billingFullName = billingFullName;
  }

  public InvoiceResource billingPostalCode(String billingPostalCode) {
    this.billingPostalCode = billingPostalCode;
    return this;
  }

   /**
   * The postal code for the customer's billing address
   * @return billingPostalCode
  **/
  @ApiModelProperty(example = "null", value = "The postal code for the customer's billing address")
  public String getBillingPostalCode() {
    return billingPostalCode;
  }

  public void setBillingPostalCode(String billingPostalCode) {
    this.billingPostalCode = billingPostalCode;
  }

  public InvoiceResource billingStateName(String billingStateName) {
    this.billingStateName = billingStateName;
    return this;
  }

   /**
   * The state for the customer's billing address
   * @return billingStateName
  **/
  @ApiModelProperty(example = "null", value = "The state for the customer's billing address")
  public String getBillingStateName() {
    return billingStateName;
  }

  public void setBillingStateName(String billingStateName) {
    this.billingStateName = billingStateName;
  }

  public InvoiceResource cartId(String cartId) {
    this.cartId = cartId;
    return this;
  }

   /**
   * The guid of the cart this invoice came from
   * @return cartId
  **/
  @ApiModelProperty(example = "null", value = "The guid of the cart this invoice came from")
  public String getCartId() {
    return cartId;
  }

  public void setCartId(String cartId) {
    this.cartId = cartId;
  }

   /**
   * The date the invoice was created, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date the invoice was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public InvoiceResource currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The code for the currency invoice prices are in
   * @return currency
  **/
  @ApiModelProperty(example = "null", value = "The code for the currency invoice prices are in")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InvoiceResource currentFulfillmentStatus(String currentFulfillmentStatus) {
    this.currentFulfillmentStatus = currentFulfillmentStatus;
    return this;
  }

   /**
   * The fulfillment status of the invoice
   * @return currentFulfillmentStatus
  **/
  @ApiModelProperty(example = "null", value = "The fulfillment status of the invoice")
  public String getCurrentFulfillmentStatus() {
    return currentFulfillmentStatus;
  }

  public void setCurrentFulfillmentStatus(String currentFulfillmentStatus) {
    this.currentFulfillmentStatus = currentFulfillmentStatus;
  }

  public InvoiceResource currentPaymentStatus(String currentPaymentStatus) {
    this.currentPaymentStatus = currentPaymentStatus;
    return this;
  }

   /**
   * The payment status of the invoice
   * @return currentPaymentStatus
  **/
  @ApiModelProperty(example = "null", value = "The payment status of the invoice")
  public String getCurrentPaymentStatus() {
    return currentPaymentStatus;
  }

  public void setCurrentPaymentStatus(String currentPaymentStatus) {
    this.currentPaymentStatus = currentPaymentStatus;
  }

  public InvoiceResource discount(Double discount) {
    this.discount = discount;
    return this;
  }

   /**
   * The amount of money saved through coupons
   * @return discount
  **/
  @ApiModelProperty(example = "null", value = "The amount of money saved through coupons")
  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public InvoiceResource email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The customer's email address
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The customer's email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InvoiceResource externalRef(String externalRef) {
    this.externalRef = externalRef;
    return this;
  }

   /**
   * An external reference to filter on
   * @return externalRef
  **/
  @ApiModelProperty(example = "null", value = "An external reference to filter on")
  public String getExternalRef() {
    return externalRef;
  }

  public void setExternalRef(String externalRef) {
    this.externalRef = externalRef;
  }

  public InvoiceResource fedTax(Double fedTax) {
    this.fedTax = fedTax;
    return this;
  }

   /**
   * The amount of federal tax added
   * @return fedTax
  **/
  @ApiModelProperty(example = "null", value = "The amount of federal tax added")
  public Double getFedTax() {
    return fedTax;
  }

  public void setFedTax(Double fedTax) {
    this.fedTax = fedTax;
  }

  public InvoiceResource grandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
    return this;
  }

   /**
   * The final price of the invoice
   * @return grandTotal
  **/
  @ApiModelProperty(example = "null", value = "The final price of the invoice")
  public Double getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
  }

   /**
   * The id of the invoice
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the invoice")
  public Integer getId() {
    return id;
  }

  public InvoiceResource invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * A reference number for the invoice
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "null", value = "A reference number for the invoice")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public InvoiceResource items(List<InvoiceItemResource> items) {
    this.items = items;
    return this;
  }

  public InvoiceResource addItemsItem(InvoiceItemResource itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of items within the invoice
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "A list of items within the invoice")
  public List<InvoiceItemResource> getItems() {
    return items;
  }

  public void setItems(List<InvoiceItemResource> items) {
    this.items = items;
  }

  public InvoiceResource namePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * The customer's name prefix
   * @return namePrefix
  **/
  @ApiModelProperty(example = "null", value = "The customer's name prefix")
  public String getNamePrefix() {
    return namePrefix;
  }

  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }

  public InvoiceResource orderNotes(String orderNotes) {
    this.orderNotes = orderNotes;
    return this;
  }

   /**
   * Notes about the order
   * @return orderNotes
  **/
  @ApiModelProperty(example = "null", value = "Notes about the order")
  public String getOrderNotes() {
    return orderNotes;
  }

  public void setOrderNotes(String orderNotes) {
    this.orderNotes = orderNotes;
  }

  public InvoiceResource parentInvoiceId(Integer parentInvoiceId) {
    this.parentInvoiceId = parentInvoiceId;
    return this;
  }

   /**
   * The id of an invoice this is a child of
   * @return parentInvoiceId
  **/
  @ApiModelProperty(example = "null", value = "The id of an invoice this is a child of")
  public Integer getParentInvoiceId() {
    return parentInvoiceId;
  }

  public void setParentInvoiceId(Integer parentInvoiceId) {
    this.parentInvoiceId = parentInvoiceId;
  }

  public InvoiceResource paymentMethodId(Integer paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * The id of a saved payment method used to pay for the invoice
   * @return paymentMethodId
  **/
  @ApiModelProperty(example = "null", value = "The id of a saved payment method used to pay for the invoice")
  public Integer getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(Integer paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public InvoiceResource phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * The customer's phone number
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "The customer's phone number")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public InvoiceResource phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The customer's phone number
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "The customer's phone number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public InvoiceResource shipping(Double shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * The shipping cost
   * @return shipping
  **/
  @ApiModelProperty(example = "null", value = "The shipping cost")
  public Double getShipping() {
    return shipping;
  }

  public void setShipping(Double shipping) {
    this.shipping = shipping;
  }

  public InvoiceResource shippingAddress1(String shippingAddress1) {
    this.shippingAddress1 = shippingAddress1;
    return this;
  }

   /**
   * Line one of the customer's shipping address
   * @return shippingAddress1
  **/
  @ApiModelProperty(example = "null", value = "Line one of the customer's shipping address")
  public String getShippingAddress1() {
    return shippingAddress1;
  }

  public void setShippingAddress1(String shippingAddress1) {
    this.shippingAddress1 = shippingAddress1;
  }

  public InvoiceResource shippingAddress2(String shippingAddress2) {
    this.shippingAddress2 = shippingAddress2;
    return this;
  }

   /**
   * Line two of the customer's shipping address
   * @return shippingAddress2
  **/
  @ApiModelProperty(example = "null", value = "Line two of the customer's shipping address")
  public String getShippingAddress2() {
    return shippingAddress2;
  }

  public void setShippingAddress2(String shippingAddress2) {
    this.shippingAddress2 = shippingAddress2;
  }

  public InvoiceResource shippingCityName(String shippingCityName) {
    this.shippingCityName = shippingCityName;
    return this;
  }

   /**
   * The city for the customer's shipping address
   * @return shippingCityName
  **/
  @ApiModelProperty(example = "null", value = "The city for the customer's shipping address")
  public String getShippingCityName() {
    return shippingCityName;
  }

  public void setShippingCityName(String shippingCityName) {
    this.shippingCityName = shippingCityName;
  }

  public InvoiceResource shippingCountryName(String shippingCountryName) {
    this.shippingCountryName = shippingCountryName;
    return this;
  }

   /**
   * The country for the customer's shipping address
   * @return shippingCountryName
  **/
  @ApiModelProperty(example = "null", value = "The country for the customer's shipping address")
  public String getShippingCountryName() {
    return shippingCountryName;
  }

  public void setShippingCountryName(String shippingCountryName) {
    this.shippingCountryName = shippingCountryName;
  }

  public InvoiceResource shippingFullName(String shippingFullName) {
    this.shippingFullName = shippingFullName;
    return this;
  }

   /**
   * The customer's name for the shipping address
   * @return shippingFullName
  **/
  @ApiModelProperty(example = "null", value = "The customer's name for the shipping address")
  public String getShippingFullName() {
    return shippingFullName;
  }

  public void setShippingFullName(String shippingFullName) {
    this.shippingFullName = shippingFullName;
  }

  public InvoiceResource shippingPostalCode(String shippingPostalCode) {
    this.shippingPostalCode = shippingPostalCode;
    return this;
  }

   /**
   * The postal code for the customer's shipping address
   * @return shippingPostalCode
  **/
  @ApiModelProperty(example = "null", value = "The postal code for the customer's shipping address")
  public String getShippingPostalCode() {
    return shippingPostalCode;
  }

  public void setShippingPostalCode(String shippingPostalCode) {
    this.shippingPostalCode = shippingPostalCode;
  }

  public InvoiceResource shippingStateName(String shippingStateName) {
    this.shippingStateName = shippingStateName;
    return this;
  }

   /**
   * The state for the customer's shipping address
   * @return shippingStateName
  **/
  @ApiModelProperty(example = "null", value = "The state for the customer's shipping address")
  public String getShippingStateName() {
    return shippingStateName;
  }

  public void setShippingStateName(String shippingStateName) {
    this.shippingStateName = shippingStateName;
  }

  public InvoiceResource sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * A number to use in sorting items. default 500.
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "A number to use in sorting items. default 500.")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public InvoiceResource stateTax(Double stateTax) {
    this.stateTax = stateTax;
    return this;
  }

   /**
   * The amount of state tax added
   * @return stateTax
  **/
  @ApiModelProperty(example = "null", value = "The amount of state tax added")
  public Double getStateTax() {
    return stateTax;
  }

  public void setStateTax(Double stateTax) {
    this.stateTax = stateTax;
  }

  public InvoiceResource subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }

   /**
   * The sum price of all items before shipping, coupons and tax
   * @return subtotal
  **/
  @ApiModelProperty(example = "null", value = "The sum price of all items before shipping, coupons and tax")
  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

   /**
   * The date the invoice was last updated, unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date the invoice was last updated, unix timestamp in seconds")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public InvoiceResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The owner of the invoice
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "The owner of the invoice")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }

  public InvoiceResource vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The id of the vendor
   * @return vendorId
  **/
  @ApiModelProperty(example = "null", value = "The id of the vendor")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  public InvoiceResource vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * The name of the invoice
   * @return vendorName
  **/
  @ApiModelProperty(example = "null", value = "The name of the invoice")
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceResource invoiceResource = (InvoiceResource) o;
    return Objects.equals(this.billingAddress1, invoiceResource.billingAddress1) &&
        Objects.equals(this.billingAddress2, invoiceResource.billingAddress2) &&
        Objects.equals(this.billingCityName, invoiceResource.billingCityName) &&
        Objects.equals(this.billingCountryName, invoiceResource.billingCountryName) &&
        Objects.equals(this.billingFullName, invoiceResource.billingFullName) &&
        Objects.equals(this.billingPostalCode, invoiceResource.billingPostalCode) &&
        Objects.equals(this.billingStateName, invoiceResource.billingStateName) &&
        Objects.equals(this.cartId, invoiceResource.cartId) &&
        Objects.equals(this.createdDate, invoiceResource.createdDate) &&
        Objects.equals(this.currency, invoiceResource.currency) &&
        Objects.equals(this.currentFulfillmentStatus, invoiceResource.currentFulfillmentStatus) &&
        Objects.equals(this.currentPaymentStatus, invoiceResource.currentPaymentStatus) &&
        Objects.equals(this.discount, invoiceResource.discount) &&
        Objects.equals(this.email, invoiceResource.email) &&
        Objects.equals(this.externalRef, invoiceResource.externalRef) &&
        Objects.equals(this.fedTax, invoiceResource.fedTax) &&
        Objects.equals(this.grandTotal, invoiceResource.grandTotal) &&
        Objects.equals(this.id, invoiceResource.id) &&
        Objects.equals(this.invoiceNumber, invoiceResource.invoiceNumber) &&
        Objects.equals(this.items, invoiceResource.items) &&
        Objects.equals(this.namePrefix, invoiceResource.namePrefix) &&
        Objects.equals(this.orderNotes, invoiceResource.orderNotes) &&
        Objects.equals(this.parentInvoiceId, invoiceResource.parentInvoiceId) &&
        Objects.equals(this.paymentMethodId, invoiceResource.paymentMethodId) &&
        Objects.equals(this.phone, invoiceResource.phone) &&
        Objects.equals(this.phoneNumber, invoiceResource.phoneNumber) &&
        Objects.equals(this.shipping, invoiceResource.shipping) &&
        Objects.equals(this.shippingAddress1, invoiceResource.shippingAddress1) &&
        Objects.equals(this.shippingAddress2, invoiceResource.shippingAddress2) &&
        Objects.equals(this.shippingCityName, invoiceResource.shippingCityName) &&
        Objects.equals(this.shippingCountryName, invoiceResource.shippingCountryName) &&
        Objects.equals(this.shippingFullName, invoiceResource.shippingFullName) &&
        Objects.equals(this.shippingPostalCode, invoiceResource.shippingPostalCode) &&
        Objects.equals(this.shippingStateName, invoiceResource.shippingStateName) &&
        Objects.equals(this.sort, invoiceResource.sort) &&
        Objects.equals(this.stateTax, invoiceResource.stateTax) &&
        Objects.equals(this.subtotal, invoiceResource.subtotal) &&
        Objects.equals(this.updatedDate, invoiceResource.updatedDate) &&
        Objects.equals(this.user, invoiceResource.user) &&
        Objects.equals(this.vendorId, invoiceResource.vendorId) &&
        Objects.equals(this.vendorName, invoiceResource.vendorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress1, billingAddress2, billingCityName, billingCountryName, billingFullName, billingPostalCode, billingStateName, cartId, createdDate, currency, currentFulfillmentStatus, currentPaymentStatus, discount, email, externalRef, fedTax, grandTotal, id, invoiceNumber, items, namePrefix, orderNotes, parentInvoiceId, paymentMethodId, phone, phoneNumber, shipping, shippingAddress1, shippingAddress2, shippingCityName, shippingCountryName, shippingFullName, shippingPostalCode, shippingStateName, sort, stateTax, subtotal, updatedDate, user, vendorId, vendorName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceResource {\n");
    
    sb.append("    billingAddress1: ").append(toIndentedString(billingAddress1)).append("\n");
    sb.append("    billingAddress2: ").append(toIndentedString(billingAddress2)).append("\n");
    sb.append("    billingCityName: ").append(toIndentedString(billingCityName)).append("\n");
    sb.append("    billingCountryName: ").append(toIndentedString(billingCountryName)).append("\n");
    sb.append("    billingFullName: ").append(toIndentedString(billingFullName)).append("\n");
    sb.append("    billingPostalCode: ").append(toIndentedString(billingPostalCode)).append("\n");
    sb.append("    billingStateName: ").append(toIndentedString(billingStateName)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currentFulfillmentStatus: ").append(toIndentedString(currentFulfillmentStatus)).append("\n");
    sb.append("    currentPaymentStatus: ").append(toIndentedString(currentPaymentStatus)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalRef: ").append(toIndentedString(externalRef)).append("\n");
    sb.append("    fedTax: ").append(toIndentedString(fedTax)).append("\n");
    sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    orderNotes: ").append(toIndentedString(orderNotes)).append("\n");
    sb.append("    parentInvoiceId: ").append(toIndentedString(parentInvoiceId)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    shippingAddress1: ").append(toIndentedString(shippingAddress1)).append("\n");
    sb.append("    shippingAddress2: ").append(toIndentedString(shippingAddress2)).append("\n");
    sb.append("    shippingCityName: ").append(toIndentedString(shippingCityName)).append("\n");
    sb.append("    shippingCountryName: ").append(toIndentedString(shippingCountryName)).append("\n");
    sb.append("    shippingFullName: ").append(toIndentedString(shippingFullName)).append("\n");
    sb.append("    shippingPostalCode: ").append(toIndentedString(shippingPostalCode)).append("\n");
    sb.append("    shippingStateName: ").append(toIndentedString(shippingStateName)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    stateTax: ").append(toIndentedString(stateTax)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

