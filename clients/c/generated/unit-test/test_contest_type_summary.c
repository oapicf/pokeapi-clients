#ifndef contest_type_summary_TEST
#define contest_type_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define contest_type_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/contest_type_summary.h"
contest_type_summary_t* instantiate_contest_type_summary(int include_optional);



contest_type_summary_t* instantiate_contest_type_summary(int include_optional) {
  contest_type_summary_t* contest_type_summary = NULL;
  if (include_optional) {
    contest_type_summary = contest_type_summary_create(
      "0",
      "0"
    );
  } else {
    contest_type_summary = contest_type_summary_create(
      "0",
      "0"
    );
  }

  return contest_type_summary;
}


#ifdef contest_type_summary_MAIN

void test_contest_type_summary(int include_optional) {
    contest_type_summary_t* contest_type_summary_1 = instantiate_contest_type_summary(include_optional);

	cJSON* jsoncontest_type_summary_1 = contest_type_summary_convertToJSON(contest_type_summary_1);
	printf("contest_type_summary :\n%s\n", cJSON_Print(jsoncontest_type_summary_1));
	contest_type_summary_t* contest_type_summary_2 = contest_type_summary_parseFromJSON(jsoncontest_type_summary_1);
	cJSON* jsoncontest_type_summary_2 = contest_type_summary_convertToJSON(contest_type_summary_2);
	printf("repeating contest_type_summary:\n%s\n", cJSON_Print(jsoncontest_type_summary_2));
}

int main() {
  test_contest_type_summary(1);
  test_contest_type_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // contest_type_summary_MAIN
#endif // contest_type_summary_TEST
