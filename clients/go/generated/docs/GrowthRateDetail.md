# GrowthRateDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Formula** | **string** |  | 
**Descriptions** | [**[]GrowthRateDescription**](GrowthRateDescription.md) |  | 
**Levels** | [**[]Experience**](Experience.md) |  | 
**PokemonSpecies** | [**[]PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 

## Methods

### NewGrowthRateDetail

`func NewGrowthRateDetail(id int32, name string, formula string, descriptions []GrowthRateDescription, levels []Experience, pokemonSpecies []PokemonSpeciesSummary, ) *GrowthRateDetail`

NewGrowthRateDetail instantiates a new GrowthRateDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGrowthRateDetailWithDefaults

`func NewGrowthRateDetailWithDefaults() *GrowthRateDetail`

NewGrowthRateDetailWithDefaults instantiates a new GrowthRateDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *GrowthRateDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GrowthRateDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GrowthRateDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *GrowthRateDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GrowthRateDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GrowthRateDetail) SetName(v string)`

SetName sets Name field to given value.


### GetFormula

`func (o *GrowthRateDetail) GetFormula() string`

GetFormula returns the Formula field if non-nil, zero value otherwise.

### GetFormulaOk

`func (o *GrowthRateDetail) GetFormulaOk() (*string, bool)`

GetFormulaOk returns a tuple with the Formula field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormula

`func (o *GrowthRateDetail) SetFormula(v string)`

SetFormula sets Formula field to given value.


### GetDescriptions

`func (o *GrowthRateDetail) GetDescriptions() []GrowthRateDescription`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *GrowthRateDetail) GetDescriptionsOk() (*[]GrowthRateDescription, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *GrowthRateDetail) SetDescriptions(v []GrowthRateDescription)`

SetDescriptions sets Descriptions field to given value.


### GetLevels

`func (o *GrowthRateDetail) GetLevels() []Experience`

GetLevels returns the Levels field if non-nil, zero value otherwise.

### GetLevelsOk

`func (o *GrowthRateDetail) GetLevelsOk() (*[]Experience, bool)`

GetLevelsOk returns a tuple with the Levels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevels

`func (o *GrowthRateDetail) SetLevels(v []Experience)`

SetLevels sets Levels field to given value.


### GetPokemonSpecies

`func (o *GrowthRateDetail) GetPokemonSpecies() []PokemonSpeciesSummary`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *GrowthRateDetail) GetPokemonSpeciesOk() (*[]PokemonSpeciesSummary, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *GrowthRateDetail) SetPokemonSpecies(v []PokemonSpeciesSummary)`

SetPokemonSpecies sets PokemonSpecies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


