# WWW::OpenAPIClient::ContestTypeApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ContestTypeApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contest_type_list**](ContestTypeApi.md#contest_type_list) | **GET** /api/v2/contest-type/ | 
[**contest_type_read**](ContestTypeApi.md#contest_type_read) | **GET** /api/v2/contest-type/{id}/ | 


# **contest_type_list**
> string contest_type_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestTypeApi;
my $api_instance = WWW::OpenAPIClient::ContestTypeApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->contest_type_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestTypeApi->contest_type_list: $@\n";
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

# **contest_type_read**
> string contest_type_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ContestTypeApi;
my $api_instance = WWW::OpenAPIClient::ContestTypeApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->contest_type_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ContestTypeApi->contest_type_read: $@\n";
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

