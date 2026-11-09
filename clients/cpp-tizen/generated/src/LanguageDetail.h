/*
 * LanguageDetail.h
 *
 * 
 */

#ifndef _LanguageDetail_H_
#define _LanguageDetail_H_


#include <string>
#include "LanguageName.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LanguageDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	LanguageDetail();
	LanguageDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LanguageDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get Whether or not the games are published in this language.
	 */
	bool getOfficial();

	/*! \brief Set Whether or not the games are published in this language.
	 */
	void setOfficial(bool  official);
	/*! \brief Get The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
	 */
	std::string getIso639();

	/*! \brief Set The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
	 */
	void setIso639(std::string  iso639);
	/*! \brief Get The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
	 */
	std::string getIso3166();

	/*! \brief Set The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
	 */
	void setIso3166(std::string  iso3166);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<LanguageName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <LanguageName> names);

private:
	int id;
	std::string name;
	bool official;
	std::string iso639;
	std::string iso3166;
	std::list <LanguageName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LanguageDetail_H_ */
