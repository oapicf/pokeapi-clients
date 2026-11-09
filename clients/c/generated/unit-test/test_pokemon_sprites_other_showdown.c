#ifndef pokemon_sprites_other_showdown_TEST
#define pokemon_sprites_other_showdown_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_sprites_other_showdown_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_sprites_other_showdown.h"
pokemon_sprites_other_showdown_t* instantiate_pokemon_sprites_other_showdown(int include_optional);



pokemon_sprites_other_showdown_t* instantiate_pokemon_sprites_other_showdown(int include_optional) {
  pokemon_sprites_other_showdown_t* pokemon_sprites_other_showdown = NULL;
  if (include_optional) {
    pokemon_sprites_other_showdown = pokemon_sprites_other_showdown_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    pokemon_sprites_other_showdown = pokemon_sprites_other_showdown_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  }

  return pokemon_sprites_other_showdown;
}


#ifdef pokemon_sprites_other_showdown_MAIN

void test_pokemon_sprites_other_showdown(int include_optional) {
    pokemon_sprites_other_showdown_t* pokemon_sprites_other_showdown_1 = instantiate_pokemon_sprites_other_showdown(include_optional);

	cJSON* jsonpokemon_sprites_other_showdown_1 = pokemon_sprites_other_showdown_convertToJSON(pokemon_sprites_other_showdown_1);
	printf("pokemon_sprites_other_showdown :\n%s\n", cJSON_Print(jsonpokemon_sprites_other_showdown_1));
	pokemon_sprites_other_showdown_t* pokemon_sprites_other_showdown_2 = pokemon_sprites_other_showdown_parseFromJSON(jsonpokemon_sprites_other_showdown_1);
	cJSON* jsonpokemon_sprites_other_showdown_2 = pokemon_sprites_other_showdown_convertToJSON(pokemon_sprites_other_showdown_2);
	printf("repeating pokemon_sprites_other_showdown:\n%s\n", cJSON_Print(jsonpokemon_sprites_other_showdown_2));
}

int main() {
  test_pokemon_sprites_other_showdown(1);
  test_pokemon_sprites_other_showdown(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_sprites_other_showdown_MAIN
#endif // pokemon_sprites_other_showdown_TEST
