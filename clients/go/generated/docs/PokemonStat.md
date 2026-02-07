# PokemonStat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BaseStat** | **int32** |  | 
**Effort** | **int32** |  | 
**Stat** | [**StatSummary**](StatSummary.md) |  | 

## Methods

### NewPokemonStat

`func NewPokemonStat(baseStat int32, effort int32, stat StatSummary, ) *PokemonStat`

NewPokemonStat instantiates a new PokemonStat object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonStatWithDefaults

`func NewPokemonStatWithDefaults() *PokemonStat`

NewPokemonStatWithDefaults instantiates a new PokemonStat object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBaseStat

`func (o *PokemonStat) GetBaseStat() int32`

GetBaseStat returns the BaseStat field if non-nil, zero value otherwise.

### GetBaseStatOk

`func (o *PokemonStat) GetBaseStatOk() (*int32, bool)`

GetBaseStatOk returns a tuple with the BaseStat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseStat

`func (o *PokemonStat) SetBaseStat(v int32)`

SetBaseStat sets BaseStat field to given value.


### GetEffort

`func (o *PokemonStat) GetEffort() int32`

GetEffort returns the Effort field if non-nil, zero value otherwise.

### GetEffortOk

`func (o *PokemonStat) GetEffortOk() (*int32, bool)`

GetEffortOk returns a tuple with the Effort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffort

`func (o *PokemonStat) SetEffort(v int32)`

SetEffort sets Effort field to given value.


### GetStat

`func (o *PokemonStat) GetStat() StatSummary`

GetStat returns the Stat field if non-nil, zero value otherwise.

### GetStatOk

`func (o *PokemonStat) GetStatOk() (*StatSummary, bool)`

GetStatOk returns a tuple with the Stat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStat

`func (o *PokemonStat) SetStat(v StatSummary)`

SetStat sets Stat field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


