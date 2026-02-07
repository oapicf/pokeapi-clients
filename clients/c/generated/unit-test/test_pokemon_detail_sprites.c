#ifndef pokemon_detail_sprites_TEST
#define pokemon_detail_sprites_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_detail_sprites_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_detail_sprites.h"
pokemon_detail_sprites_t* instantiate_pokemon_detail_sprites(int include_optional);



pokemon_detail_sprites_t* instantiate_pokemon_detail_sprites(int include_optional) {
  pokemon_detail_sprites_t* pokemon_detail_sprites = NULL;
  if (include_optional) {
    pokemon_detail_sprites = pokemon_detail_sprites_create(
      "0"
    );
  } else {
    pokemon_detail_sprites = pokemon_detail_sprites_create(
      "0"
    );
  }

  return pokemon_detail_sprites;
}


#ifdef pokemon_detail_sprites_MAIN

void test_pokemon_detail_sprites(int include_optional) {
    pokemon_detail_sprites_t* pokemon_detail_sprites_1 = instantiate_pokemon_detail_sprites(include_optional);

	cJSON* jsonpokemon_detail_sprites_1 = pokemon_detail_sprites_convertToJSON(pokemon_detail_sprites_1);
	printf("pokemon_detail_sprites :\n%s\n", cJSON_Print(jsonpokemon_detail_sprites_1));
	pokemon_detail_sprites_t* pokemon_detail_sprites_2 = pokemon_detail_sprites_parseFromJSON(jsonpokemon_detail_sprites_1);
	cJSON* jsonpokemon_detail_sprites_2 = pokemon_detail_sprites_convertToJSON(pokemon_detail_sprites_2);
	printf("repeating pokemon_detail_sprites:\n%s\n", cJSON_Print(jsonpokemon_detail_sprites_2));
}

int main() {
  test_pokemon_detail_sprites(1);
  test_pokemon_detail_sprites(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_detail_sprites_MAIN
#endif // pokemon_detail_sprites_TEST
