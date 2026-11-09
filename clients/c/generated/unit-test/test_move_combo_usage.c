#ifndef move_combo_usage_TEST
#define move_combo_usage_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_combo_usage_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_combo_usage.h"
move_combo_usage_t* instantiate_move_combo_usage(int include_optional);



move_combo_usage_t* instantiate_move_combo_usage(int include_optional) {
  move_combo_usage_t* move_combo_usage = NULL;
  if (include_optional) {
    move_combo_usage = move_combo_usage_create(
      list_createList(),
      list_createList()
    );
  } else {
    move_combo_usage = move_combo_usage_create(
      list_createList(),
      list_createList()
    );
  }

  return move_combo_usage;
}


#ifdef move_combo_usage_MAIN

void test_move_combo_usage(int include_optional) {
    move_combo_usage_t* move_combo_usage_1 = instantiate_move_combo_usage(include_optional);

	cJSON* jsonmove_combo_usage_1 = move_combo_usage_convertToJSON(move_combo_usage_1);
	printf("move_combo_usage :\n%s\n", cJSON_Print(jsonmove_combo_usage_1));
	move_combo_usage_t* move_combo_usage_2 = move_combo_usage_parseFromJSON(jsonmove_combo_usage_1);
	cJSON* jsonmove_combo_usage_2 = move_combo_usage_convertToJSON(move_combo_usage_2);
	printf("repeating move_combo_usage:\n%s\n", cJSON_Print(jsonmove_combo_usage_2));
}

int main() {
  test_move_combo_usage(1);
  test_move_combo_usage(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_combo_usage_MAIN
#endif // move_combo_usage_TEST
