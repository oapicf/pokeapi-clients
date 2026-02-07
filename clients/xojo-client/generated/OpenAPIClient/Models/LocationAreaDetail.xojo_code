#tag Class
Protected Class LocationAreaDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		game_index As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		encounter_method_rates() As OpenAPIClient.Models.LocationAreaDetailEncounterMethodRatesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		location As OpenAPIClient.Models.LocationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		names() As OpenAPIClient.Models.LocationAreaName
	#tag EndProperty


	#tag Property, Flags = &h0
		pokemon_encounters() As OpenAPIClient.Models.LocationAreaDetailPokemonEncountersInner
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="game_index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="encounter_method_rates"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaDetailEncounterMethodRatesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="location"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon_encounters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaDetailPokemonEncountersInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


