# PokemonSpeciesFlavorText

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FlavorText** | **string** | The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more.  | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 
**Version** | [**VersionSummary**](VersionSummary.md) | The game version this flavor text is extracted from. | 

## Methods

### NewPokemonSpeciesFlavorText

`func NewPokemonSpeciesFlavorText(flavorText string, language LanguageSummary, version VersionSummary, ) *PokemonSpeciesFlavorText`

NewPokemonSpeciesFlavorText instantiates a new PokemonSpeciesFlavorText object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpeciesFlavorTextWithDefaults

`func NewPokemonSpeciesFlavorTextWithDefaults() *PokemonSpeciesFlavorText`

NewPokemonSpeciesFlavorTextWithDefaults instantiates a new PokemonSpeciesFlavorText object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFlavorText

`func (o *PokemonSpeciesFlavorText) GetFlavorText() string`

GetFlavorText returns the FlavorText field if non-nil, zero value otherwise.

### GetFlavorTextOk

`func (o *PokemonSpeciesFlavorText) GetFlavorTextOk() (*string, bool)`

GetFlavorTextOk returns a tuple with the FlavorText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorText

`func (o *PokemonSpeciesFlavorText) SetFlavorText(v string)`

SetFlavorText sets FlavorText field to given value.


### GetLanguage

`func (o *PokemonSpeciesFlavorText) GetLanguage() LanguageSummary`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *PokemonSpeciesFlavorText) GetLanguageOk() (*LanguageSummary, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *PokemonSpeciesFlavorText) SetLanguage(v LanguageSummary)`

SetLanguage sets Language field to given value.


### GetVersion

`func (o *PokemonSpeciesFlavorText) GetVersion() VersionSummary`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *PokemonSpeciesFlavorText) GetVersionOk() (*VersionSummary, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *PokemonSpeciesFlavorText) SetVersion(v VersionSummary)`

SetVersion sets Version field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


