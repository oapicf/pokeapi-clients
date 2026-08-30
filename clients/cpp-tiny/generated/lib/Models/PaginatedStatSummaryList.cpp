

#include "PaginatedStatSummaryList.h"

using namespace Tiny;

PaginatedStatSummaryList::PaginatedStatSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<StatSummary>();
}

PaginatedStatSummaryList::PaginatedStatSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedStatSummaryList::~PaginatedStatSummaryList()
{

}

void
PaginatedStatSummaryList::fromJson(std::string jsonObj)
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


        std::list<StatSummary> results_list;
        StatSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedStatSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<StatSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        StatSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedStatSummaryList::getCount()
{
	return count;
}

void
PaginatedStatSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedStatSummaryList::getNext()
{
	return next;
}

void
PaginatedStatSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedStatSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedStatSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<StatSummary>
PaginatedStatSummaryList::getResults()
{
	return results;
}

void
PaginatedStatSummaryList::setResults(std::list<StatSummary> results)
{
	this->results = results;
}



