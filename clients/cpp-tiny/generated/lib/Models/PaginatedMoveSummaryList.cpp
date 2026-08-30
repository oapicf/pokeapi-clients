

#include "PaginatedMoveSummaryList.h"

using namespace Tiny;

PaginatedMoveSummaryList::PaginatedMoveSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<MoveSummary>();
}

PaginatedMoveSummaryList::PaginatedMoveSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedMoveSummaryList::~PaginatedMoveSummaryList()
{

}

void
PaginatedMoveSummaryList::fromJson(std::string jsonObj)
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


        std::list<MoveSummary> results_list;
        MoveSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedMoveSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<MoveSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        MoveSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedMoveSummaryList::getCount()
{
	return count;
}

void
PaginatedMoveSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedMoveSummaryList::getNext()
{
	return next;
}

void
PaginatedMoveSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedMoveSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedMoveSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<MoveSummary>
PaginatedMoveSummaryList::getResults()
{
	return results;
}

void
PaginatedMoveSummaryList::setResults(std::list<MoveSummary> results)
{
	this->results = results;
}



