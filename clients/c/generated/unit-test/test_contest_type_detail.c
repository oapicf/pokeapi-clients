#ifndef contest_type_detail_TEST
#define contest_type_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define contest_type_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/contest_type_detail.h"
contest_type_detail_t* instantiate_contest_type_detail(int include_optional);

#include "test_berry_flavor_summary.c"


contest_type_detail_t* instantiate_contest_type_detail(int include_optional) {
  contest_type_detail_t* contest_type_detail = NULL;
  if (include_optional) {
    contest_type_detail = contest_type_detail_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_berry_flavor_summary(0),
      list_createList()
    );
  } else {
    contest_type_detail = contest_type_detail_create(
      56,
      "0",
      NULL,
      list_createList()
    );
  }

  return contest_type_detail;
}


#ifdef contest_type_detail_MAIN

void test_contest_type_detail(int include_optional) {
    contest_type_detail_t* contest_type_detail_1 = instantiate_contest_type_detail(include_optional);

	cJSON* jsoncontest_type_detail_1 = contest_type_detail_convertToJSON(contest_type_detail_1);
	printf("contest_type_detail :\n%s\n", cJSON_Print(jsoncontest_type_detail_1));
	contest_type_detail_t* contest_type_detail_2 = contest_type_detail_parseFromJSON(jsoncontest_type_detail_1);
	cJSON* jsoncontest_type_detail_2 = contest_type_detail_convertToJSON(contest_type_detail_2);
	printf("repeating contest_type_detail:\n%s\n", cJSON_Print(jsoncontest_type_detail_2));
}

int main() {
  test_contest_type_detail(1);
  test_contest_type_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // contest_type_detail_MAIN
#endif // contest_type_detail_TEST
