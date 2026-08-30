

#include "PaginatedEncounterMethodSummaryList.h"

using namespace Tiny;

PaginatedEncounterMethodSummaryList::PaginatedEncounterMethodSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<EncounterMethodSummary>();
}

PaginatedEncounterMethodSummaryList::PaginatedEncounterMethodSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedEncounterMethodSummaryList::~PaginatedEncounterMethodSummaryList()
{

}

void
PaginatedEncounterMethodSummaryList::fromJson(std::string jsonObj)
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


        std::list<EncounterMethodSummary> results_list;
        EncounterMethodSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedEncounterMethodSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<EncounterMethodSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        EncounterMethodSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedEncounterMethodSummaryList::getCount()
{
	return count;
}

void
PaginatedEncounterMethodSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedEncounterMethodSummaryList::getNext()
{
	return next;
}

void
PaginatedEncounterMethodSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedEncounterMethodSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedEncounterMethodSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<EncounterMethodSummary>
PaginatedEncounterMethodSummaryList::getResults()
{
	return results;
}

void
PaginatedEncounterMethodSummaryList::setResults(std::list<EncounterMethodSummary> results)
{
	this->results = results;
}



