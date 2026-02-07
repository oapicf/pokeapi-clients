# PokemonShapeDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**AwesomeNames** | [**[]PokemonShapeDetailAwesomeNamesInner**](PokemonShapeDetailAwesomeNamesInner.md) |  | 
**Names** | [**[]PokemonShapeDetailNamesInner**](PokemonShapeDetailNamesInner.md) |  | 
**PokemonSpecies** | [**[]PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 

## Methods

### NewPokemonShapeDetail

`func NewPokemonShapeDetail(id int32, name string, awesomeNames []PokemonShapeDetailAwesomeNamesInner, names []PokemonShapeDetailNamesInner, pokemonSpecies []PokemonSpeciesSummary, ) *PokemonShapeDetail`

NewPokemonShapeDetail instantiates a new PokemonShapeDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonShapeDetailWithDefaults

`func NewPokemonShapeDetailWithDefaults() *PokemonShapeDetail`

NewPokemonShapeDetailWithDefaults instantiates a new PokemonShapeDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokemonShapeDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokemonShapeDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokemonShapeDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PokemonShapeDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokemonShapeDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokemonShapeDetail) SetName(v string)`

SetName sets Name field to given value.


### GetAwesomeNames

`func (o *PokemonShapeDetail) GetAwesomeNames() []PokemonShapeDetailAwesomeNamesInner`

GetAwesomeNames returns the AwesomeNames field if non-nil, zero value otherwise.

### GetAwesomeNamesOk

`func (o *PokemonShapeDetail) GetAwesomeNamesOk() (*[]PokemonShapeDetailAwesomeNamesInner, bool)`

GetAwesomeNamesOk returns a tuple with the AwesomeNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAwesomeNames

`func (o *PokemonShapeDetail) SetAwesomeNames(v []PokemonShapeDetailAwesomeNamesInner)`

SetAwesomeNames sets AwesomeNames field to given value.


### GetNames

`func (o *PokemonShapeDetail) GetNames() []PokemonShapeDetailNamesInner`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokemonShapeDetail) GetNamesOk() (*[]PokemonShapeDetailNamesInner, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokemonShapeDetail) SetNames(v []PokemonShapeDetailNamesInner)`

SetNames sets Names field to given value.


### GetPokemonSpecies

`func (o *PokemonShapeDetail) GetPokemonSpecies() []PokemonSpeciesSummary`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *PokemonShapeDetail) GetPokemonSpeciesOk() (*[]PokemonSpeciesSummary, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *PokemonShapeDetail) SetPokemonSpecies(v []PokemonSpeciesSummary)`

SetPokemonSpecies sets PokemonSpecies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


