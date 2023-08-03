# Effect

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The identifier for this effect resource | [optional] 
**Name** | Pointer to **string** | The name for this effect resource | [optional] 
**EffectEntries** | Pointer to [**[]EffectEffect**](EffectEffect.md) | The list of effect text entries | [optional] 
**PokemonFlavorTextEntries** | Pointer to [**[]EffectEffect**](EffectEffect.md) | The flavor text entries that describe this effect | [optional] 
**TargetSpecies** | Pointer to [**PokemonSpecies**](PokemonSpecies.md) |  | [optional] 
**EffectChanges** | Pointer to [**[]AbilityEffectChange**](AbilityEffectChange.md) | The list of effects that are changed by this ability | [optional] 
**FlavorTextEntries** | Pointer to [**[]FlavorText**](FlavorText.md) | The flavor text entries that describe this effect | [optional] 
**Generation** | Pointer to [**Generation**](Generation.md) |  | [optional] 
**Machines** | Pointer to [**[]MachineVersionDetail**](MachineVersionDetail.md) | The machines that teach this move | [optional] 
**Meta** | Pointer to [**MoveMetaData**](MoveMetaData.md) |  | [optional] 
**ShortEffect** | Pointer to **string** | The short description of this effect listed in different languages | [optional] 
**EffectChance** | Pointer to **int32** | The chance of this move having an additional effect listed in percentage | [optional] 
**StatChanges** | Pointer to [**[]MoveStatChange**](MoveStatChange.md) | The list of stat changes that are caused by this effect | [optional] 
**SuperContestEffect** | Pointer to [**SuperContestEffect**](SuperContestEffect.md) |  | [optional] 
**ContestCombos** | Pointer to [**ContestComboSets**](ContestComboSets.md) |  | [optional] 
**ContestType** | Pointer to [**ContestType**](ContestType.md) |  | [optional] 

## Methods

### NewEffect

`func NewEffect() *Effect`

NewEffect instantiates a new Effect object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEffectWithDefaults

`func NewEffectWithDefaults() *Effect`

NewEffectWithDefaults instantiates a new Effect object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Effect) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Effect) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Effect) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Effect) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Effect) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Effect) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Effect) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Effect) HasName() bool`

HasName returns a boolean if a field has been set.

### GetEffectEntries

`func (o *Effect) GetEffectEntries() []EffectEffect`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *Effect) GetEffectEntriesOk() (*[]EffectEffect, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *Effect) SetEffectEntries(v []EffectEffect)`

SetEffectEntries sets EffectEntries field to given value.

### HasEffectEntries

`func (o *Effect) HasEffectEntries() bool`

HasEffectEntries returns a boolean if a field has been set.

### GetPokemonFlavorTextEntries

`func (o *Effect) GetPokemonFlavorTextEntries() []EffectEffect`

GetPokemonFlavorTextEntries returns the PokemonFlavorTextEntries field if non-nil, zero value otherwise.

### GetPokemonFlavorTextEntriesOk

`func (o *Effect) GetPokemonFlavorTextEntriesOk() (*[]EffectEffect, bool)`

GetPokemonFlavorTextEntriesOk returns a tuple with the PokemonFlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonFlavorTextEntries

`func (o *Effect) SetPokemonFlavorTextEntries(v []EffectEffect)`

SetPokemonFlavorTextEntries sets PokemonFlavorTextEntries field to given value.

### HasPokemonFlavorTextEntries

`func (o *Effect) HasPokemonFlavorTextEntries() bool`

HasPokemonFlavorTextEntries returns a boolean if a field has been set.

### GetTargetSpecies

`func (o *Effect) GetTargetSpecies() PokemonSpecies`

GetTargetSpecies returns the TargetSpecies field if non-nil, zero value otherwise.

### GetTargetSpeciesOk

`func (o *Effect) GetTargetSpeciesOk() (*PokemonSpecies, bool)`

GetTargetSpeciesOk returns a tuple with the TargetSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetSpecies

`func (o *Effect) SetTargetSpecies(v PokemonSpecies)`

SetTargetSpecies sets TargetSpecies field to given value.

### HasTargetSpecies

`func (o *Effect) HasTargetSpecies() bool`

HasTargetSpecies returns a boolean if a field has been set.

### GetEffectChanges

`func (o *Effect) GetEffectChanges() []AbilityEffectChange`

GetEffectChanges returns the EffectChanges field if non-nil, zero value otherwise.

### GetEffectChangesOk

`func (o *Effect) GetEffectChangesOk() (*[]AbilityEffectChange, bool)`

GetEffectChangesOk returns a tuple with the EffectChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChanges

`func (o *Effect) SetEffectChanges(v []AbilityEffectChange)`

SetEffectChanges sets EffectChanges field to given value.

### HasEffectChanges

`func (o *Effect) HasEffectChanges() bool`

HasEffectChanges returns a boolean if a field has been set.

### GetFlavorTextEntries

`func (o *Effect) GetFlavorTextEntries() []FlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *Effect) GetFlavorTextEntriesOk() (*[]FlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *Effect) SetFlavorTextEntries(v []FlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.

### HasFlavorTextEntries

`func (o *Effect) HasFlavorTextEntries() bool`

HasFlavorTextEntries returns a boolean if a field has been set.

### GetGeneration

`func (o *Effect) GetGeneration() Generation`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *Effect) GetGenerationOk() (*Generation, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *Effect) SetGeneration(v Generation)`

SetGeneration sets Generation field to given value.

### HasGeneration

`func (o *Effect) HasGeneration() bool`

HasGeneration returns a boolean if a field has been set.

### GetMachines

`func (o *Effect) GetMachines() []MachineVersionDetail`

GetMachines returns the Machines field if non-nil, zero value otherwise.

### GetMachinesOk

`func (o *Effect) GetMachinesOk() (*[]MachineVersionDetail, bool)`

GetMachinesOk returns a tuple with the Machines field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMachines

`func (o *Effect) SetMachines(v []MachineVersionDetail)`

SetMachines sets Machines field to given value.

### HasMachines

`func (o *Effect) HasMachines() bool`

HasMachines returns a boolean if a field has been set.

### GetMeta

`func (o *Effect) GetMeta() MoveMetaData`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *Effect) GetMetaOk() (*MoveMetaData, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *Effect) SetMeta(v MoveMetaData)`

SetMeta sets Meta field to given value.

### HasMeta

`func (o *Effect) HasMeta() bool`

HasMeta returns a boolean if a field has been set.

### GetShortEffect

`func (o *Effect) GetShortEffect() string`

GetShortEffect returns the ShortEffect field if non-nil, zero value otherwise.

### GetShortEffectOk

`func (o *Effect) GetShortEffectOk() (*string, bool)`

GetShortEffectOk returns a tuple with the ShortEffect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortEffect

`func (o *Effect) SetShortEffect(v string)`

SetShortEffect sets ShortEffect field to given value.

### HasShortEffect

`func (o *Effect) HasShortEffect() bool`

HasShortEffect returns a boolean if a field has been set.

### GetEffectChance

`func (o *Effect) GetEffectChance() int32`

GetEffectChance returns the EffectChance field if non-nil, zero value otherwise.

### GetEffectChanceOk

`func (o *Effect) GetEffectChanceOk() (*int32, bool)`

GetEffectChanceOk returns a tuple with the EffectChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChance

`func (o *Effect) SetEffectChance(v int32)`

SetEffectChance sets EffectChance field to given value.

### HasEffectChance

`func (o *Effect) HasEffectChance() bool`

HasEffectChance returns a boolean if a field has been set.

### GetStatChanges

`func (o *Effect) GetStatChanges() []MoveStatChange`

GetStatChanges returns the StatChanges field if non-nil, zero value otherwise.

### GetStatChangesOk

`func (o *Effect) GetStatChangesOk() (*[]MoveStatChange, bool)`

GetStatChangesOk returns a tuple with the StatChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatChanges

`func (o *Effect) SetStatChanges(v []MoveStatChange)`

SetStatChanges sets StatChanges field to given value.

### HasStatChanges

`func (o *Effect) HasStatChanges() bool`

HasStatChanges returns a boolean if a field has been set.

### GetSuperContestEffect

`func (o *Effect) GetSuperContestEffect() SuperContestEffect`

GetSuperContestEffect returns the SuperContestEffect field if non-nil, zero value otherwise.

### GetSuperContestEffectOk

`func (o *Effect) GetSuperContestEffectOk() (*SuperContestEffect, bool)`

GetSuperContestEffectOk returns a tuple with the SuperContestEffect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuperContestEffect

`func (o *Effect) SetSuperContestEffect(v SuperContestEffect)`

SetSuperContestEffect sets SuperContestEffect field to given value.

### HasSuperContestEffect

`func (o *Effect) HasSuperContestEffect() bool`

HasSuperContestEffect returns a boolean if a field has been set.

### GetContestCombos

`func (o *Effect) GetContestCombos() ContestComboSets`

GetContestCombos returns the ContestCombos field if non-nil, zero value otherwise.

### GetContestCombosOk

`func (o *Effect) GetContestCombosOk() (*ContestComboSets, bool)`

GetContestCombosOk returns a tuple with the ContestCombos field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestCombos

`func (o *Effect) SetContestCombos(v ContestComboSets)`

SetContestCombos sets ContestCombos field to given value.

### HasContestCombos

`func (o *Effect) HasContestCombos() bool`

HasContestCombos returns a boolean if a field has been set.

### GetContestType

`func (o *Effect) GetContestType() ContestType`

GetContestType returns the ContestType field if non-nil, zero value otherwise.

### GetContestTypeOk

`func (o *Effect) GetContestTypeOk() (*ContestType, bool)`

GetContestTypeOk returns a tuple with the ContestType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContestType

`func (o *Effect) SetContestType(v ContestType)`

SetContestType sets ContestType field to given value.

### HasContestType

`func (o *Effect) HasContestType() bool`

HasContestType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


