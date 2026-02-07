#ifndef stat_detail_affecting_natures_TEST
#define stat_detail_affecting_natures_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define stat_detail_affecting_natures_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/stat_detail_affecting_natures.h"
stat_detail_affecting_natures_t* instantiate_stat_detail_affecting_natures(int include_optional);



stat_detail_affecting_natures_t* instantiate_stat_detail_affecting_natures(int include_optional) {
  stat_detail_affecting_natures_t* stat_detail_affecting_natures = NULL;
  if (include_optional) {
    stat_detail_affecting_natures = stat_detail_affecting_natures_create(
      list_createList(),
      list_createList()
    );
  } else {
    stat_detail_affecting_natures = stat_detail_affecting_natures_create(
      list_createList(),
      list_createList()
    );
  }

  return stat_detail_affecting_natures;
}


#ifdef stat_detail_affecting_natures_MAIN

void test_stat_detail_affecting_natures(int include_optional) {
    stat_detail_affecting_natures_t* stat_detail_affecting_natures_1 = instantiate_stat_detail_affecting_natures(include_optional);

	cJSON* jsonstat_detail_affecting_natures_1 = stat_detail_affecting_natures_convertToJSON(stat_detail_affecting_natures_1);
	printf("stat_detail_affecting_natures :\n%s\n", cJSON_Print(jsonstat_detail_affecting_natures_1));
	stat_detail_affecting_natures_t* stat_detail_affecting_natures_2 = stat_detail_affecting_natures_parseFromJSON(jsonstat_detail_affecting_natures_1);
	cJSON* jsonstat_detail_affecting_natures_2 = stat_detail_affecting_natures_convertToJSON(stat_detail_affecting_natures_2);
	printf("repeating stat_detail_affecting_natures:\n%s\n", cJSON_Print(jsonstat_detail_affecting_natures_2));
}

int main() {
  test_stat_detail_affecting_natures(1);
  test_stat_detail_affecting_natures(0);

  printf("Hello world \n");
  return 0;
}

#endif // stat_detail_affecting_natures_MAIN
#endif // stat_detail_affecting_natures_TEST
