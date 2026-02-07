#ifndef stat_detail_affecting_moves_TEST
#define stat_detail_affecting_moves_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define stat_detail_affecting_moves_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/stat_detail_affecting_moves.h"
stat_detail_affecting_moves_t* instantiate_stat_detail_affecting_moves(int include_optional);



stat_detail_affecting_moves_t* instantiate_stat_detail_affecting_moves(int include_optional) {
  stat_detail_affecting_moves_t* stat_detail_affecting_moves = NULL;
  if (include_optional) {
    stat_detail_affecting_moves = stat_detail_affecting_moves_create(
      list_createList(),
      list_createList()
    );
  } else {
    stat_detail_affecting_moves = stat_detail_affecting_moves_create(
      list_createList(),
      list_createList()
    );
  }

  return stat_detail_affecting_moves;
}


#ifdef stat_detail_affecting_moves_MAIN

void test_stat_detail_affecting_moves(int include_optional) {
    stat_detail_affecting_moves_t* stat_detail_affecting_moves_1 = instantiate_stat_detail_affecting_moves(include_optional);

	cJSON* jsonstat_detail_affecting_moves_1 = stat_detail_affecting_moves_convertToJSON(stat_detail_affecting_moves_1);
	printf("stat_detail_affecting_moves :\n%s\n", cJSON_Print(jsonstat_detail_affecting_moves_1));
	stat_detail_affecting_moves_t* stat_detail_affecting_moves_2 = stat_detail_affecting_moves_parseFromJSON(jsonstat_detail_affecting_moves_1);
	cJSON* jsonstat_detail_affecting_moves_2 = stat_detail_affecting_moves_convertToJSON(stat_detail_affecting_moves_2);
	printf("repeating stat_detail_affecting_moves:\n%s\n", cJSON_Print(jsonstat_detail_affecting_moves_2));
}

int main() {
  test_stat_detail_affecting_moves(1);
  test_stat_detail_affecting_moves(0);

  printf("Hello world \n");
  return 0;
}

#endif // stat_detail_affecting_moves_MAIN
#endif // stat_detail_affecting_moves_TEST
