#ifndef move_damage_class_summary_TEST
#define move_damage_class_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_damage_class_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_damage_class_summary.h"
move_damage_class_summary_t* instantiate_move_damage_class_summary(int include_optional);



move_damage_class_summary_t* instantiate_move_damage_class_summary(int include_optional) {
  move_damage_class_summary_t* move_damage_class_summary = NULL;
  if (include_optional) {
    move_damage_class_summary = move_damage_class_summary_create(
      "0",
      "0"
    );
  } else {
    move_damage_class_summary = move_damage_class_summary_create(
      "0",
      "0"
    );
  }

  return move_damage_class_summary;
}


#ifdef move_damage_class_summary_MAIN

void test_move_damage_class_summary(int include_optional) {
    move_damage_class_summary_t* move_damage_class_summary_1 = instantiate_move_damage_class_summary(include_optional);

	cJSON* jsonmove_damage_class_summary_1 = move_damage_class_summary_convertToJSON(move_damage_class_summary_1);
	printf("move_damage_class_summary :\n%s\n", cJSON_Print(jsonmove_damage_class_summary_1));
	move_damage_class_summary_t* move_damage_class_summary_2 = move_damage_class_summary_parseFromJSON(jsonmove_damage_class_summary_1);
	cJSON* jsonmove_damage_class_summary_2 = move_damage_class_summary_convertToJSON(move_damage_class_summary_2);
	printf("repeating move_damage_class_summary:\n%s\n", cJSON_Print(jsonmove_damage_class_summary_2));
}

int main() {
  test_move_damage_class_summary(1);
  test_move_damage_class_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_damage_class_summary_MAIN
#endif // move_damage_class_summary_TEST
