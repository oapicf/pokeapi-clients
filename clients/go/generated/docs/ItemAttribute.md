# ItemAttribute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The identifier for this item attribute resource | [optional] 
**Name** | Pointer to **string** | The name for this item attribute resource | [optional] 
**Items** | Pointer to [**[]NamedAPIResource**](NamedAPIResource.md) | A list of items that have this attribute | [optional] 

## Methods

### NewItemAttribute

`func NewItemAttribute() *ItemAttribute`

NewItemAttribute instantiates a new ItemAttribute object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemAttributeWithDefaults

`func NewItemAttributeWithDefaults() *ItemAttribute`

NewItemAttributeWithDefaults instantiates a new ItemAttribute object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ItemAttribute) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemAttribute) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemAttribute) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ItemAttribute) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *ItemAttribute) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ItemAttribute) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ItemAttribute) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ItemAttribute) HasName() bool`

HasName returns a boolean if a field has been set.

### GetItems

`func (o *ItemAttribute) GetItems() []NamedAPIResource`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ItemAttribute) GetItemsOk() (*[]NamedAPIResource, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ItemAttribute) SetItems(v []NamedAPIResource)`

SetItems sets Items field to given value.

### HasItems

`func (o *ItemAttribute) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


