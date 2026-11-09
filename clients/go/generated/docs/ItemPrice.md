# ItemPrice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PurchasePrice** | Pointer to **NullableInt32** | The purchase price in this currency and version group, or null if unavailable. | [optional] 
**SellPrice** | Pointer to **NullableInt32** | The sell price in this currency and version group, or null if unavailable. | [optional] 
**Currency** | [**CurrencySummary**](CurrencySummary.md) | The currency used for this price. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group to which this price applies. | 

## Methods

### NewItemPrice

`func NewItemPrice(currency CurrencySummary, versionGroup VersionGroupSummary, ) *ItemPrice`

NewItemPrice instantiates a new ItemPrice object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemPriceWithDefaults

`func NewItemPriceWithDefaults() *ItemPrice`

NewItemPriceWithDefaults instantiates a new ItemPrice object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPurchasePrice

`func (o *ItemPrice) GetPurchasePrice() int32`

GetPurchasePrice returns the PurchasePrice field if non-nil, zero value otherwise.

### GetPurchasePriceOk

`func (o *ItemPrice) GetPurchasePriceOk() (*int32, bool)`

GetPurchasePriceOk returns a tuple with the PurchasePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchasePrice

`func (o *ItemPrice) SetPurchasePrice(v int32)`

SetPurchasePrice sets PurchasePrice field to given value.

### HasPurchasePrice

`func (o *ItemPrice) HasPurchasePrice() bool`

HasPurchasePrice returns a boolean if a field has been set.

### SetPurchasePriceNil

`func (o *ItemPrice) SetPurchasePriceNil(b bool)`

 SetPurchasePriceNil sets the value for PurchasePrice to be an explicit nil

### UnsetPurchasePrice
`func (o *ItemPrice) UnsetPurchasePrice()`

UnsetPurchasePrice ensures that no value is present for PurchasePrice, not even an explicit nil
### GetSellPrice

`func (o *ItemPrice) GetSellPrice() int32`

GetSellPrice returns the SellPrice field if non-nil, zero value otherwise.

### GetSellPriceOk

`func (o *ItemPrice) GetSellPriceOk() (*int32, bool)`

GetSellPriceOk returns a tuple with the SellPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSellPrice

`func (o *ItemPrice) SetSellPrice(v int32)`

SetSellPrice sets SellPrice field to given value.

### HasSellPrice

`func (o *ItemPrice) HasSellPrice() bool`

HasSellPrice returns a boolean if a field has been set.

### SetSellPriceNil

`func (o *ItemPrice) SetSellPriceNil(b bool)`

 SetSellPriceNil sets the value for SellPrice to be an explicit nil

### UnsetSellPrice
`func (o *ItemPrice) UnsetSellPrice()`

UnsetSellPrice ensures that no value is present for SellPrice, not even an explicit nil
### GetCurrency

`func (o *ItemPrice) GetCurrency() CurrencySummary`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *ItemPrice) GetCurrencyOk() (*CurrencySummary, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *ItemPrice) SetCurrency(v CurrencySummary)`

SetCurrency sets Currency field to given value.


### GetVersionGroup

`func (o *ItemPrice) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *ItemPrice) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *ItemPrice) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


