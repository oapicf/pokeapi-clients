# MoveDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Accuracy** | Pointer to **NullableInt32** | The percent value of how likely this move is to be successful. | [optional] 
**EffectChance** | **NullableInt32** | The percent value of how likely it is this moves effect will happen. | 
**Pp** | Pointer to **NullableInt32** | Power points. The number of times this move can be used. | [optional] 
**Priority** | Pointer to **NullableInt32** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] 
**Power** | Pointer to **NullableInt32** | The base power of this move, or null if it has no fixed base power. | [optional] 
**ContestCombos** | [**NullableMoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. | [readonly] 
**ContestType** | [**NullableContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. | 
**ContestEffect** | [**NullableContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. | 
**DamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. | 
**EffectEntries** | [**[]MoveEffectEffectText**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**EffectChanges** | [**[]MoveEffectChange**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. | [readonly] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. | 
**Meta** | [**NullableMoveMeta**](MoveMeta.md) | Metadata about this move | [readonly] 
**Names** | [**[]MoveName**](MoveName.md) | The name of this resource listed in different languages. | [readonly] 
**PastValues** | [**[]MoveChange**](MoveChange.md) | A list of move resource value changes across version groups of the game. | [readonly] 
**StatChanges** | [**[]MoveMetaStatChange**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. | [readonly] 
**SuperContestEffect** | [**NullableSuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. | 
**Target** | [**MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. | 
**Type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**Machines** | [**[]ItemMachine**](ItemMachine.md) | A list of the machines that teach this move. | [readonly] 
**FlavorTextEntries** | [**[]MoveFlavorText**](MoveFlavorText.md) | The flavor text of this move listed in different languages. | [readonly] 
**LearnedByPokemon** | [**[]PokemonSummary**](PokemonSummary.md) | List of Pokemon that can learn the move | [readonly] 

## Methods

### NewMoveDetail

`func NewMoveDetail(id int32, name string, effectChance NullableInt32, contestCombos NullableMoveCombos, contestType NullableContestTypeSummary, contestEffect NullableContestEffectSummary, damageClass MoveDamageClassSummary, effectEntries []MoveEffectEffectText, effectChanges []MoveEffectChange, generation GenerationSummary, meta NullableMoveMeta, names []MoveName, pastValues []MoveChange, statChanges []MoveMetaStatChange, superContestEffect NullableSuperContestEffectSummary, target MoveTargetSummary, type_ TypeSummary, machines []ItemMachine, flavorTextEntries []MoveFlavorText, learnedByPokemon []PokemonSummary, ) *MoveDetail`

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


### SetEffectChanceNil

`func (o *MoveDetail) SetEffectChanceNil(b bool)`

 SetEffectChanceNil sets the value for EffectChance to be an explicit nil

### UnsetEffectChance
`func (o *MoveDetail) UnsetEffectChance()`

UnsetEffectChance ensures that no value is present for EffectChance, not even an explicit nil
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

`func (o *MoveDetail) GetContestCombos() MoveCombos`

GetContestCombos returns the ContestCombos field if non-nil, zero value otherwise.

### GetContestCombosOk

`func (o *MoveDetail) GetContestCombosOk() (*MoveCombos, bool)`

GetContestCombosOk returns a tuple with the ContestCombos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestCombos

`func (o *MoveDetail) SetContestCombos(v MoveCombos)`

SetContestCombos sets ContestCombos field to given value.


### SetContestCombosNil

`func (o *MoveDetail) SetContestCombosNil(b bool)`

 SetContestCombosNil sets the value for ContestCombos to be an explicit nil

### UnsetContestCombos
`func (o *MoveDetail) UnsetContestCombos()`

UnsetContestCombos ensures that no value is present for ContestCombos, not even an explicit nil
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


### SetContestTypeNil

`func (o *MoveDetail) SetContestTypeNil(b bool)`

 SetContestTypeNil sets the value for ContestType to be an explicit nil

### UnsetContestType
`func (o *MoveDetail) UnsetContestType()`

UnsetContestType ensures that no value is present for ContestType, not even an explicit nil
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


### SetContestEffectNil

`func (o *MoveDetail) SetContestEffectNil(b bool)`

 SetContestEffectNil sets the value for ContestEffect to be an explicit nil

### UnsetContestEffect
`func (o *MoveDetail) UnsetContestEffect()`

UnsetContestEffect ensures that no value is present for ContestEffect, not even an explicit nil
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

`func (o *MoveDetail) GetEffectEntries() []MoveEffectEffectText`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *MoveDetail) GetEffectEntriesOk() (*[]MoveEffectEffectText, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *MoveDetail) SetEffectEntries(v []MoveEffectEffectText)`

SetEffectEntries sets EffectEntries field to given value.


### GetEffectChanges

`func (o *MoveDetail) GetEffectChanges() []MoveEffectChange`

GetEffectChanges returns the EffectChanges field if non-nil, zero value otherwise.

### GetEffectChangesOk

`func (o *MoveDetail) GetEffectChangesOk() (*[]MoveEffectChange, bool)`

GetEffectChangesOk returns a tuple with the EffectChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChanges

`func (o *MoveDetail) SetEffectChanges(v []MoveEffectChange)`

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


### SetMetaNil

`func (o *MoveDetail) SetMetaNil(b bool)`

 SetMetaNil sets the value for Meta to be an explicit nil

### UnsetMeta
`func (o *MoveDetail) UnsetMeta()`

UnsetMeta ensures that no value is present for Meta, not even an explicit nil
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

`func (o *MoveDetail) GetStatChanges() []MoveMetaStatChange`

GetStatChanges returns the StatChanges field if non-nil, zero value otherwise.

### GetStatChangesOk

`func (o *MoveDetail) GetStatChangesOk() (*[]MoveMetaStatChange, bool)`

GetStatChangesOk returns a tuple with the StatChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatChanges

`func (o *MoveDetail) SetStatChanges(v []MoveMetaStatChange)`

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


### SetSuperContestEffectNil

`func (o *MoveDetail) SetSuperContestEffectNil(b bool)`

 SetSuperContestEffectNil sets the value for SuperContestEffect to be an explicit nil

### UnsetSuperContestEffect
`func (o *MoveDetail) UnsetSuperContestEffect()`

UnsetSuperContestEffect ensures that no value is present for SuperContestEffect, not even an explicit nil
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

`func (o *MoveDetail) GetMachines() []ItemMachine`

GetMachines returns the Machines field if non-nil, zero value otherwise.

### GetMachinesOk

`func (o *MoveDetail) GetMachinesOk() (*[]ItemMachine, bool)`

GetMachinesOk returns a tuple with the Machines field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMachines

`func (o *MoveDetail) SetMachines(v []ItemMachine)`

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

`func (o *MoveDetail) GetLearnedByPokemon() []PokemonSummary`

GetLearnedByPokemon returns the LearnedByPokemon field if non-nil, zero value otherwise.

### GetLearnedByPokemonOk

`func (o *MoveDetail) GetLearnedByPokemonOk() (*[]PokemonSummary, bool)`

GetLearnedByPokemonOk returns a tuple with the LearnedByPokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLearnedByPokemon

`func (o *MoveDetail) SetLearnedByPokemon(v []PokemonSummary)`

SetLearnedByPokemon sets LearnedByPokemon field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


