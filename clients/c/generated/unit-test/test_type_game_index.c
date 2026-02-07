#ifndef type_game_index_TEST
#define type_game_index_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_game_index_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_game_index.h"
type_game_index_t* instantiate_type_game_index(int include_optional);

#include "test_generation_summary.c"


type_game_index_t* instantiate_type_game_index(int include_optional) {
  type_game_index_t* type_game_index = NULL;
  if (include_optional) {
    type_game_index = type_game_index_create(
      56,
       // false, not to have infinite recursion
      instantiate_generation_summary(0)
    );
  } else {
    type_game_index = type_game_index_create(
      56,
      NULL
    );
  }

  return type_game_index;
}


#ifdef type_game_index_MAIN

void test_type_game_index(int include_optional) {
    type_game_index_t* type_game_index_1 = instantiate_type_game_index(include_optional);

	cJSON* jsontype_game_index_1 = type_game_index_convertToJSON(type_game_index_1);
	printf("type_game_index :\n%s\n", cJSON_Print(jsontype_game_index_1));
	type_game_index_t* type_game_index_2 = type_game_index_parseFromJSON(jsontype_game_index_1);
	cJSON* jsontype_game_index_2 = type_game_index_convertToJSON(type_game_index_2);
	printf("repeating type_game_index:\n%s\n", cJSON_Print(jsontype_game_index_2));
}

int main() {
  test_type_game_index(1);
  test_type_game_index(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_game_index_MAIN
#endif // type_game_index_TEST
