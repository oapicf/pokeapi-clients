# WWW::OpenAPIClient::GenderApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::GenderApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gender_list**](GenderApi.md#gender_list) | **GET** /api/v2/gender/ | 
[**gender_read**](GenderApi.md#gender_read) | **GET** /api/v2/gender/{id}/ | 


# **gender_list**
> string gender_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::GenderApi;
my $api_instance = WWW::OpenAPIClient::GenderApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->gender_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GenderApi->gender_list: $@\n";
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

# **gender_read**
> string gender_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::GenderApi;
my $api_instance = WWW::OpenAPIClient::GenderApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->gender_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GenderApi->gender_read: $@\n";
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

