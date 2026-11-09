# PokemonDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**BaseExperience** | Pointer to **NullableInt32** | The base experience gained for defeating this Pokémon. | [optional] 
**Height** | Pointer to **NullableInt32** | The height of this Pokémon in decimetres. | [optional] 
**IsDefault** | Pointer to **bool** | Set for exactly one Pokémon used as the default for each species. | [optional] 
**Order** | Pointer to **NullableInt32** | Order for sorting. Almost national order, except families are grouped together. | [optional] 
**Weight** | Pointer to **NullableInt32** | The weight of this Pokémon in hectograms. | [optional] 
**Abilities** | [**[]PokemonAbility**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] 
**PastAbilities** | [**[]PokemonPastAbility**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] 
**Forms** | [**[]PokemonFormSummary**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] 
**GameIndices** | [**[]PokemonGameIndex**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] 
**HeldItems** | [**[]PokemonHeldItemSummary**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] 
**LocationAreaEncounters** | **string** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] 
**Moves** | [**[]PokemonMove**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] 
**Species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**Sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] 
**Cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] 
**Stats** | [**[]PokemonStat**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] 
**PastStats** | [**[]PokemonPastStat**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] 
**Types** | [**[]PokemonType**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] 
**PastTypes** | [**[]PokemonPastType**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] 

## Methods

### NewPokemonDetail

`func NewPokemonDetail(id int32, name string, abilities []PokemonAbility, pastAbilities []PokemonPastAbility, forms []PokemonFormSummary, gameIndices []PokemonGameIndex, heldItems []PokemonHeldItemSummary, locationAreaEncounters string, moves []PokemonMove, species PokemonSpeciesSummary, sprites PokemonSprites, cries PokemonCries, stats []PokemonStat, pastStats []PokemonPastStat, types []PokemonType, pastTypes []PokemonPastType, ) *PokemonDetail`

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

`func (o *PokemonDetail) GetAbilities() []PokemonAbility`

GetAbilities returns the Abilities field if non-nil, zero value otherwise.

### GetAbilitiesOk

`func (o *PokemonDetail) GetAbilitiesOk() (*[]PokemonAbility, bool)`

GetAbilitiesOk returns a tuple with the Abilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbilities

`func (o *PokemonDetail) SetAbilities(v []PokemonAbility)`

SetAbilities sets Abilities field to given value.


### GetPastAbilities

`func (o *PokemonDetail) GetPastAbilities() []PokemonPastAbility`

GetPastAbilities returns the PastAbilities field if non-nil, zero value otherwise.

### GetPastAbilitiesOk

`func (o *PokemonDetail) GetPastAbilitiesOk() (*[]PokemonPastAbility, bool)`

GetPastAbilitiesOk returns a tuple with the PastAbilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastAbilities

`func (o *PokemonDetail) SetPastAbilities(v []PokemonPastAbility)`

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

`func (o *PokemonDetail) GetHeldItems() []PokemonHeldItemSummary`

GetHeldItems returns the HeldItems field if non-nil, zero value otherwise.

### GetHeldItemsOk

`func (o *PokemonDetail) GetHeldItemsOk() (*[]PokemonHeldItemSummary, bool)`

GetHeldItemsOk returns a tuple with the HeldItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeldItems

`func (o *PokemonDetail) SetHeldItems(v []PokemonHeldItemSummary)`

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

`func (o *PokemonDetail) GetMoves() []PokemonMove`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *PokemonDetail) GetMovesOk() (*[]PokemonMove, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *PokemonDetail) SetMoves(v []PokemonMove)`

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

`func (o *PokemonDetail) GetSprites() PokemonSprites`

GetSprites returns the Sprites field if non-nil, zero value otherwise.

### GetSpritesOk

`func (o *PokemonDetail) GetSpritesOk() (*PokemonSprites, bool)`

GetSpritesOk returns a tuple with the Sprites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSprites

`func (o *PokemonDetail) SetSprites(v PokemonSprites)`

SetSprites sets Sprites field to given value.


### GetCries

`func (o *PokemonDetail) GetCries() PokemonCries`

GetCries returns the Cries field if non-nil, zero value otherwise.

### GetCriesOk

`func (o *PokemonDetail) GetCriesOk() (*PokemonCries, bool)`

GetCriesOk returns a tuple with the Cries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCries

`func (o *PokemonDetail) SetCries(v PokemonCries)`

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


### GetPastStats

`func (o *PokemonDetail) GetPastStats() []PokemonPastStat`

GetPastStats returns the PastStats field if non-nil, zero value otherwise.

### GetPastStatsOk

`func (o *PokemonDetail) GetPastStatsOk() (*[]PokemonPastStat, bool)`

GetPastStatsOk returns a tuple with the PastStats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastStats

`func (o *PokemonDetail) SetPastStats(v []PokemonPastStat)`

SetPastStats sets PastStats field to given value.


### GetTypes

`func (o *PokemonDetail) GetTypes() []PokemonType`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *PokemonDetail) GetTypesOk() (*[]PokemonType, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *PokemonDetail) SetTypes(v []PokemonType)`

SetTypes sets Types field to given value.


### GetPastTypes

`func (o *PokemonDetail) GetPastTypes() []PokemonPastType`

GetPastTypes returns the PastTypes field if non-nil, zero value otherwise.

### GetPastTypesOk

`func (o *PokemonDetail) GetPastTypesOk() (*[]PokemonPastType, bool)`

GetPastTypesOk returns a tuple with the PastTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastTypes

`func (o *PokemonDetail) SetPastTypes(v []PokemonPastType)`

SetPastTypes sets PastTypes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


