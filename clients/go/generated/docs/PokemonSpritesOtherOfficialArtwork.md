# PokemonSpritesOtherOfficialArtwork

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FrontDefault** | **NullableString** | The URL of the default front official artwork, or null if unavailable. | 
**FrontShiny** | **NullableString** | The URL of the shiny front official artwork, or null if unavailable. | 
**Versions** | Pointer to **map[string]map[string]*interface{}** | Additional official artwork grouped by version. Available keys vary by resource. | [optional] 

## Methods

### NewPokemonSpritesOtherOfficialArtwork

`func NewPokemonSpritesOtherOfficialArtwork(frontDefault NullableString, frontShiny NullableString, ) *PokemonSpritesOtherOfficialArtwork`

NewPokemonSpritesOtherOfficialArtwork instantiates a new PokemonSpritesOtherOfficialArtwork object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpritesOtherOfficialArtworkWithDefaults

`func NewPokemonSpritesOtherOfficialArtworkWithDefaults() *PokemonSpritesOtherOfficialArtwork`

NewPokemonSpritesOtherOfficialArtworkWithDefaults instantiates a new PokemonSpritesOtherOfficialArtwork object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrontDefault

`func (o *PokemonSpritesOtherOfficialArtwork) GetFrontDefault() string`

GetFrontDefault returns the FrontDefault field if non-nil, zero value otherwise.

### GetFrontDefaultOk

`func (o *PokemonSpritesOtherOfficialArtwork) GetFrontDefaultOk() (*string, bool)`

GetFrontDefaultOk returns a tuple with the FrontDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontDefault

`func (o *PokemonSpritesOtherOfficialArtwork) SetFrontDefault(v string)`

SetFrontDefault sets FrontDefault field to given value.


### SetFrontDefaultNil

`func (o *PokemonSpritesOtherOfficialArtwork) SetFrontDefaultNil(b bool)`

 SetFrontDefaultNil sets the value for FrontDefault to be an explicit nil

### UnsetFrontDefault
`func (o *PokemonSpritesOtherOfficialArtwork) UnsetFrontDefault()`

UnsetFrontDefault ensures that no value is present for FrontDefault, not even an explicit nil
### GetFrontShiny

`func (o *PokemonSpritesOtherOfficialArtwork) GetFrontShiny() string`

GetFrontShiny returns the FrontShiny field if non-nil, zero value otherwise.

### GetFrontShinyOk

`func (o *PokemonSpritesOtherOfficialArtwork) GetFrontShinyOk() (*string, bool)`

GetFrontShinyOk returns a tuple with the FrontShiny field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontShiny

`func (o *PokemonSpritesOtherOfficialArtwork) SetFrontShiny(v string)`

SetFrontShiny sets FrontShiny field to given value.


### SetFrontShinyNil

`func (o *PokemonSpritesOtherOfficialArtwork) SetFrontShinyNil(b bool)`

 SetFrontShinyNil sets the value for FrontShiny to be an explicit nil

### UnsetFrontShiny
`func (o *PokemonSpritesOtherOfficialArtwork) UnsetFrontShiny()`

UnsetFrontShiny ensures that no value is present for FrontShiny, not even an explicit nil
### GetVersions

`func (o *PokemonSpritesOtherOfficialArtwork) GetVersions() map[string]map[string]*interface{}`

GetVersions returns the Versions field if non-nil, zero value otherwise.

### GetVersionsOk

`func (o *PokemonSpritesOtherOfficialArtwork) GetVersionsOk() (*map[string]map[string]*interface{}, bool)`

GetVersionsOk returns a tuple with the Versions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersions

`func (o *PokemonSpritesOtherOfficialArtwork) SetVersions(v map[string]map[string]*interface{})`

SetVersions sets Versions field to given value.

### HasVersions

`func (o *PokemonSpritesOtherOfficialArtwork) HasVersions() bool`

HasVersions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


