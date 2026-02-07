# ItemAttributeDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Descriptions** | [**[]ItemAttributeDescription**](ItemAttributeDescription.md) |  | 
**Items** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Names** | [**[]ItemAttributeName**](ItemAttributeName.md) |  | 

## Methods

### NewItemAttributeDetail

`func NewItemAttributeDetail(id int32, name string, descriptions []ItemAttributeDescription, items []AbilityDetailPokemonInnerPokemon, names []ItemAttributeName, ) *ItemAttributeDetail`

NewItemAttributeDetail instantiates a new ItemAttributeDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemAttributeDetailWithDefaults

`func NewItemAttributeDetailWithDefaults() *ItemAttributeDetail`

NewItemAttributeDetailWithDefaults instantiates a new ItemAttributeDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ItemAttributeDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemAttributeDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemAttributeDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *ItemAttributeDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ItemAttributeDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ItemAttributeDetail) SetName(v string)`

SetName sets Name field to given value.


### GetDescriptions

`func (o *ItemAttributeDetail) GetDescriptions() []ItemAttributeDescription`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *ItemAttributeDetail) GetDescriptionsOk() (*[]ItemAttributeDescription, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *ItemAttributeDetail) SetDescriptions(v []ItemAttributeDescription)`

SetDescriptions sets Descriptions field to given value.


### GetItems

`func (o *ItemAttributeDetail) GetItems() []AbilityDetailPokemonInnerPokemon`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ItemAttributeDetail) GetItemsOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ItemAttributeDetail) SetItems(v []AbilityDetailPokemonInnerPokemon)`

SetItems sets Items field to given value.


### GetNames

`func (o *ItemAttributeDetail) GetNames() []ItemAttributeName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *ItemAttributeDetail) GetNamesOk() (*[]ItemAttributeName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *ItemAttributeDetail) SetNames(v []ItemAttributeName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


