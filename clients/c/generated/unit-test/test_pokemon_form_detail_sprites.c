#ifndef pokemon_form_detail_sprites_TEST
#define pokemon_form_detail_sprites_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_form_detail_sprites_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_form_detail_sprites.h"
pokemon_form_detail_sprites_t* instantiate_pokemon_form_detail_sprites(int include_optional);



pokemon_form_detail_sprites_t* instantiate_pokemon_form_detail_sprites(int include_optional) {
  pokemon_form_detail_sprites_t* pokemon_form_detail_sprites = NULL;
  if (include_optional) {
    pokemon_form_detail_sprites = pokemon_form_detail_sprites_create(
      "0"
    );
  } else {
    pokemon_form_detail_sprites = pokemon_form_detail_sprites_create(
      "0"
    );
  }

  return pokemon_form_detail_sprites;
}


#ifdef pokemon_form_detail_sprites_MAIN

void test_pokemon_form_detail_sprites(int include_optional) {
    pokemon_form_detail_sprites_t* pokemon_form_detail_sprites_1 = instantiate_pokemon_form_detail_sprites(include_optional);

	cJSON* jsonpokemon_form_detail_sprites_1 = pokemon_form_detail_sprites_convertToJSON(pokemon_form_detail_sprites_1);
	printf("pokemon_form_detail_sprites :\n%s\n", cJSON_Print(jsonpokemon_form_detail_sprites_1));
	pokemon_form_detail_sprites_t* pokemon_form_detail_sprites_2 = pokemon_form_detail_sprites_parseFromJSON(jsonpokemon_form_detail_sprites_1);
	cJSON* jsonpokemon_form_detail_sprites_2 = pokemon_form_detail_sprites_convertToJSON(pokemon_form_detail_sprites_2);
	printf("repeating pokemon_form_detail_sprites:\n%s\n", cJSON_Print(jsonpokemon_form_detail_sprites_2));
}

int main() {
  test_pokemon_form_detail_sprites(1);
  test_pokemon_form_detail_sprites(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_form_detail_sprites_MAIN
#endif // pokemon_form_detail_sprites_TEST
