# Pokemon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Name** | **string** |  | 
**BaseExperience** | **int32** |  | 
**Height** | **int32** |  | 
**IsDefault** | **bool** |  | 
**Order** | **int32** |  | 
**Weight** | **int32** |  | 
**Abilities** | [**[]PokemonAbility**](PokemonAbility.md) |  | 
**Forms** | [**[]PokemonForm**](PokemonForm.md) |  | 
**GameIndices** | [**[]VersionGameIndex**](VersionGameIndex.md) |  | 
**HeldItems** | [**[]PokemonHeldItem**](PokemonHeldItem.md) |  | 
**LocationAreaEncounters** | **string** |  | 
**Moves** | [**[]PokemonMove**](PokemonMove.md) |  | 
**Sprites** | [**PokemonSprites**](PokemonSprites.md) |  | 
**Species** | [**NamedAPIResource**](NamedAPIResource.md) |  | 
**Stats** | [**[]PokemonStat**](PokemonStat.md) |  | 
**Types** | [**[]PokemonType**](PokemonType.md) |  | 

## Methods

### NewPokemon

`func NewPokemon(id int32, name string, baseExperience int32, height int32, isDefault bool, order int32, weight int32, abilities []PokemonAbility, forms []PokemonForm, gameIndices []VersionGameIndex, heldItems []PokemonHeldItem, locationAreaEncounters string, moves []PokemonMove, sprites PokemonSprites, species NamedAPIResource, stats []PokemonStat, types []PokemonType, ) *Pokemon`

NewPokemon instantiates a new Pokemon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonWithDefaults

`func NewPokemonWithDefaults() *Pokemon`

NewPokemonWithDefaults instantiates a new Pokemon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Pokemon) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Pokemon) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Pokemon) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *Pokemon) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Pokemon) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Pokemon) SetName(v string)`

SetName sets Name field to given value.


### GetBaseExperience

`func (o *Pokemon) GetBaseExperience() int32`

GetBaseExperience returns the BaseExperience field if non-nil, zero value otherwise.

### GetBaseExperienceOk

`func (o *Pokemon) GetBaseExperienceOk() (*int32, bool)`

GetBaseExperienceOk returns a tuple with the BaseExperience field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseExperience

`func (o *Pokemon) SetBaseExperience(v int32)`

SetBaseExperience sets BaseExperience field to given value.


### GetHeight

`func (o *Pokemon) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *Pokemon) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *Pokemon) SetHeight(v int32)`

SetHeight sets Height field to given value.


### GetIsDefault

`func (o *Pokemon) GetIsDefault() bool`

GetIsDefault returns the IsDefault field if non-nil, zero value otherwise.

### GetIsDefaultOk

`func (o *Pokemon) GetIsDefaultOk() (*bool, bool)`

GetIsDefaultOk returns a tuple with the IsDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDefault

`func (o *Pokemon) SetIsDefault(v bool)`

SetIsDefault sets IsDefault field to given value.


### GetOrder

`func (o *Pokemon) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *Pokemon) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *Pokemon) SetOrder(v int32)`

SetOrder sets Order field to given value.


### GetWeight

`func (o *Pokemon) GetWeight() int32`

GetWeight returns the Weight field if non-nil, zero value otherwise.

### GetWeightOk

`func (o *Pokemon) GetWeightOk() (*int32, bool)`

GetWeightOk returns a tuple with the Weight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeight

`func (o *Pokemon) SetWeight(v int32)`

SetWeight sets Weight field to given value.


### GetAbilities

`func (o *Pokemon) GetAbilities() []PokemonAbility`

GetAbilities returns the Abilities field if non-nil, zero value otherwise.

### GetAbilitiesOk

`func (o *Pokemon) GetAbilitiesOk() (*[]PokemonAbility, bool)`

GetAbilitiesOk returns a tuple with the Abilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbilities

`func (o *Pokemon) SetAbilities(v []PokemonAbility)`

SetAbilities sets Abilities field to given value.


### GetForms

`func (o *Pokemon) GetForms() []PokemonForm`

GetForms returns the Forms field if non-nil, zero value otherwise.

### GetFormsOk

`func (o *Pokemon) GetFormsOk() (*[]PokemonForm, bool)`

GetFormsOk returns a tuple with the Forms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForms

`func (o *Pokemon) SetForms(v []PokemonForm)`

SetForms sets Forms field to given value.


### GetGameIndices

`func (o *Pokemon) GetGameIndices() []VersionGameIndex`

GetGameIndices returns the GameIndices field if non-nil, zero value otherwise.

### GetGameIndicesOk

`func (o *Pokemon) GetGameIndicesOk() (*[]VersionGameIndex, bool)`

GetGameIndicesOk returns a tuple with the GameIndices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndices

`func (o *Pokemon) SetGameIndices(v []VersionGameIndex)`

SetGameIndices sets GameIndices field to given value.


### GetHeldItems

`func (o *Pokemon) GetHeldItems() []PokemonHeldItem`

GetHeldItems returns the HeldItems field if non-nil, zero value otherwise.

### GetHeldItemsOk

`func (o *Pokemon) GetHeldItemsOk() (*[]PokemonHeldItem, bool)`

GetHeldItemsOk returns a tuple with the HeldItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeldItems

`func (o *Pokemon) SetHeldItems(v []PokemonHeldItem)`

SetHeldItems sets HeldItems field to given value.


### GetLocationAreaEncounters

`func (o *Pokemon) GetLocationAreaEncounters() string`

GetLocationAreaEncounters returns the LocationAreaEncounters field if non-nil, zero value otherwise.

### GetLocationAreaEncountersOk

`func (o *Pokemon) GetLocationAreaEncountersOk() (*string, bool)`

GetLocationAreaEncountersOk returns a tuple with the LocationAreaEncounters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocationAreaEncounters

`func (o *Pokemon) SetLocationAreaEncounters(v string)`

SetLocationAreaEncounters sets LocationAreaEncounters field to given value.


### GetMoves

`func (o *Pokemon) GetMoves() []PokemonMove`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *Pokemon) GetMovesOk() (*[]PokemonMove, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *Pokemon) SetMoves(v []PokemonMove)`

SetMoves sets Moves field to given value.


### GetSprites

`func (o *Pokemon) GetSprites() PokemonSprites`

GetSprites returns the Sprites field if non-nil, zero value otherwise.

### GetSpritesOk

`func (o *Pokemon) GetSpritesOk() (*PokemonSprites, bool)`

GetSpritesOk returns a tuple with the Sprites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSprites

`func (o *Pokemon) SetSprites(v PokemonSprites)`

SetSprites sets Sprites field to given value.


### GetSpecies

`func (o *Pokemon) GetSpecies() NamedAPIResource`

GetSpecies returns the Species field if non-nil, zero value otherwise.

### GetSpeciesOk

`func (o *Pokemon) GetSpeciesOk() (*NamedAPIResource, bool)`

GetSpeciesOk returns a tuple with the Species field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecies

`func (o *Pokemon) SetSpecies(v NamedAPIResource)`

SetSpecies sets Species field to given value.


### GetStats

`func (o *Pokemon) GetStats() []PokemonStat`

GetStats returns the Stats field if non-nil, zero value otherwise.

### GetStatsOk

`func (o *Pokemon) GetStatsOk() (*[]PokemonStat, bool)`

GetStatsOk returns a tuple with the Stats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStats

`func (o *Pokemon) SetStats(v []PokemonStat)`

SetStats sets Stats field to given value.


### GetTypes

`func (o *Pokemon) GetTypes() []PokemonType`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *Pokemon) GetTypesOk() (*[]PokemonType, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *Pokemon) SetTypes(v []PokemonType)`

SetTypes sets Types field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


