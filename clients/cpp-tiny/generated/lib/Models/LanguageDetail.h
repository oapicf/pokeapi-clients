
/*
 * LanguageDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LanguageDetail_H_
#define TINY_CPP_CLIENT_LanguageDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LanguageName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LanguageDetail{
public:

    /*! \brief Constructor.
	 */
    LanguageDetail();
    LanguageDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LanguageDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	bool isOfficial();

	/*! \brief Set 
	 */
	void setOfficial(bool official);
	/*! \brief Get 
	 */
	std::string getIso639();

	/*! \brief Set 
	 */
	void setIso639(std::string iso639);
	/*! \brief Get 
	 */
	std::string getIso3166();

	/*! \brief Set 
	 */
	void setIso3166(std::string iso3166);
	/*! \brief Get 
	 */
	std::list<LanguageName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<LanguageName> names);


    private:
    int id{};
    std::string name{};
    bool official{};
    std::string iso639{};
    std::string iso3166{};
    std::list<LanguageName> names;
};
}

#endif /* TINY_CPP_CLIENT_LanguageDetail_H_ */
