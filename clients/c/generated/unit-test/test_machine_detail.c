#ifndef machine_detail_TEST
#define machine_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define machine_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/machine_detail.h"
machine_detail_t* instantiate_machine_detail(int include_optional);

#include "test_item_summary.c"
#include "test_version_group_summary.c"
#include "test_move_summary.c"


machine_detail_t* instantiate_machine_detail(int include_optional) {
  machine_detail_t* machine_detail = NULL;
  if (include_optional) {
    machine_detail = machine_detail_create(
      56,
       // false, not to have infinite recursion
      instantiate_item_summary(0),
       // false, not to have infinite recursion
      instantiate_version_group_summary(0),
       // false, not to have infinite recursion
      instantiate_move_summary(0)
    );
  } else {
    machine_detail = machine_detail_create(
      56,
      NULL,
      NULL,
      NULL
    );
  }

  return machine_detail;
}


#ifdef machine_detail_MAIN

void test_machine_detail(int include_optional) {
    machine_detail_t* machine_detail_1 = instantiate_machine_detail(include_optional);

	cJSON* jsonmachine_detail_1 = machine_detail_convertToJSON(machine_detail_1);
	printf("machine_detail :\n%s\n", cJSON_Print(jsonmachine_detail_1));
	machine_detail_t* machine_detail_2 = machine_detail_parseFromJSON(jsonmachine_detail_1);
	cJSON* jsonmachine_detail_2 = machine_detail_convertToJSON(machine_detail_2);
	printf("repeating machine_detail:\n%s\n", cJSON_Print(jsonmachine_detail_2));
}

int main() {
  test_machine_detail(1);
  test_machine_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // machine_detail_MAIN
#endif // machine_detail_TEST
