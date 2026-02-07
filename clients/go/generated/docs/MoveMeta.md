# MoveMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) |  | 
**Category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) |  | 
**MinHits** | Pointer to **NullableInt32** |  | [optional] 
**MaxHits** | Pointer to **NullableInt32** |  | [optional] 
**MinTurns** | Pointer to **NullableInt32** |  | [optional] 
**MaxTurns** | Pointer to **NullableInt32** |  | [optional] 
**Drain** | Pointer to **NullableInt32** |  | [optional] 
**Healing** | Pointer to **NullableInt32** |  | [optional] 
**CritRate** | Pointer to **NullableInt32** |  | [optional] 
**AilmentChance** | Pointer to **NullableInt32** |  | [optional] 
**FlinchChance** | Pointer to **NullableInt32** |  | [optional] 
**StatChance** | Pointer to **NullableInt32** |  | [optional] 

## Methods

### NewMoveMeta

`func NewMoveMeta(ailment MoveMetaAilmentSummary, category MoveMetaCategorySummary, ) *MoveMeta`

NewMoveMeta instantiates a new MoveMeta object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveMetaWithDefaults

`func NewMoveMetaWithDefaults() *MoveMeta`

NewMoveMetaWithDefaults instantiates a new MoveMeta object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAilment

`func (o *MoveMeta) GetAilment() MoveMetaAilmentSummary`

GetAilment returns the Ailment field if non-nil, zero value otherwise.

### GetAilmentOk

`func (o *MoveMeta) GetAilmentOk() (*MoveMetaAilmentSummary, bool)`

GetAilmentOk returns a tuple with the Ailment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAilment

`func (o *MoveMeta) SetAilment(v MoveMetaAilmentSummary)`

SetAilment sets Ailment field to given value.


### GetCategory

`func (o *MoveMeta) GetCategory() MoveMetaCategorySummary`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *MoveMeta) GetCategoryOk() (*MoveMetaCategorySummary, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *MoveMeta) SetCategory(v MoveMetaCategorySummary)`

SetCategory sets Category field to given value.


### GetMinHits

`func (o *MoveMeta) GetMinHits() int32`

GetMinHits returns the MinHits field if non-nil, zero value otherwise.

### GetMinHitsOk

`func (o *MoveMeta) GetMinHitsOk() (*int32, bool)`

GetMinHitsOk returns a tuple with the MinHits field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinHits

`func (o *MoveMeta) SetMinHits(v int32)`

SetMinHits sets MinHits field to given value.

### HasMinHits

`func (o *MoveMeta) HasMinHits() bool`

HasMinHits returns a boolean if a field has been set.

### SetMinHitsNil

`func (o *MoveMeta) SetMinHitsNil(b bool)`

 SetMinHitsNil sets the value for MinHits to be an explicit nil

### UnsetMinHits
`func (o *MoveMeta) UnsetMinHits()`

UnsetMinHits ensures that no value is present for MinHits, not even an explicit nil
### GetMaxHits

`func (o *MoveMeta) GetMaxHits() int32`

GetMaxHits returns the MaxHits field if non-nil, zero value otherwise.

### GetMaxHitsOk

`func (o *MoveMeta) GetMaxHitsOk() (*int32, bool)`

GetMaxHitsOk returns a tuple with the MaxHits field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxHits

`func (o *MoveMeta) SetMaxHits(v int32)`

SetMaxHits sets MaxHits field to given value.

### HasMaxHits

`func (o *MoveMeta) HasMaxHits() bool`

HasMaxHits returns a boolean if a field has been set.

### SetMaxHitsNil

`func (o *MoveMeta) SetMaxHitsNil(b bool)`

 SetMaxHitsNil sets the value for MaxHits to be an explicit nil

### UnsetMaxHits
`func (o *MoveMeta) UnsetMaxHits()`

UnsetMaxHits ensures that no value is present for MaxHits, not even an explicit nil
### GetMinTurns

`func (o *MoveMeta) GetMinTurns() int32`

GetMinTurns returns the MinTurns field if non-nil, zero value otherwise.

### GetMinTurnsOk

`func (o *MoveMeta) GetMinTurnsOk() (*int32, bool)`

GetMinTurnsOk returns a tuple with the MinTurns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinTurns

`func (o *MoveMeta) SetMinTurns(v int32)`

SetMinTurns sets MinTurns field to given value.

### HasMinTurns

`func (o *MoveMeta) HasMinTurns() bool`

HasMinTurns returns a boolean if a field has been set.

### SetMinTurnsNil

`func (o *MoveMeta) SetMinTurnsNil(b bool)`

 SetMinTurnsNil sets the value for MinTurns to be an explicit nil

### UnsetMinTurns
`func (o *MoveMeta) UnsetMinTurns()`

UnsetMinTurns ensures that no value is present for MinTurns, not even an explicit nil
### GetMaxTurns

`func (o *MoveMeta) GetMaxTurns() int32`

GetMaxTurns returns the MaxTurns field if non-nil, zero value otherwise.

### GetMaxTurnsOk

`func (o *MoveMeta) GetMaxTurnsOk() (*int32, bool)`

GetMaxTurnsOk returns a tuple with the MaxTurns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxTurns

`func (o *MoveMeta) SetMaxTurns(v int32)`

SetMaxTurns sets MaxTurns field to given value.

### HasMaxTurns

`func (o *MoveMeta) HasMaxTurns() bool`

HasMaxTurns returns a boolean if a field has been set.

### SetMaxTurnsNil

`func (o *MoveMeta) SetMaxTurnsNil(b bool)`

 SetMaxTurnsNil sets the value for MaxTurns to be an explicit nil

### UnsetMaxTurns
`func (o *MoveMeta) UnsetMaxTurns()`

UnsetMaxTurns ensures that no value is present for MaxTurns, not even an explicit nil
### GetDrain

`func (o *MoveMeta) GetDrain() int32`

GetDrain returns the Drain field if non-nil, zero value otherwise.

### GetDrainOk

`func (o *MoveMeta) GetDrainOk() (*int32, bool)`

GetDrainOk returns a tuple with the Drain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDrain

`func (o *MoveMeta) SetDrain(v int32)`

SetDrain sets Drain field to given value.

### HasDrain

`func (o *MoveMeta) HasDrain() bool`

HasDrain returns a boolean if a field has been set.

### SetDrainNil

`func (o *MoveMeta) SetDrainNil(b bool)`

 SetDrainNil sets the value for Drain to be an explicit nil

### UnsetDrain
`func (o *MoveMeta) UnsetDrain()`

UnsetDrain ensures that no value is present for Drain, not even an explicit nil
### GetHealing

`func (o *MoveMeta) GetHealing() int32`

GetHealing returns the Healing field if non-nil, zero value otherwise.

### GetHealingOk

`func (o *MoveMeta) GetHealingOk() (*int32, bool)`

GetHealingOk returns a tuple with the Healing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHealing

`func (o *MoveMeta) SetHealing(v int32)`

SetHealing sets Healing field to given value.

### HasHealing

`func (o *MoveMeta) HasHealing() bool`

HasHealing returns a boolean if a field has been set.

### SetHealingNil

`func (o *MoveMeta) SetHealingNil(b bool)`

 SetHealingNil sets the value for Healing to be an explicit nil

### UnsetHealing
`func (o *MoveMeta) UnsetHealing()`

UnsetHealing ensures that no value is present for Healing, not even an explicit nil
### GetCritRate

`func (o *MoveMeta) GetCritRate() int32`

GetCritRate returns the CritRate field if non-nil, zero value otherwise.

### GetCritRateOk

`func (o *MoveMeta) GetCritRateOk() (*int32, bool)`

GetCritRateOk returns a tuple with the CritRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCritRate

`func (o *MoveMeta) SetCritRate(v int32)`

SetCritRate sets CritRate field to given value.

### HasCritRate

`func (o *MoveMeta) HasCritRate() bool`

HasCritRate returns a boolean if a field has been set.

### SetCritRateNil

`func (o *MoveMeta) SetCritRateNil(b bool)`

 SetCritRateNil sets the value for CritRate to be an explicit nil

### UnsetCritRate
`func (o *MoveMeta) UnsetCritRate()`

UnsetCritRate ensures that no value is present for CritRate, not even an explicit nil
### GetAilmentChance

`func (o *MoveMeta) GetAilmentChance() int32`

GetAilmentChance returns the AilmentChance field if non-nil, zero value otherwise.

### GetAilmentChanceOk

`func (o *MoveMeta) GetAilmentChanceOk() (*int32, bool)`

GetAilmentChanceOk returns a tuple with the AilmentChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAilmentChance

`func (o *MoveMeta) SetAilmentChance(v int32)`

SetAilmentChance sets AilmentChance field to given value.

### HasAilmentChance

`func (o *MoveMeta) HasAilmentChance() bool`

HasAilmentChance returns a boolean if a field has been set.

### SetAilmentChanceNil

`func (o *MoveMeta) SetAilmentChanceNil(b bool)`

 SetAilmentChanceNil sets the value for AilmentChance to be an explicit nil

### UnsetAilmentChance
`func (o *MoveMeta) UnsetAilmentChance()`

UnsetAilmentChance ensures that no value is present for AilmentChance, not even an explicit nil
### GetFlinchChance

`func (o *MoveMeta) GetFlinchChance() int32`

GetFlinchChance returns the FlinchChance field if non-nil, zero value otherwise.

### GetFlinchChanceOk

`func (o *MoveMeta) GetFlinchChanceOk() (*int32, bool)`

GetFlinchChanceOk returns a tuple with the FlinchChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlinchChance

`func (o *MoveMeta) SetFlinchChance(v int32)`

SetFlinchChance sets FlinchChance field to given value.

### HasFlinchChance

`func (o *MoveMeta) HasFlinchChance() bool`

HasFlinchChance returns a boolean if a field has been set.

### SetFlinchChanceNil

`func (o *MoveMeta) SetFlinchChanceNil(b bool)`

 SetFlinchChanceNil sets the value for FlinchChance to be an explicit nil

### UnsetFlinchChance
`func (o *MoveMeta) UnsetFlinchChance()`

UnsetFlinchChance ensures that no value is present for FlinchChance, not even an explicit nil
### GetStatChance

`func (o *MoveMeta) GetStatChance() int32`

GetStatChance returns the StatChance field if non-nil, zero value otherwise.

### GetStatChanceOk

`func (o *MoveMeta) GetStatChanceOk() (*int32, bool)`

GetStatChanceOk returns a tuple with the StatChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatChance

`func (o *MoveMeta) SetStatChance(v int32)`

SetStatChance sets StatChance field to given value.

### HasStatChance

`func (o *MoveMeta) HasStatChance() bool`

HasStatChance returns a boolean if a field has been set.

### SetStatChanceNil

`func (o *MoveMeta) SetStatChanceNil(b bool)`

 SetStatChanceNil sets the value for StatChance to be an explicit nil

### UnsetStatChance
`func (o *MoveMeta) UnsetStatChance()`

UnsetStatChance ensures that no value is present for StatChance, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


