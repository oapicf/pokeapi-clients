

#include "PaginatedAbilitySummaryList.h"

using namespace Tiny;

PaginatedAbilitySummaryList::PaginatedAbilitySummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<AbilitySummary>();
}

PaginatedAbilitySummaryList::PaginatedAbilitySummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedAbilitySummaryList::~PaginatedAbilitySummaryList()
{

}

void
PaginatedAbilitySummaryList::fromJson(std::string jsonObj)
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


        std::list<AbilitySummary> results_list;
        AbilitySummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedAbilitySummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<AbilitySummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        AbilitySummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedAbilitySummaryList::getCount()
{
	return count;
}

void
PaginatedAbilitySummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedAbilitySummaryList::getNext()
{
	return next;
}

void
PaginatedAbilitySummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedAbilitySummaryList::getPrevious()
{
	return previous;
}

void
PaginatedAbilitySummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<AbilitySummary>
PaginatedAbilitySummaryList::getResults()
{
	return results;
}

void
PaginatedAbilitySummaryList::setResults(std::list<AbilitySummary> results)
{
	this->results = results;
}



