
# EvolutionVariableDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`symbol` | string
`dataType` | string
`source` | string
`versionGroup` | [VersionGroupSummary](VersionGroupSummary.md)
`names` | [Array&lt;EvolutionVariableName&gt;](EvolutionVariableName.md)
`descriptions` | [Array&lt;EvolutionVariableDescription&gt;](EvolutionVariableDescription.md)

## Example

```typescript
import type { EvolutionVariableDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "symbol": null,
  "dataType": null,
  "source": null,
  "versionGroup": null,
  "names": null,
  "descriptions": null,
} satisfies EvolutionVariableDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EvolutionVariableDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


