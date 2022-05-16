# WWW::OpenAPIClient::PalParkAreaApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PalParkAreaApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pal_park_area_list**](PalParkAreaApi.md#pal_park_area_list) | **GET** /api/v2/pal-park-area/ | 
[**pal_park_area_read**](PalParkAreaApi.md#pal_park_area_read) | **GET** /api/v2/pal-park-area/{id}/ | 


# **pal_park_area_list**
> string pal_park_area_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PalParkAreaApi;
my $api_instance = WWW::OpenAPIClient::PalParkAreaApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->pal_park_area_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PalParkAreaApi->pal_park_area_list: $@\n";
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

# **pal_park_area_read**
> string pal_park_area_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PalParkAreaApi;
my $api_instance = WWW::OpenAPIClient::PalParkAreaApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->pal_park_area_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PalParkAreaApi->pal_park_area_read: $@\n";
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

