# WWW::OpenAPIClient::EncounterConditionValueApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::EncounterConditionValueApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounter_condition_value_list**](EncounterConditionValueApi.md#encounter_condition_value_list) | **GET** /api/v2/encounter-condition-value/ | 
[**encounter_condition_value_read**](EncounterConditionValueApi.md#encounter_condition_value_read) | **GET** /api/v2/encounter-condition-value/{id}/ | 


# **encounter_condition_value_list**
> string encounter_condition_value_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EncounterConditionValueApi;
my $api_instance = WWW::OpenAPIClient::EncounterConditionValueApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->encounter_condition_value_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EncounterConditionValueApi->encounter_condition_value_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] 
 **offset** | **int**|  | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounter_condition_value_read**
> string encounter_condition_value_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EncounterConditionValueApi;
my $api_instance = WWW::OpenAPIClient::EncounterConditionValueApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->encounter_condition_value_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EncounterConditionValueApi->encounter_condition_value_read: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

