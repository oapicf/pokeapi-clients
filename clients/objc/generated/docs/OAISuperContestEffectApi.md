# OAISuperContestEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**superContestEffectList**](OAISuperContestEffectApi.md#supercontesteffectlist) | **GET** /api/v2/super-contest-effect/ | 
[**superContestEffectRead**](OAISuperContestEffectApi.md#supercontesteffectread) | **GET** /api/v2/super-contest-effect/{id}/ | 


# **superContestEffectList**
```objc
-(NSURLSessionTask*) superContestEffectListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* limit = @56; //  (optional)
NSNumber* offset = @56; //  (optional)

OAISuperContestEffectApi*apiInstance = [[OAISuperContestEffectApi alloc] init];

[apiInstance superContestEffectListWithLimit:limit
              offset:offset
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISuperContestEffectApi->superContestEffectList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***|  | [optional] 
 **offset** | **NSNumber***|  | [optional] 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **superContestEffectRead**
```objc
-(NSURLSessionTask*) superContestEffectReadWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* _id = @56; // 

OAISuperContestEffectApi*apiInstance = [[OAISuperContestEffectApi alloc] init];

[apiInstance superContestEffectReadWithId:_id
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISuperContestEffectApi->superContestEffectRead: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***|  | 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

