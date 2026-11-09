# EncounterPokemonDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinPerfectIvs** | Pointer to **NullableInt32** | The minimum number of perfect IVs, or null if unspecified. | [optional] 
**AlwaysShiny** | Pointer to **bool** | Whether the encountered Pokémon is always shiny. | [optional] 
**NeverShiny** | Pointer to **bool** | Whether the encountered Pokémon can never be shiny. | [optional] 
**IsAlpha** | Pointer to **bool** | Whether the encountered Pokémon is an alpha Pokémon. | [optional] 

## Methods

### NewEncounterPokemonDetail

`func NewEncounterPokemonDetail() *EncounterPokemonDetail`

NewEncounterPokemonDetail instantiates a new EncounterPokemonDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterPokemonDetailWithDefaults

`func NewEncounterPokemonDetailWithDefaults() *EncounterPokemonDetail`

NewEncounterPokemonDetailWithDefaults instantiates a new EncounterPokemonDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMinPerfectIvs

`func (o *EncounterPokemonDetail) GetMinPerfectIvs() int32`

GetMinPerfectIvs returns the MinPerfectIvs field if non-nil, zero value otherwise.

### GetMinPerfectIvsOk

`func (o *EncounterPokemonDetail) GetMinPerfectIvsOk() (*int32, bool)`

GetMinPerfectIvsOk returns a tuple with the MinPerfectIvs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinPerfectIvs

`func (o *EncounterPokemonDetail) SetMinPerfectIvs(v int32)`

SetMinPerfectIvs sets MinPerfectIvs field to given value.

### HasMinPerfectIvs

`func (o *EncounterPokemonDetail) HasMinPerfectIvs() bool`

HasMinPerfectIvs returns a boolean if a field has been set.

### SetMinPerfectIvsNil

`func (o *EncounterPokemonDetail) SetMinPerfectIvsNil(b bool)`

 SetMinPerfectIvsNil sets the value for MinPerfectIvs to be an explicit nil

### UnsetMinPerfectIvs
`func (o *EncounterPokemonDetail) UnsetMinPerfectIvs()`

UnsetMinPerfectIvs ensures that no value is present for MinPerfectIvs, not even an explicit nil
### GetAlwaysShiny

`func (o *EncounterPokemonDetail) GetAlwaysShiny() bool`

GetAlwaysShiny returns the AlwaysShiny field if non-nil, zero value otherwise.

### GetAlwaysShinyOk

`func (o *EncounterPokemonDetail) GetAlwaysShinyOk() (*bool, bool)`

GetAlwaysShinyOk returns a tuple with the AlwaysShiny field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlwaysShiny

`func (o *EncounterPokemonDetail) SetAlwaysShiny(v bool)`

SetAlwaysShiny sets AlwaysShiny field to given value.

### HasAlwaysShiny

`func (o *EncounterPokemonDetail) HasAlwaysShiny() bool`

HasAlwaysShiny returns a boolean if a field has been set.

### GetNeverShiny

`func (o *EncounterPokemonDetail) GetNeverShiny() bool`

GetNeverShiny returns the NeverShiny field if non-nil, zero value otherwise.

### GetNeverShinyOk

`func (o *EncounterPokemonDetail) GetNeverShinyOk() (*bool, bool)`

GetNeverShinyOk returns a tuple with the NeverShiny field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeverShiny

`func (o *EncounterPokemonDetail) SetNeverShiny(v bool)`

SetNeverShiny sets NeverShiny field to given value.

### HasNeverShiny

`func (o *EncounterPokemonDetail) HasNeverShiny() bool`

HasNeverShiny returns a boolean if a field has been set.

### GetIsAlpha

`func (o *EncounterPokemonDetail) GetIsAlpha() bool`

GetIsAlpha returns the IsAlpha field if non-nil, zero value otherwise.

### GetIsAlphaOk

`func (o *EncounterPokemonDetail) GetIsAlphaOk() (*bool, bool)`

GetIsAlphaOk returns a tuple with the IsAlpha field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAlpha

`func (o *EncounterPokemonDetail) SetIsAlpha(v bool)`

SetIsAlpha sets IsAlpha field to given value.

### HasIsAlpha

`func (o *EncounterPokemonDetail) HasIsAlpha() bool`

HasIsAlpha returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


