# WWW::OpenAPIClient::GrowthRateApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::GrowthRateApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**growth_rate_list**](GrowthRateApi.md#growth_rate_list) | **GET** /api/v2/growth-rate/ | 
[**growth_rate_read**](GrowthRateApi.md#growth_rate_read) | **GET** /api/v2/growth-rate/{id}/ | 


# **growth_rate_list**
> string growth_rate_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::GrowthRateApi;
my $api_instance = WWW::OpenAPIClient::GrowthRateApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->growth_rate_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GrowthRateApi->growth_rate_list: $@\n";
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

# **growth_rate_read**
> string growth_rate_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::GrowthRateApi;
my $api_instance = WWW::OpenAPIClient::GrowthRateApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->growth_rate_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GrowthRateApi->growth_rate_read: $@\n";
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

