# PokemonStat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Stat** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 
**Effort** | Pointer to **int32** | The effort points (EV) the Pokémon has in the stat. | [optional] 
**BaseStat** | Pointer to **int32** | The base value of the stat. | [optional] 

## Methods

### NewPokemonStat

`func NewPokemonStat() *PokemonStat`

NewPokemonStat instantiates a new PokemonStat object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonStatWithDefaults

`func NewPokemonStatWithDefaults() *PokemonStat`

NewPokemonStatWithDefaults instantiates a new PokemonStat object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStat

`func (o *PokemonStat) GetStat() NamedAPIResource`

GetStat returns the Stat field if non-nil, zero value otherwise.

### GetStatOk

`func (o *PokemonStat) GetStatOk() (*NamedAPIResource, bool)`

GetStatOk returns a tuple with the Stat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStat

`func (o *PokemonStat) SetStat(v NamedAPIResource)`

SetStat sets Stat field to given value.

### HasStat

`func (o *PokemonStat) HasStat() bool`

HasStat returns a boolean if a field has been set.

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

### HasEffort

`func (o *PokemonStat) HasEffort() bool`

HasEffort returns a boolean if a field has been set.

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

### HasBaseStat

`func (o *PokemonStat) HasBaseStat() bool`

HasBaseStat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


