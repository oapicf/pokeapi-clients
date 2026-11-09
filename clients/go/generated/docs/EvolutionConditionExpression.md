# EvolutionConditionExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Expression** | **string** | Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;) | 
**PercentageChance** | **NullableFloat64** | Percentage chance of evolution under this condition (0-100) | 
**Variables** | [**[]EvolutionVariableSummary**](EvolutionVariableSummary.md) | Evolution variables referenced in the expression | 

## Methods

### NewEvolutionConditionExpression

`func NewEvolutionConditionExpression(expression string, percentageChance NullableFloat64, variables []EvolutionVariableSummary, ) *EvolutionConditionExpression`

NewEvolutionConditionExpression instantiates a new EvolutionConditionExpression object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionConditionExpressionWithDefaults

`func NewEvolutionConditionExpressionWithDefaults() *EvolutionConditionExpression`

NewEvolutionConditionExpressionWithDefaults instantiates a new EvolutionConditionExpression object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExpression

`func (o *EvolutionConditionExpression) GetExpression() string`

GetExpression returns the Expression field if non-nil, zero value otherwise.

### GetExpressionOk

`func (o *EvolutionConditionExpression) GetExpressionOk() (*string, bool)`

GetExpressionOk returns a tuple with the Expression field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpression

`func (o *EvolutionConditionExpression) SetExpression(v string)`

SetExpression sets Expression field to given value.


### GetPercentageChance

`func (o *EvolutionConditionExpression) GetPercentageChance() float64`

GetPercentageChance returns the PercentageChance field if non-nil, zero value otherwise.

### GetPercentageChanceOk

`func (o *EvolutionConditionExpression) GetPercentageChanceOk() (*float64, bool)`

GetPercentageChanceOk returns a tuple with the PercentageChance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercentageChance

`func (o *EvolutionConditionExpression) SetPercentageChance(v float64)`

SetPercentageChance sets PercentageChance field to given value.


### SetPercentageChanceNil

`func (o *EvolutionConditionExpression) SetPercentageChanceNil(b bool)`

 SetPercentageChanceNil sets the value for PercentageChance to be an explicit nil

### UnsetPercentageChance
`func (o *EvolutionConditionExpression) UnsetPercentageChance()`

UnsetPercentageChance ensures that no value is present for PercentageChance, not even an explicit nil
### GetVariables

`func (o *EvolutionConditionExpression) GetVariables() []EvolutionVariableSummary`

GetVariables returns the Variables field if non-nil, zero value otherwise.

### GetVariablesOk

`func (o *EvolutionConditionExpression) GetVariablesOk() (*[]EvolutionVariableSummary, bool)`

GetVariablesOk returns a tuple with the Variables field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVariables

`func (o *EvolutionConditionExpression) SetVariables(v []EvolutionVariableSummary)`

SetVariables sets Variables field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


