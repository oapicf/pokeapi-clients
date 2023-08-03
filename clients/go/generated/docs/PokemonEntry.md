# PokemonEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntryNumber** | Pointer to **int32** | The index number within the Pokédex. | [optional] 
**PokemonSpecies** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 

## Methods

### NewPokemonEntry

`func NewPokemonEntry() *PokemonEntry`

NewPokemonEntry instantiates a new PokemonEntry object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonEntryWithDefaults

`func NewPokemonEntryWithDefaults() *PokemonEntry`

NewPokemonEntryWithDefaults instantiates a new PokemonEntry object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntryNumber

`func (o *PokemonEntry) GetEntryNumber() int32`

GetEntryNumber returns the EntryNumber field if non-nil, zero value otherwise.

### GetEntryNumberOk

`func (o *PokemonEntry) GetEntryNumberOk() (*int32, bool)`

GetEntryNumberOk returns a tuple with the EntryNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryNumber

`func (o *PokemonEntry) SetEntryNumber(v int32)`

SetEntryNumber sets EntryNumber field to given value.

### HasEntryNumber

`func (o *PokemonEntry) HasEntryNumber() bool`

HasEntryNumber returns a boolean if a field has been set.

### GetPokemonSpecies

`func (o *PokemonEntry) GetPokemonSpecies() NamedAPIResource`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *PokemonEntry) GetPokemonSpeciesOk() (*NamedAPIResource, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *PokemonEntry) SetPokemonSpecies(v NamedAPIResource)`

SetPokemonSpecies sets PokemonSpecies field to given value.

### HasPokemonSpecies

`func (o *PokemonEntry) HasPokemonSpecies() bool`

HasPokemonSpecies returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


