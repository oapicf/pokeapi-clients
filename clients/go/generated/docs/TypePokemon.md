# TypePokemon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Slot** | **int32** | The order the Pokémon&#39;s types are listed in. | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that has the referenced type. | 

## Methods

### NewTypePokemon

`func NewTypePokemon(slot int32, pokemon PokemonSummary, ) *TypePokemon`

NewTypePokemon instantiates a new TypePokemon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTypePokemonWithDefaults

`func NewTypePokemonWithDefaults() *TypePokemon`

NewTypePokemonWithDefaults instantiates a new TypePokemon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSlot

`func (o *TypePokemon) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *TypePokemon) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *TypePokemon) SetSlot(v int32)`

SetSlot sets Slot field to given value.


### GetPokemon

`func (o *TypePokemon) GetPokemon() PokemonSummary`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *TypePokemon) GetPokemonOk() (*PokemonSummary, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *TypePokemon) SetPokemon(v PokemonSummary)`

SetPokemon sets Pokemon field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


