# WWW::OpenAPIClient::EggGroupApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::EggGroupApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**egg_group_list**](EggGroupApi.md#egg_group_list) | **GET** /api/v2/egg-group/ | 
[**egg_group_read**](EggGroupApi.md#egg_group_read) | **GET** /api/v2/egg-group/{id}/ | 


# **egg_group_list**
> string egg_group_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EggGroupApi;
my $api_instance = WWW::OpenAPIClient::EggGroupApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->egg_group_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EggGroupApi->egg_group_list: $@\n";
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

# **egg_group_read**
> string egg_group_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EggGroupApi;
my $api_instance = WWW::OpenAPIClient::EggGroupApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->egg_group_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EggGroupApi->egg_group_read: $@\n";
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

