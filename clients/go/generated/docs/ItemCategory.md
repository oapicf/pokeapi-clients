# ItemCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The identifier for this item category resource | [optional] 
**Name** | Pointer to **string** | The name for this item category resource | [optional] 
**Items** | Pointer to [**[]NamedAPIResource**](NamedAPIResource.md) | A list of items that are a part of this category | [optional] 

## Methods

### NewItemCategory

`func NewItemCategory() *ItemCategory`

NewItemCategory instantiates a new ItemCategory object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemCategoryWithDefaults

`func NewItemCategoryWithDefaults() *ItemCategory`

NewItemCategoryWithDefaults instantiates a new ItemCategory object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ItemCategory) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemCategory) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemCategory) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ItemCategory) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *ItemCategory) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ItemCategory) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ItemCategory) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ItemCategory) HasName() bool`

HasName returns a boolean if a field has been set.

### GetItems

`func (o *ItemCategory) GetItems() []NamedAPIResource`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ItemCategory) GetItemsOk() (*[]NamedAPIResource, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ItemCategory) SetItems(v []NamedAPIResource)`

SetItems sets Items field to given value.

### HasItems

`func (o *ItemCategory) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


