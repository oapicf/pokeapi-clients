# WWW::OpenAPIClient::BerryFlavorApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BerryFlavorApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berry_flavor_list**](BerryFlavorApi.md#berry_flavor_list) | **GET** /api/v2/berry-flavor/ | 
[**berry_flavor_read**](BerryFlavorApi.md#berry_flavor_read) | **GET** /api/v2/berry-flavor/{id}/ | 


# **berry_flavor_list**
> string berry_flavor_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BerryFlavorApi;
my $api_instance = WWW::OpenAPIClient::BerryFlavorApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->berry_flavor_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BerryFlavorApi->berry_flavor_list: $@\n";
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

# **berry_flavor_read**
> string berry_flavor_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BerryFlavorApi;
my $api_instance = WWW::OpenAPIClient::BerryFlavorApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->berry_flavor_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BerryFlavorApi->berry_flavor_read: $@\n";
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

