# PokemonSpeciesDexEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntryNumber** | Pointer to **int32** | The index number of the Pokedex entry. | [optional] 
**Pokedex** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 

## Methods

### NewPokemonSpeciesDexEntry

`func NewPokemonSpeciesDexEntry() *PokemonSpeciesDexEntry`

NewPokemonSpeciesDexEntry instantiates a new PokemonSpeciesDexEntry object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpeciesDexEntryWithDefaults

`func NewPokemonSpeciesDexEntryWithDefaults() *PokemonSpeciesDexEntry`

NewPokemonSpeciesDexEntryWithDefaults instantiates a new PokemonSpeciesDexEntry object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntryNumber

`func (o *PokemonSpeciesDexEntry) GetEntryNumber() int32`

GetEntryNumber returns the EntryNumber field if non-nil, zero value otherwise.

### GetEntryNumberOk

`func (o *PokemonSpeciesDexEntry) GetEntryNumberOk() (*int32, bool)`

GetEntryNumberOk returns a tuple with the EntryNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryNumber

`func (o *PokemonSpeciesDexEntry) SetEntryNumber(v int32)`

SetEntryNumber sets EntryNumber field to given value.

### HasEntryNumber

`func (o *PokemonSpeciesDexEntry) HasEntryNumber() bool`

HasEntryNumber returns a boolean if a field has been set.

### GetPokedex

`func (o *PokemonSpeciesDexEntry) GetPokedex() NamedAPIResource`

GetPokedex returns the Pokedex field if non-nil, zero value otherwise.

### GetPokedexOk

`func (o *PokemonSpeciesDexEntry) GetPokedexOk() (*NamedAPIResource, bool)`

GetPokedexOk returns a tuple with the Pokedex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokedex

`func (o *PokemonSpeciesDexEntry) SetPokedex(v NamedAPIResource)`

SetPokedex sets Pokedex field to given value.

### HasPokedex

`func (o *PokemonSpeciesDexEntry) HasPokedex() bool`

HasPokedex returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


