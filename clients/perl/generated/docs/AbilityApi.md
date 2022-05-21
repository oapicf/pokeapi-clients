# WWW::OpenAPIClient::AbilityApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AbilityApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ability_list**](AbilityApi.md#ability_list) | **GET** /api/v2/ability/ | 
[**ability_read**](AbilityApi.md#ability_read) | **GET** /api/v2/ability/{id}/ | 


# **ability_list**
> string ability_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AbilityApi;
my $api_instance = WWW::OpenAPIClient::AbilityApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->ability_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AbilityApi->ability_list: $@\n";
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

# **ability_read**
> string ability_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AbilityApi;
my $api_instance = WWW::OpenAPIClient::AbilityApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->ability_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AbilityApi->ability_read: $@\n";
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

