#ifndef move_learn_method_detail_TEST
#define move_learn_method_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_learn_method_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_learn_method_detail.h"
move_learn_method_detail_t* instantiate_move_learn_method_detail(int include_optional);



move_learn_method_detail_t* instantiate_move_learn_method_detail(int include_optional) {
  move_learn_method_detail_t* move_learn_method_detail = NULL;
  if (include_optional) {
    move_learn_method_detail = move_learn_method_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    move_learn_method_detail = move_learn_method_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return move_learn_method_detail;
}


#ifdef move_learn_method_detail_MAIN

void test_move_learn_method_detail(int include_optional) {
    move_learn_method_detail_t* move_learn_method_detail_1 = instantiate_move_learn_method_detail(include_optional);

	cJSON* jsonmove_learn_method_detail_1 = move_learn_method_detail_convertToJSON(move_learn_method_detail_1);
	printf("move_learn_method_detail :\n%s\n", cJSON_Print(jsonmove_learn_method_detail_1));
	move_learn_method_detail_t* move_learn_method_detail_2 = move_learn_method_detail_parseFromJSON(jsonmove_learn_method_detail_1);
	cJSON* jsonmove_learn_method_detail_2 = move_learn_method_detail_convertToJSON(move_learn_method_detail_2);
	printf("repeating move_learn_method_detail:\n%s\n", cJSON_Print(jsonmove_learn_method_detail_2));
}

int main() {
  test_move_learn_method_detail(1);
  test_move_learn_method_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_learn_method_detail_MAIN
#endif // move_learn_method_detail_TEST
