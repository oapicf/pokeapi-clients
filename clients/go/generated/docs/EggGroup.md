# EggGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this egg group resource | 
**Name** | **string** | The name for this egg group resource | 
**Names** | [**[]Name**](Name.md) | The name of this egg group listed in different languages | 
**PokemonSpecies** | [**[]NamedAPIResource**](NamedAPIResource.md) | A list of all Pokemon species that are members of this egg group | 

## Methods

### NewEggGroup

`func NewEggGroup(id int32, name string, names []Name, pokemonSpecies []NamedAPIResource, ) *EggGroup`

NewEggGroup instantiates a new EggGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEggGroupWithDefaults

`func NewEggGroupWithDefaults() *EggGroup`

NewEggGroupWithDefaults instantiates a new EggGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EggGroup) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EggGroup) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EggGroup) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EggGroup) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EggGroup) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EggGroup) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *EggGroup) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EggGroup) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EggGroup) SetNames(v []Name)`

SetNames sets Names field to given value.


### GetPokemonSpecies

`func (o *EggGroup) GetPokemonSpecies() []NamedAPIResource`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *EggGroup) GetPokemonSpeciesOk() (*[]NamedAPIResource, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *EggGroup) SetPokemonSpecies(v []NamedAPIResource)`

SetPokemonSpecies sets PokemonSpecies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


