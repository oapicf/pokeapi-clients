# PokemonPastType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed types. | 
**Types** | [**[]PokemonType**](PokemonType.md) | The types the referenced pokémon had up to and including the listed generation. | 

## Methods

### NewPokemonPastType

`func NewPokemonPastType(generation GenerationSummary, types []PokemonType, ) *PokemonPastType`

NewPokemonPastType instantiates a new PokemonPastType object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonPastTypeWithDefaults

`func NewPokemonPastTypeWithDefaults() *PokemonPastType`

NewPokemonPastTypeWithDefaults instantiates a new PokemonPastType object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGeneration

`func (o *PokemonPastType) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *PokemonPastType) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *PokemonPastType) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.


### GetTypes

`func (o *PokemonPastType) GetTypes() []PokemonType`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *PokemonPastType) GetTypesOk() (*[]PokemonType, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *PokemonPastType) SetTypes(v []PokemonType)`

SetTypes sets Types field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


