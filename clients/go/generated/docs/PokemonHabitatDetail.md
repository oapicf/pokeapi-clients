# PokemonHabitatDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Names** | [**[]PokemonHabitatName**](PokemonHabitatName.md) |  | 
**PokemonSpecies** | [**[]PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 

## Methods

### NewPokemonHabitatDetail

`func NewPokemonHabitatDetail(id int32, name string, names []PokemonHabitatName, pokemonSpecies []PokemonSpeciesSummary, ) *PokemonHabitatDetail`

NewPokemonHabitatDetail instantiates a new PokemonHabitatDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonHabitatDetailWithDefaults

`func NewPokemonHabitatDetailWithDefaults() *PokemonHabitatDetail`

NewPokemonHabitatDetailWithDefaults instantiates a new PokemonHabitatDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokemonHabitatDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokemonHabitatDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokemonHabitatDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PokemonHabitatDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokemonHabitatDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokemonHabitatDetail) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *PokemonHabitatDetail) GetNames() []PokemonHabitatName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokemonHabitatDetail) GetNamesOk() (*[]PokemonHabitatName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokemonHabitatDetail) SetNames(v []PokemonHabitatName)`

SetNames sets Names field to given value.


### GetPokemonSpecies

`func (o *PokemonHabitatDetail) GetPokemonSpecies() []PokemonSpeciesSummary`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *PokemonHabitatDetail) GetPokemonSpeciesOk() (*[]PokemonSpeciesSummary, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *PokemonHabitatDetail) SetPokemonSpecies(v []PokemonSpeciesSummary)`

SetPokemonSpecies sets PokemonSpecies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


