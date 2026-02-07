# GenerationDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Abilities** | [**[]AbilitySummary**](AbilitySummary.md) |  | 
**MainRegion** | [**RegionSummary**](RegionSummary.md) |  | 
**Moves** | [**[]MoveSummary**](MoveSummary.md) |  | 
**Names** | [**[]GenerationName**](GenerationName.md) |  | 
**PokemonSpecies** | [**[]PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**Types** | [**[]TypeSummary**](TypeSummary.md) |  | 
**VersionGroups** | [**[]VersionGroupSummary**](VersionGroupSummary.md) |  | 

## Methods

### NewGenerationDetail

`func NewGenerationDetail(id int32, name string, abilities []AbilitySummary, mainRegion RegionSummary, moves []MoveSummary, names []GenerationName, pokemonSpecies []PokemonSpeciesSummary, types []TypeSummary, versionGroups []VersionGroupSummary, ) *GenerationDetail`

NewGenerationDetail instantiates a new GenerationDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerationDetailWithDefaults

`func NewGenerationDetailWithDefaults() *GenerationDetail`

NewGenerationDetailWithDefaults instantiates a new GenerationDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *GenerationDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GenerationDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GenerationDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *GenerationDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GenerationDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GenerationDetail) SetName(v string)`

SetName sets Name field to given value.


### GetAbilities

`func (o *GenerationDetail) GetAbilities() []AbilitySummary`

GetAbilities returns the Abilities field if non-nil, zero value otherwise.

### GetAbilitiesOk

`func (o *GenerationDetail) GetAbilitiesOk() (*[]AbilitySummary, bool)`

GetAbilitiesOk returns a tuple with the Abilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbilities

`func (o *GenerationDetail) SetAbilities(v []AbilitySummary)`

SetAbilities sets Abilities field to given value.


### GetMainRegion

`func (o *GenerationDetail) GetMainRegion() RegionSummary`

GetMainRegion returns the MainRegion field if non-nil, zero value otherwise.

### GetMainRegionOk

`func (o *GenerationDetail) GetMainRegionOk() (*RegionSummary, bool)`

GetMainRegionOk returns a tuple with the MainRegion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMainRegion

`func (o *GenerationDetail) SetMainRegion(v RegionSummary)`

SetMainRegion sets MainRegion field to given value.


### GetMoves

`func (o *GenerationDetail) GetMoves() []MoveSummary`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *GenerationDetail) GetMovesOk() (*[]MoveSummary, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *GenerationDetail) SetMoves(v []MoveSummary)`

SetMoves sets Moves field to given value.


### GetNames

`func (o *GenerationDetail) GetNames() []GenerationName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *GenerationDetail) GetNamesOk() (*[]GenerationName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *GenerationDetail) SetNames(v []GenerationName)`

SetNames sets Names field to given value.


### GetPokemonSpecies

`func (o *GenerationDetail) GetPokemonSpecies() []PokemonSpeciesSummary`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *GenerationDetail) GetPokemonSpeciesOk() (*[]PokemonSpeciesSummary, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *GenerationDetail) SetPokemonSpecies(v []PokemonSpeciesSummary)`

SetPokemonSpecies sets PokemonSpecies field to given value.


### GetTypes

`func (o *GenerationDetail) GetTypes() []TypeSummary`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *GenerationDetail) GetTypesOk() (*[]TypeSummary, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *GenerationDetail) SetTypes(v []TypeSummary)`

SetTypes sets Types field to given value.


### GetVersionGroups

`func (o *GenerationDetail) GetVersionGroups() []VersionGroupSummary`

GetVersionGroups returns the VersionGroups field if non-nil, zero value otherwise.

### GetVersionGroupsOk

`func (o *GenerationDetail) GetVersionGroupsOk() (*[]VersionGroupSummary, bool)`

GetVersionGroupsOk returns a tuple with the VersionGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroups

`func (o *GenerationDetail) SetVersionGroups(v []VersionGroupSummary)`

SetVersionGroups sets VersionGroups field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


