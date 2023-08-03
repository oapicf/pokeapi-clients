# GenerationGameIndex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GameIndex** | Pointer to **int32** | The internal id of an API resource within game data. | [optional] 
**Generation** | Pointer to [**Generation**](Generation.md) |  | [optional] 

## Methods

### NewGenerationGameIndex

`func NewGenerationGameIndex() *GenerationGameIndex`

NewGenerationGameIndex instantiates a new GenerationGameIndex object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerationGameIndexWithDefaults

`func NewGenerationGameIndexWithDefaults() *GenerationGameIndex`

NewGenerationGameIndexWithDefaults instantiates a new GenerationGameIndex object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGameIndex

`func (o *GenerationGameIndex) GetGameIndex() int32`

GetGameIndex returns the GameIndex field if non-nil, zero value otherwise.

### GetGameIndexOk

`func (o *GenerationGameIndex) GetGameIndexOk() (*int32, bool)`

GetGameIndexOk returns a tuple with the GameIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndex

`func (o *GenerationGameIndex) SetGameIndex(v int32)`

SetGameIndex sets GameIndex field to given value.

### HasGameIndex

`func (o *GenerationGameIndex) HasGameIndex() bool`

HasGameIndex returns a boolean if a field has been set.

### GetGeneration

`func (o *GenerationGameIndex) GetGeneration() Generation`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *GenerationGameIndex) GetGenerationOk() (*Generation, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *GenerationGameIndex) SetGeneration(v Generation)`

SetGeneration sets Generation field to given value.

### HasGeneration

`func (o *GenerationGameIndex) HasGeneration() bool`

HasGeneration returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


