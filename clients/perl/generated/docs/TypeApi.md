# WWW::OpenAPIClient::TypeApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::TypeApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**type_list**](TypeApi.md#type_list) | **GET** /api/v2/type/ | 
[**type_read**](TypeApi.md#type_read) | **GET** /api/v2/type/{id}/ | 


# **type_list**
> string type_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TypeApi;
my $api_instance = WWW::OpenAPIClient::TypeApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->type_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TypeApi->type_list: $@\n";
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

# **type_read**
> string type_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TypeApi;
my $api_instance = WWW::OpenAPIClient::TypeApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->type_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TypeApi->type_read: $@\n";
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

