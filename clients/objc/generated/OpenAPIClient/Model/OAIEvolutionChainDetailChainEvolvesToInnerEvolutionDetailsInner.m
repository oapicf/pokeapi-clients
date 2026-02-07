#import "OAIEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.h"

@implementation OAIEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"gender": @"gender", @"heldItem": @"held_item", @"item": @"item", @"knownMove": @"known_move", @"knownMoveType": @"known_move_type", @"location": @"location", @"minAffection": @"min_affection", @"minBeauty": @"min_beauty", @"minHappiness": @"min_happiness", @"minLevel": @"min_level", @"needsOverworldRain": @"needs_overworld_rain", @"partySpecies": @"party_species", @"partyType": @"party_type", @"relativePhysicalStats": @"relative_physical_stats", @"timeOfDay": @"time_of_day", @"tradeSpecies": @"trade_species", @"trigger": @"trigger", @"turnUpsideDown": @"turn_upside_down" }];
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
