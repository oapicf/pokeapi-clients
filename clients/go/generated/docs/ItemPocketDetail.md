# ItemPocketDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Categories** | [**[]ItemCategorySummary**](ItemCategorySummary.md) |  | 
**Names** | [**[]ItemPocketName**](ItemPocketName.md) |  | 

## Methods

### NewItemPocketDetail

`func NewItemPocketDetail(id int32, name string, categories []ItemCategorySummary, names []ItemPocketName, ) *ItemPocketDetail`

NewItemPocketDetail instantiates a new ItemPocketDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemPocketDetailWithDefaults

`func NewItemPocketDetailWithDefaults() *ItemPocketDetail`

NewItemPocketDetailWithDefaults instantiates a new ItemPocketDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ItemPocketDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemPocketDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemPocketDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *ItemPocketDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ItemPocketDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ItemPocketDetail) SetName(v string)`

SetName sets Name field to given value.


### GetCategories

`func (o *ItemPocketDetail) GetCategories() []ItemCategorySummary`

GetCategories returns the Categories field if non-nil, zero value otherwise.

### GetCategoriesOk

`func (o *ItemPocketDetail) GetCategoriesOk() (*[]ItemCategorySummary, bool)`

GetCategoriesOk returns a tuple with the Categories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategories

`func (o *ItemPocketDetail) SetCategories(v []ItemCategorySummary)`

SetCategories sets Categories field to given value.


### GetNames

`func (o *ItemPocketDetail) GetNames() []ItemPocketName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *ItemPocketDetail) GetNamesOk() (*[]ItemPocketName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *ItemPocketDetail) SetNames(v []ItemPocketName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


