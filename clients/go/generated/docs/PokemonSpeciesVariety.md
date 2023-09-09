# PokemonSpeciesVariety

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsDefault** | Pointer to **bool** | Whether this is the default \&quot;natural\&quot; variety of this species. Note that \&quot;default\&quot; is subjective and that it may not match the Pokémon games&#39; official status.  | [optional] 
**Pokemon** | Pointer to [**Pokemon**](Pokemon.md) |  | [optional] 
**Name** | Pointer to **string** | The name of this Pokémon species variety | [optional] 

## Methods

### NewPokemonSpeciesVariety

`func NewPokemonSpeciesVariety() *PokemonSpeciesVariety`

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

### HasIsDefault

`func (o *PokemonSpeciesVariety) HasIsDefault() bool`

HasIsDefault returns a boolean if a field has been set.

### GetPokemon

`func (o *PokemonSpeciesVariety) GetPokemon() Pokemon`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *PokemonSpeciesVariety) GetPokemonOk() (*Pokemon, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *PokemonSpeciesVariety) SetPokemon(v Pokemon)`

SetPokemon sets Pokemon field to given value.

### HasPokemon

`func (o *PokemonSpeciesVariety) HasPokemon() bool`

HasPokemon returns a boolean if a field has been set.

### GetName

`func (o *PokemonSpeciesVariety) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokemonSpeciesVariety) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokemonSpeciesVariety) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *PokemonSpeciesVariety) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


