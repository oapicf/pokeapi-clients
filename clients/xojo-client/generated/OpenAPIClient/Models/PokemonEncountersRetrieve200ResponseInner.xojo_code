#tag Class
Protected Class PokemonEncountersRetrieve200ResponseInner

	#tag Property, Flags = &h0
		location_area As OpenAPIClient.Models.PokemonEncountersRetrieve200ResponseInnerLocationArea
	#tag EndProperty


	#tag Property, Flags = &h0
		version_details() As OpenAPIClient.Models.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="location_area"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonEncountersRetrieve200ResponseInnerLocationArea"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


