#ifndef stat_name_TEST
#define stat_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define stat_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/stat_name.h"
stat_name_t* instantiate_stat_name(int include_optional);

#include "test_language_summary.c"


stat_name_t* instantiate_stat_name(int include_optional) {
  stat_name_t* stat_name = NULL;
  if (include_optional) {
    stat_name = stat_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    stat_name = stat_name_create(
      "0",
      NULL
    );
  }

  return stat_name;
}


#ifdef stat_name_MAIN

void test_stat_name(int include_optional) {
    stat_name_t* stat_name_1 = instantiate_stat_name(include_optional);

	cJSON* jsonstat_name_1 = stat_name_convertToJSON(stat_name_1);
	printf("stat_name :\n%s\n", cJSON_Print(jsonstat_name_1));
	stat_name_t* stat_name_2 = stat_name_parseFromJSON(jsonstat_name_1);
	cJSON* jsonstat_name_2 = stat_name_convertToJSON(stat_name_2);
	printf("repeating stat_name:\n%s\n", cJSON_Print(jsonstat_name_2));
}

int main() {
  test_stat_name(1);
  test_stat_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // stat_name_MAIN
#endif // stat_name_TEST
