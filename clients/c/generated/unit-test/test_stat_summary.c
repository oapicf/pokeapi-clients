#ifndef stat_summary_TEST
#define stat_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define stat_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/stat_summary.h"
stat_summary_t* instantiate_stat_summary(int include_optional);



stat_summary_t* instantiate_stat_summary(int include_optional) {
  stat_summary_t* stat_summary = NULL;
  if (include_optional) {
    stat_summary = stat_summary_create(
      "0",
      "0"
    );
  } else {
    stat_summary = stat_summary_create(
      "0",
      "0"
    );
  }

  return stat_summary;
}


#ifdef stat_summary_MAIN

void test_stat_summary(int include_optional) {
    stat_summary_t* stat_summary_1 = instantiate_stat_summary(include_optional);

	cJSON* jsonstat_summary_1 = stat_summary_convertToJSON(stat_summary_1);
	printf("stat_summary :\n%s\n", cJSON_Print(jsonstat_summary_1));
	stat_summary_t* stat_summary_2 = stat_summary_parseFromJSON(jsonstat_summary_1);
	cJSON* jsonstat_summary_2 = stat_summary_convertToJSON(stat_summary_2);
	printf("repeating stat_summary:\n%s\n", cJSON_Print(jsonstat_summary_2));
}

int main() {
  test_stat_summary(1);
  test_stat_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // stat_summary_MAIN
#endif // stat_summary_TEST
