#import <Foundation/Foundation.h>
#import "OAIApi.h"

/**
* 
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 20220523
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIEncounterMethodApi: NSObject <OAIApi>

extern NSString* kOAIEncounterMethodApiErrorDomain;
extern NSInteger kOAIEncounterMethodApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 
/// 
///
/// @param limit  (optional)
/// @param offset  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) encounterMethodListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// 
///
/// @param _id 
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) encounterMethodReadWithId: (NSNumber*) _id
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end