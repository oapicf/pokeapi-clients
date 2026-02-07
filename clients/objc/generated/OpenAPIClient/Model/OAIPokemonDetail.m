#import "OAIPokemonDetail.h"

@implementation OAIPokemonDetail

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"baseExperience": @"base_experience", @"height": @"height", @"isDefault": @"is_default", @"order": @"order", @"weight": @"weight", @"abilities": @"abilities", @"pastAbilities": @"past_abilities", @"forms": @"forms", @"gameIndices": @"game_indices", @"heldItems": @"held_items", @"locationAreaEncounters": @"location_area_encounters", @"moves": @"moves", @"species": @"species", @"sprites": @"sprites", @"cries": @"cries", @"stats": @"stats", @"types": @"types", @"pastTypes": @"past_types" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"baseExperience", @"height", @"isDefault", @"order", @"weight", ];
  return [optionalProperties containsObject:propertyName];
}

@end
