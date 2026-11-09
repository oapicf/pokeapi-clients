#ifndef pokemon_sprites_other_home_TEST
#define pokemon_sprites_other_home_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_sprites_other_home_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_sprites_other_home.h"
pokemon_sprites_other_home_t* instantiate_pokemon_sprites_other_home(int include_optional);



pokemon_sprites_other_home_t* instantiate_pokemon_sprites_other_home(int include_optional) {
  pokemon_sprites_other_home_t* pokemon_sprites_other_home = NULL;
  if (include_optional) {
    pokemon_sprites_other_home = pokemon_sprites_other_home_create(
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    pokemon_sprites_other_home = pokemon_sprites_other_home_create(
      "0",
      "0",
      "0",
      "0"
    );
  }

  return pokemon_sprites_other_home;
}


#ifdef pokemon_sprites_other_home_MAIN

void test_pokemon_sprites_other_home(int include_optional) {
    pokemon_sprites_other_home_t* pokemon_sprites_other_home_1 = instantiate_pokemon_sprites_other_home(include_optional);

	cJSON* jsonpokemon_sprites_other_home_1 = pokemon_sprites_other_home_convertToJSON(pokemon_sprites_other_home_1);
	printf("pokemon_sprites_other_home :\n%s\n", cJSON_Print(jsonpokemon_sprites_other_home_1));
	pokemon_sprites_other_home_t* pokemon_sprites_other_home_2 = pokemon_sprites_other_home_parseFromJSON(jsonpokemon_sprites_other_home_1);
	cJSON* jsonpokemon_sprites_other_home_2 = pokemon_sprites_other_home_convertToJSON(pokemon_sprites_other_home_2);
	printf("repeating pokemon_sprites_other_home:\n%s\n", cJSON_Print(jsonpokemon_sprites_other_home_2));
}

int main() {
  test_pokemon_sprites_other_home(1);
  test_pokemon_sprites_other_home(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_sprites_other_home_MAIN
#endif // pokemon_sprites_other_home_TEST
