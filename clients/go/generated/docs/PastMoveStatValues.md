# PastMoveStatValues

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accuracy** | **int32** | The percent value of how likely this move is to be successful. | 
**EffectChance** | Pointer to **int32** | The percent value of effect occurring. | [optional] 
**Power** | **int32** | The base power of this move with a value of 0 if it does not have a base power. | 
**Pp** | **int32** | The power points this move has left. | 
**EffectEntries** | Pointer to [**[]PastMoveStatValuesEffectEntriesInner**](PastMoveStatValuesEffectEntriesInner.md) | The list of previous effects this move has had across version groups. | [optional] 
**Type** | Pointer to [**Type**](Type.md) |  | [optional] 

## Methods

### NewPastMoveStatValues

`func NewPastMoveStatValues(accuracy int32, power int32, pp int32, ) *PastMoveStatValues`

NewPastMoveStatValues instantiates a new PastMoveStatValues object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPastMoveStatValuesWithDefaults

`func NewPastMoveStatValuesWithDefaults() *PastMoveStatValues`

NewPastMoveStatValuesWithDefaults instantiates a new PastMoveStatValues object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccuracy

`func (o *PastMoveStatValues) GetAccuracy() int32`

GetAccuracy returns the Accuracy field if non-nil, zero value otherwise.

### GetAccuracyOk

`func (o *PastMoveStatValues) GetAccuracyOk() (*int32, bool)`

GetAccuracyOk returns a tuple with the Accuracy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccuracy

`func (o *PastMoveStatValues) SetAccuracy(v int32)`

SetAccuracy sets Accuracy field to given value.


### GetEffectChance

`func (o *PastMoveStatValues) GetEffectChance() int32`

GetEffectChance returns the EffectChance field if non-nil, zero value otherwise.

### GetEffectChanceOk

`func (o *PastMoveStatValues) GetEffectChanceOk() (*int32, bool)`

GetEffectChanceOk returns a tuple with the EffectChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChance

`func (o *PastMoveStatValues) SetEffectChance(v int32)`

SetEffectChance sets EffectChance field to given value.

### HasEffectChance

`func (o *PastMoveStatValues) HasEffectChance() bool`

HasEffectChance returns a boolean if a field has been set.

### GetPower

`func (o *PastMoveStatValues) GetPower() int32`

GetPower returns the Power field if non-nil, zero value otherwise.

### GetPowerOk

`func (o *PastMoveStatValues) GetPowerOk() (*int32, bool)`

GetPowerOk returns a tuple with the Power field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPower

`func (o *PastMoveStatValues) SetPower(v int32)`

SetPower sets Power field to given value.


### GetPp

`func (o *PastMoveStatValues) GetPp() int32`

GetPp returns the Pp field if non-nil, zero value otherwise.

### GetPpOk

`func (o *PastMoveStatValues) GetPpOk() (*int32, bool)`

GetPpOk returns a tuple with the Pp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPp

`func (o *PastMoveStatValues) SetPp(v int32)`

SetPp sets Pp field to given value.


### GetEffectEntries

`func (o *PastMoveStatValues) GetEffectEntries() []PastMoveStatValuesEffectEntriesInner`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *PastMoveStatValues) GetEffectEntriesOk() (*[]PastMoveStatValuesEffectEntriesInner, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *PastMoveStatValues) SetEffectEntries(v []PastMoveStatValuesEffectEntriesInner)`

SetEffectEntries sets EffectEntries field to given value.

### HasEffectEntries

`func (o *PastMoveStatValues) HasEffectEntries() bool`

HasEffectEntries returns a boolean if a field has been set.

### GetType

`func (o *PastMoveStatValues) GetType() Type`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *PastMoveStatValues) GetTypeOk() (*Type, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *PastMoveStatValues) SetType(v Type)`

SetType sets Type field to given value.

### HasType

`func (o *PastMoveStatValues) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


