#ifndef pokemon_move_TEST
#define pokemon_move_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_move_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_move.h"
pokemon_move_t* instantiate_pokemon_move(int include_optional);

#include "test_move_summary.c"


pokemon_move_t* instantiate_pokemon_move(int include_optional) {
  pokemon_move_t* pokemon_move = NULL;
  if (include_optional) {
    pokemon_move = pokemon_move_create(
       // false, not to have infinite recursion
      instantiate_move_summary(0),
      list_createList()
    );
  } else {
    pokemon_move = pokemon_move_create(
      NULL,
      list_createList()
    );
  }

  return pokemon_move;
}


#ifdef pokemon_move_MAIN

void test_pokemon_move(int include_optional) {
    pokemon_move_t* pokemon_move_1 = instantiate_pokemon_move(include_optional);

	cJSON* jsonpokemon_move_1 = pokemon_move_convertToJSON(pokemon_move_1);
	printf("pokemon_move :\n%s\n", cJSON_Print(jsonpokemon_move_1));
	pokemon_move_t* pokemon_move_2 = pokemon_move_parseFromJSON(jsonpokemon_move_1);
	cJSON* jsonpokemon_move_2 = pokemon_move_convertToJSON(pokemon_move_2);
	printf("repeating pokemon_move:\n%s\n", cJSON_Print(jsonpokemon_move_2));
}

int main() {
  test_pokemon_move(1);
  test_pokemon_move(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_move_MAIN
#endif // pokemon_move_TEST
