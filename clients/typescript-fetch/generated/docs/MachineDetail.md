
# MachineDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`item` | [ItemSummary](ItemSummary.md)
`versionGroup` | [VersionGroupSummary](VersionGroupSummary.md)
`move` | [MoveSummary](MoveSummary.md)

## Example

```typescript
import type { MachineDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "item": null,
  "versionGroup": null,
  "move": null,
} satisfies MachineDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MachineDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


