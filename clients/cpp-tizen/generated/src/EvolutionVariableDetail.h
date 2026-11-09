/*
 * EvolutionVariableDetail.h
 *
 * 
 */

#ifndef _EvolutionVariableDetail_H_
#define _EvolutionVariableDetail_H_


#include <string>
#include "EvolutionVariableDescription.h"
#include "EvolutionVariableName.h"
#include "VersionGroupSummary.h"
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

class EvolutionVariableDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	EvolutionVariableDetail();
	EvolutionVariableDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EvolutionVariableDetail();

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
	/*! \brief Get The symbol used for this variable in evolution condition expressions.
	 */
	std::string getSymbol();

	/*! \brief Set The symbol used for this variable in evolution condition expressions.
	 */
	void setSymbol(std::string  symbol);
	/*! \brief Get The data type of this variable.
	 */
	std::string getDataType();

	/*! \brief Set The data type of this variable.
	 */
	void setDataType(std::string  data_type);
	/*! \brief Get The source of the variable value.
	 */
	std::string getSource();

	/*! \brief Set The source of the variable value.
	 */
	void setSource(std::string  source);
	/*! \brief Get The version group in which this variable was introduced.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group in which this variable was introduced.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<EvolutionVariableName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <EvolutionVariableName> names);
	/*! \brief Get The description of this resource listed in different languages.
	 */
	std::list<EvolutionVariableDescription> getDescriptions();

	/*! \brief Set The description of this resource listed in different languages.
	 */
	void setDescriptions(std::list <EvolutionVariableDescription> descriptions);

private:
	int id;
	std::string name;
	std::string symbol;
	std::string data_type;
	std::string source;
	VersionGroupSummary version_group;
	std::list <EvolutionVariableName>names;
	std::list <EvolutionVariableDescription>descriptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EvolutionVariableDetail_H_ */
