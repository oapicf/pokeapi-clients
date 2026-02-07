#ifndef move_detail_contest_combos_TEST
#define move_detail_contest_combos_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_detail_contest_combos_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_detail_contest_combos.h"
move_detail_contest_combos_t* instantiate_move_detail_contest_combos(int include_optional);

#include "test_move_detail_contest_combos_normal.c"
#include "test_move_detail_contest_combos_normal.c"


move_detail_contest_combos_t* instantiate_move_detail_contest_combos(int include_optional) {
  move_detail_contest_combos_t* move_detail_contest_combos = NULL;
  if (include_optional) {
    move_detail_contest_combos = move_detail_contest_combos_create(
       // false, not to have infinite recursion
      instantiate_move_detail_contest_combos_normal(0),
       // false, not to have infinite recursion
      instantiate_move_detail_contest_combos_normal(0)
    );
  } else {
    move_detail_contest_combos = move_detail_contest_combos_create(
      NULL,
      NULL
    );
  }

  return move_detail_contest_combos;
}


#ifdef move_detail_contest_combos_MAIN

void test_move_detail_contest_combos(int include_optional) {
    move_detail_contest_combos_t* move_detail_contest_combos_1 = instantiate_move_detail_contest_combos(include_optional);

	cJSON* jsonmove_detail_contest_combos_1 = move_detail_contest_combos_convertToJSON(move_detail_contest_combos_1);
	printf("move_detail_contest_combos :\n%s\n", cJSON_Print(jsonmove_detail_contest_combos_1));
	move_detail_contest_combos_t* move_detail_contest_combos_2 = move_detail_contest_combos_parseFromJSON(jsonmove_detail_contest_combos_1);
	cJSON* jsonmove_detail_contest_combos_2 = move_detail_contest_combos_convertToJSON(move_detail_contest_combos_2);
	printf("repeating move_detail_contest_combos:\n%s\n", cJSON_Print(jsonmove_detail_contest_combos_2));
}

int main() {
  test_move_detail_contest_combos(1);
  test_move_detail_contest_combos(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_detail_contest_combos_MAIN
#endif // move_detail_contest_combos_TEST
