#ifndef pokemon_evolution_known_move_TEST
#define pokemon_evolution_known_move_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_evolution_known_move_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_evolution_known_move.h"
pokemon_evolution_known_move_t* instantiate_pokemon_evolution_known_move(int include_optional);



pokemon_evolution_known_move_t* instantiate_pokemon_evolution_known_move(int include_optional) {
  pokemon_evolution_known_move_t* pokemon_evolution_known_move = NULL;
  if (include_optional) {
    pokemon_evolution_known_move = pokemon_evolution_known_move_create(
      "0",
      "0"
    );
  } else {
    pokemon_evolution_known_move = pokemon_evolution_known_move_create(
      "0",
      "0"
    );
  }

  return pokemon_evolution_known_move;
}


#ifdef pokemon_evolution_known_move_MAIN

void test_pokemon_evolution_known_move(int include_optional) {
    pokemon_evolution_known_move_t* pokemon_evolution_known_move_1 = instantiate_pokemon_evolution_known_move(include_optional);

	cJSON* jsonpokemon_evolution_known_move_1 = pokemon_evolution_known_move_convertToJSON(pokemon_evolution_known_move_1);
	printf("pokemon_evolution_known_move :\n%s\n", cJSON_Print(jsonpokemon_evolution_known_move_1));
	pokemon_evolution_known_move_t* pokemon_evolution_known_move_2 = pokemon_evolution_known_move_parseFromJSON(jsonpokemon_evolution_known_move_1);
	cJSON* jsonpokemon_evolution_known_move_2 = pokemon_evolution_known_move_convertToJSON(pokemon_evolution_known_move_2);
	printf("repeating pokemon_evolution_known_move:\n%s\n", cJSON_Print(jsonpokemon_evolution_known_move_2));
}

int main() {
  test_pokemon_evolution_known_move(1);
  test_pokemon_evolution_known_move(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_evolution_known_move_MAIN
#endif // pokemon_evolution_known_move_TEST
