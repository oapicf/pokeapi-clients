# PokemonSprites

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FrontDefault** | Pointer to **string** | The default depiction of this Pokémon from the front in battle. | [optional] 
**FrontFemale** | Pointer to **string** | The shiny depiction of this Pokémon from the front in battle, for female gendered Pokémon. | [optional] 
**FrontShiny** | Pointer to **string** | The shiny depiction of this Pokémon from the front in battle. | [optional] 
**FrontShinyFemale** | Pointer to **string** | The shiny depiction of this Pokémon from the front in battle, for female gendered Pokémon. | [optional] 
**BackDefault** | Pointer to **string** | The default depiction of this Pokémon from the back in battle. | [optional] 
**BackFemale** | Pointer to **string** | The shiny depiction of this Pokémon from the back in battle, for female gendered Pokémon. | [optional] 
**BackShiny** | Pointer to **string** | The shiny depiction of this Pokémon from the back in battle. | [optional] 
**BackShinyFemale** | Pointer to **string** | The shiny depiction of this Pokémon from the back in battle, for female gendered Pokémon. | [optional] 

## Methods

### NewPokemonSprites

`func NewPokemonSprites() *PokemonSprites`

NewPokemonSprites instantiates a new PokemonSprites object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpritesWithDefaults

`func NewPokemonSpritesWithDefaults() *PokemonSprites`

NewPokemonSpritesWithDefaults instantiates a new PokemonSprites object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrontDefault

`func (o *PokemonSprites) GetFrontDefault() string`

GetFrontDefault returns the FrontDefault field if non-nil, zero value otherwise.

### GetFrontDefaultOk

`func (o *PokemonSprites) GetFrontDefaultOk() (*string, bool)`

GetFrontDefaultOk returns a tuple with the FrontDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontDefault

`func (o *PokemonSprites) SetFrontDefault(v string)`

SetFrontDefault sets FrontDefault field to given value.

### HasFrontDefault

`func (o *PokemonSprites) HasFrontDefault() bool`

HasFrontDefault returns a boolean if a field has been set.

### GetFrontFemale

`func (o *PokemonSprites) GetFrontFemale() string`

GetFrontFemale returns the FrontFemale field if non-nil, zero value otherwise.

### GetFrontFemaleOk

`func (o *PokemonSprites) GetFrontFemaleOk() (*string, bool)`

GetFrontFemaleOk returns a tuple with the FrontFemale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontFemale

`func (o *PokemonSprites) SetFrontFemale(v string)`

SetFrontFemale sets FrontFemale field to given value.

### HasFrontFemale

`func (o *PokemonSprites) HasFrontFemale() bool`

HasFrontFemale returns a boolean if a field has been set.

### GetFrontShiny

`func (o *PokemonSprites) GetFrontShiny() string`

GetFrontShiny returns the FrontShiny field if non-nil, zero value otherwise.

### GetFrontShinyOk

`func (o *PokemonSprites) GetFrontShinyOk() (*string, bool)`

GetFrontShinyOk returns a tuple with the FrontShiny field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontShiny

`func (o *PokemonSprites) SetFrontShiny(v string)`

SetFrontShiny sets FrontShiny field to given value.

### HasFrontShiny

`func (o *PokemonSprites) HasFrontShiny() bool`

HasFrontShiny returns a boolean if a field has been set.

### GetFrontShinyFemale

`func (o *PokemonSprites) GetFrontShinyFemale() string`

GetFrontShinyFemale returns the FrontShinyFemale field if non-nil, zero value otherwise.

### GetFrontShinyFemaleOk

`func (o *PokemonSprites) GetFrontShinyFemaleOk() (*string, bool)`

GetFrontShinyFemaleOk returns a tuple with the FrontShinyFemale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrontShinyFemale

`func (o *PokemonSprites) SetFrontShinyFemale(v string)`

SetFrontShinyFemale sets FrontShinyFemale field to given value.

### HasFrontShinyFemale

`func (o *PokemonSprites) HasFrontShinyFemale() bool`

HasFrontShinyFemale returns a boolean if a field has been set.

### GetBackDefault

`func (o *PokemonSprites) GetBackDefault() string`

GetBackDefault returns the BackDefault field if non-nil, zero value otherwise.

### GetBackDefaultOk

`func (o *PokemonSprites) GetBackDefaultOk() (*string, bool)`

GetBackDefaultOk returns a tuple with the BackDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackDefault

`func (o *PokemonSprites) SetBackDefault(v string)`

SetBackDefault sets BackDefault field to given value.

### HasBackDefault

`func (o *PokemonSprites) HasBackDefault() bool`

HasBackDefault returns a boolean if a field has been set.

### GetBackFemale

`func (o *PokemonSprites) GetBackFemale() string`

GetBackFemale returns the BackFemale field if non-nil, zero value otherwise.

### GetBackFemaleOk

`func (o *PokemonSprites) GetBackFemaleOk() (*string, bool)`

GetBackFemaleOk returns a tuple with the BackFemale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackFemale

`func (o *PokemonSprites) SetBackFemale(v string)`

SetBackFemale sets BackFemale field to given value.

### HasBackFemale

`func (o *PokemonSprites) HasBackFemale() bool`

HasBackFemale returns a boolean if a field has been set.

### GetBackShiny

`func (o *PokemonSprites) GetBackShiny() string`

GetBackShiny returns the BackShiny field if non-nil, zero value otherwise.

### GetBackShinyOk

`func (o *PokemonSprites) GetBackShinyOk() (*string, bool)`

GetBackShinyOk returns a tuple with the BackShiny field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackShiny

`func (o *PokemonSprites) SetBackShiny(v string)`

SetBackShiny sets BackShiny field to given value.

### HasBackShiny

`func (o *PokemonSprites) HasBackShiny() bool`

HasBackShiny returns a boolean if a field has been set.

### GetBackShinyFemale

`func (o *PokemonSprites) GetBackShinyFemale() string`

GetBackShinyFemale returns the BackShinyFemale field if non-nil, zero value otherwise.

### GetBackShinyFemaleOk

`func (o *PokemonSprites) GetBackShinyFemaleOk() (*string, bool)`

GetBackShinyFemaleOk returns a tuple with the BackShinyFemale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackShinyFemale

`func (o *PokemonSprites) SetBackShinyFemale(v string)`

SetBackShinyFemale sets BackShinyFemale field to given value.

### HasBackShinyFemale

`func (o *PokemonSprites) HasBackShinyFemale() bool`

HasBackShinyFemale returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


