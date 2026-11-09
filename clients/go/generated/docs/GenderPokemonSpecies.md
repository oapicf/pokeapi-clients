# GenderPokemonSpecies

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rate** | **int32** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | 
**PokemonSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | A Pokémon species that can be the referenced gender. | 

## Methods

### NewGenderPokemonSpecies

`func NewGenderPokemonSpecies(rate int32, pokemonSpecies PokemonSpeciesSummary, ) *GenderPokemonSpecies`

NewGenderPokemonSpecies instantiates a new GenderPokemonSpecies object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenderPokemonSpeciesWithDefaults

`func NewGenderPokemonSpeciesWithDefaults() *GenderPokemonSpecies`

NewGenderPokemonSpeciesWithDefaults instantiates a new GenderPokemonSpecies object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRate

`func (o *GenderPokemonSpecies) GetRate() int32`

GetRate returns the Rate field if non-nil, zero value otherwise.

### GetRateOk

`func (o *GenderPokemonSpecies) GetRateOk() (*int32, bool)`

GetRateOk returns a tuple with the Rate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRate

`func (o *GenderPokemonSpecies) SetRate(v int32)`

SetRate sets Rate field to given value.


### GetPokemonSpecies

`func (o *GenderPokemonSpecies) GetPokemonSpecies() PokemonSpeciesSummary`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *GenderPokemonSpecies) GetPokemonSpeciesOk() (*PokemonSpeciesSummary, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *GenderPokemonSpecies) SetPokemonSpecies(v PokemonSpeciesSummary)`

SetPokemonSpecies sets PokemonSpecies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


