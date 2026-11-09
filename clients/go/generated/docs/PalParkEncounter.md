# PalParkEncounter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseScore** | Pointer to **NullableInt32** | The base score given to the player when this Pokémon is caught during a pal park run. | [optional] 
**Rate** | **int32** | The base rate for encountering this Pokémon in this pal park area. | 
**PokemonSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. | 

## Methods

### NewPalParkEncounter

`func NewPalParkEncounter(rate int32, pokemonSpecies PokemonSpeciesSummary, ) *PalParkEncounter`

NewPalParkEncounter instantiates a new PalParkEncounter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPalParkEncounterWithDefaults

`func NewPalParkEncounterWithDefaults() *PalParkEncounter`

NewPalParkEncounterWithDefaults instantiates a new PalParkEncounter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBaseScore

`func (o *PalParkEncounter) GetBaseScore() int32`

GetBaseScore returns the BaseScore field if non-nil, zero value otherwise.

### GetBaseScoreOk

`func (o *PalParkEncounter) GetBaseScoreOk() (*int32, bool)`

GetBaseScoreOk returns a tuple with the BaseScore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseScore

`func (o *PalParkEncounter) SetBaseScore(v int32)`

SetBaseScore sets BaseScore field to given value.

### HasBaseScore

`func (o *PalParkEncounter) HasBaseScore() bool`

HasBaseScore returns a boolean if a field has been set.

### SetBaseScoreNil

`func (o *PalParkEncounter) SetBaseScoreNil(b bool)`

 SetBaseScoreNil sets the value for BaseScore to be an explicit nil

### UnsetBaseScore
`func (o *PalParkEncounter) UnsetBaseScore()`

UnsetBaseScore ensures that no value is present for BaseScore, not even an explicit nil
### GetRate

`func (o *PalParkEncounter) GetRate() int32`

GetRate returns the Rate field if non-nil, zero value otherwise.

### GetRateOk

`func (o *PalParkEncounter) GetRateOk() (*int32, bool)`

GetRateOk returns a tuple with the Rate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRate

`func (o *PalParkEncounter) SetRate(v int32)`

SetRate sets Rate field to given value.


### GetPokemonSpecies

`func (o *PalParkEncounter) GetPokemonSpecies() PokemonSpeciesSummary`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *PalParkEncounter) GetPokemonSpeciesOk() (*PokemonSpeciesSummary, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *PalParkEncounter) SetPokemonSpecies(v PokemonSpeciesSummary)`

SetPokemonSpecies sets PokemonSpecies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


