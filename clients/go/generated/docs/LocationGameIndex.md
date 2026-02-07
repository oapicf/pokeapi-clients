# LocationGameIndex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GameIndex** | **int32** |  | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 

## Methods

### NewLocationGameIndex

`func NewLocationGameIndex(gameIndex int32, generation GenerationSummary, ) *LocationGameIndex`

NewLocationGameIndex instantiates a new LocationGameIndex object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationGameIndexWithDefaults

`func NewLocationGameIndexWithDefaults() *LocationGameIndex`

NewLocationGameIndexWithDefaults instantiates a new LocationGameIndex object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGameIndex

`func (o *LocationGameIndex) GetGameIndex() int32`

GetGameIndex returns the GameIndex field if non-nil, zero value otherwise.

### GetGameIndexOk

`func (o *LocationGameIndex) GetGameIndexOk() (*int32, bool)`

GetGameIndexOk returns a tuple with the GameIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndex

`func (o *LocationGameIndex) SetGameIndex(v int32)`

SetGameIndex sets GameIndex field to given value.


### GetGeneration

`func (o *LocationGameIndex) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *LocationGameIndex) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *LocationGameIndex) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


