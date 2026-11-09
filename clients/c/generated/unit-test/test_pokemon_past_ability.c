#ifndef pokemon_past_ability_TEST
#define pokemon_past_ability_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_past_ability_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_past_ability.h"
pokemon_past_ability_t* instantiate_pokemon_past_ability(int include_optional);

#include "test_generation_summary.c"


pokemon_past_ability_t* instantiate_pokemon_past_ability(int include_optional) {
  pokemon_past_ability_t* pokemon_past_ability = NULL;
  if (include_optional) {
    pokemon_past_ability = pokemon_past_ability_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_generation_summary(0)
    );
  } else {
    pokemon_past_ability = pokemon_past_ability_create(
      list_createList(),
      NULL
    );
  }

  return pokemon_past_ability;
}


#ifdef pokemon_past_ability_MAIN

void test_pokemon_past_ability(int include_optional) {
    pokemon_past_ability_t* pokemon_past_ability_1 = instantiate_pokemon_past_ability(include_optional);

	cJSON* jsonpokemon_past_ability_1 = pokemon_past_ability_convertToJSON(pokemon_past_ability_1);
	printf("pokemon_past_ability :\n%s\n", cJSON_Print(jsonpokemon_past_ability_1));
	pokemon_past_ability_t* pokemon_past_ability_2 = pokemon_past_ability_parseFromJSON(jsonpokemon_past_ability_1);
	cJSON* jsonpokemon_past_ability_2 = pokemon_past_ability_convertToJSON(pokemon_past_ability_2);
	printf("repeating pokemon_past_ability:\n%s\n", cJSON_Print(jsonpokemon_past_ability_2));
}

int main() {
  test_pokemon_past_ability(1);
  test_pokemon_past_ability(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_past_ability_MAIN
#endif // pokemon_past_ability_TEST
