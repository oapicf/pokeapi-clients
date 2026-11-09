#ifndef pokemon_sprites_other_dream_world_TEST
#define pokemon_sprites_other_dream_world_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_sprites_other_dream_world_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_sprites_other_dream_world.h"
pokemon_sprites_other_dream_world_t* instantiate_pokemon_sprites_other_dream_world(int include_optional);



pokemon_sprites_other_dream_world_t* instantiate_pokemon_sprites_other_dream_world(int include_optional) {
  pokemon_sprites_other_dream_world_t* pokemon_sprites_other_dream_world = NULL;
  if (include_optional) {
    pokemon_sprites_other_dream_world = pokemon_sprites_other_dream_world_create(
      "0",
      "0"
    );
  } else {
    pokemon_sprites_other_dream_world = pokemon_sprites_other_dream_world_create(
      "0",
      "0"
    );
  }

  return pokemon_sprites_other_dream_world;
}


#ifdef pokemon_sprites_other_dream_world_MAIN

void test_pokemon_sprites_other_dream_world(int include_optional) {
    pokemon_sprites_other_dream_world_t* pokemon_sprites_other_dream_world_1 = instantiate_pokemon_sprites_other_dream_world(include_optional);

	cJSON* jsonpokemon_sprites_other_dream_world_1 = pokemon_sprites_other_dream_world_convertToJSON(pokemon_sprites_other_dream_world_1);
	printf("pokemon_sprites_other_dream_world :\n%s\n", cJSON_Print(jsonpokemon_sprites_other_dream_world_1));
	pokemon_sprites_other_dream_world_t* pokemon_sprites_other_dream_world_2 = pokemon_sprites_other_dream_world_parseFromJSON(jsonpokemon_sprites_other_dream_world_1);
	cJSON* jsonpokemon_sprites_other_dream_world_2 = pokemon_sprites_other_dream_world_convertToJSON(pokemon_sprites_other_dream_world_2);
	printf("repeating pokemon_sprites_other_dream_world:\n%s\n", cJSON_Print(jsonpokemon_sprites_other_dream_world_2));
}

int main() {
  test_pokemon_sprites_other_dream_world(1);
  test_pokemon_sprites_other_dream_world(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_sprites_other_dream_world_MAIN
#endif // pokemon_sprites_other_dream_world_TEST
