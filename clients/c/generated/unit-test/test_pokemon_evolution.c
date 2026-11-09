#ifndef pokemon_evolution_TEST
#define pokemon_evolution_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_evolution_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_evolution.h"
pokemon_evolution_t* instantiate_pokemon_evolution(int include_optional);

#include "test_version_group_summary.c"
#include "test_item_summary.c"
#include "test_evolution_trigger_summary.c"
#include "test_item_summary.c"
#include "test_pokemon_evolution_known_move.c"
#include "test_pokemon_evolution_known_move.c"
#include "test_location_summary.c"
#include "test_pokemon_species_summary.c"
#include "test_type_summary.c"
#include "test_pokemon_species_summary.c"
#include "test_region_summary.c"
#include "test_pokemon_form_summary.c"
#include "test_pokemon_form_summary.c"
#include "test_move_summary.c"
#include "test_evolution_condition_expression.c"


pokemon_evolution_t* instantiate_pokemon_evolution(int include_optional) {
  pokemon_evolution_t* pokemon_evolution = NULL;
  if (include_optional) {
    pokemon_evolution = pokemon_evolution_create(
       // false, not to have infinite recursion
      instantiate_version_group_summary(0),
      1,
       // false, not to have infinite recursion
      instantiate_item_summary(0),
       // false, not to have infinite recursion
      instantiate_evolution_trigger_summary(0),
      56,
       // false, not to have infinite recursion
      instantiate_item_summary(0),
       // false, not to have infinite recursion
      instantiate_pokemon_evolution_known_move(0),
       // false, not to have infinite recursion
      instantiate_pokemon_evolution_known_move(0),
       // false, not to have infinite recursion
      instantiate_location_summary(0),
      -2147483648,
      -2147483648,
      -2147483648,
      -2147483648,
      1,
      1,
      1,
       // false, not to have infinite recursion
      instantiate_pokemon_species_summary(0),
       // false, not to have infinite recursion
      instantiate_type_summary(0),
      -2147483648,
      "0",
       // false, not to have infinite recursion
      instantiate_pokemon_species_summary(0),
      1,
       // false, not to have infinite recursion
      instantiate_region_summary(0),
       // false, not to have infinite recursion
      instantiate_pokemon_form_summary(0),
       // false, not to have infinite recursion
      instantiate_pokemon_form_summary(0),
       // false, not to have infinite recursion
      instantiate_move_summary(0),
      -2147483648,
      -2147483648,
      -2147483648,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_evolution_condition_expression(0)
    );
  } else {
    pokemon_evolution = pokemon_evolution_create(
      NULL,
      1,
      NULL,
      NULL,
      56,
      NULL,
      NULL,
      NULL,
      NULL,
      -2147483648,
      -2147483648,
      -2147483648,
      -2147483648,
      1,
      1,
      1,
      NULL,
      NULL,
      -2147483648,
      "0",
      NULL,
      1,
      NULL,
      NULL,
      NULL,
      NULL,
      -2147483648,
      -2147483648,
      -2147483648,
      list_createList(),
      NULL
    );
  }

  return pokemon_evolution;
}


#ifdef pokemon_evolution_MAIN

void test_pokemon_evolution(int include_optional) {
    pokemon_evolution_t* pokemon_evolution_1 = instantiate_pokemon_evolution(include_optional);

	cJSON* jsonpokemon_evolution_1 = pokemon_evolution_convertToJSON(pokemon_evolution_1);
	printf("pokemon_evolution :\n%s\n", cJSON_Print(jsonpokemon_evolution_1));
	pokemon_evolution_t* pokemon_evolution_2 = pokemon_evolution_parseFromJSON(jsonpokemon_evolution_1);
	cJSON* jsonpokemon_evolution_2 = pokemon_evolution_convertToJSON(pokemon_evolution_2);
	printf("repeating pokemon_evolution:\n%s\n", cJSON_Print(jsonpokemon_evolution_2));
}

int main() {
  test_pokemon_evolution(1);
  test_pokemon_evolution(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_evolution_MAIN
#endif // pokemon_evolution_TEST
