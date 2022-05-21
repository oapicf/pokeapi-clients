# WWW::OpenAPIClient::EncounterConditionApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::EncounterConditionApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounter_condition_list**](EncounterConditionApi.md#encounter_condition_list) | **GET** /api/v2/encounter-condition/ | 
[**encounter_condition_read**](EncounterConditionApi.md#encounter_condition_read) | **GET** /api/v2/encounter-condition/{id}/ | 


# **encounter_condition_list**
> string encounter_condition_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EncounterConditionApi;
my $api_instance = WWW::OpenAPIClient::EncounterConditionApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->encounter_condition_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EncounterConditionApi->encounter_condition_list: $@\n";
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

# **encounter_condition_read**
> string encounter_condition_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EncounterConditionApi;
my $api_instance = WWW::OpenAPIClient::EncounterConditionApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->encounter_condition_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EncounterConditionApi->encounter_condition_read: $@\n";
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

