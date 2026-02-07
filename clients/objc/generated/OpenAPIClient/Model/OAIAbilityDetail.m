#import "OAIAbilityDetail.h"

@implementation OAIAbilityDetail

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"isMainSeries": @"is_main_series", @"generation": @"generation", @"names": @"names", @"effectEntries": @"effect_entries", @"effectChanges": @"effect_changes", @"flavorTextEntries": @"flavor_text_entries", @"pokemon": @"pokemon" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"isMainSeries", ];
  return [optionalProperties containsObject:propertyName];
}

@end
