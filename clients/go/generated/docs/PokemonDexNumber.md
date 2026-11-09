# PokemonDexNumber

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntryNumber** | **int32** | The index of this Pokémon species entry within the Pokédex. | 
**PokemonSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. | 

## Methods

### NewPokemonDexNumber

`func NewPokemonDexNumber(entryNumber int32, pokemonSpecies PokemonSpeciesSummary, ) *PokemonDexNumber`

NewPokemonDexNumber instantiates a new PokemonDexNumber object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonDexNumberWithDefaults

`func NewPokemonDexNumberWithDefaults() *PokemonDexNumber`

NewPokemonDexNumberWithDefaults instantiates a new PokemonDexNumber object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntryNumber

`func (o *PokemonDexNumber) GetEntryNumber() int32`

GetEntryNumber returns the EntryNumber field if non-nil, zero value otherwise.

### GetEntryNumberOk

`func (o *PokemonDexNumber) GetEntryNumberOk() (*int32, bool)`

GetEntryNumberOk returns a tuple with the EntryNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryNumber

`func (o *PokemonDexNumber) SetEntryNumber(v int32)`

SetEntryNumber sets EntryNumber field to given value.


### GetPokemonSpecies

`func (o *PokemonDexNumber) GetPokemonSpecies() PokemonSpeciesSummary`

GetPokemonSpecies returns the PokemonSpecies field if non-nil, zero value otherwise.

### GetPokemonSpeciesOk

`func (o *PokemonDexNumber) GetPokemonSpeciesOk() (*PokemonSpeciesSummary, bool)`

GetPokemonSpeciesOk returns a tuple with the PokemonSpecies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpecies

`func (o *PokemonDexNumber) SetPokemonSpecies(v PokemonSpeciesSummary)`

SetPokemonSpecies sets PokemonSpecies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


