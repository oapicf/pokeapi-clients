# WWW::OpenAPIClient::VersionApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::VersionApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**version_list**](VersionApi.md#version_list) | **GET** /api/v2/version/ | 
[**version_read**](VersionApi.md#version_read) | **GET** /api/v2/version/{id}/ | 


# **version_list**
> string version_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VersionApi;
my $api_instance = WWW::OpenAPIClient::VersionApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->version_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VersionApi->version_list: $@\n";
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

# **version_read**
> string version_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VersionApi;
my $api_instance = WWW::OpenAPIClient::VersionApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->version_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VersionApi->version_read: $@\n";
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

