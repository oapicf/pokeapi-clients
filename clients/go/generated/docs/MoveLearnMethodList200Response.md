# MoveLearnMethodList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of move learn methods. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of move learn methods. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of move learn methods. | [optional] 
**Results** | Pointer to [**[]MoveLearnMethod**](MoveLearnMethod.md) |  | [optional] 

## Methods

### NewMoveLearnMethodList200Response

`func NewMoveLearnMethodList200Response() *MoveLearnMethodList200Response`

NewMoveLearnMethodList200Response instantiates a new MoveLearnMethodList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveLearnMethodList200ResponseWithDefaults

`func NewMoveLearnMethodList200ResponseWithDefaults() *MoveLearnMethodList200Response`

NewMoveLearnMethodList200ResponseWithDefaults instantiates a new MoveLearnMethodList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *MoveLearnMethodList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *MoveLearnMethodList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *MoveLearnMethodList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *MoveLearnMethodList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *MoveLearnMethodList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *MoveLearnMethodList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *MoveLearnMethodList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *MoveLearnMethodList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *MoveLearnMethodList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *MoveLearnMethodList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *MoveLearnMethodList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *MoveLearnMethodList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *MoveLearnMethodList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *MoveLearnMethodList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *MoveLearnMethodList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *MoveLearnMethodList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *MoveLearnMethodList200Response) GetResults() []MoveLearnMethod`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *MoveLearnMethodList200Response) GetResultsOk() (*[]MoveLearnMethod, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *MoveLearnMethodList200Response) SetResults(v []MoveLearnMethod)`

SetResults sets Results field to given value.

### HasResults

`func (o *MoveLearnMethodList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


