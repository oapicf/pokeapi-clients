# TypePastRelationships

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced type had the listed damage relations | 
**DamageRelations** | [**TypeRelationships**](TypeRelationships.md) | The damage relations the referenced type had up to and including the listed generation | 

## Methods

### NewTypePastRelationships

`func NewTypePastRelationships(generation GenerationSummary, damageRelations TypeRelationships, ) *TypePastRelationships`

NewTypePastRelationships instantiates a new TypePastRelationships object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTypePastRelationshipsWithDefaults

`func NewTypePastRelationshipsWithDefaults() *TypePastRelationships`

NewTypePastRelationshipsWithDefaults instantiates a new TypePastRelationships object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGeneration

`func (o *TypePastRelationships) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *TypePastRelationships) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *TypePastRelationships) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.


### GetDamageRelations

`func (o *TypePastRelationships) GetDamageRelations() TypeRelationships`

GetDamageRelations returns the DamageRelations field if non-nil, zero value otherwise.

### GetDamageRelationsOk

`func (o *TypePastRelationships) GetDamageRelationsOk() (*TypeRelationships, bool)`

GetDamageRelationsOk returns a tuple with the DamageRelations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDamageRelations

`func (o *TypePastRelationships) SetDamageRelations(v TypeRelationships)`

SetDamageRelations sets DamageRelations field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


