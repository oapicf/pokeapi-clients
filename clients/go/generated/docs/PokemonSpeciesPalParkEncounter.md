# PokemonSpeciesPalParkEncounter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseScore** | Pointer to **NullableInt32** | The base score given to the player when the referenced Pokémon is caught during a pal park run. | [optional] 
**Rate** | **int32** | The base rate for encountering the referenced Pokémon in this pal park area. | 
**Area** | [**PalParkAreaSummary**](PalParkAreaSummary.md) | The pal park area where this encounter happens. | 

## Methods

### NewPokemonSpeciesPalParkEncounter

`func NewPokemonSpeciesPalParkEncounter(rate int32, area PalParkAreaSummary, ) *PokemonSpeciesPalParkEncounter`

NewPokemonSpeciesPalParkEncounter instantiates a new PokemonSpeciesPalParkEncounter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpeciesPalParkEncounterWithDefaults

`func NewPokemonSpeciesPalParkEncounterWithDefaults() *PokemonSpeciesPalParkEncounter`

NewPokemonSpeciesPalParkEncounterWithDefaults instantiates a new PokemonSpeciesPalParkEncounter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBaseScore

`func (o *PokemonSpeciesPalParkEncounter) GetBaseScore() int32`

GetBaseScore returns the BaseScore field if non-nil, zero value otherwise.

### GetBaseScoreOk

`func (o *PokemonSpeciesPalParkEncounter) GetBaseScoreOk() (*int32, bool)`

GetBaseScoreOk returns a tuple with the BaseScore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseScore

`func (o *PokemonSpeciesPalParkEncounter) SetBaseScore(v int32)`

SetBaseScore sets BaseScore field to given value.

### HasBaseScore

`func (o *PokemonSpeciesPalParkEncounter) HasBaseScore() bool`

HasBaseScore returns a boolean if a field has been set.

### SetBaseScoreNil

`func (o *PokemonSpeciesPalParkEncounter) SetBaseScoreNil(b bool)`

 SetBaseScoreNil sets the value for BaseScore to be an explicit nil

### UnsetBaseScore
`func (o *PokemonSpeciesPalParkEncounter) UnsetBaseScore()`

UnsetBaseScore ensures that no value is present for BaseScore, not even an explicit nil
### GetRate

`func (o *PokemonSpeciesPalParkEncounter) GetRate() int32`

GetRate returns the Rate field if non-nil, zero value otherwise.

### GetRateOk

`func (o *PokemonSpeciesPalParkEncounter) GetRateOk() (*int32, bool)`

GetRateOk returns a tuple with the Rate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRate

`func (o *PokemonSpeciesPalParkEncounter) SetRate(v int32)`

SetRate sets Rate field to given value.


### GetArea

`func (o *PokemonSpeciesPalParkEncounter) GetArea() PalParkAreaSummary`

GetArea returns the Area field if non-nil, zero value otherwise.

### GetAreaOk

`func (o *PokemonSpeciesPalParkEncounter) GetAreaOk() (*PalParkAreaSummary, bool)`

GetAreaOk returns a tuple with the Area field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArea

`func (o *PokemonSpeciesPalParkEncounter) SetArea(v PalParkAreaSummary)`

SetArea sets Area field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


