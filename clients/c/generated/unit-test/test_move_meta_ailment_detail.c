#ifndef move_meta_ailment_detail_TEST
#define move_meta_ailment_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_meta_ailment_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_meta_ailment_detail.h"
move_meta_ailment_detail_t* instantiate_move_meta_ailment_detail(int include_optional);



move_meta_ailment_detail_t* instantiate_move_meta_ailment_detail(int include_optional) {
  move_meta_ailment_detail_t* move_meta_ailment_detail = NULL;
  if (include_optional) {
    move_meta_ailment_detail = move_meta_ailment_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    move_meta_ailment_detail = move_meta_ailment_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  }

  return move_meta_ailment_detail;
}


#ifdef move_meta_ailment_detail_MAIN

void test_move_meta_ailment_detail(int include_optional) {
    move_meta_ailment_detail_t* move_meta_ailment_detail_1 = instantiate_move_meta_ailment_detail(include_optional);

	cJSON* jsonmove_meta_ailment_detail_1 = move_meta_ailment_detail_convertToJSON(move_meta_ailment_detail_1);
	printf("move_meta_ailment_detail :\n%s\n", cJSON_Print(jsonmove_meta_ailment_detail_1));
	move_meta_ailment_detail_t* move_meta_ailment_detail_2 = move_meta_ailment_detail_parseFromJSON(jsonmove_meta_ailment_detail_1);
	cJSON* jsonmove_meta_ailment_detail_2 = move_meta_ailment_detail_convertToJSON(move_meta_ailment_detail_2);
	printf("repeating move_meta_ailment_detail:\n%s\n", cJSON_Print(jsonmove_meta_ailment_detail_2));
}

int main() {
  test_move_meta_ailment_detail(1);
  test_move_meta_ailment_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_meta_ailment_detail_MAIN
#endif // move_meta_ailment_detail_TEST
