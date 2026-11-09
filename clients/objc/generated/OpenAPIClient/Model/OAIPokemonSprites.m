#import "OAIPokemonSprites.h"

@implementation OAIPokemonSprites

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"frontDefault": @"front_default", @"frontShiny": @"front_shiny", @"frontFemale": @"front_female", @"frontShinyFemale": @"front_shiny_female", @"backDefault": @"back_default", @"backShiny": @"back_shiny", @"backFemale": @"back_female", @"backShinyFemale": @"back_shiny_female", @"other": @"other", @"versions": @"versions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"other", @"versions"];
  return [optionalProperties containsObject:propertyName];
}

@end
