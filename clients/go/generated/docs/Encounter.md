# Encounter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinLevel** | **int32** | The lowest level the Pokémon could be encountered at. | 
**MaxLevel** | **int32** | The highest level the Pokémon could be encountered at. | 
**ConditionValues** | Pointer to [**[]EncounterConditionValue**](EncounterConditionValue.md) | The condition which triggers this encounter. | [optional] 
**Chance** | Pointer to **int32** | Percent chance that this encounter will occur. | [optional] 
**Method** | [**EncounterMethod**](EncounterMethod.md) |  | 

## Methods

### NewEncounter

`func NewEncounter(minLevel int32, maxLevel int32, method EncounterMethod, ) *Encounter`

NewEncounter instantiates a new Encounter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterWithDefaults

`func NewEncounterWithDefaults() *Encounter`

NewEncounterWithDefaults instantiates a new Encounter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMinLevel

`func (o *Encounter) GetMinLevel() int32`

GetMinLevel returns the MinLevel field if non-nil, zero value otherwise.

### GetMinLevelOk

`func (o *Encounter) GetMinLevelOk() (*int32, bool)`

GetMinLevelOk returns a tuple with the MinLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinLevel

`func (o *Encounter) SetMinLevel(v int32)`

SetMinLevel sets MinLevel field to given value.


### GetMaxLevel

`func (o *Encounter) GetMaxLevel() int32`

GetMaxLevel returns the MaxLevel field if non-nil, zero value otherwise.

### GetMaxLevelOk

`func (o *Encounter) GetMaxLevelOk() (*int32, bool)`

GetMaxLevelOk returns a tuple with the MaxLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxLevel

`func (o *Encounter) SetMaxLevel(v int32)`

SetMaxLevel sets MaxLevel field to given value.


### GetConditionValues

`func (o *Encounter) GetConditionValues() []EncounterConditionValue`

GetConditionValues returns the ConditionValues field if non-nil, zero value otherwise.

### GetConditionValuesOk

`func (o *Encounter) GetConditionValuesOk() (*[]EncounterConditionValue, bool)`

GetConditionValuesOk returns a tuple with the ConditionValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConditionValues

`func (o *Encounter) SetConditionValues(v []EncounterConditionValue)`

SetConditionValues sets ConditionValues field to given value.

### HasConditionValues

`func (o *Encounter) HasConditionValues() bool`

HasConditionValues returns a boolean if a field has been set.

### GetChance

`func (o *Encounter) GetChance() int32`

GetChance returns the Chance field if non-nil, zero value otherwise.

### GetChanceOk

`func (o *Encounter) GetChanceOk() (*int32, bool)`

GetChanceOk returns a tuple with the Chance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChance

`func (o *Encounter) SetChance(v int32)`

SetChance sets Chance field to given value.

### HasChance

`func (o *Encounter) HasChance() bool`

HasChance returns a boolean if a field has been set.

### GetMethod

`func (o *Encounter) GetMethod() EncounterMethod`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *Encounter) GetMethodOk() (*EncounterMethod, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *Encounter) SetMethod(v EncounterMethod)`

SetMethod sets Method field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


