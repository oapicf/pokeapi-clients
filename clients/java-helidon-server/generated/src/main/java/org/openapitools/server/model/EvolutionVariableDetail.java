package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EvolutionVariableDescription;
import org.openapitools.server.model.EvolutionVariableName;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EvolutionVariableDetail   {

    private Integer id;
    private String name;
    private String symbol;
    private String dataType;
    private String source;
    private VersionGroupSummary versionGroup;
    private List<@Valid EvolutionVariableName> names = new ArrayList<>();
    private List<@Valid EvolutionVariableDescription> descriptions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public EvolutionVariableDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create EvolutionVariableDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param symbol The symbol used for this variable in evolution condition expressions.
     * @param dataType The data type of this variable.
     * @param source The source of the variable value.
     * @param versionGroup The version group in which this variable was introduced.
     * @param names The name of this resource listed in different languages.
     * @param descriptions The description of this resource listed in different languages.
     */
    public EvolutionVariableDetail(
        Integer id, 
        String name, 
        String symbol, 
        String dataType, 
        String source, 
        VersionGroupSummary versionGroup, 
        List<@Valid EvolutionVariableName> names, 
        List<@Valid EvolutionVariableDescription> descriptions
    ) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.dataType = dataType;
        this.source = source;
        this.versionGroup = versionGroup;
        this.names = names;
        this.descriptions = descriptions;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name for this resource.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The symbol used for this variable in evolution condition expressions.
     * @return symbol
     */
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * The data type of this variable.
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * The source of the variable value.
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * The version group in which this variable was introduced.
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid EvolutionVariableName> getNames() {
        return names;
    }

    public void setNames(List<@Valid EvolutionVariableName> names) {
        this.names = names;
    }

    /**
     * The description of this resource listed in different languages.
     * @return descriptions
     */
    public List<@Valid EvolutionVariableDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid EvolutionVariableDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvolutionVariableDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

