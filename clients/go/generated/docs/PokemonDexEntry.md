# PokemonDexEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntryNumber** | **int32** |  | 
**Pokedex** | [**PokedexSummary**](PokedexSummary.md) |  | 

## Methods

### NewPokemonDexEntry

`func NewPokemonDexEntry(entryNumber int32, pokedex PokedexSummary, ) *PokemonDexEntry`

NewPokemonDexEntry instantiates a new PokemonDexEntry object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonDexEntryWithDefaults

`func NewPokemonDexEntryWithDefaults() *PokemonDexEntry`

NewPokemonDexEntryWithDefaults instantiates a new PokemonDexEntry object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntryNumber

`func (o *PokemonDexEntry) GetEntryNumber() int32`

GetEntryNumber returns the EntryNumber field if non-nil, zero value otherwise.

### GetEntryNumberOk

`func (o *PokemonDexEntry) GetEntryNumberOk() (*int32, bool)`

GetEntryNumberOk returns a tuple with the EntryNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryNumber

`func (o *PokemonDexEntry) SetEntryNumber(v int32)`

SetEntryNumber sets EntryNumber field to given value.


### GetPokedex

`func (o *PokemonDexEntry) GetPokedex() PokedexSummary`

GetPokedex returns the Pokedex field if non-nil, zero value otherwise.

### GetPokedexOk

`func (o *PokemonDexEntry) GetPokedexOk() (*PokedexSummary, bool)`

GetPokedexOk returns a tuple with the Pokedex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokedex

`func (o *PokemonDexEntry) SetPokedex(v PokedexSummary)`

SetPokedex sets Pokedex field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


