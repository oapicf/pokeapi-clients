#ifndef move_change_TEST
#define move_change_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_change_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_change.h"
move_change_t* instantiate_move_change(int include_optional);

#include "test_type_summary.c"
#include "test_version_group_summary.c"


move_change_t* instantiate_move_change(int include_optional) {
  move_change_t* move_change = NULL;
  if (include_optional) {
    move_change = move_change_create(
      56,
      56,
      56,
      56,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_type_summary(0),
       // false, not to have infinite recursion
      instantiate_version_group_summary(0)
    );
  } else {
    move_change = move_change_create(
      56,
      56,
      56,
      56,
      list_createList(),
      NULL,
      NULL
    );
  }

  return move_change;
}


#ifdef move_change_MAIN

void test_move_change(int include_optional) {
    move_change_t* move_change_1 = instantiate_move_change(include_optional);

	cJSON* jsonmove_change_1 = move_change_convertToJSON(move_change_1);
	printf("move_change :\n%s\n", cJSON_Print(jsonmove_change_1));
	move_change_t* move_change_2 = move_change_parseFromJSON(jsonmove_change_1);
	cJSON* jsonmove_change_2 = move_change_convertToJSON(move_change_2);
	printf("repeating move_change:\n%s\n", cJSON_Print(jsonmove_change_2));
}

int main() {
  test_move_change(1);
  test_move_change(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_change_MAIN
#endif // move_change_TEST
