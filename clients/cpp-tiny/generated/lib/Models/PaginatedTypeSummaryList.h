
/*
 * PaginatedTypeSummaryList.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PaginatedTypeSummaryList_H_
#define TINY_CPP_CLIENT_PaginatedTypeSummaryList_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TypeSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PaginatedTypeSummaryList{
public:

    /*! \brief Constructor.
	 */
    PaginatedTypeSummaryList();
    PaginatedTypeSummaryList(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PaginatedTypeSummaryList();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getCount();

	/*! \brief Set 
	 */
	void setCount(int  count);
	/*! \brief Get 
	 */
	std::string getNext();

	/*! \brief Set 
	 */
	void setNext(std::string  next);
	/*! \brief Get 
	 */
	std::string getPrevious();

	/*! \brief Set 
	 */
	void setPrevious(std::string  previous);
	/*! \brief Get 
	 */
	std::list<TypeSummary> getResults();

	/*! \brief Set 
	 */
	void setResults(std::list <TypeSummary> results);


    private:
    int count{};
    std::string next{};
    std::string previous{};
    std::list<TypeSummary> results;
};
}

#endif /* TINY_CPP_CLIENT_PaginatedTypeSummaryList_H_ */
