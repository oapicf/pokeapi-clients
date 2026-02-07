#import "OAIPokemonSpeciesDetail.h"

@implementation OAIPokemonSpeciesDetail

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"order": @"order", @"genderRate": @"gender_rate", @"captureRate": @"capture_rate", @"baseHappiness": @"base_happiness", @"isBaby": @"is_baby", @"isLegendary": @"is_legendary", @"isMythical": @"is_mythical", @"hatchCounter": @"hatch_counter", @"hasGenderDifferences": @"has_gender_differences", @"formsSwitchable": @"forms_switchable", @"growthRate": @"growth_rate", @"pokedexNumbers": @"pokedex_numbers", @"eggGroups": @"egg_groups", @"color": @"color", @"shape": @"shape", @"evolvesFromSpecies": @"evolves_from_species", @"evolutionChain": @"evolution_chain", @"habitat": @"habitat", @"generation": @"generation", @"names": @"names", @"palParkEncounters": @"pal_park_encounters", @"formDescriptions": @"form_descriptions", @"flavorTextEntries": @"flavor_text_entries", @"genera": @"genera", @"varieties": @"varieties" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"order", @"genderRate", @"captureRate", @"baseHappiness", @"isBaby", @"isLegendary", @"isMythical", @"hatchCounter", @"hasGenderDifferences", @"formsSwitchable", ];
  return [optionalProperties containsObject:propertyName];
}

@end
