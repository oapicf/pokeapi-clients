#ifndef move_detail_contest_combos_normal_TEST
#define move_detail_contest_combos_normal_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_detail_contest_combos_normal_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_detail_contest_combos_normal.h"
move_detail_contest_combos_normal_t* instantiate_move_detail_contest_combos_normal(int include_optional);



move_detail_contest_combos_normal_t* instantiate_move_detail_contest_combos_normal(int include_optional) {
  move_detail_contest_combos_normal_t* move_detail_contest_combos_normal = NULL;
  if (include_optional) {
    move_detail_contest_combos_normal = move_detail_contest_combos_normal_create(
      list_createList(),
      list_createList()
    );
  } else {
    move_detail_contest_combos_normal = move_detail_contest_combos_normal_create(
      list_createList(),
      list_createList()
    );
  }

  return move_detail_contest_combos_normal;
}


#ifdef move_detail_contest_combos_normal_MAIN

void test_move_detail_contest_combos_normal(int include_optional) {
    move_detail_contest_combos_normal_t* move_detail_contest_combos_normal_1 = instantiate_move_detail_contest_combos_normal(include_optional);

	cJSON* jsonmove_detail_contest_combos_normal_1 = move_detail_contest_combos_normal_convertToJSON(move_detail_contest_combos_normal_1);
	printf("move_detail_contest_combos_normal :\n%s\n", cJSON_Print(jsonmove_detail_contest_combos_normal_1));
	move_detail_contest_combos_normal_t* move_detail_contest_combos_normal_2 = move_detail_contest_combos_normal_parseFromJSON(jsonmove_detail_contest_combos_normal_1);
	cJSON* jsonmove_detail_contest_combos_normal_2 = move_detail_contest_combos_normal_convertToJSON(move_detail_contest_combos_normal_2);
	printf("repeating move_detail_contest_combos_normal:\n%s\n", cJSON_Print(jsonmove_detail_contest_combos_normal_2));
}

int main() {
  test_move_detail_contest_combos_normal(1);
  test_move_detail_contest_combos_normal(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_detail_contest_combos_normal_MAIN
#endif // move_detail_contest_combos_normal_TEST
