# EggGroupDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Names** | [**[]EggGroupName**](EggGroupName.md) |  | 
**PokemonSpecies** | [**[]EggGroupDetailPokemonSpeciesInner**](EggGroupDetailPokemonSpeciesInner.md) |  | 

## Methods

### NewEggGroupDetail

`func NewEggGroupDetail(id int32, name string, names []EggGroupName, pokemonSpecies []EggGroupDetailPokemonSpeciesInner, ) *EggGroupDetail`

NewEggGroupDetail instantiates a new EggGroupDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEggGroupDetailWithDefaults

`func NewEggGroupDetailWithDefaults() *EggGroupDetail`

NewEggGroupDetailWithDefaults instantiates a new EggGroupDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EggGroupDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EggGroupDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EggGroupDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EggGroupDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EggGroupDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EggGroupDetail) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *EggGroupDetail) GetNames() []EggGroupName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EggGroupDetail) GetNamesOk() (*[]EggGroupName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EggGroupDetail) SetNames(v []EggGroupName)`

SetNames sets Names field to given value.


### GetPokemonSpecies

`func (o *EggGroupDetail) GetPokemonSpecies() []EggGroupDetailPokemonSpeciesInner`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *EggGroupDetail) GetPokemonSpeciesOk() (*[]EggGroupDetailPokemonSpeciesInner, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *EggGroupDetail) SetPokemonSpecies(v []EggGroupDetailPokemonSpeciesInner)`

SetPokemonSpecies sets PokemonSpecies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


