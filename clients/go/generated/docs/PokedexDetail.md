# PokedexDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**IsMainSeries** | Pointer to **bool** |  | [optional] 
**Descriptions** | [**[]PokedexDescription**](PokedexDescription.md) |  | 
**Names** | [**[]PokedexName**](PokedexName.md) |  | 
**PokemonEntries** | [**[]PokedexDetailPokemonEntriesInner**](PokedexDetailPokemonEntriesInner.md) |  | 
**Region** | [**RegionSummary**](RegionSummary.md) |  | 
**VersionGroups** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Methods

### NewPokedexDetail

`func NewPokedexDetail(id int32, name string, descriptions []PokedexDescription, names []PokedexName, pokemonEntries []PokedexDetailPokemonEntriesInner, region RegionSummary, versionGroups []AbilityDetailPokemonInnerPokemon, ) *PokedexDetail`

NewPokedexDetail instantiates a new PokedexDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokedexDetailWithDefaults

`func NewPokedexDetailWithDefaults() *PokedexDetail`

NewPokedexDetailWithDefaults instantiates a new PokedexDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokedexDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokedexDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokedexDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PokedexDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokedexDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokedexDetail) SetName(v string)`

SetName sets Name field to given value.


### GetIsMainSeries

`func (o *PokedexDetail) GetIsMainSeries() bool`

GetIsMainSeries returns the IsMainSeries field if non-nil, zero value otherwise.

### GetIsMainSeriesOk

`func (o *PokedexDetail) GetIsMainSeriesOk() (*bool, bool)`

GetIsMainSeriesOk returns a tuple with the IsMainSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMainSeries

`func (o *PokedexDetail) SetIsMainSeries(v bool)`

SetIsMainSeries sets IsMainSeries field to given value.

### HasIsMainSeries

`func (o *PokedexDetail) HasIsMainSeries() bool`

HasIsMainSeries returns a boolean if a field has been set.

### GetDescriptions

`func (o *PokedexDetail) GetDescriptions() []PokedexDescription`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *PokedexDetail) GetDescriptionsOk() (*[]PokedexDescription, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *PokedexDetail) SetDescriptions(v []PokedexDescription)`

SetDescriptions sets Descriptions field to given value.


### GetNames

`func (o *PokedexDetail) GetNames() []PokedexName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokedexDetail) GetNamesOk() (*[]PokedexName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokedexDetail) SetNames(v []PokedexName)`

SetNames sets Names field to given value.


### GetPokemonEntries

`func (o *PokedexDetail) GetPokemonEntries() []PokedexDetailPokemonEntriesInner`

GetPokemonEntries returns the PokemonEntries field if non-nil, zero value otherwise.

### GetPokemonEntriesOk

`func (o *PokedexDetail) GetPokemonEntriesOk() (*[]PokedexDetailPokemonEntriesInner, bool)`

GetPokemonEntriesOk returns a tuple with the PokemonEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonEntries

`func (o *PokedexDetail) SetPokemonEntries(v []PokedexDetailPokemonEntriesInner)`

SetPokemonEntries sets PokemonEntries field to given value.


### GetRegion

`func (o *PokedexDetail) GetRegion() RegionSummary`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *PokedexDetail) GetRegionOk() (*RegionSummary, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *PokedexDetail) SetRegion(v RegionSummary)`

SetRegion sets Region field to given value.


### GetVersionGroups

`func (o *PokedexDetail) GetVersionGroups() []AbilityDetailPokemonInnerPokemon`

GetVersionGroups returns the VersionGroups field if non-nil, zero value otherwise.

### GetVersionGroupsOk

`func (o *PokedexDetail) GetVersionGroupsOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetVersionGroupsOk returns a tuple with the VersionGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroups

`func (o *PokedexDetail) SetVersionGroups(v []AbilityDetailPokemonInnerPokemon)`

SetVersionGroups sets VersionGroups field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


