# Move

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this move resource | 
**Name** | **string** | The name for this move resource | 
**Accuracy** | Pointer to **NullableInt32** | The percent value of how likely this move is to be successful | [optional] 
**EffectChance** | Pointer to **NullableInt32** | The percent value of the additional effects this move has occuring | [optional] 
**Pp** | **int32** | Power points. The number of times this move can be used | 
**Priority** | **int32** | A value of 0 means this move goes last in the turn, and 1 means it goes first | 
**Power** | Pointer to **NullableInt32** | The base power of this move with a value of 0 if it does not have a base power | [optional] 
**ContestCombos** | Pointer to [**ContestComboSets**](ContestComboSets.md) |  | [optional] 
**ContestType** | Pointer to [**MoveContestType**](MoveContestType.md) |  | [optional] 
**ContestEffect** | Pointer to [**MoveContestEffect**](MoveContestEffect.md) |  | [optional] 
**DamageClass** | Pointer to [**MoveContestType**](MoveContestType.md) |  | [optional] 
**EffectEntries** | Pointer to [**[]VerboseEffect**](VerboseEffect.md) |  | [optional] 
**EffectChanges** | Pointer to [**[]AbilityEffectChange**](AbilityEffectChange.md) |  | [optional] 
**Generation** | [**MoveContestType**](MoveContestType.md) |  | 
**Meta** | Pointer to [**MoveMetaData**](MoveMetaData.md) |  | [optional] 
**Names** | Pointer to [**[]Name**](Name.md) |  | [optional] 
**PastValues** | Pointer to [**[]PastMoveStatValues**](PastMoveStatValues.md) |  | [optional] 
**StatChanges** | Pointer to [**[]MoveStatChange**](MoveStatChange.md) |  | [optional] 
**SuperContestEffect** | Pointer to [**MoveContestEffect**](MoveContestEffect.md) |  | [optional] 
**Target** | [**MoveContestType**](MoveContestType.md) |  | 
**Type** | [**MoveContestType**](MoveContestType.md) |  | 

## Methods

### NewMove

`func NewMove(id int32, name string, pp int32, priority int32, generation MoveContestType, target MoveContestType, type_ MoveContestType, ) *Move`

NewMove instantiates a new Move object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveWithDefaults

`func NewMoveWithDefaults() *Move`

NewMoveWithDefaults instantiates a new Move object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Move) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Move) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Move) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *Move) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Move) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Move) SetName(v string)`

SetName sets Name field to given value.


### GetAccuracy

`func (o *Move) GetAccuracy() int32`

GetAccuracy returns the Accuracy field if non-nil, zero value otherwise.

### GetAccuracyOk

`func (o *Move) GetAccuracyOk() (*int32, bool)`

GetAccuracyOk returns a tuple with the Accuracy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccuracy

`func (o *Move) SetAccuracy(v int32)`

SetAccuracy sets Accuracy field to given value.

### HasAccuracy

`func (o *Move) HasAccuracy() bool`

HasAccuracy returns a boolean if a field has been set.

### SetAccuracyNil

`func (o *Move) SetAccuracyNil(b bool)`

 SetAccuracyNil sets the value for Accuracy to be an explicit nil

### UnsetAccuracy
`func (o *Move) UnsetAccuracy()`

UnsetAccuracy ensures that no value is present for Accuracy, not even an explicit nil
### GetEffectChance

`func (o *Move) GetEffectChance() int32`

GetEffectChance returns the EffectChance field if non-nil, zero value otherwise.

### GetEffectChanceOk

`func (o *Move) GetEffectChanceOk() (*int32, bool)`

GetEffectChanceOk returns a tuple with the EffectChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChance

`func (o *Move) SetEffectChance(v int32)`

SetEffectChance sets EffectChance field to given value.

### HasEffectChance

`func (o *Move) HasEffectChance() bool`

HasEffectChance returns a boolean if a field has been set.

### SetEffectChanceNil

`func (o *Move) SetEffectChanceNil(b bool)`

 SetEffectChanceNil sets the value for EffectChance to be an explicit nil

### UnsetEffectChance
`func (o *Move) UnsetEffectChance()`

UnsetEffectChance ensures that no value is present for EffectChance, not even an explicit nil
### GetPp

`func (o *Move) GetPp() int32`

GetPp returns the Pp field if non-nil, zero value otherwise.

### GetPpOk

`func (o *Move) GetPpOk() (*int32, bool)`

GetPpOk returns a tuple with the Pp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPp

`func (o *Move) SetPp(v int32)`

SetPp sets Pp field to given value.


### GetPriority

`func (o *Move) GetPriority() int32`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *Move) GetPriorityOk() (*int32, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *Move) SetPriority(v int32)`

SetPriority sets Priority field to given value.


### GetPower

`func (o *Move) GetPower() int32`

GetPower returns the Power field if non-nil, zero value otherwise.

### GetPowerOk

`func (o *Move) GetPowerOk() (*int32, bool)`

GetPowerOk returns a tuple with the Power field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPower

`func (o *Move) SetPower(v int32)`

SetPower sets Power field to given value.

### HasPower

`func (o *Move) HasPower() bool`

HasPower returns a boolean if a field has been set.

### SetPowerNil

`func (o *Move) SetPowerNil(b bool)`

 SetPowerNil sets the value for Power to be an explicit nil

### UnsetPower
`func (o *Move) UnsetPower()`

UnsetPower ensures that no value is present for Power, not even an explicit nil
### GetContestCombos

`func (o *Move) GetContestCombos() ContestComboSets`

GetContestCombos returns the ContestCombos field if non-nil, zero value otherwise.

### GetContestCombosOk

`func (o *Move) GetContestCombosOk() (*ContestComboSets, bool)`

GetContestCombosOk returns a tuple with the ContestCombos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestCombos

`func (o *Move) SetContestCombos(v ContestComboSets)`

SetContestCombos sets ContestCombos field to given value.

### HasContestCombos

`func (o *Move) HasContestCombos() bool`

HasContestCombos returns a boolean if a field has been set.

### GetContestType

`func (o *Move) GetContestType() MoveContestType`

GetContestType returns the ContestType field if non-nil, zero value otherwise.

### GetContestTypeOk

`func (o *Move) GetContestTypeOk() (*MoveContestType, bool)`

GetContestTypeOk returns a tuple with the ContestType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestType

`func (o *Move) SetContestType(v MoveContestType)`

SetContestType sets ContestType field to given value.

### HasContestType

`func (o *Move) HasContestType() bool`

HasContestType returns a boolean if a field has been set.

### GetContestEffect

`func (o *Move) GetContestEffect() MoveContestEffect`

GetContestEffect returns the ContestEffect field if non-nil, zero value otherwise.

### GetContestEffectOk

`func (o *Move) GetContestEffectOk() (*MoveContestEffect, bool)`

GetContestEffectOk returns a tuple with the ContestEffect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestEffect

`func (o *Move) SetContestEffect(v MoveContestEffect)`

SetContestEffect sets ContestEffect field to given value.

### HasContestEffect

`func (o *Move) HasContestEffect() bool`

HasContestEffect returns a boolean if a field has been set.

### GetDamageClass

`func (o *Move) GetDamageClass() MoveContestType`

GetDamageClass returns the DamageClass field if non-nil, zero value otherwise.

### GetDamageClassOk

`func (o *Move) GetDamageClassOk() (*MoveContestType, bool)`

GetDamageClassOk returns a tuple with the DamageClass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDamageClass

`func (o *Move) SetDamageClass(v MoveContestType)`

SetDamageClass sets DamageClass field to given value.

### HasDamageClass

`func (o *Move) HasDamageClass() bool`

HasDamageClass returns a boolean if a field has been set.

### GetEffectEntries

`func (o *Move) GetEffectEntries() []VerboseEffect`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *Move) GetEffectEntriesOk() (*[]VerboseEffect, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *Move) SetEffectEntries(v []VerboseEffect)`

SetEffectEntries sets EffectEntries field to given value.

### HasEffectEntries

`func (o *Move) HasEffectEntries() bool`

HasEffectEntries returns a boolean if a field has been set.

### GetEffectChanges

`func (o *Move) GetEffectChanges() []AbilityEffectChange`

GetEffectChanges returns the EffectChanges field if non-nil, zero value otherwise.

### GetEffectChangesOk

`func (o *Move) GetEffectChangesOk() (*[]AbilityEffectChange, bool)`

GetEffectChangesOk returns a tuple with the EffectChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChanges

`func (o *Move) SetEffectChanges(v []AbilityEffectChange)`

SetEffectChanges sets EffectChanges field to given value.

### HasEffectChanges

`func (o *Move) HasEffectChanges() bool`

HasEffectChanges returns a boolean if a field has been set.

### GetGeneration

`func (o *Move) GetGeneration() MoveContestType`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *Move) GetGenerationOk() (*MoveContestType, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *Move) SetGeneration(v MoveContestType)`

SetGeneration sets Generation field to given value.


### GetMeta

`func (o *Move) GetMeta() MoveMetaData`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *Move) GetMetaOk() (*MoveMetaData, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *Move) SetMeta(v MoveMetaData)`

SetMeta sets Meta field to given value.

### HasMeta

`func (o *Move) HasMeta() bool`

HasMeta returns a boolean if a field has been set.

### GetNames

`func (o *Move) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *Move) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *Move) SetNames(v []Name)`

SetNames sets Names field to given value.

### HasNames

`func (o *Move) HasNames() bool`

HasNames returns a boolean if a field has been set.

### GetPastValues

`func (o *Move) GetPastValues() []PastMoveStatValues`

GetPastValues returns the PastValues field if non-nil, zero value otherwise.

### GetPastValuesOk

`func (o *Move) GetPastValuesOk() (*[]PastMoveStatValues, bool)`

GetPastValuesOk returns a tuple with the PastValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastValues

`func (o *Move) SetPastValues(v []PastMoveStatValues)`

SetPastValues sets PastValues field to given value.

### HasPastValues

`func (o *Move) HasPastValues() bool`

HasPastValues returns a boolean if a field has been set.

### GetStatChanges

`func (o *Move) GetStatChanges() []MoveStatChange`

GetStatChanges returns the StatChanges field if non-nil, zero value otherwise.

### GetStatChangesOk

`func (o *Move) GetStatChangesOk() (*[]MoveStatChange, bool)`

GetStatChangesOk returns a tuple with the StatChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatChanges

`func (o *Move) SetStatChanges(v []MoveStatChange)`

SetStatChanges sets StatChanges field to given value.

### HasStatChanges

`func (o *Move) HasStatChanges() bool`

HasStatChanges returns a boolean if a field has been set.

### GetSuperContestEffect

`func (o *Move) GetSuperContestEffect() MoveContestEffect`

GetSuperContestEffect returns the SuperContestEffect field if non-nil, zero value otherwise.

### GetSuperContestEffectOk

`func (o *Move) GetSuperContestEffectOk() (*MoveContestEffect, bool)`

GetSuperContestEffectOk returns a tuple with the SuperContestEffect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuperContestEffect

`func (o *Move) SetSuperContestEffect(v MoveContestEffect)`

SetSuperContestEffect sets SuperContestEffect field to given value.

### HasSuperContestEffect

`func (o *Move) HasSuperContestEffect() bool`

HasSuperContestEffect returns a boolean if a field has been set.

### GetTarget

`func (o *Move) GetTarget() MoveContestType`

GetTarget returns the Target field if non-nil, zero value otherwise.

### GetTargetOk

`func (o *Move) GetTargetOk() (*MoveContestType, bool)`

GetTargetOk returns a tuple with the Target field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTarget

`func (o *Move) SetTarget(v MoveContestType)`

SetTarget sets Target field to given value.


### GetType

`func (o *Move) GetType() MoveContestType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Move) GetTypeOk() (*MoveContestType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Move) SetType(v MoveContestType)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


