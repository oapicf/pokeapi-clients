#ifndef move_meta_stat_change_TEST
#define move_meta_stat_change_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_meta_stat_change_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_meta_stat_change.h"
move_meta_stat_change_t* instantiate_move_meta_stat_change(int include_optional);

#include "test_stat_summary.c"


move_meta_stat_change_t* instantiate_move_meta_stat_change(int include_optional) {
  move_meta_stat_change_t* move_meta_stat_change = NULL;
  if (include_optional) {
    move_meta_stat_change = move_meta_stat_change_create(
      -2147483648,
       // false, not to have infinite recursion
      instantiate_stat_summary(0)
    );
  } else {
    move_meta_stat_change = move_meta_stat_change_create(
      -2147483648,
      NULL
    );
  }

  return move_meta_stat_change;
}


#ifdef move_meta_stat_change_MAIN

void test_move_meta_stat_change(int include_optional) {
    move_meta_stat_change_t* move_meta_stat_change_1 = instantiate_move_meta_stat_change(include_optional);

	cJSON* jsonmove_meta_stat_change_1 = move_meta_stat_change_convertToJSON(move_meta_stat_change_1);
	printf("move_meta_stat_change :\n%s\n", cJSON_Print(jsonmove_meta_stat_change_1));
	move_meta_stat_change_t* move_meta_stat_change_2 = move_meta_stat_change_parseFromJSON(jsonmove_meta_stat_change_1);
	cJSON* jsonmove_meta_stat_change_2 = move_meta_stat_change_convertToJSON(move_meta_stat_change_2);
	printf("repeating move_meta_stat_change:\n%s\n", cJSON_Print(jsonmove_meta_stat_change_2));
}

int main() {
  test_move_meta_stat_change(1);
  test_move_meta_stat_change(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_meta_stat_change_MAIN
#endif // move_meta_stat_change_TEST
