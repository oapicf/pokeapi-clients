# WWW::OpenAPIClient::BerryFirmnessApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BerryFirmnessApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berry_firmness_list**](BerryFirmnessApi.md#berry_firmness_list) | **GET** /api/v2/berry-firmness/ | 
[**berry_firmness_read**](BerryFirmnessApi.md#berry_firmness_read) | **GET** /api/v2/berry-firmness/{id}/ | 


# **berry_firmness_list**
> string berry_firmness_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BerryFirmnessApi;
my $api_instance = WWW::OpenAPIClient::BerryFirmnessApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->berry_firmness_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BerryFirmnessApi->berry_firmness_list: $@\n";
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

# **berry_firmness_read**
> string berry_firmness_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BerryFirmnessApi;
my $api_instance = WWW::OpenAPIClient::BerryFirmnessApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->berry_firmness_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BerryFirmnessApi->berry_firmness_read: $@\n";
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

