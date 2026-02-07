# MoveChange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accuracy** | Pointer to **NullableInt32** |  | [optional] 
**Power** | Pointer to **NullableInt32** |  | [optional] 
**Pp** | Pointer to **NullableInt32** |  | [optional] 
**EffectChance** | **int32** |  | 
**EffectEntries** | [**[]MoveChangeEffectEntriesInner**](MoveChangeEffectEntriesInner.md) |  | 
**Type** | [**TypeSummary**](TypeSummary.md) |  | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 

## Methods

### NewMoveChange

`func NewMoveChange(effectChance int32, effectEntries []MoveChangeEffectEntriesInner, type_ TypeSummary, versionGroup VersionGroupSummary, ) *MoveChange`

NewMoveChange instantiates a new MoveChange object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveChangeWithDefaults

`func NewMoveChangeWithDefaults() *MoveChange`

NewMoveChangeWithDefaults instantiates a new MoveChange object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccuracy

`func (o *MoveChange) GetAccuracy() int32`

GetAccuracy returns the Accuracy field if non-nil, zero value otherwise.

### GetAccuracyOk

`func (o *MoveChange) GetAccuracyOk() (*int32, bool)`

GetAccuracyOk returns a tuple with the Accuracy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccuracy

`func (o *MoveChange) SetAccuracy(v int32)`

SetAccuracy sets Accuracy field to given value.

### HasAccuracy

`func (o *MoveChange) HasAccuracy() bool`

HasAccuracy returns a boolean if a field has been set.

### SetAccuracyNil

`func (o *MoveChange) SetAccuracyNil(b bool)`

 SetAccuracyNil sets the value for Accuracy to be an explicit nil

### UnsetAccuracy
`func (o *MoveChange) UnsetAccuracy()`

UnsetAccuracy ensures that no value is present for Accuracy, not even an explicit nil
### GetPower

`func (o *MoveChange) GetPower() int32`

GetPower returns the Power field if non-nil, zero value otherwise.

### GetPowerOk

`func (o *MoveChange) GetPowerOk() (*int32, bool)`

GetPowerOk returns a tuple with the Power field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPower

`func (o *MoveChange) SetPower(v int32)`

SetPower sets Power field to given value.

### HasPower

`func (o *MoveChange) HasPower() bool`

HasPower returns a boolean if a field has been set.

### SetPowerNil

`func (o *MoveChange) SetPowerNil(b bool)`

 SetPowerNil sets the value for Power to be an explicit nil

### UnsetPower
`func (o *MoveChange) UnsetPower()`

UnsetPower ensures that no value is present for Power, not even an explicit nil
### GetPp

`func (o *MoveChange) GetPp() int32`

GetPp returns the Pp field if non-nil, zero value otherwise.

### GetPpOk

`func (o *MoveChange) GetPpOk() (*int32, bool)`

GetPpOk returns a tuple with the Pp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPp

`func (o *MoveChange) SetPp(v int32)`

SetPp sets Pp field to given value.

### HasPp

`func (o *MoveChange) HasPp() bool`

HasPp returns a boolean if a field has been set.

### SetPpNil

`func (o *MoveChange) SetPpNil(b bool)`

 SetPpNil sets the value for Pp to be an explicit nil

### UnsetPp
`func (o *MoveChange) UnsetPp()`

UnsetPp ensures that no value is present for Pp, not even an explicit nil
### GetEffectChance

`func (o *MoveChange) GetEffectChance() int32`

GetEffectChance returns the EffectChance field if non-nil, zero value otherwise.

### GetEffectChanceOk

`func (o *MoveChange) GetEffectChanceOk() (*int32, bool)`

GetEffectChanceOk returns a tuple with the EffectChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChance

`func (o *MoveChange) SetEffectChance(v int32)`

SetEffectChance sets EffectChance field to given value.


### GetEffectEntries

`func (o *MoveChange) GetEffectEntries() []MoveChangeEffectEntriesInner`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *MoveChange) GetEffectEntriesOk() (*[]MoveChangeEffectEntriesInner, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *MoveChange) SetEffectEntries(v []MoveChangeEffectEntriesInner)`

SetEffectEntries sets EffectEntries field to given value.


### GetType

`func (o *MoveChange) GetType() TypeSummary`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MoveChange) GetTypeOk() (*TypeSummary, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MoveChange) SetType(v TypeSummary)`

SetType sets Type field to given value.


### GetVersionGroup

`func (o *MoveChange) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *MoveChange) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *MoveChange) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


