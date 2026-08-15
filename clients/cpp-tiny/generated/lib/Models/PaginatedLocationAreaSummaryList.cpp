

#include "PaginatedLocationAreaSummaryList.h"

using namespace Tiny;

PaginatedLocationAreaSummaryList::PaginatedLocationAreaSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<LocationAreaSummary>();
}

PaginatedLocationAreaSummaryList::PaginatedLocationAreaSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedLocationAreaSummaryList::~PaginatedLocationAreaSummaryList()
{

}

void
PaginatedLocationAreaSummaryList::fromJson(std::string jsonObj)
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


        std::list<LocationAreaSummary> results_list;
        LocationAreaSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedLocationAreaSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<LocationAreaSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        LocationAreaSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedLocationAreaSummaryList::getCount()
{
	return count;
}

void
PaginatedLocationAreaSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedLocationAreaSummaryList::getNext()
{
	return next;
}

void
PaginatedLocationAreaSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedLocationAreaSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedLocationAreaSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<LocationAreaSummary>
PaginatedLocationAreaSummaryList::getResults()
{
	return results;
}

void
PaginatedLocationAreaSummaryList::setResults(std::list <LocationAreaSummary> results)
{
	this->results = results;
}



