#ifndef pokemon_sprites_other_TEST
#define pokemon_sprites_other_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_sprites_other_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_sprites_other.h"
pokemon_sprites_other_t* instantiate_pokemon_sprites_other(int include_optional);

#include "test_pokemon_sprites_other_dream_world.c"
#include "test_pokemon_sprites_other_home.c"
#include "test_pokemon_sprites_other_showdown.c"
#include "test_pokemon_sprites_other_official_artwork.c"


pokemon_sprites_other_t* instantiate_pokemon_sprites_other(int include_optional) {
  pokemon_sprites_other_t* pokemon_sprites_other = NULL;
  if (include_optional) {
    pokemon_sprites_other = pokemon_sprites_other_create(
       // false, not to have infinite recursion
      instantiate_pokemon_sprites_other_dream_world(0),
       // false, not to have infinite recursion
      instantiate_pokemon_sprites_other_home(0),
       // false, not to have infinite recursion
      instantiate_pokemon_sprites_other_showdown(0),
       // false, not to have infinite recursion
      instantiate_pokemon_sprites_other_official_artwork(0)
    );
  } else {
    pokemon_sprites_other = pokemon_sprites_other_create(
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return pokemon_sprites_other;
}


#ifdef pokemon_sprites_other_MAIN

void test_pokemon_sprites_other(int include_optional) {
    pokemon_sprites_other_t* pokemon_sprites_other_1 = instantiate_pokemon_sprites_other(include_optional);

	cJSON* jsonpokemon_sprites_other_1 = pokemon_sprites_other_convertToJSON(pokemon_sprites_other_1);
	printf("pokemon_sprites_other :\n%s\n", cJSON_Print(jsonpokemon_sprites_other_1));
	pokemon_sprites_other_t* pokemon_sprites_other_2 = pokemon_sprites_other_parseFromJSON(jsonpokemon_sprites_other_1);
	cJSON* jsonpokemon_sprites_other_2 = pokemon_sprites_other_convertToJSON(pokemon_sprites_other_2);
	printf("repeating pokemon_sprites_other:\n%s\n", cJSON_Print(jsonpokemon_sprites_other_2));
}

int main() {
  test_pokemon_sprites_other(1);
  test_pokemon_sprites_other(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_sprites_other_MAIN
#endif // pokemon_sprites_other_TEST
