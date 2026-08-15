

#include "PaginatedLocationSummaryList.h"

using namespace Tiny;

PaginatedLocationSummaryList::PaginatedLocationSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<LocationSummary>();
}

PaginatedLocationSummaryList::PaginatedLocationSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedLocationSummaryList::~PaginatedLocationSummaryList()
{

}

void
PaginatedLocationSummaryList::fromJson(std::string jsonObj)
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


        std::list<LocationSummary> results_list;
        LocationSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedLocationSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<LocationSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        LocationSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedLocationSummaryList::getCount()
{
	return count;
}

void
PaginatedLocationSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedLocationSummaryList::getNext()
{
	return next;
}

void
PaginatedLocationSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedLocationSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedLocationSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<LocationSummary>
PaginatedLocationSummaryList::getResults()
{
	return results;
}

void
PaginatedLocationSummaryList::setResults(std::list <LocationSummary> results)
{
	this->results = results;
}



