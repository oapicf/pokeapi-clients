#ifndef pokemon_sprites_TEST
#define pokemon_sprites_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_sprites_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_sprites.h"
pokemon_sprites_t* instantiate_pokemon_sprites(int include_optional);

#include "test_pokemon_sprites_other.c"


pokemon_sprites_t* instantiate_pokemon_sprites(int include_optional) {
  pokemon_sprites_t* pokemon_sprites = NULL;
  if (include_optional) {
    pokemon_sprites = pokemon_sprites_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_pokemon_sprites_other(0),
      list_createList()
    );
  } else {
    pokemon_sprites = pokemon_sprites_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      NULL,
      list_createList()
    );
  }

  return pokemon_sprites;
}


#ifdef pokemon_sprites_MAIN

void test_pokemon_sprites(int include_optional) {
    pokemon_sprites_t* pokemon_sprites_1 = instantiate_pokemon_sprites(include_optional);

	cJSON* jsonpokemon_sprites_1 = pokemon_sprites_convertToJSON(pokemon_sprites_1);
	printf("pokemon_sprites :\n%s\n", cJSON_Print(jsonpokemon_sprites_1));
	pokemon_sprites_t* pokemon_sprites_2 = pokemon_sprites_parseFromJSON(jsonpokemon_sprites_1);
	cJSON* jsonpokemon_sprites_2 = pokemon_sprites_convertToJSON(pokemon_sprites_2);
	printf("repeating pokemon_sprites:\n%s\n", cJSON_Print(jsonpokemon_sprites_2));
}

int main() {
  test_pokemon_sprites(1);
  test_pokemon_sprites(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_sprites_MAIN
#endif // pokemon_sprites_TEST
