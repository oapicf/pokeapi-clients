# PokemonPastStat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed stats. | 
**Stats** | [**[]PokemonStat**](PokemonStat.md) | The stat the Pokémon had up to and including the listed generation. | 

## Methods

### NewPokemonPastStat

`func NewPokemonPastStat(generation GenerationSummary, stats []PokemonStat, ) *PokemonPastStat`

NewPokemonPastStat instantiates a new PokemonPastStat object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonPastStatWithDefaults

`func NewPokemonPastStatWithDefaults() *PokemonPastStat`

NewPokemonPastStatWithDefaults instantiates a new PokemonPastStat object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGeneration

`func (o *PokemonPastStat) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *PokemonPastStat) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *PokemonPastStat) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.


### GetStats

`func (o *PokemonPastStat) GetStats() []PokemonStat`

GetStats returns the Stats field if non-nil, zero value otherwise.

### GetStatsOk

`func (o *PokemonPastStat) GetStatsOk() (*[]PokemonStat, bool)`

GetStatsOk returns a tuple with the Stats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStats

`func (o *PokemonPastStat) SetStats(v []PokemonStat)`

SetStats sets Stats field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


