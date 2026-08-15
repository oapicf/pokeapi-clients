

#include "PaginatedEncounterConditionValueSummaryList.h"

using namespace Tiny;

PaginatedEncounterConditionValueSummaryList::PaginatedEncounterConditionValueSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<EncounterConditionValueSummary>();
}

PaginatedEncounterConditionValueSummaryList::PaginatedEncounterConditionValueSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedEncounterConditionValueSummaryList::~PaginatedEncounterConditionValueSummaryList()
{

}

void
PaginatedEncounterConditionValueSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<EncounterConditionValueSummary> results_list;
        EncounterConditionValueSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedEncounterConditionValueSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<EncounterConditionValueSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        EncounterConditionValueSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedEncounterConditionValueSummaryList::getCount()
{
	return count;
}

void
PaginatedEncounterConditionValueSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedEncounterConditionValueSummaryList::getNext()
{
	return next;
}

void
PaginatedEncounterConditionValueSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedEncounterConditionValueSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedEncounterConditionValueSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<EncounterConditionValueSummary>
PaginatedEncounterConditionValueSummaryList::getResults()
{
	return results;
}

void
PaginatedEncounterConditionValueSummaryList::setResults(std::list <EncounterConditionValueSummary> results)
{
	this->results = results;
}



