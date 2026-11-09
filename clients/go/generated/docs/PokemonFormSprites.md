# PokemonFormSprites

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FrontDefault** | **NullableString** | The default depiction of this Pokémon from the front in battle. | 
**FrontShiny** | **NullableString** | The shiny depiction of this Pokémon from the front in battle. | 
**FrontFemale** | **NullableString** | The female depiction of this Pokémon from the front in battle. | 
**FrontShinyFemale** | **NullableString** | The shiny female depiction of this Pokémon from the front in battle. | 
**BackDefault** | **NullableString** | The default depiction of this Pokémon from the back in battle. | 
**BackShiny** | **NullableString** | The shiny depiction of this Pokémon from the back in battle. | 
**BackFemale** | **NullableString** | The female depiction of this Pokémon from the back in battle. | 
**BackShinyFemale** | **NullableString** | The shiny female depiction of this Pokémon from the back in battle. | 
**Other** | Pointer to [**PokemonSpritesOther**](PokemonSpritesOther.md) | Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. | [optional] 
**Versions** | Pointer to **map[string]map[string]*interface{}** | Sprites grouped by generation and game. Available keys vary by resource. | [optional] 

## Methods

### NewPokemonFormSprites

`func NewPokemonFormSprites(frontDefault NullableString, frontShiny NullableString, frontFemale NullableString, frontShinyFemale NullableString, backDefault NullableString, backShiny NullableString, backFemale NullableString, backShinyFemale NullableString, ) *PokemonFormSprites`

NewPokemonFormSprites instantiates a new PokemonFormSprites object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonFormSpritesWithDefaults

`func NewPokemonFormSpritesWithDefaults() *PokemonFormSprites`

NewPokemonFormSpritesWithDefaults instantiates a new PokemonFormSprites object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrontDefault

`func (o *PokemonFormSprites) GetFrontDefault() string`

GetFrontDefault returns the FrontDefault field if non-nil, zero value otherwise.

### GetFrontDefaultOk

`func (o *PokemonFormSprites) GetFrontDefaultOk() (*string, bool)`

GetFrontDefaultOk returns a tuple with the FrontDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontDefault

`func (o *PokemonFormSprites) SetFrontDefault(v string)`

SetFrontDefault sets FrontDefault field to given value.


### SetFrontDefaultNil

`func (o *PokemonFormSprites) SetFrontDefaultNil(b bool)`

 SetFrontDefaultNil sets the value for FrontDefault to be an explicit nil

### UnsetFrontDefault
`func (o *PokemonFormSprites) UnsetFrontDefault()`

UnsetFrontDefault ensures that no value is present for FrontDefault, not even an explicit nil
### GetFrontShiny

`func (o *PokemonFormSprites) GetFrontShiny() string`

GetFrontShiny returns the FrontShiny field if non-nil, zero value otherwise.

### GetFrontShinyOk

`func (o *PokemonFormSprites) GetFrontShinyOk() (*string, bool)`

GetFrontShinyOk returns a tuple with the FrontShiny field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontShiny

`func (o *PokemonFormSprites) SetFrontShiny(v string)`

SetFrontShiny sets FrontShiny field to given value.


### SetFrontShinyNil

`func (o *PokemonFormSprites) SetFrontShinyNil(b bool)`

 SetFrontShinyNil sets the value for FrontShiny to be an explicit nil

### UnsetFrontShiny
`func (o *PokemonFormSprites) UnsetFrontShiny()`

UnsetFrontShiny ensures that no value is present for FrontShiny, not even an explicit nil
### GetFrontFemale

`func (o *PokemonFormSprites) GetFrontFemale() string`

GetFrontFemale returns the FrontFemale field if non-nil, zero value otherwise.

### GetFrontFemaleOk

`func (o *PokemonFormSprites) GetFrontFemaleOk() (*string, bool)`

GetFrontFemaleOk returns a tuple with the FrontFemale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontFemale

`func (o *PokemonFormSprites) SetFrontFemale(v string)`

SetFrontFemale sets FrontFemale field to given value.


### SetFrontFemaleNil

`func (o *PokemonFormSprites) SetFrontFemaleNil(b bool)`

 SetFrontFemaleNil sets the value for FrontFemale to be an explicit nil

### UnsetFrontFemale
`func (o *PokemonFormSprites) UnsetFrontFemale()`

UnsetFrontFemale ensures that no value is present for FrontFemale, not even an explicit nil
### GetFrontShinyFemale

`func (o *PokemonFormSprites) GetFrontShinyFemale() string`

GetFrontShinyFemale returns the FrontShinyFemale field if non-nil, zero value otherwise.

### GetFrontShinyFemaleOk

`func (o *PokemonFormSprites) GetFrontShinyFemaleOk() (*string, bool)`

GetFrontShinyFemaleOk returns a tuple with the FrontShinyFemale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontShinyFemale

`func (o *PokemonFormSprites) SetFrontShinyFemale(v string)`

SetFrontShinyFemale sets FrontShinyFemale field to given value.


### SetFrontShinyFemaleNil

`func (o *PokemonFormSprites) SetFrontShinyFemaleNil(b bool)`

 SetFrontShinyFemaleNil sets the value for FrontShinyFemale to be an explicit nil

### UnsetFrontShinyFemale
`func (o *PokemonFormSprites) UnsetFrontShinyFemale()`

UnsetFrontShinyFemale ensures that no value is present for FrontShinyFemale, not even an explicit nil
### GetBackDefault

`func (o *PokemonFormSprites) GetBackDefault() string`

GetBackDefault returns the BackDefault field if non-nil, zero value otherwise.

### GetBackDefaultOk

`func (o *PokemonFormSprites) GetBackDefaultOk() (*string, bool)`

GetBackDefaultOk returns a tuple with the BackDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackDefault

`func (o *PokemonFormSprites) SetBackDefault(v string)`

SetBackDefault sets BackDefault field to given value.


### SetBackDefaultNil

`func (o *PokemonFormSprites) SetBackDefaultNil(b bool)`

 SetBackDefaultNil sets the value for BackDefault to be an explicit nil

### UnsetBackDefault
`func (o *PokemonFormSprites) UnsetBackDefault()`

UnsetBackDefault ensures that no value is present for BackDefault, not even an explicit nil
### GetBackShiny

`func (o *PokemonFormSprites) GetBackShiny() string`

GetBackShiny returns the BackShiny field if non-nil, zero value otherwise.

### GetBackShinyOk

`func (o *PokemonFormSprites) GetBackShinyOk() (*string, bool)`

GetBackShinyOk returns a tuple with the BackShiny field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackShiny

`func (o *PokemonFormSprites) SetBackShiny(v string)`

SetBackShiny sets BackShiny field to given value.


### SetBackShinyNil

`func (o *PokemonFormSprites) SetBackShinyNil(b bool)`

 SetBackShinyNil sets the value for BackShiny to be an explicit nil

### UnsetBackShiny
`func (o *PokemonFormSprites) UnsetBackShiny()`

UnsetBackShiny ensures that no value is present for BackShiny, not even an explicit nil
### GetBackFemale

`func (o *PokemonFormSprites) GetBackFemale() string`

GetBackFemale returns the BackFemale field if non-nil, zero value otherwise.

### GetBackFemaleOk

`func (o *PokemonFormSprites) GetBackFemaleOk() (*string, bool)`

GetBackFemaleOk returns a tuple with the BackFemale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackFemale

`func (o *PokemonFormSprites) SetBackFemale(v string)`

SetBackFemale sets BackFemale field to given value.


### SetBackFemaleNil

`func (o *PokemonFormSprites) SetBackFemaleNil(b bool)`

 SetBackFemaleNil sets the value for BackFemale to be an explicit nil

### UnsetBackFemale
`func (o *PokemonFormSprites) UnsetBackFemale()`

UnsetBackFemale ensures that no value is present for BackFemale, not even an explicit nil
### GetBackShinyFemale

`func (o *PokemonFormSprites) GetBackShinyFemale() string`

GetBackShinyFemale returns the BackShinyFemale field if non-nil, zero value otherwise.

### GetBackShinyFemaleOk

`func (o *PokemonFormSprites) GetBackShinyFemaleOk() (*string, bool)`

GetBackShinyFemaleOk returns a tuple with the BackShinyFemale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackShinyFemale

`func (o *PokemonFormSprites) SetBackShinyFemale(v string)`

SetBackShinyFemale sets BackShinyFemale field to given value.


### SetBackShinyFemaleNil

`func (o *PokemonFormSprites) SetBackShinyFemaleNil(b bool)`

 SetBackShinyFemaleNil sets the value for BackShinyFemale to be an explicit nil

### UnsetBackShinyFemale
`func (o *PokemonFormSprites) UnsetBackShinyFemale()`

UnsetBackShinyFemale ensures that no value is present for BackShinyFemale, not even an explicit nil
### GetOther

`func (o *PokemonFormSprites) GetOther() PokemonSpritesOther`

GetOther returns the Other field if non-nil, zero value otherwise.

### GetOtherOk

`func (o *PokemonFormSprites) GetOtherOk() (*PokemonSpritesOther, bool)`

GetOtherOk returns a tuple with the Other field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOther

`func (o *PokemonFormSprites) SetOther(v PokemonSpritesOther)`

SetOther sets Other field to given value.

### HasOther

`func (o *PokemonFormSprites) HasOther() bool`

HasOther returns a boolean if a field has been set.

### GetVersions

`func (o *PokemonFormSprites) GetVersions() map[string]map[string]*interface{}`

GetVersions returns the Versions field if non-nil, zero value otherwise.

### GetVersionsOk

`func (o *PokemonFormSprites) GetVersionsOk() (*map[string]map[string]*interface{}, bool)`

GetVersionsOk returns a tuple with the Versions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersions

`func (o *PokemonFormSprites) SetVersions(v map[string]map[string]*interface{})`

SetVersions sets Versions field to given value.

### HasVersions

`func (o *PokemonFormSprites) HasVersions() bool`

HasVersions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


