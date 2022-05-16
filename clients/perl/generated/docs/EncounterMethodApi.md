# WWW::OpenAPIClient::EncounterMethodApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::EncounterMethodApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounter_method_list**](EncounterMethodApi.md#encounter_method_list) | **GET** /api/v2/encounter-method/ | 
[**encounter_method_read**](EncounterMethodApi.md#encounter_method_read) | **GET** /api/v2/encounter-method/{id}/ | 


# **encounter_method_list**
> string encounter_method_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EncounterMethodApi;
my $api_instance = WWW::OpenAPIClient::EncounterMethodApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->encounter_method_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EncounterMethodApi->encounter_method_list: $@\n";
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

# **encounter_method_read**
> string encounter_method_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EncounterMethodApi;
my $api_instance = WWW::OpenAPIClient::EncounterMethodApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->encounter_method_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EncounterMethodApi->encounter_method_read: $@\n";
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

