# PokemonHeldItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | Pointer to [**Item**](Item.md) |  | [optional] 
**VersionDetails** | Pointer to [**[]PokemonHeldItemVersionDetailsInner**](PokemonHeldItemVersionDetailsInner.md) |  | [optional] 

## Methods

### NewPokemonHeldItem

`func NewPokemonHeldItem() *PokemonHeldItem`

NewPokemonHeldItem instantiates a new PokemonHeldItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonHeldItemWithDefaults

`func NewPokemonHeldItemWithDefaults() *PokemonHeldItem`

NewPokemonHeldItemWithDefaults instantiates a new PokemonHeldItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItem

`func (o *PokemonHeldItem) GetItem() Item`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *PokemonHeldItem) GetItemOk() (*Item, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *PokemonHeldItem) SetItem(v Item)`

SetItem sets Item field to given value.

### HasItem

`func (o *PokemonHeldItem) HasItem() bool`

HasItem returns a boolean if a field has been set.

### GetVersionDetails

`func (o *PokemonHeldItem) GetVersionDetails() []PokemonHeldItemVersionDetailsInner`

GetVersionDetails returns the VersionDetails field if non-nil, zero value otherwise.

### GetVersionDetailsOk

`func (o *PokemonHeldItem) GetVersionDetailsOk() (*[]PokemonHeldItemVersionDetailsInner, bool)`

GetVersionDetailsOk returns a tuple with the VersionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionDetails

`func (o *PokemonHeldItem) SetVersionDetails(v []PokemonHeldItemVersionDetailsInner)`

SetVersionDetails sets VersionDetails field to given value.

### HasVersionDetails

`func (o *PokemonHeldItem) HasVersionDetails() bool`

HasVersionDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


