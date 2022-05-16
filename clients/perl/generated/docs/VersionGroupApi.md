# WWW::OpenAPIClient::VersionGroupApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::VersionGroupApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**version_group_list**](VersionGroupApi.md#version_group_list) | **GET** /api/v2/version-group/ | 
[**version_group_read**](VersionGroupApi.md#version_group_read) | **GET** /api/v2/version-group/{id}/ | 


# **version_group_list**
> string version_group_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VersionGroupApi;
my $api_instance = WWW::OpenAPIClient::VersionGroupApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->version_group_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VersionGroupApi->version_group_list: $@\n";
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

# **version_group_read**
> string version_group_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VersionGroupApi;
my $api_instance = WWW::OpenAPIClient::VersionGroupApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->version_group_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VersionGroupApi->version_group_read: $@\n";
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

