# PalParkAreaDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Names** | [**[]PalParkAreaName**](PalParkAreaName.md) |  | 
**PokemonEncounters** | [**[]PalParkAreaDetailPokemonEncountersInner**](PalParkAreaDetailPokemonEncountersInner.md) |  | 

## Methods

### NewPalParkAreaDetail

`func NewPalParkAreaDetail(id int32, name string, names []PalParkAreaName, pokemonEncounters []PalParkAreaDetailPokemonEncountersInner, ) *PalParkAreaDetail`

NewPalParkAreaDetail instantiates a new PalParkAreaDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPalParkAreaDetailWithDefaults

`func NewPalParkAreaDetailWithDefaults() *PalParkAreaDetail`

NewPalParkAreaDetailWithDefaults instantiates a new PalParkAreaDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PalParkAreaDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PalParkAreaDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PalParkAreaDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PalParkAreaDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PalParkAreaDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PalParkAreaDetail) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *PalParkAreaDetail) GetNames() []PalParkAreaName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PalParkAreaDetail) GetNamesOk() (*[]PalParkAreaName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PalParkAreaDetail) SetNames(v []PalParkAreaName)`

SetNames sets Names field to given value.


### GetPokemonEncounters

`func (o *PalParkAreaDetail) GetPokemonEncounters() []PalParkAreaDetailPokemonEncountersInner`

GetPokemonEncounters returns the PokemonEncounters field if non-nil, zero value otherwise.

### GetPokemonEncountersOk

`func (o *PalParkAreaDetail) GetPokemonEncountersOk() (*[]PalParkAreaDetailPokemonEncountersInner, bool)`

GetPokemonEncountersOk returns a tuple with the PokemonEncounters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonEncounters

`func (o *PalParkAreaDetail) SetPokemonEncounters(v []PalParkAreaDetailPokemonEncountersInner)`

SetPokemonEncounters sets PokemonEncounters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


