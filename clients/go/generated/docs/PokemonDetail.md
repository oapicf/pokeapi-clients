# PokemonDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**BaseExperience** | Pointer to **NullableInt32** |  | [optional] 
**Height** | Pointer to **NullableInt32** |  | [optional] 
**IsDefault** | Pointer to **bool** |  | [optional] 
**Order** | Pointer to **NullableInt32** |  | [optional] 
**Weight** | Pointer to **NullableInt32** |  | [optional] 
**Abilities** | [**[]PokemonDetailAbilitiesInner**](PokemonDetailAbilitiesInner.md) |  | 
**PastAbilities** | [**[]PokemonDetailPastAbilitiesInner**](PokemonDetailPastAbilitiesInner.md) |  | 
**Forms** | [**[]PokemonFormSummary**](PokemonFormSummary.md) |  | 
**GameIndices** | [**[]PokemonGameIndex**](PokemonGameIndex.md) |  | 
**HeldItems** | [**PokemonDetailHeldItems**](PokemonDetailHeldItems.md) |  | 
**LocationAreaEncounters** | **string** |  | [readonly] 
**Moves** | [**[]PokemonDetailMovesInner**](PokemonDetailMovesInner.md) |  | 
**Species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**Sprites** | [**PokemonDetailSprites**](PokemonDetailSprites.md) |  | 
**Cries** | [**PokemonDetailCries**](PokemonDetailCries.md) |  | 
**Stats** | [**[]PokemonStat**](PokemonStat.md) |  | 
**Types** | [**[]PokemonDetailTypesInner**](PokemonDetailTypesInner.md) |  | 
**PastTypes** | [**[]PokemonDetailPastTypesInner**](PokemonDetailPastTypesInner.md) |  | 

## Methods

### NewPokemonDetail

`func NewPokemonDetail(id int32, name string, abilities []PokemonDetailAbilitiesInner, pastAbilities []PokemonDetailPastAbilitiesInner, forms []PokemonFormSummary, gameIndices []PokemonGameIndex, heldItems PokemonDetailHeldItems, locationAreaEncounters string, moves []PokemonDetailMovesInner, species PokemonSpeciesSummary, sprites PokemonDetailSprites, cries PokemonDetailCries, stats []PokemonStat, types []PokemonDetailTypesInner, pastTypes []PokemonDetailPastTypesInner, ) *PokemonDetail`

NewPokemonDetail instantiates a new PokemonDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonDetailWithDefaults

`func NewPokemonDetailWithDefaults() *PokemonDetail`

NewPokemonDetailWithDefaults instantiates a new PokemonDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokemonDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokemonDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokemonDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PokemonDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokemonDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokemonDetail) SetName(v string)`

SetName sets Name field to given value.


### GetBaseExperience

`func (o *PokemonDetail) GetBaseExperience() int32`

GetBaseExperience returns the BaseExperience field if non-nil, zero value otherwise.

### GetBaseExperienceOk

`func (o *PokemonDetail) GetBaseExperienceOk() (*int32, bool)`

GetBaseExperienceOk returns a tuple with the BaseExperience field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseExperience

`func (o *PokemonDetail) SetBaseExperience(v int32)`

SetBaseExperience sets BaseExperience field to given value.

### HasBaseExperience

`func (o *PokemonDetail) HasBaseExperience() bool`

HasBaseExperience returns a boolean if a field has been set.

### SetBaseExperienceNil

`func (o *PokemonDetail) SetBaseExperienceNil(b bool)`

 SetBaseExperienceNil sets the value for BaseExperience to be an explicit nil

### UnsetBaseExperience
`func (o *PokemonDetail) UnsetBaseExperience()`

UnsetBaseExperience ensures that no value is present for BaseExperience, not even an explicit nil
### GetHeight

`func (o *PokemonDetail) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *PokemonDetail) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *PokemonDetail) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *PokemonDetail) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### SetHeightNil

`func (o *PokemonDetail) SetHeightNil(b bool)`

 SetHeightNil sets the value for Height to be an explicit nil

### UnsetHeight
`func (o *PokemonDetail) UnsetHeight()`

UnsetHeight ensures that no value is present for Height, not even an explicit nil
### GetIsDefault

`func (o *PokemonDetail) GetIsDefault() bool`

GetIsDefault returns the IsDefault field if non-nil, zero value otherwise.

### GetIsDefaultOk

`func (o *PokemonDetail) GetIsDefaultOk() (*bool, bool)`

GetIsDefaultOk returns a tuple with the IsDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDefault

`func (o *PokemonDetail) SetIsDefault(v bool)`

SetIsDefault sets IsDefault field to given value.

### HasIsDefault

`func (o *PokemonDetail) HasIsDefault() bool`

HasIsDefault returns a boolean if a field has been set.

### GetOrder

`func (o *PokemonDetail) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *PokemonDetail) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *PokemonDetail) SetOrder(v int32)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *PokemonDetail) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### SetOrderNil

`func (o *PokemonDetail) SetOrderNil(b bool)`

 SetOrderNil sets the value for Order to be an explicit nil

### UnsetOrder
`func (o *PokemonDetail) UnsetOrder()`

UnsetOrder ensures that no value is present for Order, not even an explicit nil
### GetWeight

`func (o *PokemonDetail) GetWeight() int32`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *PokemonDetail) GetWeightOk() (*int32, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *PokemonDetail) SetWeight(v int32)`

SetWeight sets Weight field to given value.

### HasWeight

`func (o *PokemonDetail) HasWeight() bool`

HasWeight returns a boolean if a field has been set.

### SetWeightNil

`func (o *PokemonDetail) SetWeightNil(b bool)`

 SetWeightNil sets the value for Weight to be an explicit nil

### UnsetWeight
`func (o *PokemonDetail) UnsetWeight()`

UnsetWeight ensures that no value is present for Weight, not even an explicit nil
### GetAbilities

`func (o *PokemonDetail) GetAbilities() []PokemonDetailAbilitiesInner`

GetAbilities returns the Abilities field if non-nil, zero value otherwise.

### GetAbilitiesOk

`func (o *PokemonDetail) GetAbilitiesOk() (*[]PokemonDetailAbilitiesInner, bool)`

GetAbilitiesOk returns a tuple with the Abilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbilities

`func (o *PokemonDetail) SetAbilities(v []PokemonDetailAbilitiesInner)`

SetAbilities sets Abilities field to given value.


### GetPastAbilities

`func (o *PokemonDetail) GetPastAbilities() []PokemonDetailPastAbilitiesInner`

GetPastAbilities returns the PastAbilities field if non-nil, zero value otherwise.

### GetPastAbilitiesOk

`func (o *PokemonDetail) GetPastAbilitiesOk() (*[]PokemonDetailPastAbilitiesInner, bool)`

GetPastAbilitiesOk returns a tuple with the PastAbilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastAbilities

`func (o *PokemonDetail) SetPastAbilities(v []PokemonDetailPastAbilitiesInner)`

SetPastAbilities sets PastAbilities field to given value.


### GetForms

`func (o *PokemonDetail) GetForms() []PokemonFormSummary`

GetForms returns the Forms field if non-nil, zero value otherwise.

### GetFormsOk

`func (o *PokemonDetail) GetFormsOk() (*[]PokemonFormSummary, bool)`

GetFormsOk returns a tuple with the Forms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForms

`func (o *PokemonDetail) SetForms(v []PokemonFormSummary)`

SetForms sets Forms field to given value.


### GetGameIndices

`func (o *PokemonDetail) GetGameIndices() []PokemonGameIndex`

GetGameIndices returns the GameIndices field if non-nil, zero value otherwise.

### GetGameIndicesOk

`func (o *PokemonDetail) GetGameIndicesOk() (*[]PokemonGameIndex, bool)`

GetGameIndicesOk returns a tuple with the GameIndices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndices

`func (o *PokemonDetail) SetGameIndices(v []PokemonGameIndex)`

SetGameIndices sets GameIndices field to given value.


### GetHeldItems

`func (o *PokemonDetail) GetHeldItems() PokemonDetailHeldItems`

GetHeldItems returns the HeldItems field if non-nil, zero value otherwise.

### GetHeldItemsOk

`func (o *PokemonDetail) GetHeldItemsOk() (*PokemonDetailHeldItems, bool)`

GetHeldItemsOk returns a tuple with the HeldItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeldItems

`func (o *PokemonDetail) SetHeldItems(v PokemonDetailHeldItems)`

SetHeldItems sets HeldItems field to given value.


### GetLocationAreaEncounters

`func (o *PokemonDetail) GetLocationAreaEncounters() string`

GetLocationAreaEncounters returns the LocationAreaEncounters field if non-nil, zero value otherwise.

### GetLocationAreaEncountersOk

`func (o *PokemonDetail) GetLocationAreaEncountersOk() (*string, bool)`

GetLocationAreaEncountersOk returns a tuple with the LocationAreaEncounters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocationAreaEncounters

`func (o *PokemonDetail) SetLocationAreaEncounters(v string)`

SetLocationAreaEncounters sets LocationAreaEncounters field to given value.


### GetMoves

`func (o *PokemonDetail) GetMoves() []PokemonDetailMovesInner`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *PokemonDetail) GetMovesOk() (*[]PokemonDetailMovesInner, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *PokemonDetail) SetMoves(v []PokemonDetailMovesInner)`

SetMoves sets Moves field to given value.


### GetSpecies

`func (o *PokemonDetail) GetSpecies() PokemonSpeciesSummary`

GetSpecies returns the Species field if non-nil, zero value otherwise.

### GetSpeciesOk

`func (o *PokemonDetail) GetSpeciesOk() (*PokemonSpeciesSummary, bool)`

GetSpeciesOk returns a tuple with the Species field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecies

`func (o *PokemonDetail) SetSpecies(v PokemonSpeciesSummary)`

SetSpecies sets Species field to given value.


### GetSprites

`func (o *PokemonDetail) GetSprites() PokemonDetailSprites`

GetSprites returns the Sprites field if non-nil, zero value otherwise.

### GetSpritesOk

`func (o *PokemonDetail) GetSpritesOk() (*PokemonDetailSprites, bool)`

GetSpritesOk returns a tuple with the Sprites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSprites

`func (o *PokemonDetail) SetSprites(v PokemonDetailSprites)`

SetSprites sets Sprites field to given value.


### GetCries

`func (o *PokemonDetail) GetCries() PokemonDetailCries`

GetCries returns the Cries field if non-nil, zero value otherwise.

### GetCriesOk

`func (o *PokemonDetail) GetCriesOk() (*PokemonDetailCries, bool)`

GetCriesOk returns a tuple with the Cries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCries

`func (o *PokemonDetail) SetCries(v PokemonDetailCries)`

SetCries sets Cries field to given value.


### GetStats

`func (o *PokemonDetail) GetStats() []PokemonStat`

GetStats returns the Stats field if non-nil, zero value otherwise.

### GetStatsOk

`func (o *PokemonDetail) GetStatsOk() (*[]PokemonStat, bool)`

GetStatsOk returns a tuple with the Stats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStats

`func (o *PokemonDetail) SetStats(v []PokemonStat)`

SetStats sets Stats field to given value.


### GetTypes

`func (o *PokemonDetail) GetTypes() []PokemonDetailTypesInner`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *PokemonDetail) GetTypesOk() (*[]PokemonDetailTypesInner, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *PokemonDetail) SetTypes(v []PokemonDetailTypesInner)`

SetTypes sets Types field to given value.


### GetPastTypes

`func (o *PokemonDetail) GetPastTypes() []PokemonDetailPastTypesInner`

GetPastTypes returns the PastTypes field if non-nil, zero value otherwise.

### GetPastTypesOk

`func (o *PokemonDetail) GetPastTypesOk() (*[]PokemonDetailPastTypesInner, bool)`

GetPastTypesOk returns a tuple with the PastTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastTypes

`func (o *PokemonDetail) SetPastTypes(v []PokemonDetailPastTypesInner)`

SetPastTypes sets PastTypes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


