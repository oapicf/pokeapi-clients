#ifndef move_battle_style_summary_TEST
#define move_battle_style_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_battle_style_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_battle_style_summary.h"
move_battle_style_summary_t* instantiate_move_battle_style_summary(int include_optional);



move_battle_style_summary_t* instantiate_move_battle_style_summary(int include_optional) {
  move_battle_style_summary_t* move_battle_style_summary = NULL;
  if (include_optional) {
    move_battle_style_summary = move_battle_style_summary_create(
      "0",
      "0"
    );
  } else {
    move_battle_style_summary = move_battle_style_summary_create(
      "0",
      "0"
    );
  }

  return move_battle_style_summary;
}


#ifdef move_battle_style_summary_MAIN

void test_move_battle_style_summary(int include_optional) {
    move_battle_style_summary_t* move_battle_style_summary_1 = instantiate_move_battle_style_summary(include_optional);

	cJSON* jsonmove_battle_style_summary_1 = move_battle_style_summary_convertToJSON(move_battle_style_summary_1);
	printf("move_battle_style_summary :\n%s\n", cJSON_Print(jsonmove_battle_style_summary_1));
	move_battle_style_summary_t* move_battle_style_summary_2 = move_battle_style_summary_parseFromJSON(jsonmove_battle_style_summary_1);
	cJSON* jsonmove_battle_style_summary_2 = move_battle_style_summary_convertToJSON(move_battle_style_summary_2);
	printf("repeating move_battle_style_summary:\n%s\n", cJSON_Print(jsonmove_battle_style_summary_2));
}

int main() {
  test_move_battle_style_summary(1);
  test_move_battle_style_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_battle_style_summary_MAIN
#endif // move_battle_style_summary_TEST
