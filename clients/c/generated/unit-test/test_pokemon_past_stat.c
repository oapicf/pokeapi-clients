#ifndef pokemon_past_stat_TEST
#define pokemon_past_stat_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_past_stat_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_past_stat.h"
pokemon_past_stat_t* instantiate_pokemon_past_stat(int include_optional);

#include "test_generation_summary.c"


pokemon_past_stat_t* instantiate_pokemon_past_stat(int include_optional) {
  pokemon_past_stat_t* pokemon_past_stat = NULL;
  if (include_optional) {
    pokemon_past_stat = pokemon_past_stat_create(
       // false, not to have infinite recursion
      instantiate_generation_summary(0),
      list_createList()
    );
  } else {
    pokemon_past_stat = pokemon_past_stat_create(
      NULL,
      list_createList()
    );
  }

  return pokemon_past_stat;
}


#ifdef pokemon_past_stat_MAIN

void test_pokemon_past_stat(int include_optional) {
    pokemon_past_stat_t* pokemon_past_stat_1 = instantiate_pokemon_past_stat(include_optional);

	cJSON* jsonpokemon_past_stat_1 = pokemon_past_stat_convertToJSON(pokemon_past_stat_1);
	printf("pokemon_past_stat :\n%s\n", cJSON_Print(jsonpokemon_past_stat_1));
	pokemon_past_stat_t* pokemon_past_stat_2 = pokemon_past_stat_parseFromJSON(jsonpokemon_past_stat_1);
	cJSON* jsonpokemon_past_stat_2 = pokemon_past_stat_convertToJSON(pokemon_past_stat_2);
	printf("repeating pokemon_past_stat:\n%s\n", cJSON_Print(jsonpokemon_past_stat_2));
}

int main() {
  test_pokemon_past_stat(1);
  test_pokemon_past_stat(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_past_stat_MAIN
#endif // pokemon_past_stat_TEST
