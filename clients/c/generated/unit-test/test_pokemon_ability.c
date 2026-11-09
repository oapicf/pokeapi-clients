#ifndef pokemon_ability_TEST
#define pokemon_ability_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_ability_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_ability.h"
pokemon_ability_t* instantiate_pokemon_ability(int include_optional);

#include "test_ability_summary.c"


pokemon_ability_t* instantiate_pokemon_ability(int include_optional) {
  pokemon_ability_t* pokemon_ability = NULL;
  if (include_optional) {
    pokemon_ability = pokemon_ability_create(
      1,
      -2147483648,
       // false, not to have infinite recursion
      instantiate_ability_summary(0)
    );
  } else {
    pokemon_ability = pokemon_ability_create(
      1,
      -2147483648,
      NULL
    );
  }

  return pokemon_ability;
}


#ifdef pokemon_ability_MAIN

void test_pokemon_ability(int include_optional) {
    pokemon_ability_t* pokemon_ability_1 = instantiate_pokemon_ability(include_optional);

	cJSON* jsonpokemon_ability_1 = pokemon_ability_convertToJSON(pokemon_ability_1);
	printf("pokemon_ability :\n%s\n", cJSON_Print(jsonpokemon_ability_1));
	pokemon_ability_t* pokemon_ability_2 = pokemon_ability_parseFromJSON(jsonpokemon_ability_1);
	cJSON* jsonpokemon_ability_2 = pokemon_ability_convertToJSON(pokemon_ability_2);
	printf("repeating pokemon_ability:\n%s\n", cJSON_Print(jsonpokemon_ability_2));
}

int main() {
  test_pokemon_ability(1);
  test_pokemon_ability(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_ability_MAIN
#endif // pokemon_ability_TEST
