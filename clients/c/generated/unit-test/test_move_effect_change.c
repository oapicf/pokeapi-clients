#ifndef move_effect_change_TEST
#define move_effect_change_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_effect_change_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_effect_change.h"
move_effect_change_t* instantiate_move_effect_change(int include_optional);

#include "test_version_group_summary.c"


move_effect_change_t* instantiate_move_effect_change(int include_optional) {
  move_effect_change_t* move_effect_change = NULL;
  if (include_optional) {
    move_effect_change = move_effect_change_create(
       // false, not to have infinite recursion
      instantiate_version_group_summary(0),
      list_createList()
    );
  } else {
    move_effect_change = move_effect_change_create(
      NULL,
      list_createList()
    );
  }

  return move_effect_change;
}


#ifdef move_effect_change_MAIN

void test_move_effect_change(int include_optional) {
    move_effect_change_t* move_effect_change_1 = instantiate_move_effect_change(include_optional);

	cJSON* jsonmove_effect_change_1 = move_effect_change_convertToJSON(move_effect_change_1);
	printf("move_effect_change :\n%s\n", cJSON_Print(jsonmove_effect_change_1));
	move_effect_change_t* move_effect_change_2 = move_effect_change_parseFromJSON(jsonmove_effect_change_1);
	cJSON* jsonmove_effect_change_2 = move_effect_change_convertToJSON(move_effect_change_2);
	printf("repeating move_effect_change:\n%s\n", cJSON_Print(jsonmove_effect_change_2));
}

int main() {
  test_move_effect_change(1);
  test_move_effect_change(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_effect_change_MAIN
#endif // move_effect_change_TEST
