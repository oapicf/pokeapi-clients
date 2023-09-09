# MoveDamageClassList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of move damage classes. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of move damage classes. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of move damage classes. | [optional] 
**Results** | Pointer to [**[]MoveDamageClass**](MoveDamageClass.md) |  | [optional] 

## Methods

### NewMoveDamageClassList200Response

`func NewMoveDamageClassList200Response() *MoveDamageClassList200Response`

NewMoveDamageClassList200Response instantiates a new MoveDamageClassList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveDamageClassList200ResponseWithDefaults

`func NewMoveDamageClassList200ResponseWithDefaults() *MoveDamageClassList200Response`

NewMoveDamageClassList200ResponseWithDefaults instantiates a new MoveDamageClassList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *MoveDamageClassList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *MoveDamageClassList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *MoveDamageClassList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *MoveDamageClassList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *MoveDamageClassList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *MoveDamageClassList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *MoveDamageClassList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *MoveDamageClassList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *MoveDamageClassList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *MoveDamageClassList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *MoveDamageClassList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *MoveDamageClassList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *MoveDamageClassList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *MoveDamageClassList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *MoveDamageClassList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *MoveDamageClassList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *MoveDamageClassList200Response) GetResults() []MoveDamageClass`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *MoveDamageClassList200Response) GetResultsOk() (*[]MoveDamageClass, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *MoveDamageClassList200Response) SetResults(v []MoveDamageClass)`

SetResults sets Results field to given value.

### HasResults

`func (o *MoveDamageClassList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


