# ItemFlingEffect

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**EffectEntries** | Pointer to [**[]VerboseEffect**](VerboseEffect.md) |  | [optional] 
**Items** | Pointer to [**[]Item**](Item.md) |  | [optional] 

## Methods

### NewItemFlingEffect

`func NewItemFlingEffect() *ItemFlingEffect`

NewItemFlingEffect instantiates a new ItemFlingEffect object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemFlingEffectWithDefaults

`func NewItemFlingEffectWithDefaults() *ItemFlingEffect`

NewItemFlingEffectWithDefaults instantiates a new ItemFlingEffect object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ItemFlingEffect) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemFlingEffect) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemFlingEffect) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ItemFlingEffect) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *ItemFlingEffect) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ItemFlingEffect) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ItemFlingEffect) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ItemFlingEffect) HasName() bool`

HasName returns a boolean if a field has been set.

### GetEffectEntries

`func (o *ItemFlingEffect) GetEffectEntries() []VerboseEffect`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *ItemFlingEffect) GetEffectEntriesOk() (*[]VerboseEffect, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *ItemFlingEffect) SetEffectEntries(v []VerboseEffect)`

SetEffectEntries sets EffectEntries field to given value.

### HasEffectEntries

`func (o *ItemFlingEffect) HasEffectEntries() bool`

HasEffectEntries returns a boolean if a field has been set.

### GetItems

`func (o *ItemFlingEffect) GetItems() []Item`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ItemFlingEffect) GetItemsOk() (*[]Item, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ItemFlingEffect) SetItems(v []Item)`

SetItems sets Items field to given value.

### HasItems

`func (o *ItemFlingEffect) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


