#ifndef move_damage_class_detail_TEST
#define move_damage_class_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_damage_class_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_damage_class_detail.h"
move_damage_class_detail_t* instantiate_move_damage_class_detail(int include_optional);



move_damage_class_detail_t* instantiate_move_damage_class_detail(int include_optional) {
  move_damage_class_detail_t* move_damage_class_detail = NULL;
  if (include_optional) {
    move_damage_class_detail = move_damage_class_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    move_damage_class_detail = move_damage_class_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return move_damage_class_detail;
}


#ifdef move_damage_class_detail_MAIN

void test_move_damage_class_detail(int include_optional) {
    move_damage_class_detail_t* move_damage_class_detail_1 = instantiate_move_damage_class_detail(include_optional);

	cJSON* jsonmove_damage_class_detail_1 = move_damage_class_detail_convertToJSON(move_damage_class_detail_1);
	printf("move_damage_class_detail :\n%s\n", cJSON_Print(jsonmove_damage_class_detail_1));
	move_damage_class_detail_t* move_damage_class_detail_2 = move_damage_class_detail_parseFromJSON(jsonmove_damage_class_detail_1);
	cJSON* jsonmove_damage_class_detail_2 = move_damage_class_detail_convertToJSON(move_damage_class_detail_2);
	printf("repeating move_damage_class_detail:\n%s\n", cJSON_Print(jsonmove_damage_class_detail_2));
}

int main() {
  test_move_damage_class_detail(1);
  test_move_damage_class_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_damage_class_detail_MAIN
#endif // move_damage_class_detail_TEST
