#ifndef type_game_sprite_TEST
#define type_game_sprite_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_game_sprite_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_game_sprite.h"
type_game_sprite_t* instantiate_type_game_sprite(int include_optional);



type_game_sprite_t* instantiate_type_game_sprite(int include_optional) {
  type_game_sprite_t* type_game_sprite = NULL;
  if (include_optional) {
    type_game_sprite = type_game_sprite_create(
      "0",
      "0"
    );
  } else {
    type_game_sprite = type_game_sprite_create(
      "0",
      "0"
    );
  }

  return type_game_sprite;
}


#ifdef type_game_sprite_MAIN

void test_type_game_sprite(int include_optional) {
    type_game_sprite_t* type_game_sprite_1 = instantiate_type_game_sprite(include_optional);

	cJSON* jsontype_game_sprite_1 = type_game_sprite_convertToJSON(type_game_sprite_1);
	printf("type_game_sprite :\n%s\n", cJSON_Print(jsontype_game_sprite_1));
	type_game_sprite_t* type_game_sprite_2 = type_game_sprite_parseFromJSON(jsontype_game_sprite_1);
	cJSON* jsontype_game_sprite_2 = type_game_sprite_convertToJSON(type_game_sprite_2);
	printf("repeating type_game_sprite:\n%s\n", cJSON_Print(jsontype_game_sprite_2));
}

int main() {
  test_type_game_sprite(1);
  test_type_game_sprite(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_game_sprite_MAIN
#endif // type_game_sprite_TEST
