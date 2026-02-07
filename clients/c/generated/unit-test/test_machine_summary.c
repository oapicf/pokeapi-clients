#ifndef machine_summary_TEST
#define machine_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define machine_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/machine_summary.h"
machine_summary_t* instantiate_machine_summary(int include_optional);



machine_summary_t* instantiate_machine_summary(int include_optional) {
  machine_summary_t* machine_summary = NULL;
  if (include_optional) {
    machine_summary = machine_summary_create(
      "0"
    );
  } else {
    machine_summary = machine_summary_create(
      "0"
    );
  }

  return machine_summary;
}


#ifdef machine_summary_MAIN

void test_machine_summary(int include_optional) {
    machine_summary_t* machine_summary_1 = instantiate_machine_summary(include_optional);

	cJSON* jsonmachine_summary_1 = machine_summary_convertToJSON(machine_summary_1);
	printf("machine_summary :\n%s\n", cJSON_Print(jsonmachine_summary_1));
	machine_summary_t* machine_summary_2 = machine_summary_parseFromJSON(jsonmachine_summary_1);
	cJSON* jsonmachine_summary_2 = machine_summary_convertToJSON(machine_summary_2);
	printf("repeating machine_summary:\n%s\n", cJSON_Print(jsonmachine_summary_2));
}

int main() {
  test_machine_summary(1);
  test_machine_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // machine_summary_MAIN
#endif // machine_summary_TEST
