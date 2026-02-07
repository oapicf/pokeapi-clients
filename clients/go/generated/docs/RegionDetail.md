# RegionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Locations** | [**[]LocationSummary**](LocationSummary.md) |  | 
**MainGeneration** | [**GenerationSummary**](GenerationSummary.md) |  | [readonly] 
**Names** | [**[]RegionName**](RegionName.md) |  | 
**Pokedexes** | [**[]PokedexSummary**](PokedexSummary.md) |  | 
**VersionGroups** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Methods

### NewRegionDetail

`func NewRegionDetail(id int32, name string, locations []LocationSummary, mainGeneration GenerationSummary, names []RegionName, pokedexes []PokedexSummary, versionGroups []AbilityDetailPokemonInnerPokemon, ) *RegionDetail`

NewRegionDetail instantiates a new RegionDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRegionDetailWithDefaults

`func NewRegionDetailWithDefaults() *RegionDetail`

NewRegionDetailWithDefaults instantiates a new RegionDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RegionDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RegionDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RegionDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *RegionDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *RegionDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *RegionDetail) SetName(v string)`

SetName sets Name field to given value.


### GetLocations

`func (o *RegionDetail) GetLocations() []LocationSummary`

GetLocations returns the Locations field if non-nil, zero value otherwise.

### GetLocationsOk

`func (o *RegionDetail) GetLocationsOk() (*[]LocationSummary, bool)`

GetLocationsOk returns a tuple with the Locations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocations

`func (o *RegionDetail) SetLocations(v []LocationSummary)`

SetLocations sets Locations field to given value.


### GetMainGeneration

`func (o *RegionDetail) GetMainGeneration() GenerationSummary`

GetMainGeneration returns the MainGeneration field if non-nil, zero value otherwise.

### GetMainGenerationOk

`func (o *RegionDetail) GetMainGenerationOk() (*GenerationSummary, bool)`

GetMainGenerationOk returns a tuple with the MainGeneration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMainGeneration

`func (o *RegionDetail) SetMainGeneration(v GenerationSummary)`

SetMainGeneration sets MainGeneration field to given value.


### GetNames

`func (o *RegionDetail) GetNames() []RegionName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *RegionDetail) GetNamesOk() (*[]RegionName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *RegionDetail) SetNames(v []RegionName)`

SetNames sets Names field to given value.


### GetPokedexes

`func (o *RegionDetail) GetPokedexes() []PokedexSummary`

GetPokedexes returns the Pokedexes field if non-nil, zero value otherwise.

### GetPokedexesOk

`func (o *RegionDetail) GetPokedexesOk() (*[]PokedexSummary, bool)`

GetPokedexesOk returns a tuple with the Pokedexes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokedexes

`func (o *RegionDetail) SetPokedexes(v []PokedexSummary)`

SetPokedexes sets Pokedexes field to given value.


### GetVersionGroups

`func (o *RegionDetail) GetVersionGroups() []AbilityDetailPokemonInnerPokemon`

GetVersionGroups returns the VersionGroups field if non-nil, zero value otherwise.

### GetVersionGroupsOk

`func (o *RegionDetail) GetVersionGroupsOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetVersionGroupsOk returns a tuple with the VersionGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroups

`func (o *RegionDetail) SetVersionGroups(v []AbilityDetailPokemonInnerPokemon)`

SetVersionGroups sets VersionGroups field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


