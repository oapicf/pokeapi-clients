# GenderDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**PokemonSpeciesDetails** | [**[]GenderDetailPokemonSpeciesDetailsInner**](GenderDetailPokemonSpeciesDetailsInner.md) |  | 
**RequiredForEvolution** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Methods

### NewGenderDetail

`func NewGenderDetail(id int32, name string, pokemonSpeciesDetails []GenderDetailPokemonSpeciesDetailsInner, requiredForEvolution []AbilityDetailPokemonInnerPokemon, ) *GenderDetail`

NewGenderDetail instantiates a new GenderDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenderDetailWithDefaults

`func NewGenderDetailWithDefaults() *GenderDetail`

NewGenderDetailWithDefaults instantiates a new GenderDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *GenderDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GenderDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GenderDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *GenderDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GenderDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GenderDetail) SetName(v string)`

SetName sets Name field to given value.


### GetPokemonSpeciesDetails

`func (o *GenderDetail) GetPokemonSpeciesDetails() []GenderDetailPokemonSpeciesDetailsInner`

GetPokemonSpeciesDetails returns the PokemonSpeciesDetails field if non-nil, zero value otherwise.

### GetPokemonSpeciesDetailsOk

`func (o *GenderDetail) GetPokemonSpeciesDetailsOk() (*[]GenderDetailPokemonSpeciesDetailsInner, bool)`

GetPokemonSpeciesDetailsOk returns a tuple with the PokemonSpeciesDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpeciesDetails

`func (o *GenderDetail) SetPokemonSpeciesDetails(v []GenderDetailPokemonSpeciesDetailsInner)`

SetPokemonSpeciesDetails sets PokemonSpeciesDetails field to given value.


### GetRequiredForEvolution

`func (o *GenderDetail) GetRequiredForEvolution() []AbilityDetailPokemonInnerPokemon`

GetRequiredForEvolution returns the RequiredForEvolution field if non-nil, zero value otherwise.

### GetRequiredForEvolutionOk

`func (o *GenderDetail) GetRequiredForEvolutionOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetRequiredForEvolutionOk returns a tuple with the RequiredForEvolution field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiredForEvolution

`func (o *GenderDetail) SetRequiredForEvolution(v []AbilityDetailPokemonInnerPokemon)`

SetRequiredForEvolution sets RequiredForEvolution field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


