#ifndef pokemon_game_index_TEST
#define pokemon_game_index_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_game_index_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_game_index.h"
pokemon_game_index_t* instantiate_pokemon_game_index(int include_optional);

#include "test_version_summary.c"


pokemon_game_index_t* instantiate_pokemon_game_index(int include_optional) {
  pokemon_game_index_t* pokemon_game_index = NULL;
  if (include_optional) {
    pokemon_game_index = pokemon_game_index_create(
      56,
       // false, not to have infinite recursion
      instantiate_version_summary(0)
    );
  } else {
    pokemon_game_index = pokemon_game_index_create(
      56,
      NULL
    );
  }

  return pokemon_game_index;
}


#ifdef pokemon_game_index_MAIN

void test_pokemon_game_index(int include_optional) {
    pokemon_game_index_t* pokemon_game_index_1 = instantiate_pokemon_game_index(include_optional);

	cJSON* jsonpokemon_game_index_1 = pokemon_game_index_convertToJSON(pokemon_game_index_1);
	printf("pokemon_game_index :\n%s\n", cJSON_Print(jsonpokemon_game_index_1));
	pokemon_game_index_t* pokemon_game_index_2 = pokemon_game_index_parseFromJSON(jsonpokemon_game_index_1);
	cJSON* jsonpokemon_game_index_2 = pokemon_game_index_convertToJSON(pokemon_game_index_2);
	printf("repeating pokemon_game_index:\n%s\n", cJSON_Print(jsonpokemon_game_index_2));
}

int main() {
  test_pokemon_game_index(1);
  test_pokemon_game_index(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_game_index_MAIN
#endif // pokemon_game_index_TEST
