# LocationAreaEncounterDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinLevel** | **int32** | The lowest level the Pokémon could be encountered at. | 
**MaxLevel** | **int32** | The highest level the Pokémon could be encountered at. | 
**Chance** | Pointer to **int32** | Percent chance that this encounter will occur. | [optional] [default to 0]
**Method** | Pointer to [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] 
**ConditionValues** | [**[]EncounterConditionValueSummary**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] 
**PokemonDetails** | [**NullableEncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] 

## Methods

### NewLocationAreaEncounterDetail

`func NewLocationAreaEncounterDetail(minLevel int32, maxLevel int32, conditionValues []EncounterConditionValueSummary, pokemonDetails NullableEncounterPokemonDetail, ) *LocationAreaEncounterDetail`

NewLocationAreaEncounterDetail instantiates a new LocationAreaEncounterDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationAreaEncounterDetailWithDefaults

`func NewLocationAreaEncounterDetailWithDefaults() *LocationAreaEncounterDetail`

NewLocationAreaEncounterDetailWithDefaults instantiates a new LocationAreaEncounterDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMinLevel

`func (o *LocationAreaEncounterDetail) GetMinLevel() int32`

GetMinLevel returns the MinLevel field if non-nil, zero value otherwise.

### GetMinLevelOk

`func (o *LocationAreaEncounterDetail) GetMinLevelOk() (*int32, bool)`

GetMinLevelOk returns a tuple with the MinLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinLevel

`func (o *LocationAreaEncounterDetail) SetMinLevel(v int32)`

SetMinLevel sets MinLevel field to given value.


### GetMaxLevel

`func (o *LocationAreaEncounterDetail) GetMaxLevel() int32`

GetMaxLevel returns the MaxLevel field if non-nil, zero value otherwise.

### GetMaxLevelOk

`func (o *LocationAreaEncounterDetail) GetMaxLevelOk() (*int32, bool)`

GetMaxLevelOk returns a tuple with the MaxLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxLevel

`func (o *LocationAreaEncounterDetail) SetMaxLevel(v int32)`

SetMaxLevel sets MaxLevel field to given value.


### GetChance

`func (o *LocationAreaEncounterDetail) GetChance() int32`

GetChance returns the Chance field if non-nil, zero value otherwise.

### GetChanceOk

`func (o *LocationAreaEncounterDetail) GetChanceOk() (*int32, bool)`

GetChanceOk returns a tuple with the Chance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChance

`func (o *LocationAreaEncounterDetail) SetChance(v int32)`

SetChance sets Chance field to given value.

### HasChance

`func (o *LocationAreaEncounterDetail) HasChance() bool`

HasChance returns a boolean if a field has been set.

### GetMethod

`func (o *LocationAreaEncounterDetail) GetMethod() EncounterMethodSummary`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *LocationAreaEncounterDetail) GetMethodOk() (*EncounterMethodSummary, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *LocationAreaEncounterDetail) SetMethod(v EncounterMethodSummary)`

SetMethod sets Method field to given value.

### HasMethod

`func (o *LocationAreaEncounterDetail) HasMethod() bool`

HasMethod returns a boolean if a field has been set.

### GetConditionValues

`func (o *LocationAreaEncounterDetail) GetConditionValues() []EncounterConditionValueSummary`

GetConditionValues returns the ConditionValues field if non-nil, zero value otherwise.

### GetConditionValuesOk

`func (o *LocationAreaEncounterDetail) GetConditionValuesOk() (*[]EncounterConditionValueSummary, bool)`

GetConditionValuesOk returns a tuple with the ConditionValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConditionValues

`func (o *LocationAreaEncounterDetail) SetConditionValues(v []EncounterConditionValueSummary)`

SetConditionValues sets ConditionValues field to given value.


### GetPokemonDetails

`func (o *LocationAreaEncounterDetail) GetPokemonDetails() EncounterPokemonDetail`

GetPokemonDetails returns the PokemonDetails field if non-nil, zero value otherwise.

### GetPokemonDetailsOk

`func (o *LocationAreaEncounterDetail) GetPokemonDetailsOk() (*EncounterPokemonDetail, bool)`

GetPokemonDetailsOk returns a tuple with the PokemonDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonDetails

`func (o *LocationAreaEncounterDetail) SetPokemonDetails(v EncounterPokemonDetail)`

SetPokemonDetails sets PokemonDetails field to given value.


### SetPokemonDetailsNil

`func (o *LocationAreaEncounterDetail) SetPokemonDetailsNil(b bool)`

 SetPokemonDetailsNil sets the value for PokemonDetails to be an explicit nil

### UnsetPokemonDetails
`func (o *LocationAreaEncounterDetail) UnsetPokemonDetails()`

UnsetPokemonDetails ensures that no value is present for PokemonDetails, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


