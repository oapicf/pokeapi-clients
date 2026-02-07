#import "OAIPokemonFormDetail.h"

@implementation OAIPokemonFormDetail

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"order": @"order", @"formOrder": @"form_order", @"isDefault": @"is_default", @"isBattleOnly": @"is_battle_only", @"isMega": @"is_mega", @"formName": @"form_name", @"pokemon": @"pokemon", @"sprites": @"sprites", @"versionGroup": @"version_group", @"formNames": @"form_names", @"names": @"names", @"types": @"types" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"order", @"formOrder", @"isDefault", @"isBattleOnly", @"isMega", ];
  return [optionalProperties containsObject:propertyName];
}

@end
