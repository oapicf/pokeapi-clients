# StatAffectingNatures

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Increase** | [**[]NatureSummary**](NatureSummary.md) | A list of natures and how they change the referenced stat. | 
**Decrease** | [**[]NatureSummary**](NatureSummary.md) | A list of nature sand how they change the referenced stat. | 

## Methods

### NewStatAffectingNatures

`func NewStatAffectingNatures(increase []NatureSummary, decrease []NatureSummary, ) *StatAffectingNatures`

NewStatAffectingNatures instantiates a new StatAffectingNatures object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStatAffectingNaturesWithDefaults

`func NewStatAffectingNaturesWithDefaults() *StatAffectingNatures`

NewStatAffectingNaturesWithDefaults instantiates a new StatAffectingNatures object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIncrease

`func (o *StatAffectingNatures) GetIncrease() []NatureSummary`

GetIncrease returns the Increase field if non-nil, zero value otherwise.

### GetIncreaseOk

`func (o *StatAffectingNatures) GetIncreaseOk() (*[]NatureSummary, bool)`

GetIncreaseOk returns a tuple with the Increase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncrease

`func (o *StatAffectingNatures) SetIncrease(v []NatureSummary)`

SetIncrease sets Increase field to given value.


### GetDecrease

`func (o *StatAffectingNatures) GetDecrease() []NatureSummary`

GetDecrease returns the Decrease field if non-nil, zero value otherwise.

### GetDecreaseOk

`func (o *StatAffectingNatures) GetDecreaseOk() (*[]NatureSummary, bool)`

GetDecreaseOk returns a tuple with the Decrease field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecrease

`func (o *StatAffectingNatures) SetDecrease(v []NatureSummary)`

SetDecrease sets Decrease field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


