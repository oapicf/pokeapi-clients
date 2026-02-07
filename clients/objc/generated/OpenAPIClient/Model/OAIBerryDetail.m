#import "OAIBerryDetail.h"

@implementation OAIBerryDetail

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"growthTime": @"growth_time", @"maxHarvest": @"max_harvest", @"naturalGiftPower": @"natural_gift_power", @"size": @"size", @"smoothness": @"smoothness", @"soilDryness": @"soil_dryness", @"firmness": @"firmness", @"flavors": @"flavors", @"item": @"item", @"naturalGiftType": @"natural_gift_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end
