

#include "PaginatedPalParkAreaSummaryList.h"

using namespace Tiny;

PaginatedPalParkAreaSummaryList::PaginatedPalParkAreaSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<PalParkAreaSummary>();
}

PaginatedPalParkAreaSummaryList::PaginatedPalParkAreaSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedPalParkAreaSummaryList::~PaginatedPalParkAreaSummaryList()
{

}

void
PaginatedPalParkAreaSummaryList::fromJson(std::string jsonObj)
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


        std::list<PalParkAreaSummary> results_list;
        PalParkAreaSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedPalParkAreaSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<PalParkAreaSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        PalParkAreaSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedPalParkAreaSummaryList::getCount()
{
	return count;
}

void
PaginatedPalParkAreaSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedPalParkAreaSummaryList::getNext()
{
	return next;
}

void
PaginatedPalParkAreaSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedPalParkAreaSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedPalParkAreaSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<PalParkAreaSummary>
PaginatedPalParkAreaSummaryList::getResults()
{
	return results;
}

void
PaginatedPalParkAreaSummaryList::setResults(std::list<PalParkAreaSummary> results)
{
	this->results = results;
}



