# MoveDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Accuracy** | Pointer to **NullableInt32** |  | [optional] 
**EffectChance** | **int32** |  | 
**Pp** | Pointer to **NullableInt32** |  | [optional] 
**Priority** | Pointer to **NullableInt32** |  | [optional] 
**Power** | Pointer to **NullableInt32** |  | [optional] 
**ContestCombos** | [**MoveDetailContestCombos**](MoveDetailContestCombos.md) |  | 
**ContestType** | [**ContestTypeSummary**](ContestTypeSummary.md) |  | 
**ContestEffect** | [**ContestEffectSummary**](ContestEffectSummary.md) |  | 
**DamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**EffectEntries** | [**[]MoveChangeEffectEntriesInner**](MoveChangeEffectEntriesInner.md) |  | 
**EffectChanges** | [**[]MoveDetailEffectChangesInner**](MoveDetailEffectChangesInner.md) |  | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**Meta** | [**MoveMeta**](MoveMeta.md) |  | [readonly] 
**Names** | [**[]MoveName**](MoveName.md) |  | 
**PastValues** | [**[]MoveChange**](MoveChange.md) |  | 
**StatChanges** | [**[]MoveDetailStatChangesInner**](MoveDetailStatChangesInner.md) |  | 
**SuperContestEffect** | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) |  | 
**Target** | [**MoveTargetSummary**](MoveTargetSummary.md) |  | 
**Type** | [**TypeSummary**](TypeSummary.md) |  | 
**Machines** | [**[]MoveDetailMachinesInner**](MoveDetailMachinesInner.md) |  | 
**FlavorTextEntries** | [**[]MoveFlavorText**](MoveFlavorText.md) |  | 
**LearnedByPokemon** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Methods

### NewMoveDetail

`func NewMoveDetail(id int32, name string, effectChance int32, contestCombos MoveDetailContestCombos, contestType ContestTypeSummary, contestEffect ContestEffectSummary, damageClass MoveDamageClassSummary, effectEntries []MoveChangeEffectEntriesInner, effectChanges []MoveDetailEffectChangesInner, generation GenerationSummary, meta MoveMeta, names []MoveName, pastValues []MoveChange, statChanges []MoveDetailStatChangesInner, superContestEffect SuperContestEffectSummary, target MoveTargetSummary, type_ TypeSummary, machines []MoveDetailMachinesInner, flavorTextEntries []MoveFlavorText, learnedByPokemon []AbilityDetailPokemonInnerPokemon, ) *MoveDetail`

NewMoveDetail instantiates a new MoveDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveDetailWithDefaults

`func NewMoveDetailWithDefaults() *MoveDetail`

NewMoveDetailWithDefaults instantiates a new MoveDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveDetail) SetName(v string)`

SetName sets Name field to given value.


### GetAccuracy

`func (o *MoveDetail) GetAccuracy() int32`

GetAccuracy returns the Accuracy field if non-nil, zero value otherwise.

### GetAccuracyOk

`func (o *MoveDetail) GetAccuracyOk() (*int32, bool)`

GetAccuracyOk returns a tuple with the Accuracy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccuracy

`func (o *MoveDetail) SetAccuracy(v int32)`

SetAccuracy sets Accuracy field to given value.

### HasAccuracy

`func (o *MoveDetail) HasAccuracy() bool`

HasAccuracy returns a boolean if a field has been set.

### SetAccuracyNil

`func (o *MoveDetail) SetAccuracyNil(b bool)`

 SetAccuracyNil sets the value for Accuracy to be an explicit nil

### UnsetAccuracy
`func (o *MoveDetail) UnsetAccuracy()`

UnsetAccuracy ensures that no value is present for Accuracy, not even an explicit nil
### GetEffectChance

`func (o *MoveDetail) GetEffectChance() int32`

GetEffectChance returns the EffectChance field if non-nil, zero value otherwise.

### GetEffectChanceOk

`func (o *MoveDetail) GetEffectChanceOk() (*int32, bool)`

GetEffectChanceOk returns a tuple with the EffectChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChance

`func (o *MoveDetail) SetEffectChance(v int32)`

SetEffectChance sets EffectChance field to given value.


### GetPp

`func (o *MoveDetail) GetPp() int32`

GetPp returns the Pp field if non-nil, zero value otherwise.

### GetPpOk

`func (o *MoveDetail) GetPpOk() (*int32, bool)`

GetPpOk returns a tuple with the Pp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPp

`func (o *MoveDetail) SetPp(v int32)`

SetPp sets Pp field to given value.

### HasPp

`func (o *MoveDetail) HasPp() bool`

HasPp returns a boolean if a field has been set.

### SetPpNil

`func (o *MoveDetail) SetPpNil(b bool)`

 SetPpNil sets the value for Pp to be an explicit nil

### UnsetPp
`func (o *MoveDetail) UnsetPp()`

UnsetPp ensures that no value is present for Pp, not even an explicit nil
### GetPriority

`func (o *MoveDetail) GetPriority() int32`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *MoveDetail) GetPriorityOk() (*int32, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *MoveDetail) SetPriority(v int32)`

SetPriority sets Priority field to given value.

### HasPriority

`func (o *MoveDetail) HasPriority() bool`

HasPriority returns a boolean if a field has been set.

### SetPriorityNil

`func (o *MoveDetail) SetPriorityNil(b bool)`

 SetPriorityNil sets the value for Priority to be an explicit nil

### UnsetPriority
`func (o *MoveDetail) UnsetPriority()`

UnsetPriority ensures that no value is present for Priority, not even an explicit nil
### GetPower

`func (o *MoveDetail) GetPower() int32`

GetPower returns the Power field if non-nil, zero value otherwise.

### GetPowerOk

`func (o *MoveDetail) GetPowerOk() (*int32, bool)`

GetPowerOk returns a tuple with the Power field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPower

`func (o *MoveDetail) SetPower(v int32)`

SetPower sets Power field to given value.

### HasPower

`func (o *MoveDetail) HasPower() bool`

HasPower returns a boolean if a field has been set.

### SetPowerNil

`func (o *MoveDetail) SetPowerNil(b bool)`

 SetPowerNil sets the value for Power to be an explicit nil

### UnsetPower
`func (o *MoveDetail) UnsetPower()`

UnsetPower ensures that no value is present for Power, not even an explicit nil
### GetContestCombos

`func (o *MoveDetail) GetContestCombos() MoveDetailContestCombos`

GetContestCombos returns the ContestCombos field if non-nil, zero value otherwise.

### GetContestCombosOk

`func (o *MoveDetail) GetContestCombosOk() (*MoveDetailContestCombos, bool)`

GetContestCombosOk returns a tuple with the ContestCombos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestCombos

`func (o *MoveDetail) SetContestCombos(v MoveDetailContestCombos)`

SetContestCombos sets ContestCombos field to given value.


### GetContestType

`func (o *MoveDetail) GetContestType() ContestTypeSummary`

GetContestType returns the ContestType field if non-nil, zero value otherwise.

### GetContestTypeOk

`func (o *MoveDetail) GetContestTypeOk() (*ContestTypeSummary, bool)`

GetContestTypeOk returns a tuple with the ContestType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestType

`func (o *MoveDetail) SetContestType(v ContestTypeSummary)`

SetContestType sets ContestType field to given value.


### GetContestEffect

`func (o *MoveDetail) GetContestEffect() ContestEffectSummary`

GetContestEffect returns the ContestEffect field if non-nil, zero value otherwise.

### GetContestEffectOk

`func (o *MoveDetail) GetContestEffectOk() (*ContestEffectSummary, bool)`

GetContestEffectOk returns a tuple with the ContestEffect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestEffect

`func (o *MoveDetail) SetContestEffect(v ContestEffectSummary)`

SetContestEffect sets ContestEffect field to given value.


### GetDamageClass

`func (o *MoveDetail) GetDamageClass() MoveDamageClassSummary`

GetDamageClass returns the DamageClass field if non-nil, zero value otherwise.

### GetDamageClassOk

`func (o *MoveDetail) GetDamageClassOk() (*MoveDamageClassSummary, bool)`

GetDamageClassOk returns a tuple with the DamageClass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDamageClass

`func (o *MoveDetail) SetDamageClass(v MoveDamageClassSummary)`

SetDamageClass sets DamageClass field to given value.


### GetEffectEntries

`func (o *MoveDetail) GetEffectEntries() []MoveChangeEffectEntriesInner`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *MoveDetail) GetEffectEntriesOk() (*[]MoveChangeEffectEntriesInner, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *MoveDetail) SetEffectEntries(v []MoveChangeEffectEntriesInner)`

SetEffectEntries sets EffectEntries field to given value.


### GetEffectChanges

`func (o *MoveDetail) GetEffectChanges() []MoveDetailEffectChangesInner`

GetEffectChanges returns the EffectChanges field if non-nil, zero value otherwise.

### GetEffectChangesOk

`func (o *MoveDetail) GetEffectChangesOk() (*[]MoveDetailEffectChangesInner, bool)`

GetEffectChangesOk returns a tuple with the EffectChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChanges

`func (o *MoveDetail) SetEffectChanges(v []MoveDetailEffectChangesInner)`

SetEffectChanges sets EffectChanges field to given value.


### GetGeneration

`func (o *MoveDetail) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *MoveDetail) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *MoveDetail) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.


### GetMeta

`func (o *MoveDetail) GetMeta() MoveMeta`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *MoveDetail) GetMetaOk() (*MoveMeta, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *MoveDetail) SetMeta(v MoveMeta)`

SetMeta sets Meta field to given value.


### GetNames

`func (o *MoveDetail) GetNames() []MoveName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *MoveDetail) GetNamesOk() (*[]MoveName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *MoveDetail) SetNames(v []MoveName)`

SetNames sets Names field to given value.


### GetPastValues

`func (o *MoveDetail) GetPastValues() []MoveChange`

GetPastValues returns the PastValues field if non-nil, zero value otherwise.

### GetPastValuesOk

`func (o *MoveDetail) GetPastValuesOk() (*[]MoveChange, bool)`

GetPastValuesOk returns a tuple with the PastValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastValues

`func (o *MoveDetail) SetPastValues(v []MoveChange)`

SetPastValues sets PastValues field to given value.


### GetStatChanges

`func (o *MoveDetail) GetStatChanges() []MoveDetailStatChangesInner`

GetStatChanges returns the StatChanges field if non-nil, zero value otherwise.

### GetStatChangesOk

`func (o *MoveDetail) GetStatChangesOk() (*[]MoveDetailStatChangesInner, bool)`

GetStatChangesOk returns a tuple with the StatChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatChanges

`func (o *MoveDetail) SetStatChanges(v []MoveDetailStatChangesInner)`

SetStatChanges sets StatChanges field to given value.


### GetSuperContestEffect

`func (o *MoveDetail) GetSuperContestEffect() SuperContestEffectSummary`

GetSuperContestEffect returns the SuperContestEffect field if non-nil, zero value otherwise.

### GetSuperContestEffectOk

`func (o *MoveDetail) GetSuperContestEffectOk() (*SuperContestEffectSummary, bool)`

GetSuperContestEffectOk returns a tuple with the SuperContestEffect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuperContestEffect

`func (o *MoveDetail) SetSuperContestEffect(v SuperContestEffectSummary)`

SetSuperContestEffect sets SuperContestEffect field to given value.


### GetTarget

`func (o *MoveDetail) GetTarget() MoveTargetSummary`

GetTarget returns the Target field if non-nil, zero value otherwise.

### GetTargetOk

`func (o *MoveDetail) GetTargetOk() (*MoveTargetSummary, bool)`

GetTargetOk returns a tuple with the Target field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTarget

`func (o *MoveDetail) SetTarget(v MoveTargetSummary)`

SetTarget sets Target field to given value.


### GetType

`func (o *MoveDetail) GetType() TypeSummary`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MoveDetail) GetTypeOk() (*TypeSummary, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MoveDetail) SetType(v TypeSummary)`

SetType sets Type field to given value.


### GetMachines

`func (o *MoveDetail) GetMachines() []MoveDetailMachinesInner`

GetMachines returns the Machines field if non-nil, zero value otherwise.

### GetMachinesOk

`func (o *MoveDetail) GetMachinesOk() (*[]MoveDetailMachinesInner, bool)`

GetMachinesOk returns a tuple with the Machines field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMachines

`func (o *MoveDetail) SetMachines(v []MoveDetailMachinesInner)`

SetMachines sets Machines field to given value.


### GetFlavorTextEntries

`func (o *MoveDetail) GetFlavorTextEntries() []MoveFlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *MoveDetail) GetFlavorTextEntriesOk() (*[]MoveFlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *MoveDetail) SetFlavorTextEntries(v []MoveFlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.


### GetLearnedByPokemon

`func (o *MoveDetail) GetLearnedByPokemon() []AbilityDetailPokemonInnerPokemon`

GetLearnedByPokemon returns the LearnedByPokemon field if non-nil, zero value otherwise.

### GetLearnedByPokemonOk

`func (o *MoveDetail) GetLearnedByPokemonOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetLearnedByPokemonOk returns a tuple with the LearnedByPokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLearnedByPokemon

`func (o *MoveDetail) SetLearnedByPokemon(v []AbilityDetailPokemonInnerPokemon)`

SetLearnedByPokemon sets LearnedByPokemon field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


