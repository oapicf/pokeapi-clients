# ItemPocket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Categories** | Pointer to [**[]ItemCategory**](ItemCategory.md) |  | [optional] 

## Methods

### NewItemPocket

`func NewItemPocket() *ItemPocket`

NewItemPocket instantiates a new ItemPocket object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemPocketWithDefaults

`func NewItemPocketWithDefaults() *ItemPocket`

NewItemPocketWithDefaults instantiates a new ItemPocket object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ItemPocket) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemPocket) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemPocket) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ItemPocket) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *ItemPocket) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ItemPocket) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ItemPocket) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ItemPocket) HasName() bool`

HasName returns a boolean if a field has been set.

### GetCategories

`func (o *ItemPocket) GetCategories() []ItemCategory`

GetCategories returns the Categories field if non-nil, zero value otherwise.

### GetCategoriesOk

`func (o *ItemPocket) GetCategoriesOk() (*[]ItemCategory, bool)`

GetCategoriesOk returns a tuple with the Categories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategories

`func (o *ItemPocket) SetCategories(v []ItemCategory)`

SetCategories sets Categories field to given value.

### HasCategories

`func (o *ItemPocket) HasCategories() bool`

HasCategories returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


