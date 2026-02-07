# ItemCategoryDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Items** | [**[]ItemSummary**](ItemSummary.md) |  | 
**Names** | [**[]ItemCategoryName**](ItemCategoryName.md) |  | 
**Pocket** | [**ItemPocketSummary**](ItemPocketSummary.md) |  | 

## Methods

### NewItemCategoryDetail

`func NewItemCategoryDetail(id int32, name string, items []ItemSummary, names []ItemCategoryName, pocket ItemPocketSummary, ) *ItemCategoryDetail`

NewItemCategoryDetail instantiates a new ItemCategoryDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemCategoryDetailWithDefaults

`func NewItemCategoryDetailWithDefaults() *ItemCategoryDetail`

NewItemCategoryDetailWithDefaults instantiates a new ItemCategoryDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ItemCategoryDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemCategoryDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemCategoryDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *ItemCategoryDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ItemCategoryDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ItemCategoryDetail) SetName(v string)`

SetName sets Name field to given value.


### GetItems

`func (o *ItemCategoryDetail) GetItems() []ItemSummary`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ItemCategoryDetail) GetItemsOk() (*[]ItemSummary, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ItemCategoryDetail) SetItems(v []ItemSummary)`

SetItems sets Items field to given value.


### GetNames

`func (o *ItemCategoryDetail) GetNames() []ItemCategoryName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *ItemCategoryDetail) GetNamesOk() (*[]ItemCategoryName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *ItemCategoryDetail) SetNames(v []ItemCategoryName)`

SetNames sets Names field to given value.


### GetPocket

`func (o *ItemCategoryDetail) GetPocket() ItemPocketSummary`

GetPocket returns the Pocket field if non-nil, zero value otherwise.

### GetPocketOk

`func (o *ItemCategoryDetail) GetPocketOk() (*ItemPocketSummary, bool)`

GetPocketOk returns a tuple with the Pocket field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPocket

`func (o *ItemCategoryDetail) SetPocket(v ItemPocketSummary)`

SetPocket sets Pocket field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


