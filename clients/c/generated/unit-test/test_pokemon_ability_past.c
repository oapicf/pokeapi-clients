#ifndef pokemon_ability_past_TEST
#define pokemon_ability_past_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_ability_past_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_ability_past.h"
pokemon_ability_past_t* instantiate_pokemon_ability_past(int include_optional);

#include "test_ability_summary.c"


pokemon_ability_past_t* instantiate_pokemon_ability_past(int include_optional) {
  pokemon_ability_past_t* pokemon_ability_past = NULL;
  if (include_optional) {
    pokemon_ability_past = pokemon_ability_past_create(
      1,
      -2147483648,
       // false, not to have infinite recursion
      instantiate_ability_summary(0)
    );
  } else {
    pokemon_ability_past = pokemon_ability_past_create(
      1,
      -2147483648,
      NULL
    );
  }

  return pokemon_ability_past;
}


#ifdef pokemon_ability_past_MAIN

void test_pokemon_ability_past(int include_optional) {
    pokemon_ability_past_t* pokemon_ability_past_1 = instantiate_pokemon_ability_past(include_optional);

	cJSON* jsonpokemon_ability_past_1 = pokemon_ability_past_convertToJSON(pokemon_ability_past_1);
	printf("pokemon_ability_past :\n%s\n", cJSON_Print(jsonpokemon_ability_past_1));
	pokemon_ability_past_t* pokemon_ability_past_2 = pokemon_ability_past_parseFromJSON(jsonpokemon_ability_past_1);
	cJSON* jsonpokemon_ability_past_2 = pokemon_ability_past_convertToJSON(pokemon_ability_past_2);
	printf("repeating pokemon_ability_past:\n%s\n", cJSON_Print(jsonpokemon_ability_past_2));
}

int main() {
  test_pokemon_ability_past(1);
  test_pokemon_ability_past(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_ability_past_MAIN
#endif // pokemon_ability_past_TEST
