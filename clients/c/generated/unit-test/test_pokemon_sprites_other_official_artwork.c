#ifndef pokemon_sprites_other_official_artwork_TEST
#define pokemon_sprites_other_official_artwork_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_sprites_other_official_artwork_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_sprites_other_official_artwork.h"
pokemon_sprites_other_official_artwork_t* instantiate_pokemon_sprites_other_official_artwork(int include_optional);



pokemon_sprites_other_official_artwork_t* instantiate_pokemon_sprites_other_official_artwork(int include_optional) {
  pokemon_sprites_other_official_artwork_t* pokemon_sprites_other_official_artwork = NULL;
  if (include_optional) {
    pokemon_sprites_other_official_artwork = pokemon_sprites_other_official_artwork_create(
      "0",
      "0",
      list_createList()
    );
  } else {
    pokemon_sprites_other_official_artwork = pokemon_sprites_other_official_artwork_create(
      "0",
      "0",
      list_createList()
    );
  }

  return pokemon_sprites_other_official_artwork;
}


#ifdef pokemon_sprites_other_official_artwork_MAIN

void test_pokemon_sprites_other_official_artwork(int include_optional) {
    pokemon_sprites_other_official_artwork_t* pokemon_sprites_other_official_artwork_1 = instantiate_pokemon_sprites_other_official_artwork(include_optional);

	cJSON* jsonpokemon_sprites_other_official_artwork_1 = pokemon_sprites_other_official_artwork_convertToJSON(pokemon_sprites_other_official_artwork_1);
	printf("pokemon_sprites_other_official_artwork :\n%s\n", cJSON_Print(jsonpokemon_sprites_other_official_artwork_1));
	pokemon_sprites_other_official_artwork_t* pokemon_sprites_other_official_artwork_2 = pokemon_sprites_other_official_artwork_parseFromJSON(jsonpokemon_sprites_other_official_artwork_1);
	cJSON* jsonpokemon_sprites_other_official_artwork_2 = pokemon_sprites_other_official_artwork_convertToJSON(pokemon_sprites_other_official_artwork_2);
	printf("repeating pokemon_sprites_other_official_artwork:\n%s\n", cJSON_Print(jsonpokemon_sprites_other_official_artwork_2));
}

int main() {
  test_pokemon_sprites_other_official_artwork(1);
  test_pokemon_sprites_other_official_artwork(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_sprites_other_official_artwork_MAIN
#endif // pokemon_sprites_other_official_artwork_TEST
