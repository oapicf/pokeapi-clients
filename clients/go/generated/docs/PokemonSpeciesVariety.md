# PokemonSpeciesVariety

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsDefault** | **bool** | Whether this variety is the default variety. | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon variety. | 

## Methods

### NewPokemonSpeciesVariety

`func NewPokemonSpeciesVariety(isDefault bool, pokemon PokemonSummary, ) *PokemonSpeciesVariety`

NewPokemonSpeciesVariety instantiates a new PokemonSpeciesVariety object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpeciesVarietyWithDefaults

`func NewPokemonSpeciesVarietyWithDefaults() *PokemonSpeciesVariety`

NewPokemonSpeciesVarietyWithDefaults instantiates a new PokemonSpeciesVariety object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIsDefault

`func (o *PokemonSpeciesVariety) GetIsDefault() bool`

GetIsDefault returns the IsDefault field if non-nil, zero value otherwise.

### GetIsDefaultOk

`func (o *PokemonSpeciesVariety) GetIsDefaultOk() (*bool, bool)`

GetIsDefaultOk returns a tuple with the IsDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDefault

`func (o *PokemonSpeciesVariety) SetIsDefault(v bool)`

SetIsDefault sets IsDefault field to given value.


### GetPokemon

`func (o *PokemonSpeciesVariety) GetPokemon() PokemonSummary`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *PokemonSpeciesVariety) GetPokemonOk() (*PokemonSummary, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *PokemonSpeciesVariety) SetPokemon(v PokemonSummary)`

SetPokemon sets Pokemon field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


