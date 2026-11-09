# PokemonSpeciesGenus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Genus** | **string** | The localized genus for the referenced Pokémon species | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this genus is in. | 

## Methods

### NewPokemonSpeciesGenus

`func NewPokemonSpeciesGenus(genus string, language LanguageSummary, ) *PokemonSpeciesGenus`

NewPokemonSpeciesGenus instantiates a new PokemonSpeciesGenus object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpeciesGenusWithDefaults

`func NewPokemonSpeciesGenusWithDefaults() *PokemonSpeciesGenus`

NewPokemonSpeciesGenusWithDefaults instantiates a new PokemonSpeciesGenus object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGenus

`func (o *PokemonSpeciesGenus) GetGenus() string`

GetGenus returns the Genus field if non-nil, zero value otherwise.

### GetGenusOk

`func (o *PokemonSpeciesGenus) GetGenusOk() (*string, bool)`

GetGenusOk returns a tuple with the Genus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenus

`func (o *PokemonSpeciesGenus) SetGenus(v string)`

SetGenus sets Genus field to given value.


### GetLanguage

`func (o *PokemonSpeciesGenus) GetLanguage() LanguageSummary`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *PokemonSpeciesGenus) GetLanguageOk() (*LanguageSummary, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *PokemonSpeciesGenus) SetLanguage(v LanguageSummary)`

SetLanguage sets Language field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


