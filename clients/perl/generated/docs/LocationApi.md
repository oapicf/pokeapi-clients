# WWW::OpenAPIClient::LocationApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LocationApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**location_list**](LocationApi.md#location_list) | **GET** /api/v2/location/ | 
[**location_read**](LocationApi.md#location_read) | **GET** /api/v2/location/{id}/ | 


# **location_list**
> string location_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->location_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->location_list: $@\n";
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

# **location_read**
> string location_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LocationApi;
my $api_instance = WWW::OpenAPIClient::LocationApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->location_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LocationApi->location_read: $@\n";
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

