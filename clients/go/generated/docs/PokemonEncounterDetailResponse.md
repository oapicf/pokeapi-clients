# PokemonEncounterDetailResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chance** | **int32** | Percent chance that this encounter will occur. | 
**ConditionValues** | [**[]EncounterConditionValueSummary**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | 
**MaxLevel** | **int32** | The highest level the Pokémon could be encountered at. | 
**Method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | 
**MinLevel** | **int32** | The lowest level the Pokémon could be encountered at. | 

## Methods

### NewPokemonEncounterDetailResponse

`func NewPokemonEncounterDetailResponse(chance int32, conditionValues []EncounterConditionValueSummary, maxLevel int32, method EncounterMethodSummary, minLevel int32, ) *PokemonEncounterDetailResponse`

NewPokemonEncounterDetailResponse instantiates a new PokemonEncounterDetailResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonEncounterDetailResponseWithDefaults

`func NewPokemonEncounterDetailResponseWithDefaults() *PokemonEncounterDetailResponse`

NewPokemonEncounterDetailResponseWithDefaults instantiates a new PokemonEncounterDetailResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChance

`func (o *PokemonEncounterDetailResponse) GetChance() int32`

GetChance returns the Chance field if non-nil, zero value otherwise.

### GetChanceOk

`func (o *PokemonEncounterDetailResponse) GetChanceOk() (*int32, bool)`

GetChanceOk returns a tuple with the Chance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChance

`func (o *PokemonEncounterDetailResponse) SetChance(v int32)`

SetChance sets Chance field to given value.


### GetConditionValues

`func (o *PokemonEncounterDetailResponse) GetConditionValues() []EncounterConditionValueSummary`

GetConditionValues returns the ConditionValues field if non-nil, zero value otherwise.

### GetConditionValuesOk

`func (o *PokemonEncounterDetailResponse) GetConditionValuesOk() (*[]EncounterConditionValueSummary, bool)`

GetConditionValuesOk returns a tuple with the ConditionValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConditionValues

`func (o *PokemonEncounterDetailResponse) SetConditionValues(v []EncounterConditionValueSummary)`

SetConditionValues sets ConditionValues field to given value.


### GetMaxLevel

`func (o *PokemonEncounterDetailResponse) GetMaxLevel() int32`

GetMaxLevel returns the MaxLevel field if non-nil, zero value otherwise.

### GetMaxLevelOk

`func (o *PokemonEncounterDetailResponse) GetMaxLevelOk() (*int32, bool)`

GetMaxLevelOk returns a tuple with the MaxLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxLevel

`func (o *PokemonEncounterDetailResponse) SetMaxLevel(v int32)`

SetMaxLevel sets MaxLevel field to given value.


### GetMethod

`func (o *PokemonEncounterDetailResponse) GetMethod() EncounterMethodSummary`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *PokemonEncounterDetailResponse) GetMethodOk() (*EncounterMethodSummary, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *PokemonEncounterDetailResponse) SetMethod(v EncounterMethodSummary)`

SetMethod sets Method field to given value.


### GetMinLevel

`func (o *PokemonEncounterDetailResponse) GetMinLevel() int32`

GetMinLevel returns the MinLevel field if non-nil, zero value otherwise.

### GetMinLevelOk

`func (o *PokemonEncounterDetailResponse) GetMinLevelOk() (*int32, bool)`

GetMinLevelOk returns a tuple with the MinLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinLevel

`func (o *PokemonEncounterDetailResponse) SetMinLevel(v int32)`

SetMinLevel sets MinLevel field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


