# ItemFlingEffectDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**EffectEntries** | [**[]ItemFlingEffectEffectText**](ItemFlingEffectEffectText.md) |  | 
**Items** | [**[]ItemSummary**](ItemSummary.md) |  | 

## Methods

### NewItemFlingEffectDetail

`func NewItemFlingEffectDetail(id int32, name string, effectEntries []ItemFlingEffectEffectText, items []ItemSummary, ) *ItemFlingEffectDetail`

NewItemFlingEffectDetail instantiates a new ItemFlingEffectDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemFlingEffectDetailWithDefaults

`func NewItemFlingEffectDetailWithDefaults() *ItemFlingEffectDetail`

NewItemFlingEffectDetailWithDefaults instantiates a new ItemFlingEffectDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ItemFlingEffectDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemFlingEffectDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemFlingEffectDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *ItemFlingEffectDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ItemFlingEffectDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ItemFlingEffectDetail) SetName(v string)`

SetName sets Name field to given value.


### GetEffectEntries

`func (o *ItemFlingEffectDetail) GetEffectEntries() []ItemFlingEffectEffectText`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *ItemFlingEffectDetail) GetEffectEntriesOk() (*[]ItemFlingEffectEffectText, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *ItemFlingEffectDetail) SetEffectEntries(v []ItemFlingEffectEffectText)`

SetEffectEntries sets EffectEntries field to given value.


### GetItems

`func (o *ItemFlingEffectDetail) GetItems() []ItemSummary`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ItemFlingEffectDetail) GetItemsOk() (*[]ItemSummary, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ItemFlingEffectDetail) SetItems(v []ItemSummary)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


