# Pokedex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Name** | **string** |  | 
**IsMainSeries** | **bool** |  | 
**Descriptions** | [**[]Description**](Description.md) |  | 
**PokemonEntries** | [**[]PokemonEntry**](PokemonEntry.md) |  | 
**Region** | [**NamedAPIResource**](NamedAPIResource.md) |  | 

## Methods

### NewPokedex

`func NewPokedex(id int32, name string, isMainSeries bool, descriptions []Description, pokemonEntries []PokemonEntry, region NamedAPIResource, ) *Pokedex`

NewPokedex instantiates a new Pokedex object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokedexWithDefaults

`func NewPokedexWithDefaults() *Pokedex`

NewPokedexWithDefaults instantiates a new Pokedex object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Pokedex) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Pokedex) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Pokedex) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *Pokedex) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Pokedex) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Pokedex) SetName(v string)`

SetName sets Name field to given value.


### GetIsMainSeries

`func (o *Pokedex) GetIsMainSeries() bool`

GetIsMainSeries returns the IsMainSeries field if non-nil, zero value otherwise.

### GetIsMainSeriesOk

`func (o *Pokedex) GetIsMainSeriesOk() (*bool, bool)`

GetIsMainSeriesOk returns a tuple with the IsMainSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMainSeries

`func (o *Pokedex) SetIsMainSeries(v bool)`

SetIsMainSeries sets IsMainSeries field to given value.


### GetDescriptions

`func (o *Pokedex) GetDescriptions() []Description`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *Pokedex) GetDescriptionsOk() (*[]Description, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *Pokedex) SetDescriptions(v []Description)`

SetDescriptions sets Descriptions field to given value.


### GetPokemonEntries

`func (o *Pokedex) GetPokemonEntries() []PokemonEntry`

GetPokemonEntries returns the PokemonEntries field if non-nil, zero value otherwise.

### GetPokemonEntriesOk

`func (o *Pokedex) GetPokemonEntriesOk() (*[]PokemonEntry, bool)`

GetPokemonEntriesOk returns a tuple with the PokemonEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonEntries

`func (o *Pokedex) SetPokemonEntries(v []PokemonEntry)`

SetPokemonEntries sets PokemonEntries field to given value.


### GetRegion

`func (o *Pokedex) GetRegion() NamedAPIResource`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *Pokedex) GetRegionOk() (*NamedAPIResource, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *Pokedex) SetRegion(v NamedAPIResource)`

SetRegion sets Region field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


