
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

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get Whether or not the games are published in this language.
	 */
	bool isOfficial();

	/*! \brief Set Whether or not the games are published in this language.
	 */
	void setOfficial(bool official);
	/*! \brief Get The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
	 */
	std::string getIso639();

	/*! \brief Set The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
	 */
	void setIso639(std::string iso639);
	/*! \brief Get The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
	 */
	std::string getIso3166();

	/*! \brief Set The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
	 */
	void setIso3166(std::string iso3166);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<LanguageName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
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
