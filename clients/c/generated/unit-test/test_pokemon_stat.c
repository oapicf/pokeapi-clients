#ifndef pokemon_stat_TEST
#define pokemon_stat_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_stat_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_stat.h"
pokemon_stat_t* instantiate_pokemon_stat(int include_optional);

#include "test_stat_summary.c"


pokemon_stat_t* instantiate_pokemon_stat(int include_optional) {
  pokemon_stat_t* pokemon_stat = NULL;
  if (include_optional) {
    pokemon_stat = pokemon_stat_create(
      56,
      56,
       // false, not to have infinite recursion
      instantiate_stat_summary(0)
    );
  } else {
    pokemon_stat = pokemon_stat_create(
      56,
      56,
      NULL
    );
  }

  return pokemon_stat;
}


#ifdef pokemon_stat_MAIN

void test_pokemon_stat(int include_optional) {
    pokemon_stat_t* pokemon_stat_1 = instantiate_pokemon_stat(include_optional);

	cJSON* jsonpokemon_stat_1 = pokemon_stat_convertToJSON(pokemon_stat_1);
	printf("pokemon_stat :\n%s\n", cJSON_Print(jsonpokemon_stat_1));
	pokemon_stat_t* pokemon_stat_2 = pokemon_stat_parseFromJSON(jsonpokemon_stat_1);
	cJSON* jsonpokemon_stat_2 = pokemon_stat_convertToJSON(pokemon_stat_2);
	printf("repeating pokemon_stat:\n%s\n", cJSON_Print(jsonpokemon_stat_2));
}

int main() {
  test_pokemon_stat(1);
  test_pokemon_stat(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_stat_MAIN
#endif // pokemon_stat_TEST
