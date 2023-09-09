# MoveMetaData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ailment** | [**NamedAPIResource**](NamedAPIResource.md) |  | 
**Category** | [**NamedAPIResource**](NamedAPIResource.md) |  | 
**MinHits** | Pointer to **NullableInt32** | The minimum number of times this move hits. Null if it always only hits once. | [optional] 
**MaxHits** | Pointer to **NullableInt32** | The maximum number of times this move hits. Null if it always only hits once. | [optional] 
**MinTurns** | Pointer to **NullableInt32** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**MaxTurns** | Pointer to **NullableInt32** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**Drain** | Pointer to **NullableInt32** | The amount of hp gained by the attacking Pokemon when it uses this move. | [optional] 
**Healing** | Pointer to **NullableInt32** | The amount of hp gained by the target Pokemon when it receives this move. | [optional] 
**CritRate** | Pointer to **NullableInt32** | Critical hit rate bonus. | [optional] 
**AilmentChance** | Pointer to **NullableInt32** | The chance of the target being inflicted with the status condition ailment. | [optional] 
**FlinchChance** | Pointer to **NullableInt32** | The chance of the target flinching when hit by this move. | [optional] 
**StatChance** | Pointer to **NullableInt32** | The chance of the attacking Pokemon lowering the target&#39;s stat. | [optional] 

## Methods

### NewMoveMetaData

`func NewMoveMetaData(ailment NamedAPIResource, category NamedAPIResource, ) *MoveMetaData`

NewMoveMetaData instantiates a new MoveMetaData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveMetaDataWithDefaults

`func NewMoveMetaDataWithDefaults() *MoveMetaData`

NewMoveMetaDataWithDefaults instantiates a new MoveMetaData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAilment

`func (o *MoveMetaData) GetAilment() NamedAPIResource`

GetAilment returns the Ailment field if non-nil, zero value otherwise.

### GetAilmentOk

`func (o *MoveMetaData) GetAilmentOk() (*NamedAPIResource, bool)`

GetAilmentOk returns a tuple with the Ailment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAilment

`func (o *MoveMetaData) SetAilment(v NamedAPIResource)`

SetAilment sets Ailment field to given value.


### GetCategory

`func (o *MoveMetaData) GetCategory() NamedAPIResource`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *MoveMetaData) GetCategoryOk() (*NamedAPIResource, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *MoveMetaData) SetCategory(v NamedAPIResource)`

SetCategory sets Category field to given value.


### GetMinHits

`func (o *MoveMetaData) GetMinHits() int32`

GetMinHits returns the MinHits field if non-nil, zero value otherwise.

### GetMinHitsOk

`func (o *MoveMetaData) GetMinHitsOk() (*int32, bool)`

GetMinHitsOk returns a tuple with the MinHits field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinHits

`func (o *MoveMetaData) SetMinHits(v int32)`

SetMinHits sets MinHits field to given value.

### HasMinHits

`func (o *MoveMetaData) HasMinHits() bool`

HasMinHits returns a boolean if a field has been set.

### SetMinHitsNil

`func (o *MoveMetaData) SetMinHitsNil(b bool)`

 SetMinHitsNil sets the value for MinHits to be an explicit nil

### UnsetMinHits
`func (o *MoveMetaData) UnsetMinHits()`

UnsetMinHits ensures that no value is present for MinHits, not even an explicit nil
### GetMaxHits

`func (o *MoveMetaData) GetMaxHits() int32`

GetMaxHits returns the MaxHits field if non-nil, zero value otherwise.

### GetMaxHitsOk

`func (o *MoveMetaData) GetMaxHitsOk() (*int32, bool)`

GetMaxHitsOk returns a tuple with the MaxHits field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxHits

`func (o *MoveMetaData) SetMaxHits(v int32)`

SetMaxHits sets MaxHits field to given value.

### HasMaxHits

`func (o *MoveMetaData) HasMaxHits() bool`

HasMaxHits returns a boolean if a field has been set.

### SetMaxHitsNil

`func (o *MoveMetaData) SetMaxHitsNil(b bool)`

 SetMaxHitsNil sets the value for MaxHits to be an explicit nil

### UnsetMaxHits
`func (o *MoveMetaData) UnsetMaxHits()`

UnsetMaxHits ensures that no value is present for MaxHits, not even an explicit nil
### GetMinTurns

`func (o *MoveMetaData) GetMinTurns() int32`

GetMinTurns returns the MinTurns field if non-nil, zero value otherwise.

### GetMinTurnsOk

`func (o *MoveMetaData) GetMinTurnsOk() (*int32, bool)`

GetMinTurnsOk returns a tuple with the MinTurns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinTurns

`func (o *MoveMetaData) SetMinTurns(v int32)`

SetMinTurns sets MinTurns field to given value.

### HasMinTurns

`func (o *MoveMetaData) HasMinTurns() bool`

HasMinTurns returns a boolean if a field has been set.

### SetMinTurnsNil

`func (o *MoveMetaData) SetMinTurnsNil(b bool)`

 SetMinTurnsNil sets the value for MinTurns to be an explicit nil

### UnsetMinTurns
`func (o *MoveMetaData) UnsetMinTurns()`

UnsetMinTurns ensures that no value is present for MinTurns, not even an explicit nil
### GetMaxTurns

`func (o *MoveMetaData) GetMaxTurns() int32`

GetMaxTurns returns the MaxTurns field if non-nil, zero value otherwise.

### GetMaxTurnsOk

`func (o *MoveMetaData) GetMaxTurnsOk() (*int32, bool)`

GetMaxTurnsOk returns a tuple with the MaxTurns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxTurns

`func (o *MoveMetaData) SetMaxTurns(v int32)`

SetMaxTurns sets MaxTurns field to given value.

### HasMaxTurns

`func (o *MoveMetaData) HasMaxTurns() bool`

HasMaxTurns returns a boolean if a field has been set.

### SetMaxTurnsNil

`func (o *MoveMetaData) SetMaxTurnsNil(b bool)`

 SetMaxTurnsNil sets the value for MaxTurns to be an explicit nil

### UnsetMaxTurns
`func (o *MoveMetaData) UnsetMaxTurns()`

UnsetMaxTurns ensures that no value is present for MaxTurns, not even an explicit nil
### GetDrain

`func (o *MoveMetaData) GetDrain() int32`

GetDrain returns the Drain field if non-nil, zero value otherwise.

### GetDrainOk

`func (o *MoveMetaData) GetDrainOk() (*int32, bool)`

GetDrainOk returns a tuple with the Drain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDrain

`func (o *MoveMetaData) SetDrain(v int32)`

SetDrain sets Drain field to given value.

### HasDrain

`func (o *MoveMetaData) HasDrain() bool`

HasDrain returns a boolean if a field has been set.

### SetDrainNil

`func (o *MoveMetaData) SetDrainNil(b bool)`

 SetDrainNil sets the value for Drain to be an explicit nil

### UnsetDrain
`func (o *MoveMetaData) UnsetDrain()`

UnsetDrain ensures that no value is present for Drain, not even an explicit nil
### GetHealing

`func (o *MoveMetaData) GetHealing() int32`

GetHealing returns the Healing field if non-nil, zero value otherwise.

### GetHealingOk

`func (o *MoveMetaData) GetHealingOk() (*int32, bool)`

GetHealingOk returns a tuple with the Healing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHealing

`func (o *MoveMetaData) SetHealing(v int32)`

SetHealing sets Healing field to given value.

### HasHealing

`func (o *MoveMetaData) HasHealing() bool`

HasHealing returns a boolean if a field has been set.

### SetHealingNil

`func (o *MoveMetaData) SetHealingNil(b bool)`

 SetHealingNil sets the value for Healing to be an explicit nil

### UnsetHealing
`func (o *MoveMetaData) UnsetHealing()`

UnsetHealing ensures that no value is present for Healing, not even an explicit nil
### GetCritRate

`func (o *MoveMetaData) GetCritRate() int32`

GetCritRate returns the CritRate field if non-nil, zero value otherwise.

### GetCritRateOk

`func (o *MoveMetaData) GetCritRateOk() (*int32, bool)`

GetCritRateOk returns a tuple with the CritRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCritRate

`func (o *MoveMetaData) SetCritRate(v int32)`

SetCritRate sets CritRate field to given value.

### HasCritRate

`func (o *MoveMetaData) HasCritRate() bool`

HasCritRate returns a boolean if a field has been set.

### SetCritRateNil

`func (o *MoveMetaData) SetCritRateNil(b bool)`

 SetCritRateNil sets the value for CritRate to be an explicit nil

### UnsetCritRate
`func (o *MoveMetaData) UnsetCritRate()`

UnsetCritRate ensures that no value is present for CritRate, not even an explicit nil
### GetAilmentChance

`func (o *MoveMetaData) GetAilmentChance() int32`

GetAilmentChance returns the AilmentChance field if non-nil, zero value otherwise.

### GetAilmentChanceOk

`func (o *MoveMetaData) GetAilmentChanceOk() (*int32, bool)`

GetAilmentChanceOk returns a tuple with the AilmentChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAilmentChance

`func (o *MoveMetaData) SetAilmentChance(v int32)`

SetAilmentChance sets AilmentChance field to given value.

### HasAilmentChance

`func (o *MoveMetaData) HasAilmentChance() bool`

HasAilmentChance returns a boolean if a field has been set.

### SetAilmentChanceNil

`func (o *MoveMetaData) SetAilmentChanceNil(b bool)`

 SetAilmentChanceNil sets the value for AilmentChance to be an explicit nil

### UnsetAilmentChance
`func (o *MoveMetaData) UnsetAilmentChance()`

UnsetAilmentChance ensures that no value is present for AilmentChance, not even an explicit nil
### GetFlinchChance

`func (o *MoveMetaData) GetFlinchChance() int32`

GetFlinchChance returns the FlinchChance field if non-nil, zero value otherwise.

### GetFlinchChanceOk

`func (o *MoveMetaData) GetFlinchChanceOk() (*int32, bool)`

GetFlinchChanceOk returns a tuple with the FlinchChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlinchChance

`func (o *MoveMetaData) SetFlinchChance(v int32)`

SetFlinchChance sets FlinchChance field to given value.

### HasFlinchChance

`func (o *MoveMetaData) HasFlinchChance() bool`

HasFlinchChance returns a boolean if a field has been set.

### SetFlinchChanceNil

`func (o *MoveMetaData) SetFlinchChanceNil(b bool)`

 SetFlinchChanceNil sets the value for FlinchChance to be an explicit nil

### UnsetFlinchChance
`func (o *MoveMetaData) UnsetFlinchChance()`

UnsetFlinchChance ensures that no value is present for FlinchChance, not even an explicit nil
### GetStatChance

`func (o *MoveMetaData) GetStatChance() int32`

GetStatChance returns the StatChance field if non-nil, zero value otherwise.

### GetStatChanceOk

`func (o *MoveMetaData) GetStatChanceOk() (*int32, bool)`

GetStatChanceOk returns a tuple with the StatChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatChance

`func (o *MoveMetaData) SetStatChance(v int32)`

SetStatChance sets StatChance field to given value.

### HasStatChance

`func (o *MoveMetaData) HasStatChance() bool`

HasStatChance returns a boolean if a field has been set.

### SetStatChanceNil

`func (o *MoveMetaData) SetStatChanceNil(b bool)`

 SetStatChanceNil sets the value for StatChance to be an explicit nil

### UnsetStatChance
`func (o *MoveMetaData) UnsetStatChance()`

UnsetStatChance ensures that no value is present for StatChance, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


