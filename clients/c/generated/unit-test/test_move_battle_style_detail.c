#ifndef move_battle_style_detail_TEST
#define move_battle_style_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_battle_style_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_battle_style_detail.h"
move_battle_style_detail_t* instantiate_move_battle_style_detail(int include_optional);



move_battle_style_detail_t* instantiate_move_battle_style_detail(int include_optional) {
  move_battle_style_detail_t* move_battle_style_detail = NULL;
  if (include_optional) {
    move_battle_style_detail = move_battle_style_detail_create(
      56,
      "0",
      list_createList()
    );
  } else {
    move_battle_style_detail = move_battle_style_detail_create(
      56,
      "0",
      list_createList()
    );
  }

  return move_battle_style_detail;
}


#ifdef move_battle_style_detail_MAIN

void test_move_battle_style_detail(int include_optional) {
    move_battle_style_detail_t* move_battle_style_detail_1 = instantiate_move_battle_style_detail(include_optional);

	cJSON* jsonmove_battle_style_detail_1 = move_battle_style_detail_convertToJSON(move_battle_style_detail_1);
	printf("move_battle_style_detail :\n%s\n", cJSON_Print(jsonmove_battle_style_detail_1));
	move_battle_style_detail_t* move_battle_style_detail_2 = move_battle_style_detail_parseFromJSON(jsonmove_battle_style_detail_1);
	cJSON* jsonmove_battle_style_detail_2 = move_battle_style_detail_convertToJSON(move_battle_style_detail_2);
	printf("repeating move_battle_style_detail:\n%s\n", cJSON_Print(jsonmove_battle_style_detail_2));
}

int main() {
  test_move_battle_style_detail(1);
  test_move_battle_style_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_battle_style_detail_MAIN
#endif // move_battle_style_detail_TEST
