# MoveCombos

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Normal** | [**MoveComboUsage**](MoveComboUsage.md) | A detail of moves this move can be used before or after, granting additional appeal points in contests. | 
**Super** | [**MoveComboUsage**](MoveComboUsage.md) | A detail of moves this move can be used before or after, granting additional appeal points in super contests. | 

## Methods

### NewMoveCombos

`func NewMoveCombos(normal MoveComboUsage, super MoveComboUsage, ) *MoveCombos`

NewMoveCombos instantiates a new MoveCombos object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveCombosWithDefaults

`func NewMoveCombosWithDefaults() *MoveCombos`

NewMoveCombosWithDefaults instantiates a new MoveCombos object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNormal

`func (o *MoveCombos) GetNormal() MoveComboUsage`

GetNormal returns the Normal field if non-nil, zero value otherwise.

### GetNormalOk

`func (o *MoveCombos) GetNormalOk() (*MoveComboUsage, bool)`

GetNormalOk returns a tuple with the Normal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormal

`func (o *MoveCombos) SetNormal(v MoveComboUsage)`

SetNormal sets Normal field to given value.


### GetSuper

`func (o *MoveCombos) GetSuper() MoveComboUsage`

GetSuper returns the Super field if non-nil, zero value otherwise.

### GetSuperOk

`func (o *MoveCombos) GetSuperOk() (*MoveComboUsage, bool)`

GetSuperOk returns a tuple with the Super field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuper

`func (o *MoveCombos) SetSuper(v MoveComboUsage)`

SetSuper sets Super field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


