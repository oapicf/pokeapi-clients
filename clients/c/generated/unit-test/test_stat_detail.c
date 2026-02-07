#ifndef stat_detail_TEST
#define stat_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define stat_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/stat_detail.h"
stat_detail_t* instantiate_stat_detail(int include_optional);

#include "test_stat_detail_affecting_moves.c"
#include "test_stat_detail_affecting_natures.c"
#include "test_move_damage_class_summary.c"


stat_detail_t* instantiate_stat_detail(int include_optional) {
  stat_detail_t* stat_detail = NULL;
  if (include_optional) {
    stat_detail = stat_detail_create(
      56,
      "0",
      56,
      1,
       // false, not to have infinite recursion
      instantiate_stat_detail_affecting_moves(0),
       // false, not to have infinite recursion
      instantiate_stat_detail_affecting_natures(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_move_damage_class_summary(0),
      list_createList()
    );
  } else {
    stat_detail = stat_detail_create(
      56,
      "0",
      56,
      1,
      NULL,
      NULL,
      list_createList(),
      NULL,
      list_createList()
    );
  }

  return stat_detail;
}


#ifdef stat_detail_MAIN

void test_stat_detail(int include_optional) {
    stat_detail_t* stat_detail_1 = instantiate_stat_detail(include_optional);

	cJSON* jsonstat_detail_1 = stat_detail_convertToJSON(stat_detail_1);
	printf("stat_detail :\n%s\n", cJSON_Print(jsonstat_detail_1));
	stat_detail_t* stat_detail_2 = stat_detail_parseFromJSON(jsonstat_detail_1);
	cJSON* jsonstat_detail_2 = stat_detail_convertToJSON(stat_detail_2);
	printf("repeating stat_detail:\n%s\n", cJSON_Print(jsonstat_detail_2));
}

int main() {
  test_stat_detail(1);
  test_stat_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // stat_detail_MAIN
#endif // stat_detail_TEST
