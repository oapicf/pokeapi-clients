#import "OAIMoveChange.h"

@implementation OAIMoveChange

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"accuracy": @"accuracy", @"power": @"power", @"pp": @"pp", @"effectChance": @"effect_chance", @"effectEntries": @"effect_entries", @"type": @"type", @"versionGroup": @"version_group" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"accuracy", @"power", @"pp", ];
  return [optionalProperties containsObject:propertyName];
}

@end
