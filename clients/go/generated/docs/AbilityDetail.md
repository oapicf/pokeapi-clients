# AbilityDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**IsMainSeries** | Pointer to **bool** |  | [optional] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**Names** | [**[]AbilityName**](AbilityName.md) |  | 
**EffectEntries** | [**[]AbilityEffectText**](AbilityEffectText.md) |  | 
**EffectChanges** | [**[]AbilityChange**](AbilityChange.md) |  | 
**FlavorTextEntries** | [**[]AbilityFlavorText**](AbilityFlavorText.md) |  | 
**Pokemon** | [**[]AbilityDetailPokemonInner**](AbilityDetailPokemonInner.md) |  | 

## Methods

### NewAbilityDetail

`func NewAbilityDetail(id int32, name string, generation GenerationSummary, names []AbilityName, effectEntries []AbilityEffectText, effectChanges []AbilityChange, flavorTextEntries []AbilityFlavorText, pokemon []AbilityDetailPokemonInner, ) *AbilityDetail`

NewAbilityDetail instantiates a new AbilityDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAbilityDetailWithDefaults

`func NewAbilityDetailWithDefaults() *AbilityDetail`

NewAbilityDetailWithDefaults instantiates a new AbilityDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AbilityDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AbilityDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AbilityDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *AbilityDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AbilityDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AbilityDetail) SetName(v string)`

SetName sets Name field to given value.


### GetIsMainSeries

`func (o *AbilityDetail) GetIsMainSeries() bool`

GetIsMainSeries returns the IsMainSeries field if non-nil, zero value otherwise.

### GetIsMainSeriesOk

`func (o *AbilityDetail) GetIsMainSeriesOk() (*bool, bool)`

GetIsMainSeriesOk returns a tuple with the IsMainSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMainSeries

`func (o *AbilityDetail) SetIsMainSeries(v bool)`

SetIsMainSeries sets IsMainSeries field to given value.

### HasIsMainSeries

`func (o *AbilityDetail) HasIsMainSeries() bool`

HasIsMainSeries returns a boolean if a field has been set.

### GetGeneration

`func (o *AbilityDetail) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *AbilityDetail) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *AbilityDetail) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.


### GetNames

`func (o *AbilityDetail) GetNames() []AbilityName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *AbilityDetail) GetNamesOk() (*[]AbilityName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *AbilityDetail) SetNames(v []AbilityName)`

SetNames sets Names field to given value.


### GetEffectEntries

`func (o *AbilityDetail) GetEffectEntries() []AbilityEffectText`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *AbilityDetail) GetEffectEntriesOk() (*[]AbilityEffectText, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *AbilityDetail) SetEffectEntries(v []AbilityEffectText)`

SetEffectEntries sets EffectEntries field to given value.


### GetEffectChanges

`func (o *AbilityDetail) GetEffectChanges() []AbilityChange`

GetEffectChanges returns the EffectChanges field if non-nil, zero value otherwise.

### GetEffectChangesOk

`func (o *AbilityDetail) GetEffectChangesOk() (*[]AbilityChange, bool)`

GetEffectChangesOk returns a tuple with the EffectChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectChanges

`func (o *AbilityDetail) SetEffectChanges(v []AbilityChange)`

SetEffectChanges sets EffectChanges field to given value.


### GetFlavorTextEntries

`func (o *AbilityDetail) GetFlavorTextEntries() []AbilityFlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *AbilityDetail) GetFlavorTextEntriesOk() (*[]AbilityFlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *AbilityDetail) SetFlavorTextEntries(v []AbilityFlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.


### GetPokemon

`func (o *AbilityDetail) GetPokemon() []AbilityDetailPokemonInner`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *AbilityDetail) GetPokemonOk() (*[]AbilityDetailPokemonInner, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *AbilityDetail) SetPokemon(v []AbilityDetailPokemonInner)`

SetPokemon sets Pokemon field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


