#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ability_detail.h"
#include "../model/characteristic_detail.h"
#include "../model/egg_group_detail.h"
#include "../model/gender_detail.h"
#include "../model/growth_rate_detail.h"
#include "../model/move_damage_class_detail.h"
#include "../model/nature_detail.h"
#include "../model/paginated_ability_summary_list.h"
#include "../model/paginated_characteristic_summary_list.h"
#include "../model/paginated_egg_group_summary_list.h"
#include "../model/paginated_gender_summary_list.h"
#include "../model/paginated_growth_rate_summary_list.h"
#include "../model/paginated_move_damage_class_summary_list.h"
#include "../model/paginated_nature_summary_list.h"
#include "../model/paginated_pokeathlon_stat_summary_list.h"
#include "../model/paginated_pokemon_color_summary_list.h"
#include "../model/paginated_pokemon_form_summary_list.h"
#include "../model/paginated_pokemon_habitat_summary_list.h"
#include "../model/paginated_pokemon_shape_summary_list.h"
#include "../model/paginated_pokemon_species_summary_list.h"
#include "../model/paginated_pokemon_summary_list.h"
#include "../model/paginated_stat_summary_list.h"
#include "../model/paginated_type_summary_list.h"
#include "../model/pokeathlon_stat_detail.h"
#include "../model/pokemon_color_detail.h"
#include "../model/pokemon_detail.h"
#include "../model/pokemon_form_detail.h"
#include "../model/pokemon_habitat_detail.h"
#include "../model/pokemon_shape_detail.h"
#include "../model/pokemon_species_detail.h"
#include "../model/stat_detail.h"
#include "../model/type_detail.h"


// Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
//
paginated_ability_summary_list_t*
PokemonAPI_abilityList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
//
ability_detail_t*
PokemonAPI_abilityRetrieve(apiClient_t *apiClient, char *id);


// List charecterictics
//
// Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
//
paginated_characteristic_summary_list_t*
PokemonAPI_characteristicList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get characteristic
//
// Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
//
characteristic_detail_t*
PokemonAPI_characteristicRetrieve(apiClient_t *apiClient, char *id);


// List egg groups
//
// Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
//
paginated_egg_group_summary_list_t*
PokemonAPI_eggGroupList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get egg group
//
// Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
//
egg_group_detail_t*
PokemonAPI_eggGroupRetrieve(apiClient_t *apiClient, char *id);


// List genders
//
// Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
//
paginated_gender_summary_list_t*
PokemonAPI_genderList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get gender
//
// Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
//
gender_detail_t*
PokemonAPI_genderRetrieve(apiClient_t *apiClient, char *id);


// List growth rates
//
// Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
//
paginated_growth_rate_summary_list_t*
PokemonAPI_growthRateList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get growth rate
//
// Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
//
growth_rate_detail_t*
PokemonAPI_growthRateRetrieve(apiClient_t *apiClient, char *id);


// List move damage classes
//
// Damage classes moves can have, e.g. physical, special, or non-damaging.
//
paginated_move_damage_class_summary_list_t*
PokemonAPI_moveDamageClassList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get move damage class
//
// Damage classes moves can have, e.g. physical, special, or non-damaging.
//
move_damage_class_detail_t*
PokemonAPI_moveDamageClassRetrieve(apiClient_t *apiClient, char *id);


// List natures
//
// Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
//
paginated_nature_summary_list_t*
PokemonAPI_natureList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get nature
//
// Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
//
nature_detail_t*
PokemonAPI_natureRetrieve(apiClient_t *apiClient, char *id);


// List pokeathlon stats
//
// Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
//
paginated_pokeathlon_stat_summary_list_t*
PokemonAPI_pokeathlonStatList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get pokeathlon stat
//
// Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
//
pokeathlon_stat_detail_t*
PokemonAPI_pokeathlonStatRetrieve(apiClient_t *apiClient, char *id);


// List pokemon colors
//
// Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
//
paginated_pokemon_color_summary_list_t*
PokemonAPI_pokemonColorList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get pokemon color
//
// Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
//
pokemon_color_detail_t*
PokemonAPI_pokemonColorRetrieve(apiClient_t *apiClient, char *id);


// List pokemon forms
//
// Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
//
paginated_pokemon_form_summary_list_t*
PokemonAPI_pokemonFormList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get pokemon form
//
// Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
//
pokemon_form_detail_t*
PokemonAPI_pokemonFormRetrieve(apiClient_t *apiClient, char *id);


// List pokemom habitas
//
// Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
//
paginated_pokemon_habitat_summary_list_t*
PokemonAPI_pokemonHabitatList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get pokemom habita
//
// Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
//
pokemon_habitat_detail_t*
PokemonAPI_pokemonHabitatRetrieve(apiClient_t *apiClient, char *id);


// List pokemon
//
// Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
//
paginated_pokemon_summary_list_t*
PokemonAPI_pokemonList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get pokemon
//
// Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
//
pokemon_detail_t*
PokemonAPI_pokemonRetrieve(apiClient_t *apiClient, char *id);


// List pokemon shapes
//
// Shapes used for sorting Pokémon in a Pokédex.
//
paginated_pokemon_shape_summary_list_t*
PokemonAPI_pokemonShapeList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get pokemon shape
//
// Shapes used for sorting Pokémon in a Pokédex.
//
pokemon_shape_detail_t*
PokemonAPI_pokemonShapeRetrieve(apiClient_t *apiClient, char *id);


// List pokemon species
//
// A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
//
paginated_pokemon_species_summary_list_t*
PokemonAPI_pokemonSpeciesList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get pokemon species
//
// A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
//
pokemon_species_detail_t*
PokemonAPI_pokemonSpeciesRetrieve(apiClient_t *apiClient, char *id);


// List stats
//
// Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
//
paginated_stat_summary_list_t*
PokemonAPI_statList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get stat
//
// Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
//
stat_detail_t*
PokemonAPI_statRetrieve(apiClient_t *apiClient, char *id);


// List types
//
// Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
//
paginated_type_summary_list_t*
PokemonAPI_typeList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get types
//
// Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
//
type_detail_t*
PokemonAPI_typeRetrieve(apiClient_t *apiClient, char *id);


