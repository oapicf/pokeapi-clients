#import "OAIPokemonEvolution.h"

@implementation OAIPokemonEvolution

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"versionGroup": @"version_group", @"isDefault": @"is_default", @"item": @"item", @"trigger": @"trigger", @"gender": @"gender", @"heldItem": @"held_item", @"knownMove": @"known_move", @"knownMoveType": @"known_move_type", @"location": @"location", @"minLevel": @"min_level", @"minHappiness": @"min_happiness", @"minBeauty": @"min_beauty", @"minAffection": @"min_affection", @"nearSpecialRock": @"near_special_rock", @"needsMultiplayer": @"needs_multiplayer", @"needsOverworldRain": @"needs_overworld_rain", @"partySpecies": @"party_species", @"partyType": @"party_type", @"relativePhysicalStats": @"relative_physical_stats", @"timeOfDay": @"time_of_day", @"tradeSpecies": @"trade_species", @"turnUpsideDown": @"turn_upside_down", @"region": @"region", @"requiredPokemonForm": @"required_pokemon_form", @"evolvedPokemonForm": @"evolved_pokemon_form", @"usedMove": @"used_move", @"minMoveCount": @"min_move_count", @"minSteps": @"min_steps", @"minDamageTaken": @"min_damage_taken", @"allowedNatures": @"allowed_natures", @"conditionExpression": @"condition_expression" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"isDefault", @"gender", @"minLevel", @"minHappiness", @"minBeauty", @"minAffection", @"nearSpecialRock", @"needsMultiplayer", @"needsOverworldRain", @"relativePhysicalStats", @"timeOfDay", @"turnUpsideDown", @"minMoveCount", @"minSteps", @"minDamageTaken", ];
  return [optionalProperties containsObject:propertyName];
}

@end
